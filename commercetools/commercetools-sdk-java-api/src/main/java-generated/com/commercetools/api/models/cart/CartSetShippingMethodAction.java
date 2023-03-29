
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>To set the Cart's Shipping Method the Cart must have the <code>Single</code> ShippingMode and a <code>shippingAddress</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodAction cartSetShippingMethodAction = CartSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetShippingMethodActionImpl.class)
public interface CartSetShippingMethodAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetShippingMethodAction
     */
    String SET_SHIPPING_METHOD = "setShippingMethod";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     * factory method
     * @return instance of CartSetShippingMethodAction
     */
    public static CartSetShippingMethodAction of() {
        return new CartSetShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetShippingMethodAction of(final CartSetShippingMethodAction template) {
        CartSetShippingMethodActionImpl instance = new CartSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetShippingMethodAction deepCopy(@Nullable final CartSetShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        CartSetShippingMethodActionImpl instance = new CartSetShippingMethodActionImpl();
        instance.setShippingMethod(Optional.ofNullable(template.getShippingMethod())
                .map(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setExternalTaxRate(Optional.ofNullable(template.getExternalTaxRate())
                .map(com.commercetools.api.models.cart.ExternalTaxRateDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartSetShippingMethodAction
     * @return builder
     */
    public static CartSetShippingMethodActionBuilder builder() {
        return CartSetShippingMethodActionBuilder.of();
    }

    /**
     * create builder for CartSetShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingMethodActionBuilder builder(final CartSetShippingMethodAction template) {
        return CartSetShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetShippingMethodAction(Function<CartSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetShippingMethodAction>";
            }
        };
    }
}
