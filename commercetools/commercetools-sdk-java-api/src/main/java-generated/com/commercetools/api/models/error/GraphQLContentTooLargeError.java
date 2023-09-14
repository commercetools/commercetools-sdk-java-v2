
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the request results in too much data being returned from the API. Adjust the request query to reduce the size of the data returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLContentTooLargeError graphQLContentTooLargeError = GraphQLContentTooLargeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLContentTooLargeErrorImpl.class)
public interface GraphQLContentTooLargeError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLContentTooLargeError
     */
    String CONTENT_TOO_LARGE = "ContentTooLarge";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLContentTooLargeError
     */
    public static GraphQLContentTooLargeError of() {
        return new GraphQLContentTooLargeErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLContentTooLargeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLContentTooLargeError of(final GraphQLContentTooLargeError template) {
        GraphQLContentTooLargeErrorImpl instance = new GraphQLContentTooLargeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLContentTooLargeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLContentTooLargeError deepCopy(@Nullable final GraphQLContentTooLargeError template) {
        if (template == null) {
            return null;
        }
        GraphQLContentTooLargeErrorImpl instance = new GraphQLContentTooLargeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLContentTooLargeError
     * @return builder
     */
    public static GraphQLContentTooLargeErrorBuilder builder() {
        return GraphQLContentTooLargeErrorBuilder.of();
    }

    /**
     * create builder for GraphQLContentTooLargeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLContentTooLargeErrorBuilder builder(final GraphQLContentTooLargeError template) {
        return GraphQLContentTooLargeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLContentTooLargeError(Function<GraphQLContentTooLargeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLContentTooLargeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLContentTooLargeError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLContentTooLargeError>";
            }
        };
    }
}
