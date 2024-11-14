
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The query, operation name, and variables that are sent to the GraphQL API.</p>
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
     *  <p>String representation of the <em>Source Text</em> of the <em>Document</em> that is specified in the Language section of the GraphQL specification.</p>
     * @return query
     */
    @NotNull
    @JsonProperty("query")
    public String getQuery();

    /**
     *  <p>Name of the operation, if you defined several operations in <code>query</code>.</p>
     * @return operationName
     */

    @JsonProperty("operationName")
    public String getOperationName();

    /**
     *  <p>JSON object that contains key-value pairs in which the keys are variable names and the values are variable values.</p>
     * @return variables
     */
    @Valid
    @JsonProperty("variables")
    public GraphQLVariablesMap getVariables();

    /**
     *  <p>String representation of the <em>Source Text</em> of the <em>Document</em> that is specified in the Language section of the GraphQL specification.</p>
     * @param query value to be set
     */

    public void setQuery(final String query);

    /**
     *  <p>Name of the operation, if you defined several operations in <code>query</code>.</p>
     * @param operationName value to be set
     */

    public void setOperationName(final String operationName);

    /**
     *  <p>JSON object that contains key-value pairs in which the keys are variable names and the values are variable values.</p>
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
        instance.setVariables(
            com.commercetools.api.models.graph_ql.GraphQLVariablesMap.deepCopy(template.getVariables()));
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
