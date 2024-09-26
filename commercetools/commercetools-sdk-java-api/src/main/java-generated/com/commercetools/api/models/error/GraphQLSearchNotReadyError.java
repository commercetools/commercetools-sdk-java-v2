
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
 *  <p>Returned if the requested search service is not ready. The search might be deactivated or indexing is in progress.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchNotReadyError graphQLSearchNotReadyError = GraphQLSearchNotReadyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLSearchNotReadyErrorImpl.class)
public interface GraphQLSearchNotReadyError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSearchNotReadyError
     */
    String SEARCH_NOT_READY = "SearchNotReady";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLSearchNotReadyError
     */
    public static GraphQLSearchNotReadyError of() {
        return new GraphQLSearchNotReadyErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLSearchNotReadyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSearchNotReadyError of(final GraphQLSearchNotReadyError template) {
        GraphQLSearchNotReadyErrorImpl instance = new GraphQLSearchNotReadyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLSearchNotReadyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSearchNotReadyError deepCopy(@Nullable final GraphQLSearchNotReadyError template) {
        if (template == null) {
            return null;
        }
        GraphQLSearchNotReadyErrorImpl instance = new GraphQLSearchNotReadyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSearchNotReadyError
     * @return builder
     */
    public static GraphQLSearchNotReadyErrorBuilder builder() {
        return GraphQLSearchNotReadyErrorBuilder.of();
    }

    /**
     * create builder for GraphQLSearchNotReadyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchNotReadyErrorBuilder builder(final GraphQLSearchNotReadyError template) {
        return GraphQLSearchNotReadyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSearchNotReadyError(Function<GraphQLSearchNotReadyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchNotReadyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchNotReadyError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSearchNotReadyError>";
            }
        };
    }
}
