
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
 *  <p>Returned by a <span>/responses</span> request when the resolved <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> grants multiple <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> and none could be automatically selected. To resolve this error, specify an explicit <code>store</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentStoreAmbiguousError graphQLAgentStoreAmbiguousError = GraphQLAgentStoreAmbiguousError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreAmbiguous")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentStoreAmbiguousErrorImpl.class)
public interface GraphQLAgentStoreAmbiguousError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentStoreAmbiguousError
     */
    String STORE_AMBIGUOUS = "StoreAmbiguous";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentStoreAmbiguousError
     */
    public static GraphQLAgentStoreAmbiguousError of() {
        return new GraphQLAgentStoreAmbiguousErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentStoreAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentStoreAmbiguousError of(final GraphQLAgentStoreAmbiguousError template) {
        GraphQLAgentStoreAmbiguousErrorImpl instance = new GraphQLAgentStoreAmbiguousErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentStoreAmbiguousError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentStoreAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentStoreAmbiguousError deepCopy(@Nullable final GraphQLAgentStoreAmbiguousError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentStoreAmbiguousErrorImpl instance = new GraphQLAgentStoreAmbiguousErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentStoreAmbiguousError
     * @return builder
     */
    public static GraphQLAgentStoreAmbiguousErrorBuilder builder() {
        return GraphQLAgentStoreAmbiguousErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentStoreAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentStoreAmbiguousErrorBuilder builder(final GraphQLAgentStoreAmbiguousError template) {
        return GraphQLAgentStoreAmbiguousErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentStoreAmbiguousError(Function<GraphQLAgentStoreAmbiguousError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentStoreAmbiguousError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentStoreAmbiguousError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentStoreAmbiguousError>";
            }
        };
    }
}
