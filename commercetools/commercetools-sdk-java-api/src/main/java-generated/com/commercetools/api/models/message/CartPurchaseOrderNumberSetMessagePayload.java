
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartPurchaseOrderNumberSetMessagePayload cartPurchaseOrderNumberSetMessagePayload = CartPurchaseOrderNumberSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartPurchaseOrderNumberSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartPurchaseOrderNumberSetMessagePayloadImpl.class)
public interface CartPurchaseOrderNumberSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartPurchaseOrderNumberSetMessagePayload
     */
    String CART_PURCHASE_ORDER_NUMBER_SET = "CartPurchaseOrderNumberSet";

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @return oldPurchaseOrderNumber
     */

    @JsonProperty("oldPurchaseOrderNumber")
    public String getOldPurchaseOrderNumber();

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>Purchase order number on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetPurchaseOrderNumberAction" rel="nofollow">Set Purchase Order Number</a> update action.</p>
     * @param oldPurchaseOrderNumber value to be set
     */

    public void setOldPurchaseOrderNumber(final String oldPurchaseOrderNumber);

    /**
     * factory method
     * @return instance of CartPurchaseOrderNumberSetMessagePayload
     */
    public static CartPurchaseOrderNumberSetMessagePayload of() {
        return new CartPurchaseOrderNumberSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartPurchaseOrderNumberSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartPurchaseOrderNumberSetMessagePayload of(final CartPurchaseOrderNumberSetMessagePayload template) {
        CartPurchaseOrderNumberSetMessagePayloadImpl instance = new CartPurchaseOrderNumberSetMessagePayloadImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    public CartPurchaseOrderNumberSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartPurchaseOrderNumberSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartPurchaseOrderNumberSetMessagePayload deepCopy(
            @Nullable final CartPurchaseOrderNumberSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartPurchaseOrderNumberSetMessagePayloadImpl instance = new CartPurchaseOrderNumberSetMessagePayloadImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setOldPurchaseOrderNumber(template.getOldPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for CartPurchaseOrderNumberSetMessagePayload
     * @return builder
     */
    public static CartPurchaseOrderNumberSetMessagePayloadBuilder builder() {
        return CartPurchaseOrderNumberSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartPurchaseOrderNumberSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartPurchaseOrderNumberSetMessagePayloadBuilder builder(
            final CartPurchaseOrderNumberSetMessagePayload template) {
        return CartPurchaseOrderNumberSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartPurchaseOrderNumberSetMessagePayload(
            Function<CartPurchaseOrderNumberSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartPurchaseOrderNumberSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartPurchaseOrderNumberSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartPurchaseOrderNumberSetMessagePayload>";
            }
        };
    }
}
