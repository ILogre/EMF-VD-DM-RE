/**
 * generated by Xtext 2.12.0
 */
package visualizationDesignLanguage.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import visualizationDesignLanguage.DSLRuntimeModule;
import visualizationDesignLanguage.DSLStandaloneSetup;
import visualizationDesignLanguage.ide.DSLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DSLIdeSetup extends DSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    DSLRuntimeModule _dSLRuntimeModule = new DSLRuntimeModule();
    DSLIdeModule _dSLIdeModule = new DSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_dSLRuntimeModule, _dSLIdeModule));
  }
}
