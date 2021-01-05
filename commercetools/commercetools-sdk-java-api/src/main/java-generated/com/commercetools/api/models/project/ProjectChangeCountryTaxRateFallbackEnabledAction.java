package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionImpl;

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
@JsonDeserialize(as = ProjectChangeCountryTaxRateFallbackEnabledActionImpl.class)
public interface ProjectChangeCountryTaxRateFallbackEnabledAction extends ProjectUpdateAction {

    /**
    *  <p>default value is <code>false</code></p>
    */
    @NotNull
    @JsonProperty("countryTaxRateFallbackEnabled")
    public Boolean getCountryTaxRateFallbackEnabled();

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);

    public static ProjectChangeCountryTaxRateFallbackEnabledAction of(){
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
    }
    

    public static ProjectChangeCountryTaxRateFallbackEnabledAction of(final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionImpl instance = new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        return instance;
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder(){
        return ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of();
    }
    
    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder(final ProjectChangeCountryTaxRateFallbackEnabledAction template){
        return ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of(template);
    }
    

    default <T> T withProjectChangeCountryTaxRateFallbackEnabledAction(Function<ProjectChangeCountryTaxRateFallbackEnabledAction, T> helper) {
        return helper.apply(this);
    }
}
