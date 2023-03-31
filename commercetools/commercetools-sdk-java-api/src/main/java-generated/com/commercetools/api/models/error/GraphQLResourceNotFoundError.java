
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
 *  <p>Returned when the resource addressed by the request URL does not exist.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLResourceNotFoundError graphQLResourceNotFoundError = GraphQLResourceNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLResourceNotFoundErrorImpl.class)
public interface GraphQLResourceNotFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLResourceNotFoundError
     */
    String RESOURCE_NOT_FOUND = "ResourceNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLResourceNotFoundError
     */
    public static GraphQLResourceNotFoundError of() {
        return new GraphQLResourceNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLResourceNotFoundError of(final GraphQLResourceNotFoundError template) {
        GraphQLResourceNotFoundErrorImpl instance = new GraphQLResourceNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLResourceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLResourceNotFoundError deepCopy(@Nullable final GraphQLResourceNotFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLResourceNotFoundErrorImpl instance = new GraphQLResourceNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLResourceNotFoundError
     * @return builder
     */
    public static GraphQLResourceNotFoundErrorBuilder builder() {
        return GraphQLResourceNotFoundErrorBuilder.of();
    }

    /**
     * create builder for GraphQLResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLResourceNotFoundErrorBuilder builder(final GraphQLResourceNotFoundError template) {
        return GraphQLResourceNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLResourceNotFoundError(Function<GraphQLResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLResourceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLResourceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLResourceNotFoundError>";
            }
        };
    }
}
