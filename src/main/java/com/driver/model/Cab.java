import javax.persistence.*;

@Entity
@Table(name="cab")

public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int perKmRate;
    boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;

    public Cab(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
