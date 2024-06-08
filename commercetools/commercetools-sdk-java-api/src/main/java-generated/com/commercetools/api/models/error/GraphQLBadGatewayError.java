
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
 *  <p>Returned when a server-side problem is caused by scaling infrastructure resources.</p>
 *  <p>The client application should retry the request with exponential backoff up to a point where further delay is unacceptable.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLBadGatewayError graphQLBadGatewayError = GraphQLBadGatewayError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLBadGatewayErrorImpl.class)
public interface GraphQLBadGatewayError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLBadGatewayError
     */
    String BAD_GATEWAY = "BadGateway";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLBadGatewayError
     */
    public static GraphQLBadGatewayError of() {
        return new GraphQLBadGatewayErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLBadGatewayError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLBadGatewayError of(final GraphQLBadGatewayError template) {
        GraphQLBadGatewayErrorImpl instance = new GraphQLBadGatewayErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLBadGatewayError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLBadGatewayError deepCopy(@Nullable final GraphQLBadGatewayError template) {
        if (template == null) {
            return null;
        }
        GraphQLBadGatewayErrorImpl instance = new GraphQLBadGatewayErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLBadGatewayError
     * @return builder
     */
    public static GraphQLBadGatewayErrorBuilder builder() {
        return GraphQLBadGatewayErrorBuilder.of();
    }

    /**
     * create builder for GraphQLBadGatewayError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLBadGatewayErrorBuilder builder(final GraphQLBadGatewayError template) {
        return GraphQLBadGatewayErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLBadGatewayError(Function<GraphQLBadGatewayError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLBadGatewayError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLBadGatewayError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLBadGatewayError>";
            }
        };
    }
}
