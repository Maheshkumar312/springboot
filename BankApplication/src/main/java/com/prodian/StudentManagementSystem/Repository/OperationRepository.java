package com.prodian.StudentManagementSystem.Repository;

import java.awt.print.Pageable;
import java.rmi.server.Operation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.prodian.StudentManagementSystem.Entities.PaymentOperation;
import com.prodian.StudentManagementSystem.Entities.WithdrawalOperation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

	@Query("select op from Operation op where op.account.accountId = :x order by op.operationDate desc")
	public Page<Operation> getAccountOperationsByPage(@Param("x") String accountId, PageRequest pageRequest);

	public void save(WithdrawalOperation withdrawalOp);

	public void save(PaymentOperation paymentOp);

}
