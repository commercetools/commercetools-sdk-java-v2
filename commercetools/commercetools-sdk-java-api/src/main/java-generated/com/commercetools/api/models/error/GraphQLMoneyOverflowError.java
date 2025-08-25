
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
 *  <p>Returned when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> operation overflows the 64-bit integer range. See <span>Money usage</span> for more information.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMoneyOverflowError graphQLMoneyOverflowError = GraphQLMoneyOverflowError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MoneyOverflow")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMoneyOverflowErrorImpl.class)
public interface GraphQLMoneyOverflowError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMoneyOverflowError
     */
    String MONEY_OVERFLOW = "MoneyOverflow";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLMoneyOverflowError
     */
    public static GraphQLMoneyOverflowError of() {
        return new GraphQLMoneyOverflowErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMoneyOverflowError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMoneyOverflowError of(final GraphQLMoneyOverflowError template) {
        GraphQLMoneyOverflowErrorImpl instance = new GraphQLMoneyOverflowErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLMoneyOverflowError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLMoneyOverflowError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMoneyOverflowError deepCopy(@Nullable final GraphQLMoneyOverflowError template) {
        if (template == null) {
            return null;
        }
        GraphQLMoneyOverflowErrorImpl instance = new GraphQLMoneyOverflowErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLMoneyOverflowError
     * @return builder
     */
    public static GraphQLMoneyOverflowErrorBuilder builder() {
        return GraphQLMoneyOverflowErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMoneyOverflowError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMoneyOverflowErrorBuilder builder(final GraphQLMoneyOverflowError template) {
        return GraphQLMoneyOverflowErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMoneyOverflowError(Function<GraphQLMoneyOverflowError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMoneyOverflowError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMoneyOverflowError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMoneyOverflowError>";
            }
        };
    }
}
