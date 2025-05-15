
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>For Product Variant identification, either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemDraft lineItemDraft = LineItemDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemDraftImpl.class)
public interface LineItemDraft extends com.commercetools.api.models.CustomizableDraft<LineItemDraft>,
        io.vrap.rmf.base.client.Draft<LineItemDraft> {

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of a published Product.</p>
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Quantity of the Product Variant to add to the Cart.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @return addedAt
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Used to select a Product Price. The referenced Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     *  <p>If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The referenced Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @return externalPrice
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @return externalTotalPrice
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p>Sets the external Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode and <code>Single</code> ShippingMode. If the Cart has <code>Multiple</code> ShippingMode, the Tax Rate is accepted but ignored.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @return perMethodExternalTaxRate
     */
    @Valid
    @JsonProperty("perMethodExternalTaxRate")
    public List<MethodExternalTaxRateDraft> getPerMethodExternalTaxRate();

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
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
     *  <p>Custom Fields for the Line Item.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>id</code> of a published Product.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Quantity of the Product Variant to add to the Cart.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     * @param addedAt value to be set
     */

    public void setAddedAt(final ZonedDateTime addedAt);

    /**
     *  <p>Used to select a Product Price. The referenced Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     *  <p>If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The referenced Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     * @param externalPrice value to be set
     */

    public void setExternalPrice(final Money externalPrice);

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param externalTotalPrice value to be set
     */

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    /**
     *  <p>Sets the external Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode and <code>Single</code> ShippingMode. If the Cart has <code>Multiple</code> ShippingMode, the Tax Rate is accepted but ignored.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param perMethodExternalTaxRate values to be set
     */

    @JsonIgnore
    public void setPerMethodExternalTaxRate(final MethodExternalTaxRateDraft... perMethodExternalTaxRate);

    /**
     *  <p>Sets the external Tax Rates for individual Shipping Methods, if the Cart has the <code>External</code> TaxMode and <code>Multiple</code> ShippingMode.</p>
     * @param perMethodExternalTaxRate values to be set
     */

    public void setPerMethodExternalTaxRate(final List<MethodExternalTaxRateDraft> perMethodExternalTaxRate);

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     *  <p>Custom Fields for the Line Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of LineItemDraft
     */
    public static LineItemDraft of() {
        return new LineItemDraftImpl();
    }

    /**
     * factory method to create a shallow copy LineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemDraft of(final LineItemDraft template) {
        LineItemDraftImpl instance = new LineItemDraftImpl();
        instance.setKey(template.getKey());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setPerMethodExternalTaxRate(template.getPerMethodExternalTaxRate());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public LineItemDraft copyDeep();

    /**
     * factory method to create a deep copy of LineItemDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemDraft deepCopy(@Nullable final LineItemDraft template) {
        if (template == null) {
            return null;
        }
        LineItemDraftImpl instance = new LineItemDraftImpl();
        instance.setKey(template.getKey());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        instance.setExternalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getExternalPrice()));
        instance.setExternalTotalPrice(
            com.commercetools.api.models.cart.ExternalLineItemTotalPrice.deepCopy(template.getExternalTotalPrice()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setPerMethodExternalTaxRate(Optional.ofNullable(template.getPerMethodExternalTaxRate())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.MethodExternalTaxRateDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for LineItemDraft
     * @return builder
     */
    public static LineItemDraftBuilder builder() {
        return LineItemDraftBuilder.of();
    }

    /**
     * create builder for LineItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemDraftBuilder builder(final LineItemDraft template) {
        return LineItemDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemDraft(Function<LineItemDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemDraft>";
            }
        };
    }
}
