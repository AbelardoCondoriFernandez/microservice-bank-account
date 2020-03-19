package com.everis.bank.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Document
@Getter @Setter
@AllArgsConstructor
public class BankAccount {
    @Id
    private String idBankAccount;
    @NotEmpty
    private String codeBankAccount;
    @NotEmpty
    private String descriptionBankAccount;

    @NotEmpty
    private Integer numMaxDepositBankAccount;

    @NotEmpty
    private Integer numMaxWithdrawalBankAccount;
    @DBRef
    @Valid
    private BankAccountType bankAccountType;

    @NotEmpty
    private Double commissionBankAccount;
}
