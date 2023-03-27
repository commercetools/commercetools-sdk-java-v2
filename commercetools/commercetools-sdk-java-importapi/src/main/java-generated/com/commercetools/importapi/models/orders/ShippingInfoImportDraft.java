
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.prices.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Maps to an order's <code>shippingInfo</code> property. This field is usually populated by the cart assosciated with the order, but when importing orders you must provide a draft representation as a part of the OrderImport.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingInfoImportDraft shippingInfoImportDraft = ShippingInfoImportDraft.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .price(priceBuilder -> priceBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingInfoImportDraftImpl.class)
public interface ShippingInfoImportDraft extends io.vrap.rmf.base.client.Draft<ShippingInfoImportDraft> {

    /**
     *
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public TypedMoney getPrice();

    /**
     *
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>References a tax category by key.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     *  <p>References a shipping method by key.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodKeyReference getShippingMethod();

    /**
     *  <p>Note that you can not add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referencable by an <code>id</code>.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    /**
     *
     * @return discountedPrice
     */
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPriceDraft getDiscountedPrice();

    /**
     *
     * @return shippingMethodState
     */

    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    /**
     * set shippingMethodName
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     * set price
     * @param price value to be set
     */

    public void setPrice(final TypedMoney price);

    /**
     * set shippingRate
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     * set taxRate
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>References a tax category by key.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    /**
     *  <p>References a shipping method by key.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodKeyReference shippingMethod);

    /**
     *  <p>Note that you can not add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referencable by an <code>id</code>.</p>
     * @param deliveries values to be set
     */

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    /**
     *  <p>Note that you can not add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referencable by an <code>id</code>.</p>
     * @param deliveries values to be set
     */

    public void setDeliveries(final List<Delivery> deliveries);

    /**
     * set discountedPrice
     * @param discountedPrice value to be set
     */

    public void setDiscountedPrice(final DiscountedLineItemPriceDraft discountedPrice);

    /**
     * set shippingMethodState
     * @param shippingMethodState value to be set
     */

    public void setShippingMethodState(final ShippingMethodState shippingMethodState);

    /**
     * factory method
     * @return instance of ShippingInfoImportDraft
     */
    public static ShippingInfoImportDraft of() {
        return new ShippingInfoImportDraftImpl();
    }

    /**
     * factory method to copy an instance of ShippingInfoImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingInfoImportDraft of(final ShippingInfoImportDraft template) {
        ShippingInfoImportDraftImpl instance = new ShippingInfoImportDraftImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setPrice(template.getPrice());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxRate(template.getTaxRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setDeliveries(template.getDeliveries());
        instance.setDiscountedPrice(template.getDiscountedPrice());
        instance.setShippingMethodState(template.getShippingMethodState());
        return instance;
    }

    /**
     * builder factory method for ShippingInfoImportDraft
     * @return builder
     */
    public static ShippingInfoImportDraftBuilder builder() {
        return ShippingInfoImportDraftBuilder.of();
    }

    /**
     * create builder for ShippingInfoImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingInfoImportDraftBuilder builder(final ShippingInfoImportDraft template) {
        return ShippingInfoImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingInfoImportDraft(Function<ShippingInfoImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingInfoImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingInfoImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingInfoImportDraft>";
            }
        };
    }
}
