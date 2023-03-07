
package com.commercetools.api.models.me;

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
 *     MyCartSetShippingAddressAction myCartSetShippingAddressAction = MyCartSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetShippingAddressActionImpl.class)
public interface MyCartSetShippingAddressAction extends MyCartUpdateAction {

    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items.</p>
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyCartSetShippingAddressAction of() {
        return new MyCartSetShippingAddressActionImpl();
    }

    public static MyCartSetShippingAddressAction of(final MyCartSetShippingAddressAction template) {
        MyCartSetShippingAddressActionImpl instance = new MyCartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartSetShippingAddressActionBuilder builder() {
        return MyCartSetShippingAddressActionBuilder.of();
    }

    public static MyCartSetShippingAddressActionBuilder builder(final MyCartSetShippingAddressAction template) {
        return MyCartSetShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartSetShippingAddressAction(Function<MyCartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetShippingAddressAction>";
            }
        };
    }
}
