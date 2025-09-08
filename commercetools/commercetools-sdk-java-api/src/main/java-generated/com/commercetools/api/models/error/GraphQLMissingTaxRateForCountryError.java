
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
 *  <p>Returned when the Tax Category of at least one of the <code>lineItems</code>, <code>customLineItems</code>, or <code>shippingInfo</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> is missing the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> matching <code>country</code> and <code>state</code> given in the <code>shippingAddress</code> of that Cart.</p>
 *  <p>The error can be returned as a failed response to all update actions on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUpdateAction" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderUpdateAction" rel="nofollow">Staged Orders</a>.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">Authenticate (sign in) Customer</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/login:POST" rel="nofollow">Authenticate (sign in) Customer in Store</a> requests and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAction" rel="nofollow">Set CustomerGroup</a> update action on Customers.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/login:POST" rel="nofollow">Authenticate (sign in) Customer</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/login:POST" rel="nofollow">Authenticate (sign in) Customer in Store</a> on My Customer Profile.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">Create Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts:POST" rel="nofollow">Create Cart in Store</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts/replicate:POST" rel="nofollow">Replicate Cart</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts/replicate:POST" rel="nofollow">Replicate Cart in Store</a> requests on Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/carts:POST" rel="nofollow">Create Cart in Store</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts/replicate:POST" rel="nofollow">Replicate My Cart</a> requests on My Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts:POST" rel="nofollow">Create Cart in BusinessUnit</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts/replicate:POST" rel="nofollow">Replicate Cart in Business Unit</a> requests on Associate Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> requests on Associate Orders.</li>
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
@io.vrap.rmf.base.client.utils.json.SubType("MissingTaxRateForCountry")
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
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
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
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
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

    public GraphQLMissingTaxRateForCountryError copyDeep();

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
