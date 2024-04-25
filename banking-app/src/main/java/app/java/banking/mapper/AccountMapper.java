package app.java.banking.mapper;

import app.java.banking.dto.AccountDto;
import app.java.banking.entity.Account;


public class AccountMapper {
    @org.jetbrains.annotations.NotNull
    public static Account mapToAccount(AccountDto accountDto)
    {

         Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
return accountDto;
    }

}
