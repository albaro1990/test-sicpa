package ec.sicpa.latam.com.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public abstract class BaseDto implements Serializable {

	protected String createBy;

	protected Date createDate;

	protected String status;

	protected Date modifiedDate;

	protected String modifiedBy;

}
