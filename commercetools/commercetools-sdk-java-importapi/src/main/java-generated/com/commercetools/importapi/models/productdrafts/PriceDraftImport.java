
package com.commercetools.importapi.models.productdrafts;

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
@JsonDeserialize(as = PriceDraftImportImpl.class)
public interface PriceDraftImport {

    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */

    @JsonProperty("country")
    public String getCountry();

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

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>The custom fields for this category.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

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

    @JsonProperty("key")
    public String getKey();

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    public void setChannel(final ChannelKeyReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setCustom(final Custom custom);

    public void setDiscounted(final DiscountedPrice discounted);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setKey(final String key);

    public static PriceDraftImport of() {
        return new PriceDraftImportImpl();
    }

    public static PriceDraftImport of(final PriceDraftImport template) {
        PriceDraftImportImpl instance = new PriceDraftImportImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(template.getCustom());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setKey(template.getKey());
        return instance;
    }

    public static PriceDraftImportBuilder builder() {
        return PriceDraftImportBuilder.of();
    }

    public static PriceDraftImportBuilder builder(final PriceDraftImport template) {
        return PriceDraftImportBuilder.of(template);
    }

    default <T> T withPriceDraftImport(Function<PriceDraftImport, T> helper) {
        return helper.apply(this);
    }
}
