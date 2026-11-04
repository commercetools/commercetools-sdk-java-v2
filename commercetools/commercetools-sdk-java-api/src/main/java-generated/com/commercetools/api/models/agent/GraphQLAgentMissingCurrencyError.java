
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
 *  <p>Returned by a <span>/responses</span> request that sets <code>shoppingList</code> when the currency for the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> could not be determined unambiguously. No entity is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingCurrencyError graphQLAgentMissingCurrencyError = GraphQLAgentMissingCurrencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingCurrency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentMissingCurrencyErrorImpl.class)
public interface GraphQLAgentMissingCurrencyError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentMissingCurrencyError
     */
    String MISSING_CURRENCY = "MissingCurrency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentMissingCurrencyError
     */
    public static GraphQLAgentMissingCurrencyError of() {
        return new GraphQLAgentMissingCurrencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentMissingCurrencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentMissingCurrencyError of(final GraphQLAgentMissingCurrencyError template) {
        GraphQLAgentMissingCurrencyErrorImpl instance = new GraphQLAgentMissingCurrencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentMissingCurrencyError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentMissingCurrencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentMissingCurrencyError deepCopy(@Nullable final GraphQLAgentMissingCurrencyError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentMissingCurrencyErrorImpl instance = new GraphQLAgentMissingCurrencyErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentMissingCurrencyError
     * @return builder
     */
    public static GraphQLAgentMissingCurrencyErrorBuilder builder() {
        return GraphQLAgentMissingCurrencyErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentMissingCurrencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingCurrencyErrorBuilder builder(final GraphQLAgentMissingCurrencyError template) {
        return GraphQLAgentMissingCurrencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentMissingCurrencyError(Function<GraphQLAgentMissingCurrencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentMissingCurrencyError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentMissingCurrencyError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentMissingCurrencyError>";
            }
        };
    }
}
