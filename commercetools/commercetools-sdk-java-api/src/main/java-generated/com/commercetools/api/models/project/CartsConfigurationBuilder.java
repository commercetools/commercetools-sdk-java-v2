
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartsConfigurationBuilder {

    @Nullable
    private Boolean countryTaxRateFallbackEnabled;

    public CartsConfigurationBuilder countryTaxRateFallbackEnabled(
            @Nullable final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    @Nullable
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public CartsConfiguration build() {
        return new CartsConfigurationImpl(countryTaxRateFallbackEnabled);
    }

    public static CartsConfigurationBuilder of() {
        return new CartsConfigurationBuilder();
    }

    public static CartsConfigurationBuilder of(final CartsConfiguration template) {
        CartsConfigurationBuilder builder = new CartsConfigurationBuilder();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        return builder;
    }

}
