package cn.gson.oasys.model.dao.plandao;

import java.util.List;

import cn.gson.oasys.model.entity.process.EvectionMoney;
import cn.gson.oasys.model.entity.process.Traffic;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TrafficDao extends PagingAndSortingRepository<Traffic, Long>{

	List<Traffic> findByEvection(EvectionMoney money);
}
