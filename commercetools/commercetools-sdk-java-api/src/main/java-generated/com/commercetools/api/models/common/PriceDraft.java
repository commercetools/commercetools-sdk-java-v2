
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
public interface PriceDraft extends com.commercetools.api.models.CustomizableDraft<PriceDraft> {

    /**
    *  <p>Money value of this Price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
    *  <p>Set this field if this Price is only valid for the specified country.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Set this field if this Price is only valid for the referenced <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
    *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
    *  <p>Set this field if this Price is valid only valid from the specified date and time.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Set this field if this Price is valid only valid until the specified date and time.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
    *  <p>Set this field to add a DiscountedPrice from an external service.</p>
    *  <p>The commercetools Platform sets this field automatically if at least one <a href="ctp:api:type:ProductDiscount">ProductDiscount</a> applies.
    *  The DiscountedPrice must reference a ProductDiscount with:</p>
    *  <ul>
    *  <li>The <code>isActive</code> flag set to <code>true</code>.</li>
    *  <li>A <a href="ctp:api:type:ProductDiscountValueExternal">ProductDiscountValue</a> of type <code>external</code>.</li>
    *  <li>A <code>predicate</code> that matches the <a href="ctp:api:type:ProductVariant">ProductVariant</a> the Price is referenced from.</li>
    *  </ul>
    */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
    *  <p>Set this field to specify different Prices for certain <a href="ctp:api:type:LineItem">LineItem</a> quantities.</p>
    */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    /**
    *  <p>Custom Fields for the Price.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setValue(final Money value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setDiscounted(final DiscountedPriceDraft discounted);

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    public void setTiers(final List<PriceTierDraft> tiers);

    public void setCustom(final CustomFieldsDraft custom);

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
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
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

    public static com.fasterxml.jackson.core.type.TypeReference<PriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PriceDraft>";
            }
        };
    }
}
