package kata;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class AccountBalanceServiceTest {
    //Crear las clases para una cuenta de banco que soporte:
    //- Depósitos y extracciones en pesos (cash-in / cash-out)
    //- Transferencias entre cuentas.
    //- Resumen de cuenta: saldo total en pesos y listado de operaciones.

    @Test
    public void shouldExecuteCashIn(){
        AccountBalanceService.executeCashIn(100, new Object());
        //Validar que el monto de 100$ se acreditó a la cuenta
        //Assertions.assertEquals();
    }

    @Test
    public void shouldExecuteCashOutAndFailBecauseOfInsufficientBalance(){
        AccountBalanceService.executeCashOut(100, new Object());
        //Validar que la extracción falló
    }

    @Test
    public void shouldGenerateAccountSummary(){
        Object account = new Object();
        AccountBalanceService.executeCashIn(100, account);
        AccountBalanceService.executeCashIn(50, account);
        AccountBalanceService.executeCashOut(60, account);

        //Validar que el balance final es de 90$
        //Validar que se generaron 3 operaciones
    }

    @Test
    public void shouldTransferToAnotherUser(){
        AccountBalanceService.executeCashTransfer(100, new Object(), new Object());
        //Validar que el monto se transfirió de un usuario al otro
    }
}
