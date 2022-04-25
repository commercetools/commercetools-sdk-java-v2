
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
    *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="ctp:api:type:CartDraft">CartDraft</a>. This field may not be present on Projects created before January 2020.</p>
    */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
    *  <p>Indicates if country <em>- no state</em> Tax Rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all Tax Categories of a Cart Line Items. This field may not be present on Projects created before June 2020.</p>
    */

    @JsonProperty("countryTaxRateFallbackEnabled")
    public Boolean getCountryTaxRateFallbackEnabled();

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled);

    public static CartsConfiguration of() {
        return new CartsConfigurationImpl();
    }

    public static CartsConfiguration of(final CartsConfiguration template) {
        CartsConfigurationImpl instance = new CartsConfigurationImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
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

    public static com.fasterxml.jackson.core.type.TypeReference<CartsConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartsConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<CartsConfiguration>";
            }
        };
    }
}
