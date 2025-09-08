
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
 *  <p>Returned when Line Item or Custom Line Item quantities set under <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingDetails" rel="nofollow">ItemShippingDetails</a> do not match the sum of the quantities in their respective shipping details.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUpdateAction" rel="nofollow">Carts</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartUpdateAction" rel="nofollow">My Carts</a>.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/carts:POST" rel="nofollow">Create Cart in Store</a> requests and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddLineItemAction" rel="nofollow">Add LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddCustomLineItemAction" rel="nofollow">Add CustomLineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShoppingListAction" rel="nofollow">Add Shopping List</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update actions on Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/carts:POST" rel="nofollow">Create Cart</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/me/carts:POST" rel="nofollow">Create Cart in Store</a> requests, and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartAddLineItemAction" rel="nofollow">Add LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:MyCartRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update actions on My Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/carts:POST" rel="nofollow">Create Cart in BusinessUnit</a> request on Associate Carts.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Create Order from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/orders:POST" rel="nofollow">Create Order in Store from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/import:POST" rel="nofollow">Create Order by Import</a> requests on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders:POST" rel="nofollow">Create Order from Cart</a>, <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/me/orders:POST" rel="nofollow">Create Order in Store from Cart</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/orders/quotes:POST" rel="nofollow">Create Order from Quote</a> requests on My Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddLineItemAction" rel="nofollow">Add LineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddCustomLineItemAction" rel="nofollow">Add CustomLineItem</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddShoppingListAction" rel="nofollow">Add Shopping List</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemoveLineItemAction" rel="nofollow">Remove LineItem</a> update actions on Order Edits.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders:POST" rel="nofollow">Create Order from Cart in BusinessUnit</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/as-associate/{associateId}/in-business-unit/key={businessUnitKey}/orders/quotes:POST" rel="nofollow">Create Order from Quote in BusinessUnit</a> requests on Associate Orders.</li>
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
