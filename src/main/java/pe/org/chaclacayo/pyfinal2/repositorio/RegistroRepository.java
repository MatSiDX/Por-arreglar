package pe.org.chaclacayo.pyfinal2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.org.chaclacayo.pyfinal2.entity.Registro;

/**
 *
 * @author admin
 */
@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer>{


}