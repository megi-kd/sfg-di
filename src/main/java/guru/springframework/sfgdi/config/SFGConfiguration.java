package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("guru")
@Configuration
public class SFGConfiguration {
    private String username;
    private String password;
    private String JdBcUrL;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdBcUrL() {
        return JdBcUrL;
    }

    public void setJdBcUrL(String jdBcUrL) {
        JdBcUrL = jdBcUrL;
    }
}
