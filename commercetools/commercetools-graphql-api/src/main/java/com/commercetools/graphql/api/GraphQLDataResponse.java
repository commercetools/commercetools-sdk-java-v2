
package com.commercetools.graphql.api;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.graph_ql.GraphQLError;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.validation.Valid;

/**
 * GraphQLResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDataResponse graphQLResponse = GraphQLDataResponse.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonDeserialize(as = GraphQLDataResponseImpl.class)
public interface GraphQLDataResponse {

    /**
     *
     * @return data
     */

    @JsonProperty("data")
    public GraphQLData getData();

    /**
     *
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<GraphQLError> getErrors();

    /**
     * set data
     * @param data value to be set
     */

    public void setData(final GraphQLData data);

    /**
     * set errors
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final GraphQLError... errors);

    /**
     * set errors
     * @param errors values to be set
     */

    public void setErrors(final List<GraphQLError> errors);

    default <T> T getData(GraphQLRequest<T> request) {
        return request.getDataMapper().apply(this.getData());
    }

    /**
     * factory method
     * @return instance of GraphQLResponse
     */
    public static GraphQLDataResponse of() {
        return new GraphQLDataResponseImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDataResponse of(final GraphQLDataResponse template) {
        GraphQLDataResponseImpl instance = new GraphQLDataResponseImpl();
        instance.setData(template.getData());
        instance.setErrors(template.getErrors());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDataResponse deepCopy(@Nullable final GraphQLDataResponse template) {
        if (template == null) {
            return null;
        }
        GraphQLDataResponseImpl instance = new GraphQLDataResponseImpl();
        instance.setData(template.getData());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream().map(GraphQLError::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLResponse
     * @return builder
     */
    public static GraphQLDataResponseBuilder builder() {
        return GraphQLDataResponseBuilder.of();
    }

    /**
     * create builder for GraphQLResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDataResponseBuilder builder(final GraphQLDataResponse template) {
        return GraphQLDataResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDataResponse(Function<GraphQLDataResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDataResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDataResponse>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDataResponse>";
            }
        };
    }
}
