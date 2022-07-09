package pe.org.chaclacayo.pyfinal2.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.chaclacayo.pyfinal2.entity.Registro;
import pe.org.chaclacayo.pyfinal2.repositorio.RegistroRepository;

/**
 *
 * @author Asus
 */
@Service
public class RegistroService implements Operaciones<Registro> {

    @Autowired
    private RegistroRepository registroRepository;

    @Override
    public Registro create(Registro  t) {
        return registroRepository.save(t);

    }

    @Override
    public Registro update(Registro t) {
        return registroRepository.save(t);
    }

    @Override
    public void delete(int id) {
        registroRepository.deleteById(id);
    }

    @Override
    public Registro read(int id) {
        return registroRepository.findById(id).get();
    }

    @Override
    public List<Registro> readAll() {
        return registroRepository.findAll();
    }

}