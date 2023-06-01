package dev.nyambura7.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nyambura7.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        var contact1 = ContactData("","Mutesi","0756277887","@mutesi")
        var contact2 = ContactData("","Joyce","0712347887","@joyce")
        var contact3 = ContactData("","Nyambura","0745447887","@nyambura")
        var contact4 = ContactData("","Masian","0775833445","@mmasian")
        var contact5 = ContactData("","Vallary","0723345666","@vallary")
        var contact6 = ContactData("","Eunice","0712343211","@eunice")
        var contact7 = ContactData("","Elizabeth","0723445678","@elizabeth")
        var contact8 = ContactData("","Kamau","07866543221","@kamau")
        var contact9 = ContactData("","Gubo","01128958777","@gubs")
        var contact10 = ContactData("","Juliet","07123456789","@juliet")
        var contact11 = ContactData("","Esther","987654321","@esther")
        var contact12 = ContactData("","Parkire","0791234511","@parkire")
        var contact13 = ContactData("","Kevine","012234567898","@kevine")

        var contactList = listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        var ContactsRvAdapter = ContactsRvAdapter(contactList)
        binding.rvContact.adapter = ContactsRvAdapter
    }

}