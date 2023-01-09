
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Standalone Prices are defined with a scope consisting of <code>currency</code> and optionally <code>country</code>, <code>customerGroup</code>, and <code>channel</code> and/or a validity period (<code>validFrom</code> and/or <code>validTo</code>). For more information see price selection.</p>
 *  <p>Creating a Standalone Price for an SKU which has a Standalone Price with exactly the same price scope, or with overlapping validity periods within the same price scope returns the DuplicateStandalonePriceScope and OverlappingStandalonePriceValidity errors, respectively. A Price without validity period does not conflict with a Price defined for a time period.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDraft standalonePriceDraft = StandalonePriceDraft.builder()
 *             .sku("{sku}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceDraftImpl.class)
public interface StandalonePriceDraft extends com.commercetools.api.models.CustomizableDraft<StandalonePriceDraft> {

    /**
     *  <p>User-defined unique identifier for the StandalonePrice.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Specifies to which ProductVariant the API associates this Price. It is not validated to exist in product variants.</p>
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Sets the money value of this Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Sets the date from which the Price is valid. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Sets the date until the Price is valid. Must be at least 1 ms later than <code>validFrom</code>.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Sets price tiers.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>If set to <code>true</code>, the StandalonePrice is considered during price selection. If set to <code>false</code>, the StandalonePrice is not considered during price selection.</p>
     */

    @JsonProperty("active")
    public Boolean getActive();

    public void setKey(final String key);

    public void setSku(final String sku);

    public void setValue(final Money value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    public void setTiers(final List<PriceTierDraft> tiers);

    public void setDiscounted(final DiscountedPriceDraft discounted);

    public void setCustom(final CustomFieldsDraft custom);

    public void setActive(final Boolean active);

    public static StandalonePriceDraft of() {
        return new StandalonePriceDraftImpl();
    }

    public static StandalonePriceDraft of(final StandalonePriceDraft template) {
        StandalonePriceDraftImpl instance = new StandalonePriceDraftImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(template.getTiers());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        instance.setActive(template.getActive());
        return instance;
    }

    public static StandalonePriceDraftBuilder builder() {
        return StandalonePriceDraftBuilder.of();
    }

    public static StandalonePriceDraftBuilder builder(final StandalonePriceDraft template) {
        return StandalonePriceDraftBuilder.of(template);
    }

    default <T> T withStandalonePriceDraft(Function<StandalonePriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDraft>";
            }
        };
    }
}
