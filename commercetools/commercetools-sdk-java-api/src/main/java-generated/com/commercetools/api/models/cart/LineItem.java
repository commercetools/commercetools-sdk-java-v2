
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product_type.ProductTypeReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemImpl.class)
public interface LineItem {

    /**
    *  <p>The unique ID of this LineItem.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
    *  <p>The product name.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>The slug of a product is inserted on the fly.
    *  It is always up-to-date and can therefore be used to link to the product detail page of the product.
    *  It is empty if the product has been deleted.
    *  The slug is also empty if the cart or order is retrieved via Reference Expansion or is a snapshot in a Message.</p>
    */
    @Valid
    @JsonProperty("productSlug")
    public LocalizedString getProductSlug();

    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
    *  <p>The variant data is saved when the variant is added to the cart, and not updated automatically.
    *  It can manually be updated with the Recalculate update action.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
    *  <p>The price of a line item is selected from the prices array of the product variant.
    *  If the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
    *  <p>Set once the <code>taxRate</code> is set.</p>
    */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    /**
    *  <p>The total price of this line item.
    *  If the line item is discounted, then the <code>totalPrice</code> is the DiscountedLineItemPriceForQuantity multiplied by <code>quantity</code>.
    *  Otherwise the total price is the product price multiplied by the <code>quantity</code>.
    *  <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
    *  <p>The amount of a LineItem in the cart.
    *  Must be a positive integer.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
    *  <p>When the line item was added to the cart. Optional for backwards
    *  compatibility reasons only.</p>
    */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
    *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
    *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
    */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
    *  <p>The supply channel identifies the inventory entries that should be reserved.
    *  The channel has
    *  the role InventorySupply.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
    *  <p>The distribution channel is used to select a ProductPrice.
    *  The channel has the role ProductDistribution.</p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelReference getDistributionChannel();

    @NotNull
    @Valid
    @JsonProperty("discountedPricePerQuantity")
    public List<DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity();

    @NotNull
    @JsonProperty("priceMode")
    public LineItemPriceMode getPriceMode();

    @NotNull
    @JsonProperty("lineItemMode")
    public LineItemMode getLineItemMode();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
    *  <p>Container for line item specific address(es).</p>
    */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetails getShippingDetails();

    /**
    *  <p>The date when the LineItem was last modified by one of the following actions
    *  setLineItemShippingDetails, addLineItem, removeLineItem, or changeLineItemQuantity.
    *  Optional only for backwards compatible reasons. When the LineItem is created lastModifiedAt is set to addedAt.</p>
    */

    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setId(final String id);

    public void setProductId(final String productId);

    public void setName(final LocalizedString name);

    public void setProductSlug(final LocalizedString productSlug);

    public void setProductType(final ProductTypeReference productType);

    public void setVariant(final ProductVariant variant);

    public void setPrice(final Price price);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setTaxRate(final TaxRate taxRate);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public void setDistributionChannel(final ChannelReference distributionChannel);

    @JsonIgnore
    public void setDiscountedPricePerQuantity(final DiscountedLineItemPriceForQuantity... discountedPricePerQuantity);

    public void setDiscountedPricePerQuantity(
            final List<DiscountedLineItemPriceForQuantity> discountedPricePerQuantity);

    public void setPriceMode(final LineItemPriceMode priceMode);

    public void setLineItemMode(final LineItemMode lineItemMode);

    public void setCustom(final CustomFields custom);

    public void setShippingDetails(final ItemShippingDetails shippingDetails);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public static LineItem of() {
        return new LineItemImpl();
    }

    public static LineItem of(final LineItem template) {
        LineItemImpl instance = new LineItemImpl();
        instance.setId(template.getId());
        instance.setProductId(template.getProductId());
        instance.setName(template.getName());
        instance.setProductSlug(template.getProductSlug());
        instance.setProductType(template.getProductType());
        instance.setVariant(template.getVariant());
        instance.setPrice(template.getPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setState(template.getState());
        instance.setTaxRate(template.getTaxRate());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setDiscountedPricePerQuantity(template.getDiscountedPricePerQuantity());
        instance.setPriceMode(template.getPriceMode());
        instance.setLineItemMode(template.getLineItemMode());
        instance.setCustom(template.getCustom());
        instance.setShippingDetails(template.getShippingDetails());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    public static LineItemBuilder builder() {
        return LineItemBuilder.of();
    }

    public static LineItemBuilder builder(final LineItem template) {
        return LineItemBuilder.of(template);
    }

    default <T> T withLineItem(Function<LineItem, T> helper) {
        return helper.apply(this);
    }
}
