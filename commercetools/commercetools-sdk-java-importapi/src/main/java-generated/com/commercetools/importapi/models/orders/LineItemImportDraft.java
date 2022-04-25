
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.prices.TaxRate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Represents an individual Line Item in an Order. A line item is a snapshot of a product at the time it was added to the order.</p>
*  <p>You cannot create an Order that includes line item operations that do not exist in the Project or have been deleted.
*  Products and Product Variants referenced by a line item must already exist in the commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemImportDraftImpl.class)
public interface LineItemImportDraft {

    /**
    *  <p>Maps to <code>LineItem.productId</code>.</p>
    */
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
    *  <p>Maps to <code>LineItem.name</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public LineItemProductVariantImportDraft getVariant();

    /**
    *  <p>Maps to <code>LineItem.price</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("price")
    public LineItemPrice getPrice();

    /**
    *  <p>Maps to <code>LineItem.quantity</code>.</p>
    */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
    *  <p>Maps to <code>LineItem.supplyChannel</code>.
    *  The Reference to the Supply <a href="/../api/projects/channels#channel">Channel</a> with which the LineItem is associated.
    *  If referenced Supply Channel does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Supply Channel is created.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();

    /**
    *  <p>Maps to <code>LineItem.distributionChannel</code>.
    *  The Reference to the Distribution <a href="/../api/projects/channels#channel">Channel</a> with which the LineItem is associated.
    *  If referenced CustomerGroup does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Distribution Channel is created.</p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelKeyReference getDistributionChannel();

    /**
    *  <p>Maps to <code>LineItem.taxRate</code>.</p>
    */
    @Valid
    @JsonProperty("taxRate")
    public TaxRate getTaxRate();

    /**
    *  <p>Maps to LineItem.shippingDetails.</p>
    */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setProduct(final ProductKeyReference product);

    public void setName(final LocalizedString name);

    public void setVariant(final LineItemProductVariantImportDraft variant);

    public void setPrice(final LineItemPrice price);

    public void setQuantity(final Double quantity);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public void setSupplyChannel(final ChannelKeyReference supplyChannel);

    public void setDistributionChannel(final ChannelKeyReference distributionChannel);

    public void setTaxRate(final TaxRate taxRate);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static LineItemImportDraft of() {
        return new LineItemImportDraftImpl();
    }

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

    public static com.fasterxml.jackson.core.type.TypeReference<LineItemImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemImportDraft>";
            }
        };
    }
}
