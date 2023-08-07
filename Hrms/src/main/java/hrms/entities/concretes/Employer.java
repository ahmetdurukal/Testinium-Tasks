package hrms.entities.concretes;
import jakarta.persistence.*;

@Entity
@Table(name = "employer")
public class Employer {
    @Id
    @GeneratedValue
    @Column(name = "employer_id")
    private int id;
    @Column(name = "employer_name")
    private String companyName;
    @Column(name = "employer_adress")
    private String webAdress;
    @Column(name ="employer_phone_number")
    private String phoneNumber;
    public Employer(){
    }
    public Employer(int id, String companyName, String webAdress, String phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.webAdress = webAdress;
        this.phoneNumber = phoneNumber;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getWebAdress() {
        return webAdress;
    }
    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
