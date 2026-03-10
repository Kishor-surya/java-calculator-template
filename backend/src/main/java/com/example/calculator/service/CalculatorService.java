@Service
public class CalculatorService {
    @Autowired
    private CalculationRepository repo;

    public CalculationRecord calculate(String operation, int result) {
        CalculationRecord record = new CalculationRecord(operation, result);
        return repo.save(record);
    }
}
