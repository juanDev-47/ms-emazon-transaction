package com.emazon.transaction.adapters.driving.rest.controller;

import com.emazon.transaction.adapters.driving.rest.dto.request.AddSuppliesRequestDTO;
import com.emazon.transaction.adapters.driving.rest.service.ITransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final ITransactionService transactionService;

    @Operation(summary = "Send id and amount to increase product stock")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Id and amount send succeeded", content = @Content),
    })
    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_AUX_BODEGA')")
    public ResponseEntity<?> addSupplies(@Valid @RequestBody AddSuppliesRequestDTO suppliesRequestDTO) {
        transactionService.sendAmountProduct(suppliesRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
