package br.edu.ifsp.scl.sdm.moviesmanager.model.entity

// importações de classes e anotações necessárias para a definição da entidade do Room
import android.os.Parcelable // permite que objetos sejam facilmente transferidos entre componentes
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize // para tornar a classe parcelável

@Parcelize
@Entity
data class Movie (
    @PrimaryKey
    var name: String = "", // nome do filme
    var releaseYear: Int = INVALID_TIME, // ano de lançamento do filme
    var studio: String = "", // estúdio do filme
    var duration: Int = 0, // duração do filme em minutos
    var watched: Boolean = NOT_WATCHED, // flag para indicar se o filme foi assistido
    var userRating: Float? = null, // nota do filme
    var genre: String = "" // gênero do filme (romance, aventura, terror etc.)
): Parcelable {
    companion object {
        const val INVALID_TIME = -1
        const val WATCHED = true
        const val NOT_WATCHED = false
    }
}