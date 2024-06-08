
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * GraphQLResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLResponse graphQLResponse = GraphQLResponse.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLResponseImpl.class)
public interface GraphQLResponse {

    /**
     *
     * @return data
     */

    @JsonProperty("data")
    public Object getData();

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

    public void setData(final Object data);

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

    /**
     * factory method
     * @return instance of GraphQLResponse
     */
    public static GraphQLResponse of() {
        return new GraphQLResponseImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLResponse of(final GraphQLResponse template) {
        GraphQLResponseImpl instance = new GraphQLResponseImpl();
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
    public static GraphQLResponse deepCopy(@Nullable final GraphQLResponse template) {
        if (template == null) {
            return null;
        }
        GraphQLResponseImpl instance = new GraphQLResponseImpl();
        instance.setData(template.getData());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.graph_ql.GraphQLError::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLResponse
     * @return builder
     */
    public static GraphQLResponseBuilder builder() {
        return GraphQLResponseBuilder.of();
    }

    /**
     * create builder for GraphQLResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLResponseBuilder builder(final GraphQLResponse template) {
        return GraphQLResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLResponse(Function<GraphQLResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLResponse>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLResponse>";
            }
        };
    }
}
