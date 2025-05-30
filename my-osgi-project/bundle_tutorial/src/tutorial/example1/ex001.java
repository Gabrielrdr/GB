package tutorial.example1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceEvent;

public class Activator implements BundleActivator, ServiceListener
{
    public void start(BundleContext context) {
        System.out.println("Começando a ouvir eventos de serviço.");
        context.addServiceListener(this);
    }

    public void stop(BundleContext context) {
        context.removeServiceListener(this);
        System.out.println("Parou de ouvir eventos de serviço.");
    }

    public void serviceChanged(ServiceEvent event) {
        String[] objectClass = (String[]) event.getServiceReference().getProperty("objectClass");
        if (event.getType() == ServiceEvent.REGISTERED) {
            System.out.println("Ex1: Serviço do tipo " + objectClass[0] + " registrado.");
        } else if (event.getType() == ServiceEvent.UNREGISTERING) {
            System.out.println("Ex1: Serviço do tipo " + objectClass[0] + " não registrado.");
        } else if (event.getType() == ServiceEvent.MODIFIED) {
            System.out.println("Ex1: Serviço do tipo " + objectClass[0] + " modificado.");
        }
    }
}
