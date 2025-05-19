
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
 *  <p>Returned when an invalid input has been sent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidInputError graphQLInvalidInputError = GraphQLInvalidInputError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidInput")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidInputErrorImpl.class)
public interface GraphQLInvalidInputError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidInputError
     */
    String INVALID_INPUT = "InvalidInput";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLInvalidInputError
     */
    public static GraphQLInvalidInputError of() {
        return new GraphQLInvalidInputErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidInputError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidInputError of(final GraphQLInvalidInputError template) {
        GraphQLInvalidInputErrorImpl instance = new GraphQLInvalidInputErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLInvalidInputError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLInvalidInputError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidInputError deepCopy(@Nullable final GraphQLInvalidInputError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidInputErrorImpl instance = new GraphQLInvalidInputErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidInputError
     * @return builder
     */
    public static GraphQLInvalidInputErrorBuilder builder() {
        return GraphQLInvalidInputErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidInputErrorBuilder builder(final GraphQLInvalidInputError template) {
        return GraphQLInvalidInputErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidInputError(Function<GraphQLInvalidInputError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidInputError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidInputError>";
            }
        };
    }
}
