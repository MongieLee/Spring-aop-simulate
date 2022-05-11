package cn.mjl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@Repository("userFFF")
public class User {
    @Value("父亲")
    private String name;
    private Integer id;

    public User() {
        System.out.println("Userfu");
    }
}
