
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode. This update action sets the <code>taxedPrice</code> and <code>taxRate</code> on a Line Item and must be used after any price-affecting change occurs.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemTaxAmountAction cartSetLineItemTaxAmountAction = CartSetLineItemTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemTaxAmount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemTaxAmountActionImpl.class)
public interface CartSetLineItemTaxAmountAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemTaxAmountAction
     */
    String SET_LINE_ITEM_TAX_AMOUNT = "setLineItemTaxAmount";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     */

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of CartSetLineItemTaxAmountAction
     */
    public static CartSetLineItemTaxAmountAction of() {
        return new CartSetLineItemTaxAmountActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemTaxAmountAction of(final CartSetLineItemTaxAmountAction template) {
        CartSetLineItemTaxAmountActionImpl instance = new CartSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public CartSetLineItemTaxAmountAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemTaxAmountAction deepCopy(@Nullable final CartSetLineItemTaxAmountAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemTaxAmountActionImpl instance = new CartSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setExternalTaxAmount(
            com.commercetools.api.models.cart.ExternalTaxAmountDraft.deepCopy(template.getExternalTaxAmount()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemTaxAmountAction
     * @return builder
     */
    public static CartSetLineItemTaxAmountActionBuilder builder() {
        return CartSetLineItemTaxAmountActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemTaxAmountActionBuilder builder(final CartSetLineItemTaxAmountAction template) {
        return CartSetLineItemTaxAmountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemTaxAmountAction(Function<CartSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemTaxAmountAction>";
            }
        };
    }
}
