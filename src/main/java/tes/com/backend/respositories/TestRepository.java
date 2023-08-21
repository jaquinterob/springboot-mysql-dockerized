package tes.com.backend.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tes.com.backend.entities.Test;

public interface TestRepository extends JpaRepository<Test,String> {
}
