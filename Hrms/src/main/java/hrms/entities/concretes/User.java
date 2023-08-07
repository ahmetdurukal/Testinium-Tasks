package hrms.entities.concretes;
import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "dtype")
    private String dtype;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "web_adress")
    private String webAddress;
    public User(){}

    public User(int id, String email, String password, String dtype, String companyName, String webAddress) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.dtype = dtype;
        this.companyName = companyName;
        this.webAddress = webAddress;
    }
    public int getId(String id) {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDtype() {
        return dtype;
    }
    public void setDtype(String dtype) {
        this.dtype = dtype;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getWebAddress() {
        return webAddress;
    }
    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
}
