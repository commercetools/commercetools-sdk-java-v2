
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
 *  <p>Returned by a <span>/responses</span> request when Product Search is not enabled for the project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentProductSearchNotEnabledError graphQLAgentProductSearchNotEnabledError = GraphQLAgentProductSearchNotEnabledError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSearchNotEnabled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentProductSearchNotEnabledErrorImpl.class)
public interface GraphQLAgentProductSearchNotEnabledError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentProductSearchNotEnabledError
     */
    String PRODUCT_SEARCH_NOT_ENABLED = "ProductSearchNotEnabled";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentProductSearchNotEnabledError
     */
    public static GraphQLAgentProductSearchNotEnabledError of() {
        return new GraphQLAgentProductSearchNotEnabledErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentProductSearchNotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentProductSearchNotEnabledError of(final GraphQLAgentProductSearchNotEnabledError template) {
        GraphQLAgentProductSearchNotEnabledErrorImpl instance = new GraphQLAgentProductSearchNotEnabledErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentProductSearchNotEnabledError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentProductSearchNotEnabledError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentProductSearchNotEnabledError deepCopy(
            @Nullable final GraphQLAgentProductSearchNotEnabledError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentProductSearchNotEnabledErrorImpl instance = new GraphQLAgentProductSearchNotEnabledErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentProductSearchNotEnabledError
     * @return builder
     */
    public static GraphQLAgentProductSearchNotEnabledErrorBuilder builder() {
        return GraphQLAgentProductSearchNotEnabledErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentProductSearchNotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentProductSearchNotEnabledErrorBuilder builder(
            final GraphQLAgentProductSearchNotEnabledError template) {
        return GraphQLAgentProductSearchNotEnabledErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentProductSearchNotEnabledError(
            Function<GraphQLAgentProductSearchNotEnabledError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentProductSearchNotEnabledError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentProductSearchNotEnabledError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentProductSearchNotEnabledError>";
            }
        };
    }
}
