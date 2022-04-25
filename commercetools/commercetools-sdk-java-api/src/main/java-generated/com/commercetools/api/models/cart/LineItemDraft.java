
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemDraftImpl.class)
public interface LineItemDraft extends com.commercetools.api.models.CustomizableDraft<LineItemDraft> {

    @JsonProperty("productId")
    public String getProductId();

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>The amount of a <code>LineItem</code>in the cart.
    *  Must be a positive integer.</p>
    */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
    *  <p>When the line item was added to the cart. Optional for backwards
    *  compatibility reasons only.</p>
    */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    /**
    *  <p>By providing supply channel information, you can unique identify
    *  inventory entries that should be reserved.
    *  The provided channel should have
    *  the InventorySupply role.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
    *  <p>The channel is used to select a ProductPrice.
    *  The provided channel should have the ProductDistribution role.</p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
    *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
    */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>Sets the line item <code>price</code> to the given value and sets the line item <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
    */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
    *  <p>Sets the line item <code>price</code> and <code>totalPrice</code> to the given values and sets the line item <code>priceMode</code> to <code>ExternalTotal</code> LineItemPriceMode.</p>
    */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
    *  <p>Container for line item specific address(es).</p>
    */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setQuantity(final Long quantity);

    public void setAddedAt(final ZonedDateTime addedAt);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public void setCustom(final CustomFieldsDraft custom);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static LineItemDraft of() {
        return new LineItemDraftImpl();
    }

    public static LineItemDraft of(final LineItemDraft template) {
        LineItemDraftImpl instance = new LineItemDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setAddedAt(template.getAddedAt());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setCustom(template.getCustom());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static LineItemDraftBuilder builder() {
        return LineItemDraftBuilder.of();
    }

    public static LineItemDraftBuilder builder(final LineItemDraft template) {
        return LineItemDraftBuilder.of(template);
    }

    default <T> T withLineItemDraft(Function<LineItemDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LineItemDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemDraft>";
            }
        };
    }
}
