package cn.gson.oasys.model.dao.scheduledao;

import java.util.List;

import cn.gson.oasys.model.entity.schedule.ScheduleList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleDao extends JpaRepository<ScheduleList, Long>{

	@Query("from ScheduleList s where s.user.userId=?1")
	List<ScheduleList> findstart(long userid);
}
