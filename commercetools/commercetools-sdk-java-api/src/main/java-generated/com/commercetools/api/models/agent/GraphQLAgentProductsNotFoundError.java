
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by a <span>/responses</span> request when none of the requested products could be matched to the catalog.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentProductsNotFoundError graphQLAgentProductsNotFoundError = GraphQLAgentProductsNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductsNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentProductsNotFoundErrorImpl.class)
public interface GraphQLAgentProductsNotFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentProductsNotFoundError
     */
    String PRODUCTS_NOT_FOUND = "ProductsNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentProductsNotFoundError
     */
    public static GraphQLAgentProductsNotFoundError of() {
        return new GraphQLAgentProductsNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentProductsNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentProductsNotFoundError of(final GraphQLAgentProductsNotFoundError template) {
        GraphQLAgentProductsNotFoundErrorImpl instance = new GraphQLAgentProductsNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentProductsNotFoundError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentProductsNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentProductsNotFoundError deepCopy(
            @Nullable final GraphQLAgentProductsNotFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentProductsNotFoundErrorImpl instance = new GraphQLAgentProductsNotFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentProductsNotFoundError
     * @return builder
     */
    public static GraphQLAgentProductsNotFoundErrorBuilder builder() {
        return GraphQLAgentProductsNotFoundErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentProductsNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentProductsNotFoundErrorBuilder builder(final GraphQLAgentProductsNotFoundError template) {
        return GraphQLAgentProductsNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentProductsNotFoundError(Function<GraphQLAgentProductsNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentProductsNotFoundError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentProductsNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentProductsNotFoundError>";
            }
        };
    }
}
