
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
 *     InvalidItemShippingDetailsError invalidItemShippingDetailsError = InvalidItemShippingDetailsError.builder()
 *             .message("{message}")
 *             .subject("{subject}")
 *             .itemId("{itemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidItemShippingDetails")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidItemShippingDetailsErrorImpl.class)
public interface InvalidItemShippingDetailsError extends ErrorObject {

    /**
     * discriminator value for InvalidItemShippingDetailsError
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
     *  <p><code>"Inconsistent shipping details for $subject with ID $itemId. $subject quantity is $itemQuantity and shippingTargets quantity sum is $quantitySum."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

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
     *  <p><code>"Inconsistent shipping details for $subject with ID $itemId. $subject quantity is $itemQuantity and shippingTargets quantity sum is $quantitySum."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

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
     * @return instance of InvalidItemShippingDetailsError
     */
    public static InvalidItemShippingDetailsError of() {
        return new InvalidItemShippingDetailsErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidItemShippingDetailsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidItemShippingDetailsError of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorImpl instance = new InvalidItemShippingDetailsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

    public InvalidItemShippingDetailsError copyDeep();

    /**
     * factory method to create a deep copy of InvalidItemShippingDetailsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidItemShippingDetailsError deepCopy(@Nullable final InvalidItemShippingDetailsError template) {
        if (template == null) {
            return null;
        }
        InvalidItemShippingDetailsErrorImpl instance = new InvalidItemShippingDetailsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

    /**
     * builder factory method for InvalidItemShippingDetailsError
     * @return builder
     */
    public static InvalidItemShippingDetailsErrorBuilder builder() {
        return InvalidItemShippingDetailsErrorBuilder.of();
    }

    /**
     * create builder for InvalidItemShippingDetailsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidItemShippingDetailsErrorBuilder builder(final InvalidItemShippingDetailsError template) {
        return InvalidItemShippingDetailsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidItemShippingDetailsError(Function<InvalidItemShippingDetailsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidItemShippingDetailsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidItemShippingDetailsError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidItemShippingDetailsError>";
            }
        };
    }
}
