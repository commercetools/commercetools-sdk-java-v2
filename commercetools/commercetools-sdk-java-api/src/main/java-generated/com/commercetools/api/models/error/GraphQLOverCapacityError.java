
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
 *  <p>Returned when the service is having trouble handling the load.</p>
 *  <p>The client application should retry the request with exponential backoff up to a point where further delay is unacceptable.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLOverCapacityError graphQLOverCapacityError = GraphQLOverCapacityError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLOverCapacityErrorImpl.class)
public interface GraphQLOverCapacityError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLOverCapacityError
     */
    String OVER_CAPACITY = "OverCapacity";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLOverCapacityError
     */
    public static GraphQLOverCapacityError of() {
        return new GraphQLOverCapacityErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLOverCapacityError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLOverCapacityError of(final GraphQLOverCapacityError template) {
        GraphQLOverCapacityErrorImpl instance = new GraphQLOverCapacityErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLOverCapacityError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLOverCapacityError deepCopy(@Nullable final GraphQLOverCapacityError template) {
        if (template == null) {
            return null;
        }
        GraphQLOverCapacityErrorImpl instance = new GraphQLOverCapacityErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLOverCapacityError
     * @return builder
     */
    public static GraphQLOverCapacityErrorBuilder builder() {
        return GraphQLOverCapacityErrorBuilder.of();
    }

    /**
     * create builder for GraphQLOverCapacityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLOverCapacityErrorBuilder builder(final GraphQLOverCapacityError template) {
        return GraphQLOverCapacityErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLOverCapacityError(Function<GraphQLOverCapacityError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLOverCapacityError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLOverCapacityError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLOverCapacityError>";
            }
        };
    }
}
