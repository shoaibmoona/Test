package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.main -> {
//                Toast.makeText(this@Home, "Main", Toast.LENGTH_SHORT).show()
                var intent = Intent(this@Home, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.login -> {
//                Toast.makeText(this@Home, "Home",Toast.LENGTH_SHORT).show()
                var intent = Intent(this@Home, Login::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}