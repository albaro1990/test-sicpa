package ec.sicpa.latam.com.dao.impl;

import ec.sicpa.latam.com.dao.IEnterpriseDao;
import ec.sicpa.latam.com.entity.Enterprises;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import javax.persistence.EntityManager;


public class EnterpriseDao extends GenericDao<Enterprises, Long> implements IEnterpriseDao {

	private static final long serialVersionUID = 1L;
	private static final Logger LOG = LoggerFactory.getLogger(EnterpriseDao.class);

	public EnterpriseDao(JpaEntityInformation<Enterprises, Long> ei, EntityManager em) {
		super(ei, em);
	}

}
