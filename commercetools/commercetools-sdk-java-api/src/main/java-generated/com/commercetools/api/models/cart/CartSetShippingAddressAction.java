
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the shipping address also sets the TaxRate of Line Items and calculates the TaxedPrice.</p>
 *  <p>If a matching price cannot be found for the given shipping address during Line Item Price selection, a MissingTaxRateForCountry error is returned.</p>
 *  <p>If you want to allow shipping to states inside a country that are not explicitly covered by a TaxRate, set the <code>countryTaxRateFallbackEnabled</code> field to <code>true</code> in the CartsConfiguration by using the Change CountryTaxRateFallbackEnabled update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingAddressAction cartSetShippingAddressAction = CartSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingAddressActionImpl.class)
public interface CartSetShippingAddressAction extends CartUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items of the Cart.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static CartSetShippingAddressAction of() {
        return new CartSetShippingAddressActionImpl();
    }

    public static CartSetShippingAddressAction of(final CartSetShippingAddressAction template) {
        CartSetShippingAddressActionImpl instance = new CartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CartSetShippingAddressActionBuilder builder() {
        return CartSetShippingAddressActionBuilder.of();
    }

    public static CartSetShippingAddressActionBuilder builder(final CartSetShippingAddressAction template) {
        return CartSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withCartSetShippingAddressAction(Function<CartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingAddressAction>";
            }
        };
    }
}
