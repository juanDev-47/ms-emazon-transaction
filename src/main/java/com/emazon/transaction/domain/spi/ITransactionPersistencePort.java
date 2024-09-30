package com.emazon.transaction.domain.spi;

import com.emazon.transaction.domain.dto.request.SupplieDTO;

public interface ITransactionPersistencePort {
    void addSupplies(SupplieDTO supplieDTO);
}
