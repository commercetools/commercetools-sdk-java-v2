
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingTaxRateForCountryErrorImpl.class)
public interface MissingTaxRateForCountryError extends ErrorObject {

    String MISSING_TAX_RATE_FOR_COUNTRY = "MissingTaxRateForCountry";

    @NotNull
    @JsonProperty("taxCategoryId")
    public String getTaxCategoryId();

    @JsonProperty("country")
    public String getCountry();

    @JsonProperty("state")
    public String getState();

    public void setTaxCategoryId(final String taxCategoryId);

    public void setCountry(final String country);

    public void setState(final String state);

    public static MissingTaxRateForCountryError of() {
        return new MissingTaxRateForCountryErrorImpl();
    }

    public static MissingTaxRateForCountryError of(final MissingTaxRateForCountryError template) {
        MissingTaxRateForCountryErrorImpl instance = new MissingTaxRateForCountryErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setTaxCategoryId(template.getTaxCategoryId());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    public static MissingTaxRateForCountryErrorBuilder builder() {
        return MissingTaxRateForCountryErrorBuilder.of();
    }

    public static MissingTaxRateForCountryErrorBuilder builder(final MissingTaxRateForCountryError template) {
        return MissingTaxRateForCountryErrorBuilder.of(template);
    }

    default <T> T withMissingTaxRateForCountryError(Function<MissingTaxRateForCountryError, T> helper) {
        return helper.apply(this);
    }
}
