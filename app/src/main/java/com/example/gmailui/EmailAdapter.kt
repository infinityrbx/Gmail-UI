package com.example.gmailui

// EmailAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Email(val subject: String, val preview: String, val sender: String, val profilePictureResId: Int)

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImageView: ImageView = itemView.findViewById(R.id.profileImageView)
        val senderTextView: TextView = itemView.findViewById(R.id.senderTextView)
        val subjectTextView: TextView = itemView.findViewById(R.id.subjectTextView)
        val previewTextView: TextView = itemView.findViewById(R.id.previewTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderTextView.text = email.sender
        holder.subjectTextView.text = email.subject
        holder.previewTextView.text = email.preview
        holder.profileImageView.setImageResource(email.profilePictureResId) // Set profile picture
    }

    override fun getItemCount() = emailList.size
}
