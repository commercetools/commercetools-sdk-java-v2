
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>To set the Cart's Shipping Method the Cart must have the <code>Single</code> ShippingMode and a <code>shippingAddress</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetShippingMethodAction myCartSetShippingMethodAction = MyCartSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetShippingMethodActionImpl.class)
public interface MyCartSetShippingMethodAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetShippingMethodAction
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
     * @return instance of MyCartSetShippingMethodAction
     */
    public static MyCartSetShippingMethodAction of() {
        return new MyCartSetShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetShippingMethodAction of(final MyCartSetShippingMethodAction template) {
        MyCartSetShippingMethodActionImpl instance = new MyCartSetShippingMethodActionImpl();
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartSetShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetShippingMethodAction deepCopy(@Nullable final MyCartSetShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetShippingMethodActionImpl instance = new MyCartSetShippingMethodActionImpl();
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier
                .deepCopy(template.getShippingMethod()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetShippingMethodAction
     * @return builder
     */
    public static MyCartSetShippingMethodActionBuilder builder() {
        return MyCartSetShippingMethodActionBuilder.of();
    }

    /**
     * create builder for MyCartSetShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetShippingMethodActionBuilder builder(final MyCartSetShippingMethodAction template) {
        return MyCartSetShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetShippingMethodAction(Function<MyCartSetShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetShippingMethodAction>";
            }
        };
    }
}
