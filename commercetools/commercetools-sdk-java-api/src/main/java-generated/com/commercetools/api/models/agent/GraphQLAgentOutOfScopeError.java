
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
 *  <p>Returned by a <span>/responses</span> request when the input does not contain enough information to create a Cart or a Quote Request: no products, no customer email address, and no shipping country could be determined.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentOutOfScopeError graphQLAgentOutOfScopeError = GraphQLAgentOutOfScopeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OutOfScope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentOutOfScopeErrorImpl.class)
public interface GraphQLAgentOutOfScopeError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentOutOfScopeError
     */
    String OUT_OF_SCOPE = "OutOfScope";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentOutOfScopeError
     */
    public static GraphQLAgentOutOfScopeError of() {
        return new GraphQLAgentOutOfScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentOutOfScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentOutOfScopeError of(final GraphQLAgentOutOfScopeError template) {
        GraphQLAgentOutOfScopeErrorImpl instance = new GraphQLAgentOutOfScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentOutOfScopeError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentOutOfScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentOutOfScopeError deepCopy(@Nullable final GraphQLAgentOutOfScopeError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentOutOfScopeErrorImpl instance = new GraphQLAgentOutOfScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentOutOfScopeError
     * @return builder
     */
    public static GraphQLAgentOutOfScopeErrorBuilder builder() {
        return GraphQLAgentOutOfScopeErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentOutOfScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentOutOfScopeErrorBuilder builder(final GraphQLAgentOutOfScopeError template) {
        return GraphQLAgentOutOfScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentOutOfScopeError(Function<GraphQLAgentOutOfScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentOutOfScopeError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentOutOfScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentOutOfScopeError>";
            }
        };
    }
}
