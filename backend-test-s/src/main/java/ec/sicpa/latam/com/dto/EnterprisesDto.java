package ec.sicpa.latam.com.dto;

import lombok.*;

@Data
public class EnterprisesDto extends BaseDto {

    private Long id;

    private String address;

    private String name;

    private String phone;
}
