
package com.commercetools.api.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceImpl.class)
public interface Price extends com.commercetools.api.models.Customizable<Price> {

    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
    */
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
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
    *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a <a href="ctp:api:type:Type">Type</a>.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    public void setId(final String id);

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public static Price of() {
        return new PriceImpl();
    }

    public static Price of(final Price template) {
        PriceImpl instance = new PriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        instance.setTiers(template.getTiers());
        return instance;
    }

    public static PriceBuilder builder() {
        return PriceBuilder.of();
    }

    public static PriceBuilder builder(final Price template) {
        return PriceBuilder.of(template);
    }

    default <T> T withPrice(Function<Price, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Price> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Price>() {
            @Override
            public String toString() {
                return "TypeReference<Price>";
            }
        };
    }
}
