
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
 *  <p>Returned when the Extension dependency chain exceeds 3 layers.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionChainTooDeepError graphQLExtensionChainTooDeepError = GraphQLExtensionChainTooDeepError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionChainTooDeep")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExtensionChainTooDeepErrorImpl.class)
public interface GraphQLExtensionChainTooDeepError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionChainTooDeepError
     */
    String EXTENSION_CHAIN_TOO_DEEP = "ExtensionChainTooDeep";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExtensionChainTooDeepError
     */
    public static GraphQLExtensionChainTooDeepError of() {
        return new GraphQLExtensionChainTooDeepErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExtensionChainTooDeepError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionChainTooDeepError of(final GraphQLExtensionChainTooDeepError template) {
        GraphQLExtensionChainTooDeepErrorImpl instance = new GraphQLExtensionChainTooDeepErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLExtensionChainTooDeepError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExtensionChainTooDeepError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionChainTooDeepError deepCopy(
            @Nullable final GraphQLExtensionChainTooDeepError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionChainTooDeepErrorImpl instance = new GraphQLExtensionChainTooDeepErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionChainTooDeepError
     * @return builder
     */
    public static GraphQLExtensionChainTooDeepErrorBuilder builder() {
        return GraphQLExtensionChainTooDeepErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExtensionChainTooDeepError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionChainTooDeepErrorBuilder builder(final GraphQLExtensionChainTooDeepError template) {
        return GraphQLExtensionChainTooDeepErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionChainTooDeepError(Function<GraphQLExtensionChainTooDeepError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLExtensionChainTooDeepError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLExtensionChainTooDeepError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionChainTooDeepError>";
            }
        };
    }
}
