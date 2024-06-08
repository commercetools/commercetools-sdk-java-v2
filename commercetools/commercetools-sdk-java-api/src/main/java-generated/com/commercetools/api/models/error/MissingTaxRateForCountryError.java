
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the Tax Category of at least one of the <code>lineItems</code>, <code>customLineItems</code>, or <code>shippingInfo</code> in the Cart is missing the TaxRate matching <code>country</code> and <code>state</code> given in the <code>shippingAddress</code> of that Cart.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Set Default Shipping Address, Add LineItem, Add CustomLineItem, Set Shipping Address, Add LineItem, Add LineItem, and Add CustomLineItem update actions</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests.</li>
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

    /**
     * discriminator value for MissingTaxRateForCountryError
     */
    String MISSING_TAX_RATE_FOR_COUNTRY = "MissingTaxRateForCountry";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Tax category $taxCategoryId is missing a tax rate for country $countriesAndStates."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @return taxCategoryId
     */
    @NotNull
    @JsonProperty("taxCategoryId")
    public String getTaxCategoryId();

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @return state
     */

    @JsonProperty("state")
    public String getState();

    /**
     *  <p><code>"Tax category $taxCategoryId is missing a tax rate for country $countriesAndStates."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @param taxCategoryId value to be set
     */

    public void setTaxCategoryId(final String taxCategoryId);

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     */

    public void setState(final String state);

    /**
     * factory method
     * @return instance of MissingTaxRateForCountryError
     */
    public static MissingTaxRateForCountryError of() {
        return new MissingTaxRateForCountryErrorImpl();
    }

    /**
     * factory method to create a shallow copy MissingTaxRateForCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MissingTaxRateForCountryError of(final MissingTaxRateForCountryError template) {
        MissingTaxRateForCountryErrorImpl instance = new MissingTaxRateForCountryErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTaxCategoryId(template.getTaxCategoryId());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of MissingTaxRateForCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MissingTaxRateForCountryError deepCopy(@Nullable final MissingTaxRateForCountryError template) {
        if (template == null) {
            return null;
        }
        MissingTaxRateForCountryErrorImpl instance = new MissingTaxRateForCountryErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTaxCategoryId(template.getTaxCategoryId());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for MissingTaxRateForCountryError
     * @return builder
     */
    public static MissingTaxRateForCountryErrorBuilder builder() {
        return MissingTaxRateForCountryErrorBuilder.of();
    }

    /**
     * create builder for MissingTaxRateForCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingTaxRateForCountryErrorBuilder builder(final MissingTaxRateForCountryError template) {
        return MissingTaxRateForCountryErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMissingTaxRateForCountryError(Function<MissingTaxRateForCountryError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MissingTaxRateForCountryError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingTaxRateForCountryError>() {
            @Override
            public String toString() {
                return "TypeReference<MissingTaxRateForCountryError>";
            }
        };
    }
}
