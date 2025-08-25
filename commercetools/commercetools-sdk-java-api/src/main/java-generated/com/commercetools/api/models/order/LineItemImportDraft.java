
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a snapshot of a Product Variant at the time it was imported with the Order. The Product Variant can be specified by providing a <code>productId</code> and <code>variant.id</code>, or by providing a <code>variant.sku</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemImportDraft lineItemImportDraft = LineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .quantity(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft extends com.commercetools.api.models.CustomizableDraft<LineItemImportDraft>,
        io.vrap.rmf.base.client.Draft<LineItemImportDraft> {

    /**
     *  <p>Name of the Line Item.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier of the Line Item.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariantImportDraft getVariant();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Product Variant belongs to.</p>
     *  <p>If provided, you must also set <code>variant.id</code>.</p>
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>The number of Product Variants in the LineItem. Can be a negative value.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Inventory mode specific to the LineItem, valid for the entire <code>quantity</code> of the LineItem. Set only if Inventory mode should be different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderImportDraft" rel="nofollow">OrderImportDraft</a>.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>States of the Line Item.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     *  <p>Custom Fields of the LineItem.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Name of the Line Item.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier of the Line Item.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariantImportDraft variant);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Product Variant belongs to.</p>
     *  <p>If provided, you must also set <code>variant.id</code>.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>The number of Product Variants in the LineItem. Can be a negative value.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     * @param price value to be set
     */

    public void setPrice(final PriceDraft price);

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRate taxRate);

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>Inventory mode specific to the LineItem, valid for the entire <code>quantity</code> of the LineItem. Set only if Inventory mode should be different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderImportDraft" rel="nofollow">OrderImportDraft</a>.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     *  <p>States of the Line Item.</p>
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     *  <p>States of the Line Item.</p>
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     *  <p>Custom Fields of the LineItem.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

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
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setVariant(template.getVariant());
        instance.setProductId(template.getProductId());
        instance.setQuantity(template.getQuantity());
        instance.setPrice(template.getPrice());
        instance.setTaxRate(template.getTaxRate());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setState(template.getState());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public LineItemImportDraft copyDeep();

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
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setVariant(
            com.commercetools.api.models.order.ProductVariantImportDraft.deepCopy(template.getVariant()));
        instance.setProductId(template.getProductId());
        instance.setQuantity(template.getQuantity());
        instance.setPrice(com.commercetools.api.models.common.PriceDraft.deepCopy(template.getPrice()));
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRate.deepCopy(template.getTaxRate()));
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
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
