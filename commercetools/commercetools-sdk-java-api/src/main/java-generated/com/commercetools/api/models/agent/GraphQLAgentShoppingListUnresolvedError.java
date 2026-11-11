
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> in <code>shoppingList</code> could not be found. No entity is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentShoppingListUnresolvedError graphQLAgentShoppingListUnresolvedError = GraphQLAgentShoppingListUnresolvedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentShoppingListUnresolvedErrorImpl.class)
public interface GraphQLAgentShoppingListUnresolvedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentShoppingListUnresolvedError
     */
    String SHOPPING_LIST_UNRESOLVED = "ShoppingListUnresolved";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentShoppingListUnresolvedError
     */
    public static GraphQLAgentShoppingListUnresolvedError of() {
        return new GraphQLAgentShoppingListUnresolvedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentShoppingListUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentShoppingListUnresolvedError of(final GraphQLAgentShoppingListUnresolvedError template) {
        GraphQLAgentShoppingListUnresolvedErrorImpl instance = new GraphQLAgentShoppingListUnresolvedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentShoppingListUnresolvedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentShoppingListUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentShoppingListUnresolvedError deepCopy(
            @Nullable final GraphQLAgentShoppingListUnresolvedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentShoppingListUnresolvedErrorImpl instance = new GraphQLAgentShoppingListUnresolvedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentShoppingListUnresolvedError
     * @return builder
     */
    public static GraphQLAgentShoppingListUnresolvedErrorBuilder builder() {
        return GraphQLAgentShoppingListUnresolvedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentShoppingListUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentShoppingListUnresolvedErrorBuilder builder(
            final GraphQLAgentShoppingListUnresolvedError template) {
        return GraphQLAgentShoppingListUnresolvedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentShoppingListUnresolvedError(
            Function<GraphQLAgentShoppingListUnresolvedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentShoppingListUnresolvedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentShoppingListUnresolvedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentShoppingListUnresolvedError>";
            }
        };
    }
}
