package com.emazon.transaction.domain.api;

import com.emazon.transaction.domain.dto.request.SupplieDTO;

public interface ITransactionServicePort {
    void addSupplies(SupplieDTO supplieDTO);
}
