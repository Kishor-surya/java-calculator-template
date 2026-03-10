@Entity
public class CalculationRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String operation;
    private int result;

    // constructors, getters, setters
}
