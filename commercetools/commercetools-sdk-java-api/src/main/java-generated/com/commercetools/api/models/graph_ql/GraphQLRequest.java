
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLRequest
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLRequest graphQLRequest = GraphQLRequest.builder()
 *             .query("{query}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLRequestImpl.class)
public interface GraphQLRequest {

    /**
     *
     * @return query
     */
    @NotNull
    @JsonProperty("query")
    public String getQuery();

    /**
     *
     * @return operationName
     */

    @JsonProperty("operationName")
    public String getOperationName();

    /**
     *
     * @return variables
     */
    @Valid
    @JsonProperty("variables")
    public GraphQLVariablesMap getVariables();

    /**
     * set query
     * @param query value to be set
     */

    public void setQuery(final String query);

    /**
     * set operationName
     * @param operationName value to be set
     */

    public void setOperationName(final String operationName);

    /**
     * set variables
     * @param variables value to be set
     */

    public void setVariables(final GraphQLVariablesMap variables);

    /**
     * factory method
     * @return instance of GraphQLRequest
     */
    public static GraphQLRequest of() {
        return new GraphQLRequestImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLRequest of(final GraphQLRequest template) {
        GraphQLRequestImpl instance = new GraphQLRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setOperationName(template.getOperationName());
        instance.setVariables(template.getVariables());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLRequest deepCopy(@Nullable final GraphQLRequest template) {
        if (template == null) {
            return null;
        }
        GraphQLRequestImpl instance = new GraphQLRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setOperationName(template.getOperationName());
        instance.setVariables(Optional.ofNullable(template.getVariables())
                .map(com.commercetools.api.models.graph_ql.GraphQLVariablesMap::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLRequest
     * @return builder
     */
    public static GraphQLRequestBuilder builder() {
        return GraphQLRequestBuilder.of();
    }

    /**
     * create builder for GraphQLRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLRequestBuilder builder(final GraphQLRequest template) {
        return GraphQLRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLRequest(Function<GraphQLRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLRequest>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLRequest>";
            }
        };
    }
}
