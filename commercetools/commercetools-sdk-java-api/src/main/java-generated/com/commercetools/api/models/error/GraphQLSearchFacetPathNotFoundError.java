
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
 *  <p>Returned when a search facet path could not be found.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchFacetPathNotFoundError graphQLSearchFacetPathNotFoundError = GraphQLSearchFacetPathNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SearchFacetPathNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLSearchFacetPathNotFoundErrorImpl.class)
public interface GraphQLSearchFacetPathNotFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLSearchFacetPathNotFoundError
     */
    String SEARCH_FACET_PATH_NOT_FOUND = "SearchFacetPathNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLSearchFacetPathNotFoundError
     */
    public static GraphQLSearchFacetPathNotFoundError of() {
        return new GraphQLSearchFacetPathNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLSearchFacetPathNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLSearchFacetPathNotFoundError of(final GraphQLSearchFacetPathNotFoundError template) {
        GraphQLSearchFacetPathNotFoundErrorImpl instance = new GraphQLSearchFacetPathNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLSearchFacetPathNotFoundError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLSearchFacetPathNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLSearchFacetPathNotFoundError deepCopy(
            @Nullable final GraphQLSearchFacetPathNotFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLSearchFacetPathNotFoundErrorImpl instance = new GraphQLSearchFacetPathNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLSearchFacetPathNotFoundError
     * @return builder
     */
    public static GraphQLSearchFacetPathNotFoundErrorBuilder builder() {
        return GraphQLSearchFacetPathNotFoundErrorBuilder.of();
    }

    /**
     * create builder for GraphQLSearchFacetPathNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchFacetPathNotFoundErrorBuilder builder(
            final GraphQLSearchFacetPathNotFoundError template) {
        return GraphQLSearchFacetPathNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLSearchFacetPathNotFoundError(Function<GraphQLSearchFacetPathNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchFacetPathNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLSearchFacetPathNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLSearchFacetPathNotFoundError>";
            }
        };
    }
}
