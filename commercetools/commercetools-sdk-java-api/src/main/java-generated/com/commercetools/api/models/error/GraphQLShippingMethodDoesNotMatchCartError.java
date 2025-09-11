
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
 *  <p>Returned when the Cart contains a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> that is not allowed for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. In this case, the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodState" rel="nofollow">ShippingMethodState</a> value is <code>DoesNotMatchCart</code>.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUpdateAction" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartUpdateAction" rel="nofollow">My Carts</a>.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> request on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLShippingMethodDoesNotMatchCartError graphQLShippingMethodDoesNotMatchCartError = GraphQLShippingMethodDoesNotMatchCartError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodDoesNotMatchCart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLShippingMethodDoesNotMatchCartErrorImpl.class)
public interface GraphQLShippingMethodDoesNotMatchCartError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLShippingMethodDoesNotMatchCartError
     */
    String SHIPPING_METHOD_DOES_NOT_MATCH_CART = "ShippingMethodDoesNotMatchCart";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLShippingMethodDoesNotMatchCartError
     */
    public static GraphQLShippingMethodDoesNotMatchCartError of() {
        return new GraphQLShippingMethodDoesNotMatchCartErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLShippingMethodDoesNotMatchCartError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLShippingMethodDoesNotMatchCartError of(
            final GraphQLShippingMethodDoesNotMatchCartError template) {
        GraphQLShippingMethodDoesNotMatchCartErrorImpl instance = new GraphQLShippingMethodDoesNotMatchCartErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLShippingMethodDoesNotMatchCartError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLShippingMethodDoesNotMatchCartError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLShippingMethodDoesNotMatchCartError deepCopy(
            @Nullable final GraphQLShippingMethodDoesNotMatchCartError template) {
        if (template == null) {
            return null;
        }
        GraphQLShippingMethodDoesNotMatchCartErrorImpl instance = new GraphQLShippingMethodDoesNotMatchCartErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLShippingMethodDoesNotMatchCartError
     * @return builder
     */
    public static GraphQLShippingMethodDoesNotMatchCartErrorBuilder builder() {
        return GraphQLShippingMethodDoesNotMatchCartErrorBuilder.of();
    }

    /**
     * create builder for GraphQLShippingMethodDoesNotMatchCartError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLShippingMethodDoesNotMatchCartErrorBuilder builder(
            final GraphQLShippingMethodDoesNotMatchCartError template) {
        return GraphQLShippingMethodDoesNotMatchCartErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLShippingMethodDoesNotMatchCartError(
            Function<GraphQLShippingMethodDoesNotMatchCartError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLShippingMethodDoesNotMatchCartError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLShippingMethodDoesNotMatchCartError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLShippingMethodDoesNotMatchCartError>";
            }
        };
    }
}
