
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the <code>purchaseOrderNumber</code> field and produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartPurchaseOrderNumberSetMessage" rel="nofollow">CartPurchaseOrderNumberSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetPurchaseOrderNumberAction cartSetPurchaseOrderNumberAction = CartSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPurchaseOrderNumber")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetPurchaseOrderNumberActionImpl.class)
public interface CartSetPurchaseOrderNumberAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetPurchaseOrderNumberAction
     */
    String SET_PURCHASE_ORDER_NUMBER = "setPurchaseOrderNumber";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     * factory method
     * @return instance of CartSetPurchaseOrderNumberAction
     */
    public static CartSetPurchaseOrderNumberAction of() {
        return new CartSetPurchaseOrderNumberActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetPurchaseOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetPurchaseOrderNumberAction of(final CartSetPurchaseOrderNumberAction template) {
        CartSetPurchaseOrderNumberActionImpl instance = new CartSetPurchaseOrderNumberActionImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    public CartSetPurchaseOrderNumberAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetPurchaseOrderNumberAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetPurchaseOrderNumberAction deepCopy(@Nullable final CartSetPurchaseOrderNumberAction template) {
        if (template == null) {
            return null;
        }
        CartSetPurchaseOrderNumberActionImpl instance = new CartSetPurchaseOrderNumberActionImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    /**
     * builder factory method for CartSetPurchaseOrderNumberAction
     * @return builder
     */
    public static CartSetPurchaseOrderNumberActionBuilder builder() {
        return CartSetPurchaseOrderNumberActionBuilder.of();
    }

    /**
     * create builder for CartSetPurchaseOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetPurchaseOrderNumberActionBuilder builder(final CartSetPurchaseOrderNumberAction template) {
        return CartSetPurchaseOrderNumberActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetPurchaseOrderNumberAction(Function<CartSetPurchaseOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetPurchaseOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetPurchaseOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetPurchaseOrderNumberAction>";
            }
        };
    }
}
