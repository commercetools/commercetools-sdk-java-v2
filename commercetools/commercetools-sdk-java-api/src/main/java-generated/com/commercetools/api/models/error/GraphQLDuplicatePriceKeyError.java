
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Price key conflicts with an existing key.</p>
 *  <p>Keys of Embedded Prices must be unique per ProductVariant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicatePriceKeyError graphQLDuplicatePriceKeyError = GraphQLDuplicatePriceKeyError.builder()
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicatePriceKeyErrorImpl.class)
public interface GraphQLDuplicatePriceKeyError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicatePriceKeyError
     */
    String DUPLICATE_PRICE_KEY = "DuplicatePriceKey";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingPrice")
    public Price getConflictingPrice();

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     */

    public void setConflictingPrice(final Price conflictingPrice);

    /**
     * factory method
     * @return instance of GraphQLDuplicatePriceKeyError
     */
    public static GraphQLDuplicatePriceKeyError of() {
        return new GraphQLDuplicatePriceKeyErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicatePriceKeyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicatePriceKeyError of(final GraphQLDuplicatePriceKeyError template) {
        GraphQLDuplicatePriceKeyErrorImpl instance = new GraphQLDuplicatePriceKeyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(template.getConflictingPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLDuplicatePriceKeyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicatePriceKeyError deepCopy(@Nullable final GraphQLDuplicatePriceKeyError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicatePriceKeyErrorImpl instance = new GraphQLDuplicatePriceKeyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(
            com.commercetools.api.models.common.Price.deepCopy(template.getConflictingPrice()));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicatePriceKeyError
     * @return builder
     */
    public static GraphQLDuplicatePriceKeyErrorBuilder builder() {
        return GraphQLDuplicatePriceKeyErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicatePriceKeyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicatePriceKeyErrorBuilder builder(final GraphQLDuplicatePriceKeyError template) {
        return GraphQLDuplicatePriceKeyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicatePriceKeyError(Function<GraphQLDuplicatePriceKeyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicatePriceKeyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicatePriceKeyError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicatePriceKeyError>";
            }
        };
    }
}
