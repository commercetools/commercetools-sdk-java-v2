
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A Shipping Method tax amount can be set if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodTaxAmountAction cartSetShippingMethodTaxAmountAction = CartSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingMethodTaxAmountActionImpl.class)
public interface CartSetShippingMethodTaxAmountAction extends CartUpdateAction {

    String SET_SHIPPING_METHOD_TAX_AMOUNT = "setShippingMethodTaxAmount";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetShippingMethodTaxAmountAction of() {
        return new CartSetShippingMethodTaxAmountActionImpl();
    }

    public static CartSetShippingMethodTaxAmountAction of(final CartSetShippingMethodTaxAmountAction template) {
        CartSetShippingMethodTaxAmountActionImpl instance = new CartSetShippingMethodTaxAmountActionImpl();
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

    public static CartSetShippingMethodTaxAmountActionBuilder builder() {
        return CartSetShippingMethodTaxAmountActionBuilder.of();
    }

    public static CartSetShippingMethodTaxAmountActionBuilder builder(
            final CartSetShippingMethodTaxAmountAction template) {
        return CartSetShippingMethodTaxAmountActionBuilder.of(template);
    }

    default <T> T withCartSetShippingMethodTaxAmountAction(Function<CartSetShippingMethodTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingMethodTaxAmountAction>";
            }
        };
    }
}
