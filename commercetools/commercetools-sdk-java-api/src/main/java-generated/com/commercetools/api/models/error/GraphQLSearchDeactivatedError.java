
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
 *  <p>Returned when the indexing of Product information is deactivated in a Project.</p>
 *  <p>To activate indexing, call Change Product Search Indexing Enabled and set <code>enabled</code> to <code>true</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchDeactivatedError graphQLSearchDeactivatedError = GraphQLSearchDeactivatedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLSearchDeactivatedErrorImpl.class)
public interface GraphQLSearchDeactivatedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSearchDeactivatedError
     */
    String SEARCH_DEACTIVATED = "SearchDeactivated";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLSearchDeactivatedError
     */
    public static GraphQLSearchDeactivatedError of() {
        return new GraphQLSearchDeactivatedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLSearchDeactivatedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSearchDeactivatedError of(final GraphQLSearchDeactivatedError template) {
        GraphQLSearchDeactivatedErrorImpl instance = new GraphQLSearchDeactivatedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLSearchDeactivatedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSearchDeactivatedError deepCopy(@Nullable final GraphQLSearchDeactivatedError template) {
        if (template == null) {
            return null;
        }
        GraphQLSearchDeactivatedErrorImpl instance = new GraphQLSearchDeactivatedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSearchDeactivatedError
     * @return builder
     */
    public static GraphQLSearchDeactivatedErrorBuilder builder() {
        return GraphQLSearchDeactivatedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLSearchDeactivatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchDeactivatedErrorBuilder builder(final GraphQLSearchDeactivatedError template) {
        return GraphQLSearchDeactivatedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSearchDeactivatedError(Function<GraphQLSearchDeactivatedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchDeactivatedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchDeactivatedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSearchDeactivatedError>";
            }
        };
    }
}
