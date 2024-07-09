
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when Line Item or Custom Line Item quantities set under ItemShippingDetails do not match the sum of the quantities in their respective shipping details.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on Carts and My Carts.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Cart and Create Cart in Store requests and Add LineItem, Add CustomLineItem, Set LineItem ShippingDetails, Set CustomLineItem ShippingDetails, Add Shopping List, and Remove LineItem update actions on Carts.</li>
 *   <li>Create Cart and Create Cart in Store requests, and Add LineItem, Set LineItem ShippingDetails, and Remove LineItem update actions on My Carts.</li>
 *   <li>Create Cart in BusinessUnit request on Associate Carts.</li>
 *   <li>Create Order from Cart, Create Order in Store from Cart, Create Order from Quote, and Create Order by Import requests on Orders.</li>
 *   <li>Create Order from Cart, Create Order in Store from Cart, and Create Order from Quote requests on My Orders.</li>
 *   <li>Add LineItem, Add CustomLineItem, Set LineItem ShippingDetails, Set CustomLineItem ShippingDetails, Add Shopping List, and Remove LineItem update actions on Order Edits.</li>
 *   <li>Create Order from Cart in BusinessUnit and Create Order from Quote in BusinessUnit requests on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidItemShippingDetailsError graphQLInvalidItemShippingDetailsError = GraphQLInvalidItemShippingDetailsError.builder()
 *             .subject("{subject}")
 *             .itemId("{itemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidItemShippingDetailsErrorImpl.class)
public interface GraphQLInvalidItemShippingDetailsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidItemShippingDetailsError
     */
    String INVALID_ITEM_SHIPPING_DETAILS = "InvalidItemShippingDetails";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     * @return subject
     */
    @NotNull
    @JsonProperty("subject")
    public String getSubject();

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     * @return itemId
     */
    @NotNull
    @JsonProperty("itemId")
    public String getItemId();

    /**
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     * @param subject value to be set
     */

    public void setSubject(final String subject);

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     * @param itemId value to be set
     */

    public void setItemId(final String itemId);

    /**
     * factory method
     * @return instance of GraphQLInvalidItemShippingDetailsError
     */
    public static GraphQLInvalidItemShippingDetailsError of() {
        return new GraphQLInvalidItemShippingDetailsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidItemShippingDetailsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidItemShippingDetailsError of(final GraphQLInvalidItemShippingDetailsError template) {
        GraphQLInvalidItemShippingDetailsErrorImpl instance = new GraphQLInvalidItemShippingDetailsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLInvalidItemShippingDetailsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidItemShippingDetailsError deepCopy(
            @Nullable final GraphQLInvalidItemShippingDetailsError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidItemShippingDetailsErrorImpl instance = new GraphQLInvalidItemShippingDetailsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidItemShippingDetailsError
     * @return builder
     */
    public static GraphQLInvalidItemShippingDetailsErrorBuilder builder() {
        return GraphQLInvalidItemShippingDetailsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidItemShippingDetailsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidItemShippingDetailsErrorBuilder builder(
            final GraphQLInvalidItemShippingDetailsError template) {
        return GraphQLInvalidItemShippingDetailsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidItemShippingDetailsError(
            Function<GraphQLInvalidItemShippingDetailsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidItemShippingDetailsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidItemShippingDetailsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidItemShippingDetailsError>";
            }
        };
    }
}
