
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemTaxAmountAction cartSetLineItemTaxAmountAction = CartSetLineItemTaxAmountAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemTaxAmountActionImpl.class)
public interface CartSetLineItemTaxAmountAction extends CartUpdateAction {

    String SET_LINE_ITEM_TAX_AMOUNT = "setLineItemTaxAmount";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

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

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public void setShippingKey(final String shippingKey);

    public static CartSetLineItemTaxAmountAction of() {
        return new CartSetLineItemTaxAmountActionImpl();
    }

    public static CartSetLineItemTaxAmountAction of(final CartSetLineItemTaxAmountAction template) {
        CartSetLineItemTaxAmountActionImpl instance = new CartSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static CartSetLineItemTaxAmountActionBuilder builder() {
        return CartSetLineItemTaxAmountActionBuilder.of();
    }

    public static CartSetLineItemTaxAmountActionBuilder builder(final CartSetLineItemTaxAmountAction template) {
        return CartSetLineItemTaxAmountActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTaxAmountAction(Function<CartSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemTaxAmountAction>";
            }
        };
    }
}
