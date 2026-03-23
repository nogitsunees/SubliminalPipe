package org.newpipe.subliminal

fun mainScreen() {
    val videos = filterSubliminal(subliminalVideos)
    for(video in videos) {
        println("${video.title} -> ${video.url}")
    }
}
