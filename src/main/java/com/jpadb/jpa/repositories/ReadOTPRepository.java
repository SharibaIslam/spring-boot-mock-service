package com.jpadb.jpa.repositories;

import com.jpadb.jpa.entity.OTPRead;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@Qualifier(value = "ReadOTPRepository")
public interface ReadOTPRepository extends JpaRepository<OTPRead,Long> {
    /*@Transactional
    @Modifying*/
    @Query(value = "SELECT n.code FROM otp_log n WHERE n.mobile_no= :mobile ORDER BY n.id DESC limit 1",nativeQuery = true)
    public String findBy_mobile(@RequestParam("mobile") String mobile);

    @Query(value = "SELECT * FROM otp_log n  ORDER BY n.id DESC limit 10",nativeQuery = true)
    public List<OTPRead> getAllMobileOTP();
}
