package com.emazon.transaction.adapters.driving.rest.service;

import com.emazon.transaction.adapters.driving.rest.dto.request.AddSuppliesRequestDTO;

public interface ITransactionService {

    void sendAmountProduct(AddSuppliesRequestDTO addSuppliesRequestDTO);
}
