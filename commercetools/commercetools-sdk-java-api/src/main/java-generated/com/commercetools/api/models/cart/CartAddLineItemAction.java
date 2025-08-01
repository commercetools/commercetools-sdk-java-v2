
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>If the Cart contains a LineItem for a Product Variant with the same LineItemMode, Custom Fields, supply and distribution channel, then only the quantity of the existing Line Item is increased. If LineItem <code>shippingDetails</code> is set, it is merged. All addresses will be present afterwards and, for address keys present in both shipping details, the quantity will be summed up. A new Line Item is added when the <code>externalPrice</code> or <code>externalTotalPrice</code> is set in this update action. The LineItem price is set as described in Line Item price selection.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
 *  <p>If the Line Items do not have a Price according to the Product <code>priceMode</code> value for a selected currency and/or country, Customer Group, or Channel, a MatchingPriceNotFound error is returned.</p>
 *  <p>If the Line Items are added to a Cart bound to a Store with active Product Selections, the selected Product Variant must be available in that Store, otherwise an InvalidInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddLineItemAction cartAddLineItemAction = CartAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addLineItem")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddLineItemActionImpl.class)
public interface CartAddLineItemAction
        extends CartUpdateAction, com.commercetools.api.models.CustomizableDraft<CartAddLineItemAction> {

    /**
     * discriminator value for CartAddLineItemAction
     */
    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of the published Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @return productId
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>SKU of the ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
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
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
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
     *  <p>Recurring Order and frequency data.</p>
     * @return recurrenceInfo
     */
    @Valid
    @JsonProperty("recurrenceInfo")
    public LineItemRecurrenceInfoDraft getRecurrenceInfo();

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
     *  <p><code>id</code> of the published Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>SKU of the ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
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
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
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
     *  <p>Recurring Order and frequency data.</p>
     * @param recurrenceInfo value to be set
     */

    public void setRecurrenceInfo(final LineItemRecurrenceInfoDraft recurrenceInfo);

    /**
     *  <p>Custom Fields for the Line Item.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of CartAddLineItemAction
     */
    public static CartAddLineItemAction of() {
        return new CartAddLineItemActionImpl();
    }

    /**
     * factory method to create a shallow copy CartAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddLineItemAction of(final CartAddLineItemAction template) {
        CartAddLineItemActionImpl instance = new CartAddLineItemActionImpl();
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
        instance.setRecurrenceInfo(template.getRecurrenceInfo());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public CartAddLineItemAction copyDeep();

    /**
     * factory method to create a deep copy of CartAddLineItemAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartAddLineItemAction deepCopy(@Nullable final CartAddLineItemAction template) {
        if (template == null) {
            return null;
        }
        CartAddLineItemActionImpl instance = new CartAddLineItemActionImpl();
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
        instance.setRecurrenceInfo(com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft
                .deepCopy(template.getRecurrenceInfo()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for CartAddLineItemAction
     * @return builder
     */
    public static CartAddLineItemActionBuilder builder() {
        return CartAddLineItemActionBuilder.of();
    }

    /**
     * create builder for CartAddLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddLineItemActionBuilder builder(final CartAddLineItemAction template) {
        return CartAddLineItemActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddLineItemAction(Function<CartAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddLineItemAction>";
            }
        };
    }
}
