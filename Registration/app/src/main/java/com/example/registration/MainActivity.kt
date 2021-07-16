package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etDOB:EditText
    lateinit var etIdNumber:EditText
    lateinit var spNationality:Spinner
    lateinit var etPhone:EditText
    lateinit var etEmail: EditText
    lateinit var btnRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView()

    }
    fun castView() {

        etName = findViewById<EditText>(R.id.etName)
        etDOB = findViewById<EditText>(R.id.etDOB1)
        etIdNumber = findViewById<EditText>(R.id.etID)
        spNationality = findViewById<Spinner>(R.id.spNationality)
        var nationalities= arrayOf("Select nationality","Kenyan","Rwandan","South Sudanese","Ugandan")
        var nationalitiesAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_dropdown_item,nationalities)
        nationalitiesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spNationality.adapter=nationalitiesAdapter
        etPhone = findViewById<EditText>(R.id.etPhoneNo)
        etEmail = findViewById<EditText>(R.id.etEmail)
        btnRegister = findViewById<Button>(R.id.btnregister)
        }

        fun clickRegister(){
        btnRegister.setOnClickListener {
            var name=etName.text.toString()
            var dob=etDOB.text.toString()
            var IdNo=etIdNumber.text.toString()
            var nationality=spNationality.selectedItem.toString()
            var phone=etPhone.text.toString()
            var email=etEmail.text.toString()
            var olga=Person(name,dob,IdNo,nationality,phone,email)
            Toast.makeText(baseContext,name, Toast.LENGTH_LONG).show()
            val intent=Intent(baseContext ,CoursesActivity::class.java)
            startActivity(intent)
        }

    }
}
data class Person(var name:String,var dob:String,var idno:String,var nation:String,var phone:String,var email:String)



