
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCountryTaxRateFallbackEnabledActionImpl.class)
public interface ProjectChangeCountryTaxRateFallbackEnabledAction extends ProjectUpdateAction {

    String CHANGE_COUNTRY_TAX_RATE_FALLBACK_ENABLED = "changeCountryTaxRateFallbackEnabled";

    /**
    *  <p>default value is <code>false</code></p>
    */
    @NotNull
    @JsonProperty("countryTaxRateFallbackEnabled")
    public Boolean getCountryTaxRateFallbackEnabled();

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);

    public static ProjectChangeCountryTaxRateFallbackEnabledAction of() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledAction of(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionImpl instance = new ProjectChangeCountryTaxRateFallbackEnabledActionImpl();
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        return instance;
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder() {
        return ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of();
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        return ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of(template);
    }

    default <T> T withProjectChangeCountryTaxRateFallbackEnabledAction(
            Function<ProjectChangeCountryTaxRateFallbackEnabledAction, T> helper) {
        return helper.apply(this);
    }
}
