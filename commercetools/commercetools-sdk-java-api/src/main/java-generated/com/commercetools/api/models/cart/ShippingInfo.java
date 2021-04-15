
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingInfoImpl.class)
public interface ShippingInfo {

    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
    *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("price")
    public TypedMoney getPrice();

    /**
    *  <p>The shipping rate used to determine the price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRate getShippingRate();

    /**
    *  <p>Set once the <code>taxRate</code> is set.</p>
    */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
    *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
    *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
    */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
    *  <p>Not set if custom shipping method is used.</p>
    */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodReference getShippingMethod();

    /**
    *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
    */
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPrice getDiscountedPrice();

    /**
    *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the cart or not.</p>
    */
    @NotNull
    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    public void setShippingMethodName(final String shippingMethodName);

    public void setPrice(final TypedMoney price);

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
}
