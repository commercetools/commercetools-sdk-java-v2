
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
 *  <p>This error occurs when your API Client does not have the OAuth scope required for the endpoint. Use an API Client with the required permissions for this endpoint instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInsufficientScopeError graphQLInsufficientScopeError = GraphQLInsufficientScopeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("insufficient_scope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInsufficientScopeErrorImpl.class)
public interface GraphQLInsufficientScopeError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInsufficientScopeError
     */
    String INSUFFICIENT_SCOPE = "insufficient_scope";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLInsufficientScopeError
     */
    public static GraphQLInsufficientScopeError of() {
        return new GraphQLInsufficientScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInsufficientScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInsufficientScopeError of(final GraphQLInsufficientScopeError template) {
        GraphQLInsufficientScopeErrorImpl instance = new GraphQLInsufficientScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLInsufficientScopeError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLInsufficientScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInsufficientScopeError deepCopy(@Nullable final GraphQLInsufficientScopeError template) {
        if (template == null) {
            return null;
        }
        GraphQLInsufficientScopeErrorImpl instance = new GraphQLInsufficientScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInsufficientScopeError
     * @return builder
     */
    public static GraphQLInsufficientScopeErrorBuilder builder() {
        return GraphQLInsufficientScopeErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInsufficientScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInsufficientScopeErrorBuilder builder(final GraphQLInsufficientScopeError template) {
        return GraphQLInsufficientScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInsufficientScopeError(Function<GraphQLInsufficientScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInsufficientScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInsufficientScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInsufficientScopeError>";
            }
        };
    }
}
