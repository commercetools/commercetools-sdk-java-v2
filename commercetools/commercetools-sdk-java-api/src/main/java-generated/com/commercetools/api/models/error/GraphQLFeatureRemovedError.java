
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
 *  <p>Returned when the requested feature was removed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLFeatureRemovedError graphQLFeatureRemovedError = GraphQLFeatureRemovedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("FeatureRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLFeatureRemovedErrorImpl.class)
public interface GraphQLFeatureRemovedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLFeatureRemovedError
     */
    String FEATURE_REMOVED = "FeatureRemoved";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLFeatureRemovedError
     */
    public static GraphQLFeatureRemovedError of() {
        return new GraphQLFeatureRemovedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLFeatureRemovedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLFeatureRemovedError of(final GraphQLFeatureRemovedError template) {
        GraphQLFeatureRemovedErrorImpl instance = new GraphQLFeatureRemovedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLFeatureRemovedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLFeatureRemovedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLFeatureRemovedError deepCopy(@Nullable final GraphQLFeatureRemovedError template) {
        if (template == null) {
            return null;
        }
        GraphQLFeatureRemovedErrorImpl instance = new GraphQLFeatureRemovedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLFeatureRemovedError
     * @return builder
     */
    public static GraphQLFeatureRemovedErrorBuilder builder() {
        return GraphQLFeatureRemovedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLFeatureRemovedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLFeatureRemovedErrorBuilder builder(final GraphQLFeatureRemovedError template) {
        return GraphQLFeatureRemovedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLFeatureRemovedError(Function<GraphQLFeatureRemovedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLFeatureRemovedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLFeatureRemovedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLFeatureRemovedError>";
            }
        };
    }
}
