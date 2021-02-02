
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeCountryTaxRateFallbackEnabledActionBuilder {

    private Boolean countryTaxRateFallbackEnabled;

    public ProjectChangeCountryTaxRateFallbackEnabledActionBuilder countryTaxRateFallbackEnabled(
            final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public ProjectChangeCountryTaxRateFallbackEnabledAction build() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionImpl(countryTaxRateFallbackEnabled);
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder of() {
        return new ProjectChangeCountryTaxRateFallbackEnabledActionBuilder();
    }

    public static ProjectChangeCountryTaxRateFallbackEnabledActionBuilder of(
            final ProjectChangeCountryTaxRateFallbackEnabledAction template) {
        ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder = new ProjectChangeCountryTaxRateFallbackEnabledActionBuilder();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        return builder;
    }

}
