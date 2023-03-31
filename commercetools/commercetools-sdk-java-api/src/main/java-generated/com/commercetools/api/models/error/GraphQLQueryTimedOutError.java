
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
 *  <p>Returned when the query times out.</p>
 *  <p>If a query constantly times out, please check if it follows the performance best practices.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLQueryTimedOutError graphQLQueryTimedOutError = GraphQLQueryTimedOutError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLQueryTimedOutErrorImpl.class)
public interface GraphQLQueryTimedOutError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLQueryTimedOutError
     */
    String QUERY_TIMED_OUT = "QueryTimedOut";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLQueryTimedOutError
     */
    public static GraphQLQueryTimedOutError of() {
        return new GraphQLQueryTimedOutErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLQueryTimedOutError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLQueryTimedOutError of(final GraphQLQueryTimedOutError template) {
        GraphQLQueryTimedOutErrorImpl instance = new GraphQLQueryTimedOutErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLQueryTimedOutError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLQueryTimedOutError deepCopy(@Nullable final GraphQLQueryTimedOutError template) {
        if (template == null) {
            return null;
        }
        GraphQLQueryTimedOutErrorImpl instance = new GraphQLQueryTimedOutErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLQueryTimedOutError
     * @return builder
     */
    public static GraphQLQueryTimedOutErrorBuilder builder() {
        return GraphQLQueryTimedOutErrorBuilder.of();
    }

    /**
     * create builder for GraphQLQueryTimedOutError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLQueryTimedOutErrorBuilder builder(final GraphQLQueryTimedOutError template) {
        return GraphQLQueryTimedOutErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLQueryTimedOutError(Function<GraphQLQueryTimedOutError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLQueryTimedOutError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLQueryTimedOutError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLQueryTimedOutError>";
            }
        };
    }
}
