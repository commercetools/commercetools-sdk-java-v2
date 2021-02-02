
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingTaxRateForCountryErrorBuilder {

    private String message;

    private String taxCategoryId;

    @Nullable
    private String country;

    @Nullable
    private String state;

    public MissingTaxRateForCountryErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public MissingTaxRateForCountryErrorBuilder taxCategoryId(final String taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
        return this;
    }

    public MissingTaxRateForCountryErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public MissingTaxRateForCountryErrorBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTaxCategoryId() {
        return this.taxCategoryId;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    public MissingTaxRateForCountryError build() {
        return new MissingTaxRateForCountryErrorImpl(message, taxCategoryId, country, state);
    }

    public static MissingTaxRateForCountryErrorBuilder of() {
        return new MissingTaxRateForCountryErrorBuilder();
    }

    public static MissingTaxRateForCountryErrorBuilder of(final MissingTaxRateForCountryError template) {
        MissingTaxRateForCountryErrorBuilder builder = new MissingTaxRateForCountryErrorBuilder();
        builder.message = template.getMessage();
        builder.taxCategoryId = template.getTaxCategoryId();
        builder.country = template.getCountry();
        builder.state = template.getState();
        return builder;
    }

}
