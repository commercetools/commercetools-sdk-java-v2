
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a circular reference is detected among Extension dependencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionCircularDependencyError graphQLExtensionCircularDependencyError = GraphQLExtensionCircularDependencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionCircularDependency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExtensionCircularDependencyErrorImpl.class)
public interface GraphQLExtensionCircularDependencyError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionCircularDependencyError
     */
    String EXTENSION_CIRCULAR_DEPENDENCY = "ExtensionCircularDependency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExtensionCircularDependencyError
     */
    public static GraphQLExtensionCircularDependencyError of() {
        return new GraphQLExtensionCircularDependencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExtensionCircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionCircularDependencyError of(final GraphQLExtensionCircularDependencyError template) {
        GraphQLExtensionCircularDependencyErrorImpl instance = new GraphQLExtensionCircularDependencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLExtensionCircularDependencyError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExtensionCircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionCircularDependencyError deepCopy(
            @Nullable final GraphQLExtensionCircularDependencyError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionCircularDependencyErrorImpl instance = new GraphQLExtensionCircularDependencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionCircularDependencyError
     * @return builder
     */
    public static GraphQLExtensionCircularDependencyErrorBuilder builder() {
        return GraphQLExtensionCircularDependencyErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExtensionCircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionCircularDependencyErrorBuilder builder(
            final GraphQLExtensionCircularDependencyError template) {
        return GraphQLExtensionCircularDependencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionCircularDependencyError(
            Function<GraphQLExtensionCircularDependencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLExtensionCircularDependencyError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLExtensionCircularDependencyError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionCircularDependencyError>";
            }
        };
    }
}
