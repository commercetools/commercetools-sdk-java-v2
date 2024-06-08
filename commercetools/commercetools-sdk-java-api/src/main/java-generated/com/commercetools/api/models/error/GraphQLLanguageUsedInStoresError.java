
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
 *  <p>Returned when a language cannot be removed from a Project as it is being used by a Store.</p>
 *  <p>The error is returned as a failed response to the Change Languages update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLanguageUsedInStoresError graphQLLanguageUsedInStoresError = GraphQLLanguageUsedInStoresError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLLanguageUsedInStoresErrorImpl.class)
public interface GraphQLLanguageUsedInStoresError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLLanguageUsedInStoresError
     */
    String LANGUAGE_USED_IN_STORES = "LanguageUsedInStores";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLLanguageUsedInStoresError
     */
    public static GraphQLLanguageUsedInStoresError of() {
        return new GraphQLLanguageUsedInStoresErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLLanguageUsedInStoresError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLLanguageUsedInStoresError of(final GraphQLLanguageUsedInStoresError template) {
        GraphQLLanguageUsedInStoresErrorImpl instance = new GraphQLLanguageUsedInStoresErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLLanguageUsedInStoresError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLLanguageUsedInStoresError deepCopy(@Nullable final GraphQLLanguageUsedInStoresError template) {
        if (template == null) {
            return null;
        }
        GraphQLLanguageUsedInStoresErrorImpl instance = new GraphQLLanguageUsedInStoresErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLLanguageUsedInStoresError
     * @return builder
     */
    public static GraphQLLanguageUsedInStoresErrorBuilder builder() {
        return GraphQLLanguageUsedInStoresErrorBuilder.of();
    }

    /**
     * create builder for GraphQLLanguageUsedInStoresError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLanguageUsedInStoresErrorBuilder builder(final GraphQLLanguageUsedInStoresError template) {
        return GraphQLLanguageUsedInStoresErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLLanguageUsedInStoresError(Function<GraphQLLanguageUsedInStoresError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLLanguageUsedInStoresError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLLanguageUsedInStoresError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLLanguageUsedInStoresError>";
            }
        };
    }
}
