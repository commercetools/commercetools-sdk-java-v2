
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartsConfigurationBuilder implements Builder<CartsConfiguration> {

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private Boolean countryTaxRateFallbackEnabled;

    public CartsConfigurationBuilder deleteDaysAfterLastModification(
            @Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    public CartsConfigurationBuilder countryTaxRateFallbackEnabled(
            @Nullable final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
        return this;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public Boolean getCountryTaxRateFallbackEnabled() {
        return this.countryTaxRateFallbackEnabled;
    }

    public CartsConfiguration build() {
        return new CartsConfigurationImpl(deleteDaysAfterLastModification, countryTaxRateFallbackEnabled);
    }

    /**
     * builds CartsConfiguration without checking for non null required values
     */
    public CartsConfiguration buildUnchecked() {
        return new CartsConfigurationImpl(deleteDaysAfterLastModification, countryTaxRateFallbackEnabled);
    }

    public static CartsConfigurationBuilder of() {
        return new CartsConfigurationBuilder();
    }

    public static CartsConfigurationBuilder of(final CartsConfiguration template) {
        CartsConfigurationBuilder builder = new CartsConfigurationBuilder();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.countryTaxRateFallbackEnabled = template.getCountryTaxRateFallbackEnabled();
        return builder;
    }

}
