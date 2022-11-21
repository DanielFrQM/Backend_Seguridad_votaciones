package microservicioMisionTIC.seguridad.Repositorios;
import microservicioMisionTIC.seguridad.Modelos.Permiso;
import microservicioMisionTIC.seguridad.Modelos.PermisosRol;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
    @Query("{'url': ?0, 'metodo': ?1}")// SELECT * FROM Permiso WHERE url = ?0 and metodo = ?1
    Permiso getPermiso(String url, String metodo);
}
