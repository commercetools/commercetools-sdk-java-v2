
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the Tax Category of at least one of the <code>lineItems</code>, <code>customLineItems</code>, or <code>shippingInfo</code> in the Cart is missing the TaxRate matching <code>country</code> and <code>state</code> given in the <code>shippingAddress</code> of that Cart.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Set Default Shipping Address, Add LineItem, Add CustomLineItem, Set Shipping Address, Set Customer ID, Add LineItem, and Add CustomLineItem update actions</li>
 *   <li>Create Order from Cart and Create Order from Cart in a Store requests.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingTaxRateForCountryError missingTaxRateForCountryError = MissingTaxRateForCountryError.builder()
 *             .message("{message}")
 *             .taxCategoryId("{taxCategoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingTaxRateForCountryErrorImpl.class)
public interface MissingTaxRateForCountryError extends ErrorObject {

    String MISSING_TAX_RATE_FOR_COUNTRY = "MissingTaxRateForCountry";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Tax category $taxCategoryId is missing a tax rate for country $countriesAndStates."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     */
    @NotNull
    @JsonProperty("taxCategoryId")
    public String getTaxCategoryId();

    /**
     *  <p>Country code of the geographic location.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     */

    @JsonProperty("state")
    public String getState();

    public void setMessage(final String message);

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

    public static com.fasterxml.jackson.core.type.TypeReference<MissingTaxRateForCountryError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingTaxRateForCountryError>() {
            @Override
            public String toString() {
                return "TypeReference<MissingTaxRateForCountryError>";
            }
        };
    }
}
