package dev.nyambura7.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
//import dev.nyambura7.contacts.databinding.ActivityMainBinding
import dev.nyambura7.contacts.databinding.ItemContactBinding
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsRvAdapter (var contactsList: List<ContactData>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var  binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contacts = contactsList[position]
        var binding = holder.binding
        holder.binding.tvEmail.text = contacts.email
        holder.binding.tvName.text = contacts.displayName
        holder.binding.tvPhoneNumber.text = contacts.phoneNumber
        Picasso
            .get()
            .load(contacts.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivContacts)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}

class  ContactsViewHolder(var  binding: ItemContactBinding):RecyclerView.ViewHolder(binding.root)