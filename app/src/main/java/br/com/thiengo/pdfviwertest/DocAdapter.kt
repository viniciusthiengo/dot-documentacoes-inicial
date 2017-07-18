package br.com.thiengo.pdfviwertest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import br.com.thiengo.pdfviwertest.domain.Doc


class DocAdapter(
        private val context: Context,
        private val docList: List<Doc>) :
        RecyclerView.Adapter<DocAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int) : DocAdapter.ViewHolder {

        val v = LayoutInflater
                .from(context)
                .inflate(R.layout.iten_doc, parent, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(docList[position])
    }

    override fun getItemCount(): Int {
        return docList.size
    }

    inner class ViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {

        var ivCover: ImageView
        var tvLanguage: TextView
        var tvTotalPages: TextView

        init {
            ivCover = itemView.findViewById(R.id.iv_cover)
            tvLanguage = itemView.findViewById(R.id.tv_language)
            tvTotalPages = itemView.findViewById(R.id.tv_total_pages)
        }

        fun setData(doc: Doc) {
            ivCover.setImageResource( doc.imageRes )
            tvLanguage.text = doc.language
            tvTotalPages.text = "${doc.pagesNumber} páginas"
        }
    }
}