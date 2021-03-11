package rest;

import java.util.HashSet;
import javax.ws.rs.ApplicationPath;
import utils.cors.CorsRequestFilter;
import utils.cors.CorsResponseFilter;
import utils.errorhandling.GenericExceptionMapper;
import java.util.Set;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.wadl.internal.WadlResource;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(CorsRequestFilter.class);
        resources.add(CorsResponseFilter.class);
        resources.add(GenericExceptionMapper.class);
        resources.add(WadlResource.class);
        resources.add(RenameMeResource.class);
    }
    
}
