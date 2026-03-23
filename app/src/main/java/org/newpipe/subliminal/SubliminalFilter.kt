package org.newpipe.subliminal

data class Video(val title: String, val description: String, val url: String)

// Função que filtra os vídeos automaticamente
fun filterSubliminal(videos: List<Video>): List<Video> {
    val keywords = listOf("biokinesis", "kinesis", "luminal", "subliminals", "subliminal")
    return videos.filter { video ->
        keywords.any { keyword ->
            video.title.contains(keyword, ignoreCase = true) ||
            video.description.contains(keyword, ignoreCase = true)
        }
    }
}
