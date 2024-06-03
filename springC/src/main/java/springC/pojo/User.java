package springC.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class User {
    private String name;

    public User() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username : admin or register or other");
        this.name = sc.nextLine();
    }
}
