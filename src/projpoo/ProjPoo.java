package projpoo;

import projpoo.view.Manager;
import projpoo.view.Menus;

/**
 *
 * @author Clara
 */
public class ProjPoo {


    public static void main(String[] args) {

        Menus menu = new Menus();
        Manager m = new Manager();
        
        m.boasVindas();
        menu.menuPrincipal();
        
    }
    
}
