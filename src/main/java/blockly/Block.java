package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Block {

public static final int TIMEOUT = 300;

/**
 *
 * @author Root
 * @since 25/02/2026, 14:09:44
 *
 */
public static Var Execute() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    Var.valueOf("testee");
    return Var.VAR_NULL;
   }
 }.call();
}

}

