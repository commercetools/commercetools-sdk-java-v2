
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Cart Discount cannot be created or activated as the limit for active Cart Discounts has been reached.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create CartDiscount and Create CartDiscount in Store requests</li>
 *   <li>Change IsActive update action</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxCartDiscountsReachedError graphQLMaxCartDiscountsReachedError = GraphQLMaxCartDiscountsReachedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMaxCartDiscountsReachedErrorImpl.class)
public interface GraphQLMaxCartDiscountsReachedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMaxCartDiscountsReachedError
     */
    String MAX_CART_DISCOUNTS_REACHED = "MaxCartDiscountsReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLMaxCartDiscountsReachedError
     */
    public static GraphQLMaxCartDiscountsReachedError of() {
        return new GraphQLMaxCartDiscountsReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMaxCartDiscountsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMaxCartDiscountsReachedError of(final GraphQLMaxCartDiscountsReachedError template) {
        GraphQLMaxCartDiscountsReachedErrorImpl instance = new GraphQLMaxCartDiscountsReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLMaxCartDiscountsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMaxCartDiscountsReachedError deepCopy(
            @Nullable final GraphQLMaxCartDiscountsReachedError template) {
        if (template == null) {
            return null;
        }
        GraphQLMaxCartDiscountsReachedErrorImpl instance = new GraphQLMaxCartDiscountsReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLMaxCartDiscountsReachedError
     * @return builder
     */
    public static GraphQLMaxCartDiscountsReachedErrorBuilder builder() {
        return GraphQLMaxCartDiscountsReachedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMaxCartDiscountsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxCartDiscountsReachedErrorBuilder builder(
            final GraphQLMaxCartDiscountsReachedError template) {
        return GraphQLMaxCartDiscountsReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMaxCartDiscountsReachedError(Function<GraphQLMaxCartDiscountsReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxCartDiscountsReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxCartDiscountsReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMaxCartDiscountsReachedError>";
            }
        };
    }
}
