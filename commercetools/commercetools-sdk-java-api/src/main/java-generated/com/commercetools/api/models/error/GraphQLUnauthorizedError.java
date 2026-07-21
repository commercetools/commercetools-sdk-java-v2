
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when one of the following conditions occurs:</p>
 *  <ul>
 *   <li>A Customer reference (for example, <code>associates[*].customer</code> or <code>inheritedAssociates[*].customer</code>) is expanded on the <span>My Business Unit</span> endpoint.</li>
 *   <li>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> cannot be modified due to missing permissions for its assigned <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a>.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLUnauthorizedError graphQLUnauthorizedError = GraphQLUnauthorizedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Unauthorized")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLUnauthorizedErrorImpl.class)
public interface GraphQLUnauthorizedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLUnauthorizedError
     */
    String UNAUTHORIZED = "Unauthorized";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @return storesWithoutPermission
     */

    @JsonProperty("storesWithoutPermission")
    public List<String> getStoresWithoutPermission();

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission values to be set
     */

    @JsonIgnore
    public void setStoresWithoutPermission(final String... storesWithoutPermission);

    /**
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     * @param storesWithoutPermission values to be set
     */

    public void setStoresWithoutPermission(final List<String> storesWithoutPermission);

    /**
     * factory method
     * @return instance of GraphQLUnauthorizedError
     */
    public static GraphQLUnauthorizedError of() {
        return new GraphQLUnauthorizedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLUnauthorizedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLUnauthorizedError of(final GraphQLUnauthorizedError template) {
        GraphQLUnauthorizedErrorImpl instance = new GraphQLUnauthorizedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStoresWithoutPermission(template.getStoresWithoutPermission());
        return instance;
    }

    public GraphQLUnauthorizedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLUnauthorizedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLUnauthorizedError deepCopy(@Nullable final GraphQLUnauthorizedError template) {
        if (template == null) {
            return null;
        }
        GraphQLUnauthorizedErrorImpl instance = new GraphQLUnauthorizedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setStoresWithoutPermission(
            Optional.ofNullable(template.getStoresWithoutPermission()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLUnauthorizedError
     * @return builder
     */
    public static GraphQLUnauthorizedErrorBuilder builder() {
        return GraphQLUnauthorizedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLUnauthorizedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLUnauthorizedErrorBuilder builder(final GraphQLUnauthorizedError template) {
        return GraphQLUnauthorizedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLUnauthorizedError(Function<GraphQLUnauthorizedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLUnauthorizedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLUnauthorizedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLUnauthorizedError>";
            }
        };
    }
}
