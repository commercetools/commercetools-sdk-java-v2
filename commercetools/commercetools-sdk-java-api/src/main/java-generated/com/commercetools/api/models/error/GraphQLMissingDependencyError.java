
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
 *  <p>Returned when a referenced Extension does not exist or is not applicable to the same trigger.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMissingDependencyError graphQLMissingDependencyError = GraphQLMissingDependencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingDependency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMissingDependencyErrorImpl.class)
public interface GraphQLMissingDependencyError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMissingDependencyError
     */
    String MISSING_DEPENDENCY = "MissingDependency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLMissingDependencyError
     */
    public static GraphQLMissingDependencyError of() {
        return new GraphQLMissingDependencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMissingDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMissingDependencyError of(final GraphQLMissingDependencyError template) {
        GraphQLMissingDependencyErrorImpl instance = new GraphQLMissingDependencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLMissingDependencyError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLMissingDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMissingDependencyError deepCopy(@Nullable final GraphQLMissingDependencyError template) {
        if (template == null) {
            return null;
        }
        GraphQLMissingDependencyErrorImpl instance = new GraphQLMissingDependencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLMissingDependencyError
     * @return builder
     */
    public static GraphQLMissingDependencyErrorBuilder builder() {
        return GraphQLMissingDependencyErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMissingDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMissingDependencyErrorBuilder builder(final GraphQLMissingDependencyError template) {
        return GraphQLMissingDependencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMissingDependencyError(Function<GraphQLMissingDependencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMissingDependencyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMissingDependencyError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMissingDependencyError>";
            }
        };
    }
}
