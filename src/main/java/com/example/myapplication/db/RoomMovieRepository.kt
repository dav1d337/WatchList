package com.example.myapplication.db

import com.example.myapplication.Movie
import com.example.myapplication.di.ApplicationScope
import io.reactivex.Flowable
import javax.inject.Inject

@ApplicationScope
class RoomMovieRepository @Inject
constructor(private val dao: RoomMovieDao) : MovieRepository {

    override fun get(id: Long): Flowable<Movie> {
        return dao.get(id).map { convert(it) }
    }

    override fun deleteAll() {
        dao.deleteAll()
    }

    override fun insert(movie: Movie): Long {
        return dao.insert(convert(movie))
    }

    override fun getAll(): Flowable<List<Movie>> {
        return dao.getAll().map { list -> list.map { convert(it) } }
    }

    fun convert(e: RoomMovie): Movie {
        return Movie(e.id, e.title, e.vote_average,e.genres, e.backdropPath,e.release_date,e.description,e.posterPath)
    }

    fun convert(e: Movie): RoomMovie {
        return RoomMovie(
            title = e.title,
            vote_average = e.voteAverage,
            genres = e.genres,
            backdropPath = e.backdropPath,
            release_date = e.releaseDate,
            description = e.overview,
            posterPath = e.posterPath).apply { id = e.id }
    }

}