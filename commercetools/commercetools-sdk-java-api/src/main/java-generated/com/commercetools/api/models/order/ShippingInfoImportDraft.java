
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ShippingMethodState;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Becomes the <code>shippingInfo</code> of the imported Order.</p>
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
     *  <p>Name of the Shipping Method.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>The base price for the Shipping Method.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Shipping rate information for the Order.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Include a Tax Rate for the Shipping Method.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Include a value to associate a Tax Category with the shipping information.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>Include a value to associate a Shipping Method with the Order.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Information on how items are to be delivered to customers.</p>
     * @return deliveries
     */
    @Valid
    @JsonProperty("deliveries")
    public List<DeliveryDraft> getDeliveries();

    /**
     *  <p>Discounted Price of the Shipping Method.</p>
     * @return discountedPrice
     */
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPriceDraft getDiscountedPrice();

    /**
     *  <p>Indicates if the ShippingMethod referenced is allowed for the Order or not.</p>
     * @return shippingMethodState
     */

    @JsonProperty("shippingMethodState")
    public ShippingMethodState getShippingMethodState();

    /**
     *  <p>Name of the Shipping Method.</p>
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     *  <p>The base price for the Shipping Method.</p>
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     *  <p>Shipping rate information for the Order.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     *  <p>Include a Tax Rate for the Shipping Method.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Include a value to associate a Tax Category with the shipping information.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>Include a value to associate a Shipping Method with the Order.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>Information on how items are to be delivered to customers.</p>
     * @param deliveries values to be set
     */

    @JsonIgnore
    public void setDeliveries(final DeliveryDraft... deliveries);

    /**
     *  <p>Information on how items are to be delivered to customers.</p>
     * @param deliveries values to be set
     */

    public void setDeliveries(final List<DeliveryDraft> deliveries);

    /**
     *  <p>Discounted Price of the Shipping Method.</p>
     * @param discountedPrice value to be set
     */

    public void setDiscountedPrice(final DiscountedLineItemPriceDraft discountedPrice);

    /**
     *  <p>Indicates if the ShippingMethod referenced is allowed for the Order or not.</p>
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
        instance.setPrice(com.commercetools.api.models.common.Money.deepCopy(template.getPrice()));
        instance.setShippingRate(
            com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRate.deepCopy(template.getTaxRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier
                .deepCopy(template.getShippingMethod()));
        instance.setDeliveries(Optional.ofNullable(template.getDeliveries())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountedPrice(
            com.commercetools.api.models.order.DiscountedLineItemPriceDraft.deepCopy(template.getDiscountedPrice()));
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
