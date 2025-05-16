
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Price scope conflicts with an existing one during an Update Product request.</p>
 *  <p>Every Price of a Product Variant must have a distinct combination of currency, Customer Group, country, and Channel that constitute the scope of a Price.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicatePriceScopeError graphQLDuplicatePriceScopeError = GraphQLDuplicatePriceScopeError.builder()
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicatePriceScope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicatePriceScopeErrorImpl.class)
public interface GraphQLDuplicatePriceScopeError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicatePriceScopeError
     */
    String DUPLICATE_PRICE_SCOPE = "DuplicatePriceScope";

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
     * @return instance of GraphQLDuplicatePriceScopeError
     */
    public static GraphQLDuplicatePriceScopeError of() {
        return new GraphQLDuplicatePriceScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicatePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicatePriceScopeError of(final GraphQLDuplicatePriceScopeError template) {
        GraphQLDuplicatePriceScopeErrorImpl instance = new GraphQLDuplicatePriceScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(template.getConflictingPrice());
        return instance;
    }

    public GraphQLDuplicatePriceScopeError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicatePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicatePriceScopeError deepCopy(@Nullable final GraphQLDuplicatePriceScopeError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicatePriceScopeErrorImpl instance = new GraphQLDuplicatePriceScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(
            com.commercetools.api.models.common.Price.deepCopy(template.getConflictingPrice()));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicatePriceScopeError
     * @return builder
     */
    public static GraphQLDuplicatePriceScopeErrorBuilder builder() {
        return GraphQLDuplicatePriceScopeErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicatePriceScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicatePriceScopeErrorBuilder builder(final GraphQLDuplicatePriceScopeError template) {
        return GraphQLDuplicatePriceScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicatePriceScopeError(Function<GraphQLDuplicatePriceScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicatePriceScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicatePriceScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicatePriceScopeError>";
            }
        };
    }
}
