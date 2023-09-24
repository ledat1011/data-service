package com.example.dataservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dataservice.entity.SystemParamEntity;
import com.example.dataservice.entity.SystemParamId;

public interface SystemParamRepository extends JpaRepository<SystemParamEntity, SystemParamId> {
	SystemParamEntity findByParamKeyAndParamGroup(String paramKey, String paramGroup);
}
