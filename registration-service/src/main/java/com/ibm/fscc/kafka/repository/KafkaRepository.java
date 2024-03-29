package com.ibm.fscc.kafka.repository;

import com.ibm.fscc.kafka.model.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaRepository extends JpaRepository<RegistrationEntity, Long> {
}
