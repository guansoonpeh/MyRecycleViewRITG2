package com.example.myrecycleviewritg2.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleviewritg2.R
import org.w3c.dom.Text

class ProductAdapter (private val productList : List<Product>) : RecyclerView.Adapter<ProductAdapter.myViewHolder>(){

    class myViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val productName:TextView = itemView.findViewById(R.id.tvProductName)
        val productPrice:TextView =  itemView.findViewById(R.id.tvProductPrice)
        val productImage:ImageView =  itemView.findViewById(R.id.imgProduct)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.product_item, parent, false)

        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val currentProduct = productList[position]

        holder.productName.text = currentProduct.productName
        holder.productPrice.text = currentProduct.price.toString()
        holder.productImage.setImageResource(currentProduct.image)
    }

    override fun getItemCount(): Int {
        return  productList.size
    }


}