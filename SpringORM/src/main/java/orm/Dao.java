package orm;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
public class Dao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insertModel(Model m) {
		int i = (Integer) this.hibernateTemplate.save(m);
		return i;
	}
	
	public Model getModelById(int id) {
		 return this.hibernateTemplate.get(Model.class, id);
	}
	
	public List<Model> getAllModels(){
		List<Model> list = this.hibernateTemplate.loadAll(Model.class);
		return list;
	}
	@Transactional
	public void updateModel(Model m) {
		this.hibernateTemplate.update(m);
	}
	@Transactional
	public  void deleteModel(Model m) {
		this.hibernateTemplate.delete(m);
	}
}
