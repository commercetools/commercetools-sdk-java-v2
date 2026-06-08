
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
 *  <p>Returned when the resources involved in the request are not in a valid state for the operation.</p>
 *  <p>The client application should validate the constraints described in the error message before sending the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidOperationError graphQLInvalidOperationError = GraphQLInvalidOperationError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidOperation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidOperationErrorImpl.class)
public interface GraphQLInvalidOperationError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidOperationError
     */
    String INVALID_OPERATION = "InvalidOperation";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLInvalidOperationError
     */
    public static GraphQLInvalidOperationError of() {
        return new GraphQLInvalidOperationErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidOperationError of(final GraphQLInvalidOperationError template) {
        GraphQLInvalidOperationErrorImpl instance = new GraphQLInvalidOperationErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLInvalidOperationError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLInvalidOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidOperationError deepCopy(@Nullable final GraphQLInvalidOperationError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidOperationErrorImpl instance = new GraphQLInvalidOperationErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidOperationError
     * @return builder
     */
    public static GraphQLInvalidOperationErrorBuilder builder() {
        return GraphQLInvalidOperationErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidOperationErrorBuilder builder(final GraphQLInvalidOperationError template) {
        return GraphQLInvalidOperationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidOperationError(Function<GraphQLInvalidOperationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidOperationError>";
            }
        };
    }
}
