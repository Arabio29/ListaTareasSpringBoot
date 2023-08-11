@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }

    public void agregarTarea(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    // Otros métodos para eliminar, marcar como completada, etc.
}

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    // Métodos personalizados si es necesario
}
