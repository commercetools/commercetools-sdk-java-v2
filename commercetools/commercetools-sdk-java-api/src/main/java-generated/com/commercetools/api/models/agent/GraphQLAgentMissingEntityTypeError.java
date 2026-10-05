
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
 *  <p>Returned by a <span>/responses</span> request when the input did not specify whether to create a Cart or a Quote Request. Set <code>outputType</code> explicitly in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingEntityTypeError graphQLAgentMissingEntityTypeError = GraphQLAgentMissingEntityTypeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingEntityType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentMissingEntityTypeErrorImpl.class)
public interface GraphQLAgentMissingEntityTypeError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentMissingEntityTypeError
     */
    String MISSING_ENTITY_TYPE = "MissingEntityType";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentMissingEntityTypeError
     */
    public static GraphQLAgentMissingEntityTypeError of() {
        return new GraphQLAgentMissingEntityTypeErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentMissingEntityTypeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentMissingEntityTypeError of(final GraphQLAgentMissingEntityTypeError template) {
        GraphQLAgentMissingEntityTypeErrorImpl instance = new GraphQLAgentMissingEntityTypeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentMissingEntityTypeError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentMissingEntityTypeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentMissingEntityTypeError deepCopy(
            @Nullable final GraphQLAgentMissingEntityTypeError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentMissingEntityTypeErrorImpl instance = new GraphQLAgentMissingEntityTypeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentMissingEntityTypeError
     * @return builder
     */
    public static GraphQLAgentMissingEntityTypeErrorBuilder builder() {
        return GraphQLAgentMissingEntityTypeErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentMissingEntityTypeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingEntityTypeErrorBuilder builder(final GraphQLAgentMissingEntityTypeError template) {
        return GraphQLAgentMissingEntityTypeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentMissingEntityTypeError(Function<GraphQLAgentMissingEntityTypeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentMissingEntityTypeError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentMissingEntityTypeError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentMissingEntityTypeError>";
            }
        };
    }
}
