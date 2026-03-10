@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService service;

    @GetMapping("/add")
    public CalculationRecord add(@RequestParam int a, @RequestParam int b) {
        return service.calculate("add", a + b);
    }

    @GetMapping("/subtract")
    public CalculationRecord subtract(@RequestParam int a, @RequestParam int b) {
        return service.calculate("subtract", a - b);
    }
}
