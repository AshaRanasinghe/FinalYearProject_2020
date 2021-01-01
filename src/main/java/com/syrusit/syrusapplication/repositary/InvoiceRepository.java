package com.syrusit.syrusapplication.repositary;

import com.syrusit.syrusapplication.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {


}
