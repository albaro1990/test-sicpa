package ec.sicpa.latam.com.service.impl;

import ec.sicpa.latam.com.entity.Enterprises;
import ec.sicpa.latam.com.service.IEnterprisesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * <b> Descripcion de la clase, interface o enumeracion. </b>
 * 
 * @author amf
 * @version $1.0$
 */

@Scope("singleton")
@Service("EnterpriseService")
public class EnterpriseService extends GenericService<Enterprises, Long> implements IEnterprisesService {

	private static final long serialVersionUID = 1L;
	private static final Logger LOG = LoggerFactory.getLogger(EnterpriseService.class);



}
