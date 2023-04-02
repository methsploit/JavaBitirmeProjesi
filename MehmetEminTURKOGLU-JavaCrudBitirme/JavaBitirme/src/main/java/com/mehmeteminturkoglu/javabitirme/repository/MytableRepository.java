package com.mehmeteminturkoglu.javabitirme.repository;

import com.mehmeteminturkoglu.javabitirme.dao.DaoMytable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MytableRepository extends JpaRepository<DaoMytable,Long> {



}
