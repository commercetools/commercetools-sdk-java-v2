
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
 *  <p>Returned when attempting to delete an Extension that is a prerequisite for other Extensions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionDependencyExistsError graphQLExtensionDependencyExistsError = GraphQLExtensionDependencyExistsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionDependencyExists")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExtensionDependencyExistsErrorImpl.class)
public interface GraphQLExtensionDependencyExistsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionDependencyExistsError
     */
    String EXTENSION_DEPENDENCY_EXISTS = "ExtensionDependencyExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExtensionDependencyExistsError
     */
    public static GraphQLExtensionDependencyExistsError of() {
        return new GraphQLExtensionDependencyExistsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExtensionDependencyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionDependencyExistsError of(final GraphQLExtensionDependencyExistsError template) {
        GraphQLExtensionDependencyExistsErrorImpl instance = new GraphQLExtensionDependencyExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLExtensionDependencyExistsError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExtensionDependencyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionDependencyExistsError deepCopy(
            @Nullable final GraphQLExtensionDependencyExistsError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionDependencyExistsErrorImpl instance = new GraphQLExtensionDependencyExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionDependencyExistsError
     * @return builder
     */
    public static GraphQLExtensionDependencyExistsErrorBuilder builder() {
        return GraphQLExtensionDependencyExistsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExtensionDependencyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionDependencyExistsErrorBuilder builder(
            final GraphQLExtensionDependencyExistsError template) {
        return GraphQLExtensionDependencyExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionDependencyExistsError(Function<GraphQLExtensionDependencyExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLExtensionDependencyExistsError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLExtensionDependencyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionDependencyExistsError>";
            }
        };
    }
}
