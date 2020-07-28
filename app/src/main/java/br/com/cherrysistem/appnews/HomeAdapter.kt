package br.com.cherrysistem.appnews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.cherrysistem.appnews.model.Articles
import br.com.cherrysistem.appnews.model.News
import kotlinx.android.synthetic.main.item_list_news.view.*

class HomeAdapter(
    private val context : Context,
    private val listOfNews : MutableList<Articles>
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(context).inflate(R.layout.item_list_news, parent, false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return listOfNews.size
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        val news = listOfNews[position]
        holder.bindView(news)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(news: Articles) {
            itemView.item_list_news_title.text = news.title
        }
    }

}