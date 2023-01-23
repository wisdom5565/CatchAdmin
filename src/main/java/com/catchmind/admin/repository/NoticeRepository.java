package com.catchmind.admin.repository;

import com.catchmind.admin.model.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoticeRepository extends JpaRepository<Notice,Long> {
    Optional<Notice> findByNoIdx(Long noidx);

}
