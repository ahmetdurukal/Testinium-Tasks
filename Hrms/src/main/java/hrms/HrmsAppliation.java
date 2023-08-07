package hrms;
import  io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class HrmsAppliation {
    public static void main(String[] args) {
        SpringApplication.run(HrmsAppliation.class, args);
    }
    @Bean

    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                        .info(new Info()
                        .title("hrms")
                        .version("1.0")
                        .description("""

                                This is an api provides weather report

                                for last 30 minutes based on city names

                                """));

    }
}


