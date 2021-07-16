package com.example.C

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        var nameIntent=intent.getStringExtra("NAME")
        var emailIntent=intent.getStringExtra("EMAIL")
        var phone_numberIntent=intent.getStringExtra("PHONE_NUMBER")
        var image_urlIntent=intent.getStringExtra("IMAGE_URL").toString()


        var name=findViewById<TextView>(R.id.tvName2)
        var email=findViewById<TextView>(R.id.tvEmail2)
        var phone_number=findViewById<TextView>(R.id.tvPhoneNumber2)
        var image=findViewById<ImageView>(R.id.tvImage0ne)


        name.text=nameIntent
        email.text=emailIntent
        phone_number.text=phone_numberIntent
        Picasso.get().load(image_urlIntent).into(image)
    }
}