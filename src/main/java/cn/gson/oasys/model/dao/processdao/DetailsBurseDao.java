package cn.gson.oasys.model.dao.processdao;

import java.util.List;

import cn.gson.oasys.model.entity.process.Bursement;
import cn.gson.oasys.model.entity.process.DetailsBurse;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DetailsBurseDao extends PagingAndSortingRepository<DetailsBurse, Long>{

	List<DetailsBurse> findByBurs(Bursement bu);
}
