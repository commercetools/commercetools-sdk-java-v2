
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

/**
 * MyCartAddLineItemAction
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
     <*  <p>The representation used when creating or updating a customizable data type with Custom Fields.</p>>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     <>
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     <>
     */

    @JsonProperty("productId")
    public String getProductId();

    /**
     <>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     <>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     <>
     */

    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     <*  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>>
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    /**
     <>
     */
    @Valid
    @JsonProperty("externalTotalPrice")
    public ExternalLineItemTotalPrice getExternalTotalPrice();

    /**
     <>
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

    /**
     <>
     */

    @JsonProperty("addedAt")
    public ZonedDateTime getAddedAt();

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

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddLineItemAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddLineItemAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddLineItemAction>";
            }
        };
    }
}
