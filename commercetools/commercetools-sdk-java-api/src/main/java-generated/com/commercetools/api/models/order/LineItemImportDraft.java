
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft {

    /**
    *  <p>ID of the existing product.
    *  You also need to specify the ID of the variant if this property is set or alternatively you can just specify SKU of the product variant.</p>
    */

    @JsonProperty("productId")
    public String getProductId();

    /**
    *  <p>The product name.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariantImportDraft getVariant();

    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
    *  <p>Optional connection to a particular supplier.
    *  By providing supply channel information, you can uniquely identify
    *  inventory entries that should be reserved.
    *  The provided channel should have the
    *  InventorySupply role.</p>
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

    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setProductId(final String productId);

    public void setName(final LocalizedString name);

    public void setVariant(final ProductVariantImportDraft variant);

    public void setPrice(final PriceDraft price);

    public void setQuantity(final Double quantity);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public void setTaxRate(final TaxRate taxRate);

    public void setCustom(final CustomFieldsDraft custom);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static LineItemImportDraft of() {
        return new LineItemImportDraftImpl();
    }

    public static LineItemImportDraft of(final LineItemImportDraft template) {
        LineItemImportDraftImpl instance = new LineItemImportDraftImpl();
        instance.setProductId(template.getProductId());
        instance.setName(template.getName());
        instance.setVariant(template.getVariant());
        instance.setPrice(template.getPrice());
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setTaxRate(template.getTaxRate());
        instance.setCustom(template.getCustom());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public static LineItemImportDraftBuilder builder() {
        return LineItemImportDraftBuilder.of();
    }

    public static LineItemImportDraftBuilder builder(final LineItemImportDraft template) {
        return LineItemImportDraftBuilder.of(template);
    }

    default <T> T withLineItemImportDraft(Function<LineItemImportDraft, T> helper) {
        return helper.apply(this);
    }
}
