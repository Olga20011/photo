package com.example.C

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvPhotos: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display()
    }

    fun display() {
        var contact_list = listOf<Data>(
            Data(
                "Olga Akello",
                "olgaestherakello@gmail.com",
                "0782899731",
                "https://media-exp3.licdn.com/dms/image/C5603AQEH8S0aCgdYGQ/profile-displayphoto-shrink_800_800/0/1624810235968?e=1631750400&v=beta&t=UjSSeFI34jkSA37aNv6y-zOE1QcsnFdKFZYz_a5i3I0"
            ),
            Data(
                "Audrey Munyiva",
                "audreymunyive@gmail.com",
                "0353672727",
                "https://media-exp3.licdn.com/dms/image/C4E03AQEcyU0HxluMuA/profile-displayphoto-shrink_800_800/0/1616757482227?e=1631750400&v=beta&t=xafmpZ8_5YIX5MK322HDPiRr8qg0OJuV1P956-_hzzA"
            ),
            Data(
                "Mercy Birungi",
                "ssozimercy@gmail.com",
                "093883837373",
                "https://media-exp3.licdn.com/dms/image/C4D03AQElvmm8TsZI2w/profile-displayphoto-shrink_800_800/0/1625967665577?e=1631750400&v=beta&t=VQwaNS5D7CQN573KyzwljzVk1Xh-QMx2LWmwRHtZrhc"
            ),
            Data(
                "Mercy Wangari",
                "mercywangari@gmail.com",
                "07574664657",
                "https://media-exp3.licdn.com/dms/image/C4D03AQGd5zK0j48zLw/profile-displayphoto-shrink_800_800/0/1616687220944?e=1631750400&v=beta&t=KEDjzpUEYMmuznJ928X9ObyNaUbs06Lzdi1rU96nhrU"
            ),
            Data(
                "Stella Chepcumba",
                "stellachecumba@gmail.com",
                "3747377287872",
                "https://media-exp3.licdn.com/dms/image/C4D03AQGT1ypxQi4j5Q/profile-displayphoto-shrink_800_800/0/1625752657850?e=1631750400&v=beta&t=lWgeQOHVWm0ZaBa0OVNb_cFCB4rq_6sKHC3lUDPtPT0"
            ),
            Data("Iman Yahya",
                "imanmuthoni@gmail.com",
                "32646278187",
                "https://media-exp3.licdn.com/dms/image/C4E03AQFhh9EYNjEx-g/profile-displayphoto-shrink_800_800/0/1616490340522?e=1631750400&v=beta&t=jEhPXcwDmFXzH8gteNlyFmm96DiIgU9HclYfFITR8LM"
            ),


        )
        rvPhotos = findViewById<RecyclerView>(R.id.rvPhotos)
        var contactsAdapter = Contact_list_RvAdapter(contact_list, baseContext)
        rvPhotos.layoutManager = LinearLayoutManager(baseContext)
        rvPhotos.adapter = contactsAdapter
    }
}