
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> could not be resolved from the input. Pin it with an explicit <code>store</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentStoreUnresolvedError graphQLAgentStoreUnresolvedError = GraphQLAgentStoreUnresolvedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentStoreUnresolvedErrorImpl.class)
public interface GraphQLAgentStoreUnresolvedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentStoreUnresolvedError
     */
    String STORE_UNRESOLVED = "StoreUnresolved";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentStoreUnresolvedError
     */
    public static GraphQLAgentStoreUnresolvedError of() {
        return new GraphQLAgentStoreUnresolvedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentStoreUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentStoreUnresolvedError of(final GraphQLAgentStoreUnresolvedError template) {
        GraphQLAgentStoreUnresolvedErrorImpl instance = new GraphQLAgentStoreUnresolvedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentStoreUnresolvedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentStoreUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentStoreUnresolvedError deepCopy(@Nullable final GraphQLAgentStoreUnresolvedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentStoreUnresolvedErrorImpl instance = new GraphQLAgentStoreUnresolvedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentStoreUnresolvedError
     * @return builder
     */
    public static GraphQLAgentStoreUnresolvedErrorBuilder builder() {
        return GraphQLAgentStoreUnresolvedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentStoreUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentStoreUnresolvedErrorBuilder builder(final GraphQLAgentStoreUnresolvedError template) {
        return GraphQLAgentStoreUnresolvedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentStoreUnresolvedError(Function<GraphQLAgentStoreUnresolvedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentStoreUnresolvedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentStoreUnresolvedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentStoreUnresolvedError>";
            }
        };
    }
}
