package br.com.cherrysistem.appnews.model

class News(
    val status: String,
    val totalResults: Int,
    val articles : List<Articles>
)

class Articles(
    val source : Source,
    val author : String,
    val title : String,
    val description: String,
    val url : String,
    val urlToImage : String,
    val publishAt: String,
    val content : String
)

class Source(
    val id : Int?,
    val name : String
)
