
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
 *  <p>Returned when a circular reference is detected among Extension dependencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLCircularDependencyError graphQLCircularDependencyError = GraphQLCircularDependencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CircularDependency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLCircularDependencyErrorImpl.class)
public interface GraphQLCircularDependencyError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLCircularDependencyError
     */
    String CIRCULAR_DEPENDENCY = "CircularDependency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLCircularDependencyError
     */
    public static GraphQLCircularDependencyError of() {
        return new GraphQLCircularDependencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLCircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLCircularDependencyError of(final GraphQLCircularDependencyError template) {
        GraphQLCircularDependencyErrorImpl instance = new GraphQLCircularDependencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLCircularDependencyError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLCircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLCircularDependencyError deepCopy(@Nullable final GraphQLCircularDependencyError template) {
        if (template == null) {
            return null;
        }
        GraphQLCircularDependencyErrorImpl instance = new GraphQLCircularDependencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLCircularDependencyError
     * @return builder
     */
    public static GraphQLCircularDependencyErrorBuilder builder() {
        return GraphQLCircularDependencyErrorBuilder.of();
    }

    /**
     * create builder for GraphQLCircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLCircularDependencyErrorBuilder builder(final GraphQLCircularDependencyError template) {
        return GraphQLCircularDependencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLCircularDependencyError(Function<GraphQLCircularDependencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLCircularDependencyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLCircularDependencyError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLCircularDependencyError>";
            }
        };
    }
}
