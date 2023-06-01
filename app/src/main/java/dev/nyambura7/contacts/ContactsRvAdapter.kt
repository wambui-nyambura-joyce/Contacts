package dev.nyambura7.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
//import dev.nyambura7.contacts.databinding.ActivityMainBinding
import dev.nyambura7.contacts.databinding.ItemContactBinding

class ContactsRvAdapter (var contactsList: List<ContactData>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var  binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contacts = contactsList[position]
        holder.binding.tvEmail.text = contacts.email
        holder.binding.tvName.text = contacts.displayName
        holder.binding.tvPhoneNumber.text = contacts.phoneNumber
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}

class  ContactsViewHolder(var  binding: ItemContactBinding):RecyclerView.ViewHolder(binding.root)