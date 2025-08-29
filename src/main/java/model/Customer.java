package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Customer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerNumber;
    private String customerEmail;
}
