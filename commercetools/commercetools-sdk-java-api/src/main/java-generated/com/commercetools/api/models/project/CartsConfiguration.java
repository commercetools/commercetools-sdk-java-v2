
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartsConfigurationImpl.class)
public interface CartsConfiguration {

    /**
    *  <p>if country - no state tax rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all tax categories of a cart line items. Default value 'false'</p>
    */

    @JsonProperty("countryTaxRateFallbackEnabled")
    public Boolean getCountryTaxRateFallbackEnabled();

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);

    public static CartsConfiguration of() {
        return new CartsConfigurationImpl();
    }

    public static CartsConfiguration of(final CartsConfiguration template) {
        CartsConfigurationImpl instance = new CartsConfigurationImpl();
        instance.setCountryTaxRateFallbackEnabled(template.getCountryTaxRateFallbackEnabled());
        return instance;
    }

    public static CartsConfigurationBuilder builder() {
        return CartsConfigurationBuilder.of();
    }

    public static CartsConfigurationBuilder builder(final CartsConfiguration template) {
        return CartsConfigurationBuilder.of(template);
    }

    default <T> T withCartsConfiguration(Function<CartsConfiguration, T> helper) {
        return helper.apply(this);
    }
}
