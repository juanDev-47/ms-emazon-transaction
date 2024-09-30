package com.emazon.transaction.domain.api.usecase;

import com.emazon.transaction.domain.api.ITransactionServicePort;
import com.emazon.transaction.domain.dto.request.SupplieDTO;
import com.emazon.transaction.domain.spi.ITransactionPersistencePort;

public class TransactionUseCase implements ITransactionServicePort {
    private final ITransactionPersistencePort transactionPersistencePort;

    public TransactionUseCase(ITransactionPersistencePort transactionPersistencePort) {
        this.transactionPersistencePort = transactionPersistencePort;
    }

    @Override
    public void addSupplies(SupplieDTO supplieDTO) {

        System.out.println(supplieDTO.getIdProduct());
        System.out.println(supplieDTO.getAmountProduct());
        System.out.println(supplieDTO.getName());
//        transactionPersistencePort.addSupplies(supplieDTO);
    }
}
