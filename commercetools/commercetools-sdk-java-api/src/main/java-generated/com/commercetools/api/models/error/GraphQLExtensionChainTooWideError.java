
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
 *  <p>Returned when an Extension declares more than 5 direct dependencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionChainTooWideError graphQLExtensionChainTooWideError = GraphQLExtensionChainTooWideError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionChainTooWide")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExtensionChainTooWideErrorImpl.class)
public interface GraphQLExtensionChainTooWideError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionChainTooWideError
     */
    String EXTENSION_CHAIN_TOO_WIDE = "ExtensionChainTooWide";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExtensionChainTooWideError
     */
    public static GraphQLExtensionChainTooWideError of() {
        return new GraphQLExtensionChainTooWideErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExtensionChainTooWideError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionChainTooWideError of(final GraphQLExtensionChainTooWideError template) {
        GraphQLExtensionChainTooWideErrorImpl instance = new GraphQLExtensionChainTooWideErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLExtensionChainTooWideError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExtensionChainTooWideError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionChainTooWideError deepCopy(
            @Nullable final GraphQLExtensionChainTooWideError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionChainTooWideErrorImpl instance = new GraphQLExtensionChainTooWideErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionChainTooWideError
     * @return builder
     */
    public static GraphQLExtensionChainTooWideErrorBuilder builder() {
        return GraphQLExtensionChainTooWideErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExtensionChainTooWideError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionChainTooWideErrorBuilder builder(final GraphQLExtensionChainTooWideError template) {
        return GraphQLExtensionChainTooWideErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionChainTooWideError(Function<GraphQLExtensionChainTooWideError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionChainTooWideError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionChainTooWideError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionChainTooWideError>";
            }
        };
    }
}
