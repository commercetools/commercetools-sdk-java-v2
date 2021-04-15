package com.commercetools.api.models.project;

import com.commercetools.api.models.project.CartsConfiguration;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeCartsConfigurationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeCartsConfigurationImpl.class)
public interface ProjectChangeCartsConfiguration extends ProjectUpdateAction {

    String CHANGE_CARTS_CONFIGURATION = "changeCartsConfiguration";

    
    @Valid
    @JsonProperty("cartsConfiguration")
    public CartsConfiguration getCartsConfiguration();

    
    public void setCartsConfiguration(final CartsConfiguration cartsConfiguration);
    

    public static ProjectChangeCartsConfiguration of(){
        return new ProjectChangeCartsConfigurationImpl();
    }
    

    public static ProjectChangeCartsConfiguration of(final ProjectChangeCartsConfiguration template) {
        ProjectChangeCartsConfigurationImpl instance = new ProjectChangeCartsConfigurationImpl();
        instance.setCartsConfiguration(template.getCartsConfiguration());
        return instance;
    }

    public static ProjectChangeCartsConfigurationBuilder builder(){
        return ProjectChangeCartsConfigurationBuilder.of();
    }
    
    public static ProjectChangeCartsConfigurationBuilder builder(final ProjectChangeCartsConfiguration template){
        return ProjectChangeCartsConfigurationBuilder.of(template);
    }
    

    default <T> T withProjectChangeCartsConfiguration(Function<ProjectChangeCartsConfiguration, T> helper) {
        return helper.apply(this);
    }
}
