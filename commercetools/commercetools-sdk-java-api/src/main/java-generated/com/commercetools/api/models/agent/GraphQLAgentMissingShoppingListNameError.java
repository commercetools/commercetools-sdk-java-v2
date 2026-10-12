
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
 *  <p>Returned by a <span>/responses</span> request with <code>outputType</code> set to <code>ShoppingList</code> when a name for the Shopping List is not present in the input. A name is never invented.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingShoppingListNameError graphQLAgentMissingShoppingListNameError = GraphQLAgentMissingShoppingListNameError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingShoppingListName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentMissingShoppingListNameErrorImpl.class)
public interface GraphQLAgentMissingShoppingListNameError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentMissingShoppingListNameError
     */
    String MISSING_SHOPPING_LIST_NAME = "MissingShoppingListName";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentMissingShoppingListNameError
     */
    public static GraphQLAgentMissingShoppingListNameError of() {
        return new GraphQLAgentMissingShoppingListNameErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentMissingShoppingListNameError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentMissingShoppingListNameError of(final GraphQLAgentMissingShoppingListNameError template) {
        GraphQLAgentMissingShoppingListNameErrorImpl instance = new GraphQLAgentMissingShoppingListNameErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentMissingShoppingListNameError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentMissingShoppingListNameError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentMissingShoppingListNameError deepCopy(
            @Nullable final GraphQLAgentMissingShoppingListNameError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentMissingShoppingListNameErrorImpl instance = new GraphQLAgentMissingShoppingListNameErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentMissingShoppingListNameError
     * @return builder
     */
    public static GraphQLAgentMissingShoppingListNameErrorBuilder builder() {
        return GraphQLAgentMissingShoppingListNameErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentMissingShoppingListNameError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingShoppingListNameErrorBuilder builder(
            final GraphQLAgentMissingShoppingListNameError template) {
        return GraphQLAgentMissingShoppingListNameErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentMissingShoppingListNameError(
            Function<GraphQLAgentMissingShoppingListNameError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentMissingShoppingListNameError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentMissingShoppingListNameError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentMissingShoppingListNameError>";
            }
        };
    }
}
