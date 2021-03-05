package ebucelik.keepeasy.dataclasses

data class Movie(
    var title: String = "Movie Title", var description: String = "No story available yet.", var rating: Float = 1.5f,
    var genres: String = "Comedy", var creators: String = "Ebu, Gabriel, Franz", var actors: String = "Hubert, Susi")