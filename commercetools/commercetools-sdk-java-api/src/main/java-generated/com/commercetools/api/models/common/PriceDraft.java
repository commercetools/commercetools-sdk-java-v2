
package com.commercetools.api.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceDraftImpl.class)
public interface PriceDraft {

    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    public void setValue(final Money value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setCustom(final CustomFieldsDraft custom);

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    public void setTiers(final List<PriceTierDraft> tiers);

    public void setDiscounted(final DiscountedPrice discounted);

    public static PriceDraft of() {
        return new PriceDraftImpl();
    }

    public static PriceDraft of(final PriceDraft template) {
        PriceDraftImpl instance = new PriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(template.getCustom());
        instance.setTiers(template.getTiers());
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public static PriceDraftBuilder builder() {
        return PriceDraftBuilder.of();
    }

    public static PriceDraftBuilder builder(final PriceDraft template) {
        return PriceDraftBuilder.of(template);
    }

    default <T> T withPriceDraft(Function<PriceDraft, T> helper) {
        return helper.apply(this);
    }
}
