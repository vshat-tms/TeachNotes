package com.example.teachnotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private val notes: List<Note>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_card_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = notes[position]
        holder.itemPreviewNoteTitle.text = itemsViewModel.noteTitle
        holder.itemPreviewNoteText.text = itemsViewModel.noteText
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemPreviewNoteTitle: TextView = itemView.findViewById(R.id.previewNoteTitle)
        var itemPreviewNoteText: TextView = itemView.findViewById(R.id.previewNoteText)
    }

    override fun getItemCount(): Int {
        return notes.size
    }
}

