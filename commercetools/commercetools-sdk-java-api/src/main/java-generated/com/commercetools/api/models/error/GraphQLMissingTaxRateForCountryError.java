
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
 *  <p>The error can be returned as a failed response to all update actions on Carts and Staged Orders.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store requests and Set CustomerGroup update action on Customers.</li>
 *   <li>Authenticate (sign in) Customer and Authenticate (sign in) Customer in Store on My Customer Profile.</li>
 *   <li>Create Cart, Create Cart in Store, Replicate Cart, and Replicate Cart in Store requests on Carts.</li>
 *   <li>Create Cart and Create Cart in Store and Replicate My Cart requests on My Carts.</li>
 *   <li>Create Cart in BusinessUnit and Replicate Cart in Business Unit requests on Associate Carts.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *   <li>Create Order from Cart in BusinessUnit requests on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMissingTaxRateForCountryError graphQLMissingTaxRateForCountryError = GraphQLMissingTaxRateForCountryError.builder()
 *             .taxCategoryId("{taxCategoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMissingTaxRateForCountryErrorImpl.class)
public interface GraphQLMissingTaxRateForCountryError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMissingTaxRateForCountryError
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
     * @return instance of GraphQLMissingTaxRateForCountryError
     */
    public static GraphQLMissingTaxRateForCountryError of() {
        return new GraphQLMissingTaxRateForCountryErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMissingTaxRateForCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMissingTaxRateForCountryError of(final GraphQLMissingTaxRateForCountryError template) {
        GraphQLMissingTaxRateForCountryErrorImpl instance = new GraphQLMissingTaxRateForCountryErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTaxCategoryId(template.getTaxCategoryId());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLMissingTaxRateForCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMissingTaxRateForCountryError deepCopy(
            @Nullable final GraphQLMissingTaxRateForCountryError template) {
        if (template == null) {
            return null;
        }
        GraphQLMissingTaxRateForCountryErrorImpl instance = new GraphQLMissingTaxRateForCountryErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setTaxCategoryId(template.getTaxCategoryId());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for GraphQLMissingTaxRateForCountryError
     * @return builder
     */
    public static GraphQLMissingTaxRateForCountryErrorBuilder builder() {
        return GraphQLMissingTaxRateForCountryErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMissingTaxRateForCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMissingTaxRateForCountryErrorBuilder builder(
            final GraphQLMissingTaxRateForCountryError template) {
        return GraphQLMissingTaxRateForCountryErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMissingTaxRateForCountryError(Function<GraphQLMissingTaxRateForCountryError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMissingTaxRateForCountryError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMissingTaxRateForCountryError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMissingTaxRateForCountryError>";
            }
        };
    }
}
