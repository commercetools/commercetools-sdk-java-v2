
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
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemTaxAmountAction cartSetCustomLineItemTaxAmountAction = CartSetCustomLineItemTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomLineItemTaxAmount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemTaxAmountActionImpl.class)
public interface CartSetCustomLineItemTaxAmountAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCustomLineItemTaxAmountAction
     */
    String SET_CUSTOM_LINE_ITEM_TAX_AMOUNT = "setCustomLineItemTaxAmount";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxAmount
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalTaxAmount value to be set
     */

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of CartSetCustomLineItemTaxAmountAction
     */
    public static CartSetCustomLineItemTaxAmountAction of() {
        return new CartSetCustomLineItemTaxAmountActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCustomLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCustomLineItemTaxAmountAction of(final CartSetCustomLineItemTaxAmountAction template) {
        CartSetCustomLineItemTaxAmountActionImpl instance = new CartSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public CartSetCustomLineItemTaxAmountAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetCustomLineItemTaxAmountAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCustomLineItemTaxAmountAction deepCopy(
            @Nullable final CartSetCustomLineItemTaxAmountAction template) {
        if (template == null) {
            return null;
        }
        CartSetCustomLineItemTaxAmountActionImpl instance = new CartSetCustomLineItemTaxAmountActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setExternalTaxAmount(
            com.commercetools.api.models.cart.ExternalTaxAmountDraft.deepCopy(template.getExternalTaxAmount()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for CartSetCustomLineItemTaxAmountAction
     * @return builder
     */
    public static CartSetCustomLineItemTaxAmountActionBuilder builder() {
        return CartSetCustomLineItemTaxAmountActionBuilder.of();
    }

    /**
     * create builder for CartSetCustomLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCustomLineItemTaxAmountActionBuilder builder(
            final CartSetCustomLineItemTaxAmountAction template) {
        return CartSetCustomLineItemTaxAmountActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCustomLineItemTaxAmountAction(Function<CartSetCustomLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemTaxAmountAction>";
            }
        };
    }
}
