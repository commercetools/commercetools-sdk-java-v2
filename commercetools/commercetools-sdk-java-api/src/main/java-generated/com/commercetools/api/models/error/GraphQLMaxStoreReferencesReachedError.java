
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
 *  <p>Returned when a Store cannot be added to a Cart Discount as the limit for Stores configured for a Cart Discount has been reached.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create CartDiscount and Create CartDiscount in Store requests</li>
 *   <li>Add Store and Set Store update actions</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxStoreReferencesReachedError graphQLMaxStoreReferencesReachedError = GraphQLMaxStoreReferencesReachedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMaxStoreReferencesReachedErrorImpl.class)
public interface GraphQLMaxStoreReferencesReachedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMaxStoreReferencesReachedError
     */
    String MAX_STORE_REFERENCES_REACHED = "MaxStoreReferencesReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLMaxStoreReferencesReachedError
     */
    public static GraphQLMaxStoreReferencesReachedError of() {
        return new GraphQLMaxStoreReferencesReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMaxStoreReferencesReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMaxStoreReferencesReachedError of(final GraphQLMaxStoreReferencesReachedError template) {
        GraphQLMaxStoreReferencesReachedErrorImpl instance = new GraphQLMaxStoreReferencesReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLMaxStoreReferencesReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMaxStoreReferencesReachedError deepCopy(
            @Nullable final GraphQLMaxStoreReferencesReachedError template) {
        if (template == null) {
            return null;
        }
        GraphQLMaxStoreReferencesReachedErrorImpl instance = new GraphQLMaxStoreReferencesReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLMaxStoreReferencesReachedError
     * @return builder
     */
    public static GraphQLMaxStoreReferencesReachedErrorBuilder builder() {
        return GraphQLMaxStoreReferencesReachedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMaxStoreReferencesReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxStoreReferencesReachedErrorBuilder builder(
            final GraphQLMaxStoreReferencesReachedError template) {
        return GraphQLMaxStoreReferencesReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMaxStoreReferencesReachedError(Function<GraphQLMaxStoreReferencesReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxStoreReferencesReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxStoreReferencesReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMaxStoreReferencesReachedError>";
            }
        };
    }
}
