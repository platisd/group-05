package com.example.uidesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton



class Destination : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)


        val destination_1 = findViewById(R.id.destination1) as Button
        val destination_2 = findViewById(R.id.destination2) as Button
        val destination_3 = findViewById(R.id.destination3) as Button






        destination_1.setOnClickListener {
            val intent2 = Intent(this, MenuActivity::class.java)
            intent.putExtra("toMenu", 572)
            startActivity(intent2)
        }
        destination_2.setOnClickListener {
            val intent2 = Intent(this, MenuActivity::class.java)
            intent.putExtra("toMenu", 56)
            startActivity(intent2)
        }
        destination_3.setOnClickListener {
            val intent2 = Intent(this, MenuActivity::class.java)
            intent.putExtra("toMenu", 100)
            startActivity(intent2)
        }


        destination_1.setOnClickListener {
            sendRequest("AutoOn?distance="+"572")
            val intent2 = Intent(this, MenuActivity::class.java)
            startActivity(intent2)
        }
        destination_2.setOnClickListener {
            sendRequest("AutoOn?distance="+"100")
            val intent2 = Intent(this, MenuActivity::class.java)
            startActivity(intent2)
        }
        destination_3.setOnClickListener {
            sendRequest("AutoOn?distance="+"100")
            val intent2 = Intent(this, MenuActivity::class.java)
            startActivity(intent2)
        }




        val home = findViewById(R.id.home) as ImageButton

        home.setOnClickListener {
            val home = Intent(this, MainActivity::class.java)
            home.putExtra("BackVariable2", 1)
            startActivity(home)

        }


    }


}
