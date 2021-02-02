
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartAddLineItemActionImpl.class)
public interface MyCartAddLineItemAction extends MyCartUpdateAction {

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
    public Double getQuantity();

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

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

    public void setCustom(final CustomFieldsDraft custom);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public void setProductId(final String productId);

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setQuantity(final Double quantity);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setExternalPrice(final Money externalPrice);

    public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    public void setAddedAt(final ZonedDateTime addedAt);

    public static MyCartAddLineItemAction of() {
        return new MyCartAddLineItemActionImpl();
    }

    public static MyCartAddLineItemAction of(final MyCartAddLineItemAction template) {
        MyCartAddLineItemActionImpl instance = new MyCartAddLineItemActionImpl();
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
        instance.setAddedAt(template.getAddedAt());
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
}
