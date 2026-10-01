
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
 *  <p>Returned by a <span>/responses</span> request when the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> was created but the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> could not be created from it, for example because the Cart has no verified Customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentQuoteRequestCreationFailedError graphQLAgentQuoteRequestCreationFailedError = GraphQLAgentQuoteRequestCreationFailedError.builder()
 *             .cartId("{cartId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QuoteRequestCreationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentQuoteRequestCreationFailedErrorImpl.class)
public interface GraphQLAgentQuoteRequestCreationFailedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentQuoteRequestCreationFailedError
     */
    String QUOTE_REQUEST_CREATION_FAILED = "QuoteRequestCreationFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @return cartId
     */
    @NotNull
    @JsonProperty("cartId")
    public String getCartId();

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @param cartId value to be set
     */

    public void setCartId(final String cartId);

    /**
     * factory method
     * @return instance of GraphQLAgentQuoteRequestCreationFailedError
     */
    public static GraphQLAgentQuoteRequestCreationFailedError of() {
        return new GraphQLAgentQuoteRequestCreationFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentQuoteRequestCreationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentQuoteRequestCreationFailedError of(
            final GraphQLAgentQuoteRequestCreationFailedError template) {
        GraphQLAgentQuoteRequestCreationFailedErrorImpl instance = new GraphQLAgentQuoteRequestCreationFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCartId(template.getCartId());
        return instance;
    }

    public GraphQLAgentQuoteRequestCreationFailedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentQuoteRequestCreationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentQuoteRequestCreationFailedError deepCopy(
            @Nullable final GraphQLAgentQuoteRequestCreationFailedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentQuoteRequestCreationFailedErrorImpl instance = new GraphQLAgentQuoteRequestCreationFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCartId(template.getCartId());
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentQuoteRequestCreationFailedError
     * @return builder
     */
    public static GraphQLAgentQuoteRequestCreationFailedErrorBuilder builder() {
        return GraphQLAgentQuoteRequestCreationFailedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentQuoteRequestCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentQuoteRequestCreationFailedErrorBuilder builder(
            final GraphQLAgentQuoteRequestCreationFailedError template) {
        return GraphQLAgentQuoteRequestCreationFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentQuoteRequestCreationFailedError(
            Function<GraphQLAgentQuoteRequestCreationFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentQuoteRequestCreationFailedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentQuoteRequestCreationFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentQuoteRequestCreationFailedError>";
            }
        };
    }
}
