package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Customer {
    private String id;
    private String name;
    private String address;
    private double salary;
}
