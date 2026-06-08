
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Cart Discount cannot be created or assigned to a Store as the <span>limit</span> for active Cart Discounts in a Store has been reached for one or more Stores in the request.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/cart-discounts:POST" rel="nofollow">Create CartDiscount</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/cart-discounts:POST" rel="nofollow">Create CartDiscount in Store</a> requests</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountAddStoreAction" rel="nofollow">Add Store</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountSetStoresAction" rel="nofollow">Set Store</a> update actions</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLStoreCartDiscountsLimitReachedError graphQLStoreCartDiscountsLimitReachedError = GraphQLStoreCartDiscountsLimitReachedError.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreCartDiscountsLimitReached")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLStoreCartDiscountsLimitReachedErrorImpl.class)
public interface GraphQLStoreCartDiscountsLimitReachedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLStoreCartDiscountsLimitReachedError
     */
    String STORE_CART_DISCOUNTS_LIMIT_REACHED = "StoreCartDiscountsLimitReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>Stores for which the limit for active Cart Discounts that can exist has been reached.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     * factory method
     * @return instance of GraphQLStoreCartDiscountsLimitReachedError
     */
    public static GraphQLStoreCartDiscountsLimitReachedError of() {
        return new GraphQLStoreCartDiscountsLimitReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLStoreCartDiscountsLimitReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLStoreCartDiscountsLimitReachedError of(
            final GraphQLStoreCartDiscountsLimitReachedError template) {
        GraphQLStoreCartDiscountsLimitReachedErrorImpl instance = new GraphQLStoreCartDiscountsLimitReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStores(template.getStores());
        return instance;
    }

    public GraphQLStoreCartDiscountsLimitReachedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLStoreCartDiscountsLimitReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLStoreCartDiscountsLimitReachedError deepCopy(
            @Nullable final GraphQLStoreCartDiscountsLimitReachedError template) {
        if (template == null) {
            return null;
        }
        GraphQLStoreCartDiscountsLimitReachedErrorImpl instance = new GraphQLStoreCartDiscountsLimitReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLStoreCartDiscountsLimitReachedError
     * @return builder
     */
    public static GraphQLStoreCartDiscountsLimitReachedErrorBuilder builder() {
        return GraphQLStoreCartDiscountsLimitReachedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLStoreCartDiscountsLimitReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLStoreCartDiscountsLimitReachedErrorBuilder builder(
            final GraphQLStoreCartDiscountsLimitReachedError template) {
        return GraphQLStoreCartDiscountsLimitReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLStoreCartDiscountsLimitReachedError(
            Function<GraphQLStoreCartDiscountsLimitReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLStoreCartDiscountsLimitReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLStoreCartDiscountsLimitReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLStoreCartDiscountsLimitReachedError>";
            }
        };
    }
}
