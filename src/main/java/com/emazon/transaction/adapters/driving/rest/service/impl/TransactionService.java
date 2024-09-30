package com.emazon.transaction.adapters.driving.rest.service.impl;

import com.emazon.transaction.adapters.driving.rest.dto.request.AddSuppliesRequestDTO;
import com.emazon.transaction.adapters.driving.rest.service.ITransactionService;
import com.emazon.transaction.domain.api.ITransactionServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionService implements ITransactionService {

    private final ITransactionServicePort transactionServicePort;

    @Override
    public void sendAmountProduct(AddSuppliesRequestDTO addSuppliesRequestDTO) {

    }
}
