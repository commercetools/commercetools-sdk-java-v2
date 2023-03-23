
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>To set the Cart's custom Shipping Method (independent of the ShippingMethods managed through the Shipping Methods API) the Cart must have the <code>Single</code> ShippingMode and a <code>shippingAddress</code>.</p>
 *  <p>To unset a custom Shipping Method on a Cart, use the Set ShippingMethod update action without the <code>shippingMethod</code> field instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomShippingMethodAction cartSetCustomShippingMethodAction = CartSetCustomShippingMethodAction.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomShippingMethodActionImpl.class)
public interface CartSetCustomShippingMethodAction extends CartUpdateAction {

    String SET_CUSTOM_SHIPPING_METHOD = "setCustomShippingMethod";

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Determines the shipping price.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethodName(final String shippingMethodName);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static CartSetCustomShippingMethodAction of() {
        return new CartSetCustomShippingMethodActionImpl();
    }

    public static CartSetCustomShippingMethodAction of(final CartSetCustomShippingMethodAction template) {
        CartSetCustomShippingMethodActionImpl instance = new CartSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static CartSetCustomShippingMethodActionBuilder builder() {
        return CartSetCustomShippingMethodActionBuilder.of();
    }

    public static CartSetCustomShippingMethodActionBuilder builder(final CartSetCustomShippingMethodAction template) {
        return CartSetCustomShippingMethodActionBuilder.of(template);
    }

    default <T> T withCartSetCustomShippingMethodAction(Function<CartSetCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomShippingMethodAction>";
            }
        };
    }
}
