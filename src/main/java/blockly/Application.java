package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Application {

public static final int TIMEOUT = 300;

/**
 *
 * Application
 *
 * @author Root
 * @since 25/02/2026, 10:07:17
 *
 */
public static Var Current() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.logic.Operations.isEmpty(
    Var.valueOf("test"));
    return
cronapi.util.Operations.getApplication();
   }
 }.call();
}

}

