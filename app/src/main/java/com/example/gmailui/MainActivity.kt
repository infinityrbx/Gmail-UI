package com.example.gmailui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // dummy
        val emailList = listOf(
            Email("Welcome to our app!", "Thank you for signing up...", "Support", R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder) ,
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder),
            Email("Your Weekly Summary", "Here’s what happened this week...", "Updates",R.drawable.ic_profile_placeholder)
        )

        val emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
    }
}
