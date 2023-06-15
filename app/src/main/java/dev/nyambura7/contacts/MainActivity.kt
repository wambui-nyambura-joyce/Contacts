package dev.nyambura7.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dev.nyambura7.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, AddContacts::class.java)
            startActivity(intent)
        }
    }


    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        var contact1 = ContactData("https://media.istockphoto.com/id/1446848678/photo/business-black-man-tablet-and-modern-office-for-corporate-email-communication-software.jpg?s=612x612&w=0&k=20&c=irkpuLO3t5jlDms-5cY3GZiGzttVVATc7N-4j9TM8Qg=","Mutesi","0756277887","@mutesi")
        var contact2 = ContactData("https://images.unsplash.com/photo-1531475925016-6d33cb7c8344?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDN8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","Joyce","0712347887","@joyce")
        var contact3 = ContactData("https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YWZyaWNhbnN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Nyambura","0745447887","@nyambura")
        var contact4 = ContactData("https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YWZyaWNhbnN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Masian","0775833445","@mmasian")
        var contact5 = ContactData("https://plus.unsplash.com/premium_photo-1670226145708-fe8e83e8d9da?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YWZyaWNhbnN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Vallary","0723345666","@vallary")
        var contact6 = ContactData("https://media.istockphoto.com/id/1403839079/photo/busy-young-mixed-race-man-using-technologies.webp?b=1&s=170667a&w=0&k=20&c=zSK0lH_t6jlqVpmVFG9VrwBQnCQ19w61v2dR6PkLmbI=","Eunice","0712343211","@eunice")
        var contact7 = ContactData("https://media.istockphoto.com/id/1369547846/photo/shot-of-an-adorable-little-boy-enjoying-a-piggyback-ride-with-his-father-in-a-garden.webp?b=1&s=170667a&w=0&k=20&c=enYdyxVDGAIeFPYy-MQ8OALMKEXL8js1a03Zeco7F3U=","Elizabeth","0723445678","@elizabeth")
        var contact8 = ContactData("https://media.istockphoto.com/id/1372615072/photo/male-high-school-friends-studying-together.webp?b=1&s=170667a&w=0&k=20&c=R3uANYr2ihAKmjE3GERQLQkPvQ97IrwERzsz3cVqFak=","Kamau","07866543221","@kamau")
        var contact9 = ContactData("https://media.istockphoto.com/id/1436067051/photo/side-profile-model-and-natural-beauty-of-black-women-standing-with-afro-hair-stunning.webp?b=1&s=170667a&w=0&k=20&c=QW-aNWhbUEpnc_tbQz6jarpXBDhLw4M1Kl9ikCXxB8s=","Gubo","01128958777","@gubs")
        var contact10 = ContactData("https://media.istockphoto.com/id/1436064604/photo/black-woman-hair-and-afro-for-beauty-hair-care-or-cosmetics-for-skin-with-beige-background.jpg?s=612x612&w=0&k=20&c=ICbBLjNSaA07xI3y8zejxcoN-_yLf7l8yzluu-1VP1g=","Juliet","07123456789","@juliet")
        var contact11 = ContactData("https://media.istockphoto.com/id/1492856381/photo/dermatology-beauty-and-portrait-of-black-woman-with-hand-on-face-afro-and-advertising-luxury.jpg?s=612x612&w=0&k=20&c=_wCW0bGSszGSD9jJgCFQqKuzdkDnhg_tOdNjndn86lM=","Esther","987654321","@esther")
        var contact12 = ContactData("https://media.istockphoto.com/id/868639626/photo/business-meetings.jpg?s=612x612&w=0&k=20&c=q81PrRabub0WK3tNZow-4rZ6NJHVV1RaOZ9oJSERj5s=","Parkire","0791234511","@parkire")
        var contact13 = ContactData("https://media.istockphoto.com/id/1446863781/photo/business-black-man-city-and-tablet-technology-on-website-review-email-communication-or.jpg?s=612x612&w=0&k=20&c=KRTGtfwp4T4Ps8vR6Ob8ux4JYcw0gMQP9KO-V_H8Ti4=","Kevine","012234567898","@kevine")
        var contact14 = ContactData("https://media.istockphoto.com/id/1080149616/photo/lets-double-check-those-designs.jpg?s=612x612&w=0&k=20&c=4SVxqqS1PQn_9KqnCeJtsBa3jb5QCAP16APaGKV340Y=","Ian","012234567898","@ianmarwa")
        var contact15 = ContactData("https://media.istockphoto.com/id/1257729250/photo/three-diverse-businesspeople-going-over-paperwork-in-an-office-l.jpg?s=612x612&w=0&k=20&c=0yTltF2lEuu8ANWQcLOvLyjlDxKqz5oyapAhpG_Dm58=","Joan","0712345898","@joan")

        var contactList = listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14,contact15)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        var ContactsRvAdapter = ContactsRvAdapter(contactList)
        binding.rvContact.adapter = ContactsRvAdapter
    }


}