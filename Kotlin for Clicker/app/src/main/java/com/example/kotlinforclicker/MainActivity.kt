package com.example.kotlinforclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var count = 0
        var result = findViewById<TextView>(R.id.result)
        var up = findViewById<Button>(R.id.up_button)
        var down = findViewById<Button>(R.id.down_button2)

        up.setOnClickListener{
            count++
            result.text = count.toString()

            if(count == 10) {
                var t1 = Toast.makeText(this,"10점에 도달했습니다.",Toast.LENGTH_SHORT)
                t1.show()

            }

            else if(count == 20) {
                var t2 = Toast.makeText(this,"20점에 도달했습니다.",Toast.LENGTH_SHORT)
                t2.show()

            }
        }
        down.setOnClickListener {
            count--
            result.text = count.toString()
        }

    }
}