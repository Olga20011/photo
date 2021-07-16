package com.example.C

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Contact_list_RvAdapter(var contacts_list:List<Data>,var context: Context):RecyclerView.Adapter<Contacts_View_Holder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Contacts_View_Holder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contacts_list_item,parent,false)
        return  Contacts_View_Holder((itemView))

    }

    override fun onBindViewHolder(holder: Contacts_View_Holder, position: Int) {
        var currentContacts=contacts_list.get(position)
        holder.tvName.text=currentContacts.Name
        holder.tvEmail.text=currentContacts.Email
        holder.tvphoneNumber.text=currentContacts.PhoneNumber

        Picasso.get()
            .load(currentContacts.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivPhotos)
        holder.cvPhotos.setOnClickListener{
            var intent=Intent(context,ContactDetails::class.java)
            intent.putExtra("NAME",currentContacts.Name)
            intent.putExtra("EMAIL",currentContacts.Email)
            intent.putExtra("PHONE_NUMBER",currentContacts.PhoneNumber)
            intent.putExtra("IMAGE_URL",currentContacts.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }

    }
    override fun getItemCount(): Int {
        return contacts_list.size
    }
}

private fun Any.into(ivPhotos: TextView?) {

}

class Contacts_View_Holder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvphoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var ivPhotos=itemView.findViewById<ImageView>(R.id.ivPhotos)
    var cvPhotos=itemView.findViewById<CardView>(R.id.cvPhotos)


}
