@Controller
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping("/tareas")
    public String listarTareas(Model model) {
        List<Tarea> tareas = tareaService.obtenerTodasLasTareas();
        model.addAttribute("tareas", tareas);
        return "lista-tareas";
    }

    @PostMapping("/agregar-tarea")
    public String agregarTarea(@ModelAttribute Tarea tarea) {
        tareaService.agregarTarea(tarea);
        return "redirect:/tareas";
    }

    // Otros métodos para eliminar, marcar como completada, etc.
}
