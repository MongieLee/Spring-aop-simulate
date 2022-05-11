package cn.mjl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Repository("userzzz")
public class UserZi extends User {
    @Value("儿子")
    private String name;
    private Integer id;


    public UserZi(){
        System.out.println("UserZi");
    }
}
