package com.emazon.transaction.adapters.driving.rest.mapper;

import com.emazon.transaction.adapters.driving.rest.dto.request.AddSuppliesRequestDTO;
import com.emazon.transaction.domain.dto.request.SupplieDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TransactionMapper {
    SupplieDTO toSupplieDTO(AddSuppliesRequestDTO addSuppliesRequestDTO);
}
