
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingInfo shippingInfo = ShippingInfo.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .price(priceBuilder -> priceBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .shippingMethodState(ShippingMethodState.DOES_NOT_MATCH_CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingInfoImpl.class)
public interface ShippingInfo {

    /**
     *  <p>Name of the Shipping Method.</p>
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public CentPrecisionMoney getPrice();

    /**
     *  <p>Used to determine the price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRate getShippingRate();

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Automatically set in the <code>Platform</code> TaxMode after the shipping address is set.</p>
     *  <p>For the <code>External</code> TaxMode the Tax Rate must be set explicitly with the ExternalTaxRateDraft.</p>
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodReference getShippingMethod();

    /**
     *  <p>Information on how items are delivered to customers.</p>
     */
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     */
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPrice getDiscountedPrice();

    /**
     *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the Cart.</p>
     */
    @NotNull
    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    public void setShippingMethodName(final String shippingMethodName);

    public void setPrice(final CentPrecisionMoney price);

    public void setShippingRate(final ShippingRate shippingRate);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public void setTaxRate(final TaxRate taxRate);

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    public void setShippingMethod(final ShippingMethodReference shippingMethod);

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    public void setDeliveries(final List<Delivery> deliveries);

    public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);

    public void setShippingMethodState(final ShippingMethodState shippingMethodState);

    public static ShippingInfo of() {
        return new ShippingInfoImpl();
    }

    public static ShippingInfo of(final ShippingInfo template) {
        ShippingInfoImpl instance = new ShippingInfoImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setPrice(template.getPrice());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxRate(template.getTaxRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setDeliveries(template.getDeliveries());
        instance.setDiscountedPrice(template.getDiscountedPrice());
        instance.setShippingMethodState(template.getShippingMethodState());
        return instance;
    }

    public static ShippingInfoBuilder builder() {
        return ShippingInfoBuilder.of();
    }

    public static ShippingInfoBuilder builder(final ShippingInfo template) {
        return ShippingInfoBuilder.of(template);
    }

    default <T> T withShippingInfo(Function<ShippingInfo, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingInfo>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingInfo>";
            }
        };
    }
}
