
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the Product Variant does not have a Price according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code> value for a selected currency, country, Customer Group, or Channel.</p>
 *  <p>The error can be returned as a failed response to all update actions on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUpdateAction" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderUpdateAction" rel="nofollow">Staged Orders</a>.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">Authenticate (sign in) Customer</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/login:POST" rel="nofollow">Authenticate (sign in) Customer in Store</a> requests and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomerGroupAction" rel="nofollow">Set CustomerGroup</a> update action on Customers.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/login:POST" rel="nofollow">Authenticate (sign in) Customer</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/login:POST" rel="nofollow">Authenticate (sign in) Customer in Store</a> requests on My Customer Profile.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">Create Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts:POST" rel="nofollow">Create Cart in Store</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts/replicate:POST" rel="nofollow">Replicate Cart</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts/replicate:POST" rel="nofollow">Replicate Cart in Store</a> requests on Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/carts:POST" rel="nofollow">Create Cart in Store</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts/replicate:POST" rel="nofollow">Replicate My Cart</a> requests on My Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts:POST" rel="nofollow">Create Cart in BusinessUnit</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts/replicate:POST" rel="nofollow">Replicate Cart in Business Unit</a> requests on Associate Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> request on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMatchingPriceNotFoundError graphQLMatchingPriceNotFoundError = GraphQLMatchingPriceNotFoundError.builder()
 *             .productId("{productId}")
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MatchingPriceNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMatchingPriceNotFoundErrorImpl.class)
public interface GraphQLMatchingPriceNotFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMatchingPriceNotFoundError
     */
    String MATCHING_PRICE_NOT_FOUND = "MatchingPriceNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in the Product.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Currency code of the country.</p>
     * @return currency
     */

    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Channel associated with the Price.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>Unique identifier of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> in the Product.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>Currency code of the country.</p>
     * @param currency value to be set
     */

    public void setCurrency(final String currency);

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Channel associated with the Price.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelReference channel);

    /**
     * factory method
     * @return instance of GraphQLMatchingPriceNotFoundError
     */
    public static GraphQLMatchingPriceNotFoundError of() {
        return new GraphQLMatchingPriceNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMatchingPriceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMatchingPriceNotFoundError of(final GraphQLMatchingPriceNotFoundError template) {
        GraphQLMatchingPriceNotFoundErrorImpl instance = new GraphQLMatchingPriceNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        return instance;
    }

    public GraphQLMatchingPriceNotFoundError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLMatchingPriceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMatchingPriceNotFoundError deepCopy(
            @Nullable final GraphQLMatchingPriceNotFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLMatchingPriceNotFoundErrorImpl instance = new GraphQLMatchingPriceNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getChannel()));
        return instance;
    }

    /**
     * builder factory method for GraphQLMatchingPriceNotFoundError
     * @return builder
     */
    public static GraphQLMatchingPriceNotFoundErrorBuilder builder() {
        return GraphQLMatchingPriceNotFoundErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMatchingPriceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMatchingPriceNotFoundErrorBuilder builder(final GraphQLMatchingPriceNotFoundError template) {
        return GraphQLMatchingPriceNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMatchingPriceNotFoundError(Function<GraphQLMatchingPriceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMatchingPriceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMatchingPriceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMatchingPriceNotFoundError>";
            }
        };
    }
}
