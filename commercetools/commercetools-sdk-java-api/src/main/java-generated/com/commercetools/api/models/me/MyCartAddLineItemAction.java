
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
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
 *     MyCartAddLineItemAction myCartAddLineItemAction = MyCartAddLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartAddLineItemActionImpl.class)
public interface MyCartAddLineItemAction
        extends MyCartUpdateAction, com.commercetools.api.models.CustomizableDraft<MyCartAddLineItemAction> {

    String ADD_LINE_ITEM = "addLineItem";

    /**
     *  <p><code>id</code> of the Product.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p><code>id</code> of the ProductVariant in the Product.</p>
     *  <p>If not given, the Master Variant is used.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p><code>sku</code> of the ProductVariant.</p>
     *  <p>Either the <code>productId</code> and <code>variantId</code>, or <code>sku</code> must be provided.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Number of Line Items to add to the Cart.</p>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart. If not set, it defaults to the current date and time.</p>
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

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public void setCustom(final CustomFieldsDraft custom);

    public static MyCartAddLineItemAction of() {
        return new MyCartAddLineItemActionImpl();
    }

    public static MyCartAddLineItemAction of(final MyCartAddLineItemAction template) {
        MyCartAddLineItemActionImpl instance = new MyCartAddLineItemActionImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyCartAddLineItemActionBuilder builder() {
        return MyCartAddLineItemActionBuilder.of();
    }

    public static MyCartAddLineItemActionBuilder builder(final MyCartAddLineItemAction template) {
        return MyCartAddLineItemActionBuilder.of(template);
    }

    default <T> T withMyCartAddLineItemAction(Function<MyCartAddLineItemAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddLineItemAction>";
            }
        };
    }
}
