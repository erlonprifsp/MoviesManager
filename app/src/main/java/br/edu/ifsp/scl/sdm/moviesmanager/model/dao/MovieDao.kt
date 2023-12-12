package br.edu.ifsp.scl.sdm.moviesmanager.model.dao

//  importações de classes e anotações do Room
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.edu.ifsp.scl.sdm.moviesmanager.model.entity.Movie

@Dao
interface MovieDao {
    companion object {
        const val MOVIE_TABLE = "movie" // define uma constante MOVIE_TABLE com o valor movie
    }

    // implementação do CRUD

    @Insert
    fun createMovie(movie: Movie) // insere um objeto Movie no banco de dados
    @Query("SELECT * FROM $MOVIE_TABLE")
    fun retrieveMovies(): List<Movie> // recupera todos os filmes da tabela do banco de dados
    @Update
    fun updateMovie(movie: Movie) // atualiza um objeto Movie no banco de dados
    @Delete
    fun deleteMovie(movie: Movie) // exclui um objeto Movie do banco de dados

}

