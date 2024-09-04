
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
 *  <p>Returned when the request conflicts with the current state of the involved resources. Typically, the request attempts to modify a resource that is out of date (that is modified by another client since it was last retrieved). The client application should resolve the conflict (with or without involving the end user) before retrying the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLConcurrentModificationError graphQLConcurrentModificationError = GraphQLConcurrentModificationError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLConcurrentModificationErrorImpl.class)
public interface GraphQLConcurrentModificationError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLConcurrentModificationError
     */
    String CONCURRENT_MODIFICATION = "ConcurrentModification";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Current version of the resource.</p>
     * @return currentVersion
     */

    @JsonProperty("currentVersion")
    public Long getCurrentVersion();

    /**
     *  <p>Current version of the resource.</p>
     * @param currentVersion value to be set
     */

    public void setCurrentVersion(final Long currentVersion);

    /**
     * factory method
     * @return instance of GraphQLConcurrentModificationError
     */
    public static GraphQLConcurrentModificationError of() {
        return new GraphQLConcurrentModificationErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLConcurrentModificationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLConcurrentModificationError of(final GraphQLConcurrentModificationError template) {
        GraphQLConcurrentModificationErrorImpl instance = new GraphQLConcurrentModificationErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCurrentVersion(template.getCurrentVersion());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLConcurrentModificationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLConcurrentModificationError deepCopy(
            @Nullable final GraphQLConcurrentModificationError template) {
        if (template == null) {
            return null;
        }
        GraphQLConcurrentModificationErrorImpl instance = new GraphQLConcurrentModificationErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCurrentVersion(template.getCurrentVersion());
        return instance;
    }

    /**
     * builder factory method for GraphQLConcurrentModificationError
     * @return builder
     */
    public static GraphQLConcurrentModificationErrorBuilder builder() {
        return GraphQLConcurrentModificationErrorBuilder.of();
    }

    /**
     * create builder for GraphQLConcurrentModificationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLConcurrentModificationErrorBuilder builder(final GraphQLConcurrentModificationError template) {
        return GraphQLConcurrentModificationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLConcurrentModificationError(Function<GraphQLConcurrentModificationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLConcurrentModificationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLConcurrentModificationError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLConcurrentModificationError>";
            }
        };
    }
}
