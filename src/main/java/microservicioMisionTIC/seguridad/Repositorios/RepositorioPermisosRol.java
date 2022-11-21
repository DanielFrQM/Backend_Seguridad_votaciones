package microservicioMisionTIC.seguridad.Repositorios;
import org.springframework.data.mongodb.repository.MongoRepository;
import microservicioMisionTIC.seguridad.Modelos.PermisosRol;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioPermisosRol extends MongoRepository<PermisosRol, String> {
    @Query("{'rol.$id': ObjectId(?0),'permiso.$id': ObjectId(?1)}")// SELECT * FROM PermisosRol WHERE id_rol (JOIN) = ?0 and id_permiso (JOIN) = ?1
    PermisosRol getPermisoRol(String id_rol,String id_permiso);
}
