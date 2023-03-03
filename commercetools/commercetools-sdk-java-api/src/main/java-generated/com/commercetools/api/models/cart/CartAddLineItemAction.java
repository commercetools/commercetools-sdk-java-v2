
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the Cart contains a LineItem for a Product Variant with the same LineItemMode, Custom Fields, supply and distribution channel, then only the quantity of the existing Line Item is increased. If LineItem <code>shippingDetails</code> is set, it is merged. All addresses will be present afterwards and, for address keys present in both shipping details, the quantity will be summed up. A new Line Item is added when the <code>externalPrice</code> or <code>externalTotalPrice</code> is set in this update action. The LineItem price is set as described in LineItem Price selection.</p>
 *  <p>If the Tax Rate is not set, a MissingTaxRateForCountry error is returned.</p>
 *  <p>If the Line Items do not have a Price according to the Product <code>priceMode</code> value for a selected currency and/or country, Customer Group, or Channel, a MatchingPriceNotFound error is returned.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddLineItemActionImpl.class)
public interface CartAddLineItemAction
        extends CartUpdateAction, com.commercetools.api.models.CustomizableDraft<CartAddLineItemAction> {

    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p><code>id</code> of the published Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the ProductVariant in the Product. If not provided, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>SKU of the ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Quantity of the Product Variant to add to the Cart.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time (UTC) the Product Variant is added to the Cart. If not set, it defaults to the current date and time.</p>
     *  <p>Optional for backwards compatibility reasons.</p>
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
     *  <p>Used to select a Product Price. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum. If the Cart is bound to a Store with <code>distributionChannels</code> set, the Channel must match one of the Store's distribution channels.</p>
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p>Used to identify Inventory entries that must be reserved. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Sets the LineItem <code>price</code> value, and the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> values, and the <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     *  <p>External Tax Rate for the Line Item, if the Cart has the <code>External</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Inventory mode specific to the Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Set only if the inventory mode should be different from the <code>inventoryMode</code> specified on the Cart.</p>
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     *  <p>Custom Fields for the Line Item.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public void setCustom(final CustomFieldsDraft custom);

    public static CartAddLineItemAction of() {
        return new CartAddLineItemActionImpl();
    }

    public static CartAddLineItemAction of(final CartAddLineItemAction template) {
        CartAddLineItemActionImpl instance = new CartAddLineItemActionImpl();
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
        instance.setInventoryMode(template.getInventoryMode());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static CartAddLineItemActionBuilder builder() {
        return CartAddLineItemActionBuilder.of();
    }

    public static CartAddLineItemActionBuilder builder(final CartAddLineItemAction template) {
        return CartAddLineItemActionBuilder.of(template);
    }

    default <T> T withCartAddLineItemAction(Function<CartAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddLineItemAction>";
            }
        };
    }
}
