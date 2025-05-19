
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
 *  <p>Returned when a previous conflicting operation is still pending and needs to finish before the request can succeed.</p>
 *  <p>The client application should retry the request with exponential backoff up to a point where further delay is unacceptable. If the error persists, report it to the Composable Commerce support team.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLPendingOperationError graphQLPendingOperationError = GraphQLPendingOperationError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PendingOperation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLPendingOperationErrorImpl.class)
public interface GraphQLPendingOperationError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLPendingOperationError
     */
    String PENDING_OPERATION = "PendingOperation";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLPendingOperationError
     */
    public static GraphQLPendingOperationError of() {
        return new GraphQLPendingOperationErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLPendingOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLPendingOperationError of(final GraphQLPendingOperationError template) {
        GraphQLPendingOperationErrorImpl instance = new GraphQLPendingOperationErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLPendingOperationError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLPendingOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLPendingOperationError deepCopy(@Nullable final GraphQLPendingOperationError template) {
        if (template == null) {
            return null;
        }
        GraphQLPendingOperationErrorImpl instance = new GraphQLPendingOperationErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLPendingOperationError
     * @return builder
     */
    public static GraphQLPendingOperationErrorBuilder builder() {
        return GraphQLPendingOperationErrorBuilder.of();
    }

    /**
     * create builder for GraphQLPendingOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLPendingOperationErrorBuilder builder(final GraphQLPendingOperationError template) {
        return GraphQLPendingOperationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLPendingOperationError(Function<GraphQLPendingOperationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLPendingOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLPendingOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLPendingOperationError>";
            }
        };
    }
}
