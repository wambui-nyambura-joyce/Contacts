package dev.nyambura7.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dev.nyambura7.contacts.databinding.ActivityAddContactsBinding

class AddContacts : AppCompatActivity() {
    lateinit var binding: ActivityAddContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val button = findViewById<Button>(R.id.btnsave)
        button.setOnClickListener {
            val intent = Intent(this@AddContacts, MainActivity::class.java)
            startActivity(intent)
        }
        onResume()

    }
    override fun onResume() {
        super.onResume()
        validateSignUp()
        clearErrorOnType()
//        validateSignUp()
    }

    fun validateSignUp() {
        val firstName = binding.etFirstName.text.toString()
        val lastName = binding.etLastName.text.toString()
        val phoneno = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false

        if (firstName.isBlank()) {
            binding.tilFirstName.error = "First name is required"
            error = true
        } else {
            binding.tilFirstName.error = null
        }
        if (lastName.isBlank()) {
            binding.tilLastName.error = "Last name is required"
            error = true
        } else {
            binding.tilLastName.error = null
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        } else {
            binding.tilEmail.error = null
        }
        if (phoneno.isBlank()) {
            binding.tilPhoneNumber.error = "Phone Number is required"
            error = true
        } else {
            binding.tilPhoneNumber.error = null
        }

        if (!error) {
            Toast.makeText(this, "$firstName $lastName $email", Toast.LENGTH_LONG).show()
        }
    }

    fun clearErrorOnType() {
        binding.tilFirstName.editText?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilFirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tilLastName.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilLastName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tilPhoneNumber.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tilEmail.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
}
