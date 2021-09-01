
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartsConfigurationBuilder implements Builder<CartsConfiguration> {

    @Nullable
    private Boolean countryTaxRateFallbackEnabled;

    @Nullable
    private Long deleteDaysAfterLastModification;

    public CartsConfigurationBuilder countryTaxRateFallbackEnabled(
            @Nullable final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    public CartsConfigurationBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    @Nullable
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public CartsConfiguration build() {
        return new CartsConfigurationImpl(countryTaxRateFallbackEnabled, deleteDaysAfterLastModification);
    }

    /**
     * builds CartsConfiguration without checking for non null required values
     */
    public CartsConfiguration buildUnchecked() {
        return new CartsConfigurationImpl(countryTaxRateFallbackEnabled, deleteDaysAfterLastModification);
    }

    public static CartsConfigurationBuilder of() {
        return new CartsConfigurationBuilder();
    }

    public static CartsConfigurationBuilder of(final CartsConfiguration template) {
        CartsConfigurationBuilder builder = new CartsConfigurationBuilder();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        return builder;
    }

}
