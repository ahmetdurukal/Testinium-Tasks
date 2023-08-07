package hrms.entities.concretes;
import jakarta.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue
    @Column(name = "candidate_id")
    private int id;
    @Column(name = "candidate_first_name")
    private String firstName;
    @Column(name = "candidate_last_name")
    private String lastName;
    @Column(name = "candidate_identity_number")
    private String identityNumber;
    @Column(name = "candidate_date_of_birth")
    private String dateOfBirth;
    @Column(name = "candidate_password")
    private String password;
    public Candidate(){
    }
    public Candidate(int id, String firstName, String lastName, String identityNumber, String dateOfBirth, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getIdentityNumber() {
        return identityNumber;
    }
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
