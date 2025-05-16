
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public CentPrecisionMoney getPrice();

    /**
     *  <p>Used to determine the price.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRate getShippingRate();

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
     *  <p>Automatically set in the <code>Platform</code> TaxMode after the shipping address is set.</p>
     *  <p>For the <code>External</code> TaxMode the Tax Rate must be set explicitly with the ExternalTaxRateDraft.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryReference getTaxCategory();

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodReference getShippingMethod();

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     * @return discountedPrice
     */
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPrice getDiscountedPrice();

    /**
     *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the Cart.</p>
     * @return shippingMethodState
     */
    @NotNull
    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    /**
     *  <p>Name of the Shipping Method.</p>
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
     * @param price value to be set
     */

    public void setPrice(final CentPrecisionMoney price);

    /**
     *  <p>Used to determine the price.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRate shippingRate);

    /**
     *  <p>Automatically set after the <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    /**
     *  <p>Automatically set in the <code>Platform</code> TaxMode after the shipping address is set.</p>
     *  <p>For the <code>External</code> TaxMode the Tax Rate must be set explicitly with the ExternalTaxRateDraft.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Used to select a Tax Rate when a Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryReference taxCategory);

    /**
     *  <p>Not set if a custom Shipping Method is used.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodReference shippingMethod);

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param deliveries values to be set
     */

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    /**
     *  <p>Information on how items are delivered to customers.</p>
     * @param deliveries values to be set
     */

    public void setDeliveries(final List<Delivery> deliveries);

    /**
     *  <p>Discounted price of the Shipping Method.</p>
     * @param discountedPrice value to be set
     */

    public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);

    /**
     *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the Cart.</p>
     * @param shippingMethodState value to be set
     */

    public void setShippingMethodState(final ShippingMethodState shippingMethodState);

    /**
     * factory method
     * @return instance of ShippingInfo
     */
    public static ShippingInfo of() {
        return new ShippingInfoImpl();
    }

    /**
     * factory method to create a shallow copy ShippingInfo
     * @param template instance to be copied
     * @return copy instance
     */
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

    public ShippingInfo copyDeep();

    /**
     * factory method to create a deep copy of ShippingInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingInfo deepCopy(@Nullable final ShippingInfo template) {
        if (template == null) {
            return null;
        }
        ShippingInfoImpl instance = new ShippingInfoImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setPrice(com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getPrice()));
        instance.setShippingRate(
            com.commercetools.api.models.shipping_method.ShippingRate.deepCopy(template.getShippingRate()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedItemPrice.deepCopy(template.getTaxedPrice()));
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRate.deepCopy(template.getTaxRate()));
        instance.setTaxCategory(
            com.commercetools.api.models.tax_category.TaxCategoryReference.deepCopy(template.getTaxCategory()));
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodReference
                .deepCopy(template.getShippingMethod()));
        instance.setDeliveries(Optional.ofNullable(template.getDeliveries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.Delivery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountedPrice(
            com.commercetools.api.models.cart.DiscountedLineItemPrice.deepCopy(template.getDiscountedPrice()));
        instance.setShippingMethodState(template.getShippingMethodState());
        return instance;
    }

    /**
     * builder factory method for ShippingInfo
     * @return builder
     */
    public static ShippingInfoBuilder builder() {
        return ShippingInfoBuilder.of();
    }

    /**
     * create builder for ShippingInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingInfoBuilder builder(final ShippingInfo template) {
        return ShippingInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingInfo(Function<ShippingInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingInfo>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingInfo>";
            }
        };
    }
}
