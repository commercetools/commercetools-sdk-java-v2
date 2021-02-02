
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = LineItemPriceImpl.class)
public interface LineItemPrice {

    /**
    *  <p>Maps to <code>Price.value</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
    *  <p>Maps to <code>Price.county</code>.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Maps to <code>Price.validFrom</code>.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Maps to <code>Price.validUntil</code>.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>References a customer group by its key.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
    *  <p>References a channel by its key.</p>
    */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
    *  <p>Sets a discounted price from an external service.</p>
    */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
    *  <p>The tiered prices for this price.</p>
    */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
    *  <p>Maps to <code>Price.custom</code>.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    public void setChannel(final ChannelKeyReference channel);

    public void setDiscounted(final DiscountedPrice discounted);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setCustom(final Custom custom);

    public static LineItemPrice of() {
        return new LineItemPriceImpl();
    }

    public static LineItemPrice of(final LineItemPrice template) {
        LineItemPriceImpl instance = new LineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static LineItemPriceBuilder builder() {
        return LineItemPriceBuilder.of();
    }

    public static LineItemPriceBuilder builder(final LineItemPrice template) {
        return LineItemPriceBuilder.of(template);
    }

    default <T> T withLineItemPrice(Function<LineItemPrice, T> helper) {
        return helper.apply(this);
    }
}
