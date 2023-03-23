
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
 *  <p>Can be used if the Cart has the <code>External</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemTaxRateAction cartSetLineItemTaxRateAction = CartSetLineItemTaxRateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemTaxRateActionImpl.class)
public interface CartSetLineItemTaxRateAction extends CartUpdateAction {

    String SET_LINE_ITEM_TAX_RATE = "setLineItemTaxRate";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public void setShippingKey(final String shippingKey);

    public static CartSetLineItemTaxRateAction of() {
        return new CartSetLineItemTaxRateActionImpl();
    }

    public static CartSetLineItemTaxRateAction of(final CartSetLineItemTaxRateAction template) {
        CartSetLineItemTaxRateActionImpl instance = new CartSetLineItemTaxRateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static CartSetLineItemTaxRateActionBuilder builder() {
        return CartSetLineItemTaxRateActionBuilder.of();
    }

    public static CartSetLineItemTaxRateActionBuilder builder(final CartSetLineItemTaxRateAction template) {
        return CartSetLineItemTaxRateActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemTaxRateAction(Function<CartSetLineItemTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemTaxRateAction>";
            }
        };
    }
}
