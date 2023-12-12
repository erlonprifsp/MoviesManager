package br.edu.ifsp.scl.sdm.moviesmanager.model.database

import androidx.room.Database // banco de dados
import androidx.room.RoomDatabase // classe base para os bancos de dados Room
import br.edu.ifsp.scl.sdm.moviesmanager.model.dao.MovieDao // acesso DAO
import br.edu.ifsp.scl.sdm.moviesmanager.model.entity.Movie // acesso a entity

// Room irá fornecer a implementação dos métodos da base de dados

@Database(entities = [Movie::class], version = 1) // indica que a entidade Movie é parte do banco de dados
abstract class MoviesManagerDatabase: RoomDatabase() { // define a classe MoviesManagerDatabase como uma subclasse de RoomDatabase
    companion object {
        const val MOVICES_MANAGER_DATABASE = "moviesManagerDatabase" // constante que armazena o nome do banco de dados
    }
    abstract fun getMovieDao(): MovieDao // implementa o MovieDAO para acessar operações relacionadas à filmes no banco de dados
}


