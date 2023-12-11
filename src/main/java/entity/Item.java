package entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Item {
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
