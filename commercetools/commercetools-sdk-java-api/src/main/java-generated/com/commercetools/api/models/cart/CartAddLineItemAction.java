
package com.commercetools.api.models.cart;

import java.time.*;
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
@JsonDeserialize(as = CartAddLineItemActionImpl.class)
public interface CartAddLineItemAction extends CartUpdateAction {

    String ADD_LINE_ITEM = "addLineItem";

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    @JsonProperty("productId")
    public String getProductId();

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("quantity")
    public Long getQuantity();

    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    public void setCustom(final CustomFieldsDraft custom);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setQuantity(final Long quantity);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public static CartAddLineItemAction of() {
        return new CartAddLineItemActionImpl();
    }

    public static CartAddLineItemAction of(final CartAddLineItemAction template) {
        CartAddLineItemActionImpl instance = new CartAddLineItemActionImpl();
        instance.setCustom(template.getCustom());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setQuantity(template.getQuantity());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setExternalPrice(template.getExternalPrice());
        instance.setExternalTotalPrice(template.getExternalTotalPrice());
        instance.setShippingDetails(template.getShippingDetails());
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
}
