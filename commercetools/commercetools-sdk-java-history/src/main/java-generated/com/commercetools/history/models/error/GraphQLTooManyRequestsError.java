
package com.commercetools.history.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the Query Records request exceeds the rate limit.</p>
 *  <p>Reduce the date range and resource types in your query to minimize the token usage, or retry the request after some time (indicated in the <code>Retry-After</code> header).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLTooManyRequestsError graphQLTooManyRequestsError = GraphQLTooManyRequestsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("TooManyRequests")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLTooManyRequestsErrorImpl.class)
public interface GraphQLTooManyRequestsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLTooManyRequestsError
     */
    String TOO_MANY_REQUESTS = "TooManyRequests";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLTooManyRequestsError
     */
    public static GraphQLTooManyRequestsError of() {
        return new GraphQLTooManyRequestsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLTooManyRequestsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLTooManyRequestsError of(final GraphQLTooManyRequestsError template) {
        GraphQLTooManyRequestsErrorImpl instance = new GraphQLTooManyRequestsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLTooManyRequestsError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLTooManyRequestsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLTooManyRequestsError deepCopy(@Nullable final GraphQLTooManyRequestsError template) {
        if (template == null) {
            return null;
        }
        GraphQLTooManyRequestsErrorImpl instance = new GraphQLTooManyRequestsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLTooManyRequestsError
     * @return builder
     */
    public static GraphQLTooManyRequestsErrorBuilder builder() {
        return GraphQLTooManyRequestsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLTooManyRequestsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLTooManyRequestsErrorBuilder builder(final GraphQLTooManyRequestsError template) {
        return GraphQLTooManyRequestsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLTooManyRequestsError(Function<GraphQLTooManyRequestsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLTooManyRequestsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLTooManyRequestsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLTooManyRequestsError>";
            }
        };
    }
}
