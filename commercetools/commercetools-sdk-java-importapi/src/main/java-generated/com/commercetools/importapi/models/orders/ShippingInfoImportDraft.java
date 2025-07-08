
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.prices.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Maps to an Order's <code>shippingInfo</code> property. This field is usually populated by the Cart associated with the Order, but when importing Orders you must provide a draft representation as a part of the OrderImport.</p>
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
     *  <p>Maps to <code>shippingInfo.shippingMethodName</code>.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Maps to <code>shippingInfo.price</code>.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public TypedMoney getPrice();

    /**
     *  <p>Used to determine the price.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced ShippingMethod does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodKeyReference getShippingMethod();

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<Delivery> getDeliveries();

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     * @return discountedPrice
     */
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPriceDraft getDiscountedPrice();

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodState</code>.</p>
     * @return shippingMethodState
     */

    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodName</code>.</p>
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     *  <p>Maps to <code>shippingInfo.price</code>.</p>
     * @param price value to be set
     */

    public void setPrice(final TypedMoney price);

    /**
     *  <p>Used to determine the price.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     *  <p>Maps to <code>shippingInfo.taxRate</code>.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Maps to <code>shippingInfo.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethod</code>. If the referenced ShippingMethod does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ShippingMethod is created.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodKeyReference shippingMethod);

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param deliveries values to be set
     */

    @JsonIgnore
    public void setDeliveries(final Delivery... deliveries);

    /**
     *  <p>Maps to <code>shippingInfo.deliveries</code>. You cannot add a <code>DeliveryItem</code> on import, as <code>LineItems</code> and <code>CustomLineItems</code> are not yet referenceable by an <code>id</code>.</p>
     * @param deliveries values to be set
     */

    public void setDeliveries(final List<Delivery> deliveries);

    /**
     *  <p>Maps to <code>shippingInfo.discountedPrice</code>.</p>
     * @param discountedPrice value to be set
     */

    public void setDiscountedPrice(final DiscountedLineItemPriceDraft discountedPrice);

    /**
     *  <p>Maps to <code>shippingInfo.shippingMethodState</code>.</p>
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
     * factory method to create a shallow copy ShippingInfoImportDraft
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

    public ShippingInfoImportDraft copyDeep();

    /**
     * factory method to create a deep copy of ShippingInfoImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingInfoImportDraft deepCopy(@Nullable final ShippingInfoImportDraft template) {
        if (template == null) {
            return null;
        }
        ShippingInfoImportDraftImpl instance = new ShippingInfoImportDraftImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setPrice(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getPrice()));
        instance.setShippingRate(
            com.commercetools.importapi.models.orders.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setTaxRate(com.commercetools.importapi.models.prices.TaxRate.deepCopy(template.getTaxRate()));
        instance.setTaxCategory(
            com.commercetools.importapi.models.common.TaxCategoryKeyReference.deepCopy(template.getTaxCategory()));
        instance.setShippingMethod(com.commercetools.importapi.models.common.ShippingMethodKeyReference
                .deepCopy(template.getShippingMethod()));
        instance.setDeliveries(Optional.ofNullable(template.getDeliveries())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.Delivery::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountedPrice(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft
                .deepCopy(template.getDiscountedPrice()));
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
