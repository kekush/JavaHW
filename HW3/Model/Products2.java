package org.example.HW3.Model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Products2 {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer sort;
}