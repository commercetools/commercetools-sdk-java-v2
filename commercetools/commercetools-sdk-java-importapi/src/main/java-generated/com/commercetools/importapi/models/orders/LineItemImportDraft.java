
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.customfields.Custom;
import com.commercetools.importapi.models.prices.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Represents an individual Line Item in an Order. A line item is a snapshot of a product at the time it was added to the order.</p>
 *  <p>You cannot create an Order that includes line item operations that do not exist in the Project or have been deleted. Products and Product Variants referenced by a line item must already exist in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemImportDraft lineItemImportDraft = LineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .price(priceBuilder -> priceBuilder)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft extends io.vrap.rmf.base.client.Draft<LineItemImportDraft> {

    /**
     *  <p>Maps to <code>LineItem.productId</code>.</p>
     * @return product
     */
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public LineItemProductVariantImportDraft getVariant();

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public LineItemPrice getPrice();

    /**
     *  <p>Maps to <code>LineItem.quantity</code>.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    /**
     *
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. The Reference to the Supply Channel with which the LineItem is associated. If referenced Supply Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Supply Channel is created.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. The Reference to the Distribution Channel with which the LineItem is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Distribution Channel is created.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelKeyReference getDistributionChannel();

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>Maps to LineItem.shippingDetails.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>Custom Fields for this Line Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>Maps to <code>LineItem.productId</code>.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductKeyReference product);

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     * @param variant value to be set
     */

    public void setVariant(final LineItemProductVariantImportDraft variant);

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @param price value to be set
     */

    public void setPrice(final LineItemPrice price);

    /**
     *  <p>Maps to <code>LineItem.quantity</code>.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Double quantity);

    /**
     * set state
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     * set state
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. The Reference to the Supply Channel with which the LineItem is associated. If referenced Supply Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Supply Channel is created.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelKeyReference supplyChannel);

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. The Reference to the Distribution Channel with which the LineItem is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Distribution Channel is created.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelKeyReference distributionChannel);

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>Maps to LineItem.shippingDetails.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     *  <p>Custom Fields for this Line Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of LineItemImportDraft
     */
    public static LineItemImportDraft of() {
        return new LineItemImportDraftImpl();
    }

    /**
     * factory method to create a shallow copy LineItemImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemImportDraft of(final LineItemImportDraft template) {
        LineItemImportDraftImpl instance = new LineItemImportDraftImpl();
        instance.setProduct(template.getProduct());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setPrice(template.getPrice());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setTaxRate(template.getTaxRate());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of LineItemImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemImportDraft deepCopy(@Nullable final LineItemImportDraft template) {
        if (template == null) {
            return null;
        }
        LineItemImportDraftImpl instance = new LineItemImportDraftImpl();
        instance.setProduct(Optional.ofNullable(template.getProduct())
                .map(com.commercetools.importapi.models.common.ProductKeyReference::deepCopy)
                .orElse(null));
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setVariant(Optional.ofNullable(template.getVariant())
                .map(com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft::deepCopy)
                .orElse(null));
        instance.setPrice(Optional.ofNullable(template.getPrice())
                .map(com.commercetools.importapi.models.orders.LineItemPrice::deepCopy)
                .orElse(null));
        instance.setQuantity(template.getQuantity());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setSupplyChannel(Optional.ofNullable(template.getSupplyChannel())
                .map(com.commercetools.importapi.models.common.ChannelKeyReference::deepCopy)
                .orElse(null));
        instance.setDistributionChannel(Optional.ofNullable(template.getDistributionChannel())
                .map(com.commercetools.importapi.models.common.ChannelKeyReference::deepCopy)
                .orElse(null));
        instance.setTaxRate(Optional.ofNullable(template.getTaxRate())
                .map(com.commercetools.importapi.models.prices.TaxRate::deepCopy)
                .orElse(null));
        instance.setShippingDetails(Optional.ofNullable(template.getShippingDetails())
                .map(com.commercetools.importapi.models.orders.ItemShippingDetailsDraft::deepCopy)
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.importapi.models.customfields.Custom::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for LineItemImportDraft
     * @return builder
     */
    public static LineItemImportDraftBuilder builder() {
        return LineItemImportDraftBuilder.of();
    }

    /**
     * create builder for LineItemImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemImportDraftBuilder builder(final LineItemImportDraft template) {
        return LineItemImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemImportDraft(Function<LineItemImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemImportDraft>";
            }
        };
    }
}
