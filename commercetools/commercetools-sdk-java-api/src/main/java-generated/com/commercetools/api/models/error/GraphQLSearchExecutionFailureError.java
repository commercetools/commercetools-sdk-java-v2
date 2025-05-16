
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
 *  <p>Returned when a search query could not be completed due to an unexpected failure.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchExecutionFailureError graphQLSearchExecutionFailureError = GraphQLSearchExecutionFailureError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SearchExecutionFailure")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLSearchExecutionFailureErrorImpl.class)
public interface GraphQLSearchExecutionFailureError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSearchExecutionFailureError
     */
    String SEARCH_EXECUTION_FAILURE = "SearchExecutionFailure";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLSearchExecutionFailureError
     */
    public static GraphQLSearchExecutionFailureError of() {
        return new GraphQLSearchExecutionFailureErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLSearchExecutionFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSearchExecutionFailureError of(final GraphQLSearchExecutionFailureError template) {
        GraphQLSearchExecutionFailureErrorImpl instance = new GraphQLSearchExecutionFailureErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLSearchExecutionFailureError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLSearchExecutionFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSearchExecutionFailureError deepCopy(
            @Nullable final GraphQLSearchExecutionFailureError template) {
        if (template == null) {
            return null;
        }
        GraphQLSearchExecutionFailureErrorImpl instance = new GraphQLSearchExecutionFailureErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSearchExecutionFailureError
     * @return builder
     */
    public static GraphQLSearchExecutionFailureErrorBuilder builder() {
        return GraphQLSearchExecutionFailureErrorBuilder.of();
    }

    /**
     * create builder for GraphQLSearchExecutionFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchExecutionFailureErrorBuilder builder(final GraphQLSearchExecutionFailureError template) {
        return GraphQLSearchExecutionFailureErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSearchExecutionFailureError(Function<GraphQLSearchExecutionFailureError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchExecutionFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchExecutionFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSearchExecutionFailureError>";
            }
        };
    }
}
