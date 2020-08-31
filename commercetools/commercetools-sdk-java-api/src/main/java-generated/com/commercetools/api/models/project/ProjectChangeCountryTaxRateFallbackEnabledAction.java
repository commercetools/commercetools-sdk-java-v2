package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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

    public static ProjectChangeCountryTaxRateFallbackEnabledActionImpl of(){
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
    }
    

    public static ProjectChangeCountryTaxRateFallbackEnabledActionImpl of(final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionImpl instance = new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        return instance;
    }

}
