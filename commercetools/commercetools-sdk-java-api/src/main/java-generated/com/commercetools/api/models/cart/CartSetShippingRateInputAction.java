
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Input used to select a ShippingRatePriceTier. If no matching tier can be found, or the input is not set, the default price for the shipping rate is used.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingRateInputAction cartSetShippingRateInputAction = CartSetShippingRateInputAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingRateInputActionImpl.class)
public interface CartSetShippingRateInputAction extends CartUpdateAction {

    String SET_SHIPPING_RATE_INPUT = "setShippingRateInput";

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public static CartSetShippingRateInputAction of() {
        return new CartSetShippingRateInputActionImpl();
    }

    public static CartSetShippingRateInputAction of(final CartSetShippingRateInputAction template) {
        CartSetShippingRateInputActionImpl instance = new CartSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

    public static CartSetShippingRateInputActionBuilder builder() {
        return CartSetShippingRateInputActionBuilder.of();
    }

    public static CartSetShippingRateInputActionBuilder builder(final CartSetShippingRateInputAction template) {
        return CartSetShippingRateInputActionBuilder.of(template);
    }

    default <T> T withCartSetShippingRateInputAction(Function<CartSetShippingRateInputAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetShippingRateInputAction ofUnset() {
        return CartSetShippingRateInputAction.of();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingRateInputAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingRateInputAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingRateInputAction>";
            }
        };
    }
}
