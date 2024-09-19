package com.onboarding.test.zoloz.repository;

import com.onboarding.test.zoloz.model.FileRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRecordRepository extends JpaRepository<FileRecord, Integer> {
}
