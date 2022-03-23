package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Customer {

    @Id
    private String id;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private String deliveryAddress;
    @Field
    private String phoneNumber;
    @Field
    private String birthDate;
    abstract void makeOrder();
}
