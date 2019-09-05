package cn.gson.oasys.model.dao.processdao;

import java.util.List;

import cn.gson.oasys.model.entity.process.Subject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SubjectDao extends PagingAndSortingRepository<Subject, Long>{

	List<Subject> findByParentId(Long id);
	
	List<Subject> findByParentIdNot(Long id);
	
	
}
