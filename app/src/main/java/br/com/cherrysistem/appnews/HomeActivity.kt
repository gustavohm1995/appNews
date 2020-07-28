package br.com.cherrysistem.appnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cherrysistem.appnews.model.Articles
import br.com.cherrysistem.appnews.model.News
import br.com.cherrysistem.appnews.model.Source
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listOfArticles = mutableListOf(
            Articles(
                Source(null, "sapo"),
                "pacoka",
                "testando",
                "testando",
                "testando",
                "testando",
                "testando",
                "testando"
            )
        )
        home_recycler_view.adapter = HomeAdapter(this, listOfArticles)
    }



}