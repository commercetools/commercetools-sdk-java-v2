
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * StandalonePriceDraft
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
public interface StandalonePriceDraft extends com.commercetools.api.models.CustomizableDraft<StandalonePriceDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<StandalonePriceDraft> {

    /**
     *  <p>User-defined unique identifier for the StandalonePrice.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Specifies to which ProductVariant the API associates this Price. It is not validated to exist in product variants.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Sets the money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Sets the date from which the Price is valid. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Sets the date until the Price is valid. Must be at least 1 ms later than <code>validFrom</code>. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Staged changes for the StandalonePrice.</p>
     * @return staged
     */
    @Valid
    @JsonProperty("staged")
    public StagedPriceDraft getStaged();

    /**
     *  <p>Set to <code>false</code>, if the StandalonePrice should not be considered during Product price selection.</p>
     * @return active
     */

    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>User-defined unique identifier for the StandalonePrice.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Specifies to which ProductVariant the API associates this Price. It is not validated to exist in product variants.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Sets the money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>Sets the country for which this Price is valid.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Sets the CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p>Sets the product distribution Channel for which this Price is valid.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelResourceIdentifier channel);

    /**
     *  <p>Sets the date from which the Price is valid. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Sets the date until the Price is valid. Must be at least 1 ms later than <code>validFrom</code>. Standalone Prices that are no longer valid are not automatically deleted, but they can be deleted if necessary.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    /**
     *  <p>Sets price tiers.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTierDraft> tiers);

    /**
     *  <p>Sets a discounted price for this Price that is different from the base price with <code>value</code>.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPriceDraft discounted);

    /**
     *  <p>Custom Fields for the StandalonePrice.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Staged changes for the StandalonePrice.</p>
     * @param staged value to be set
     */

    public void setStaged(final StagedPriceDraft staged);

    /**
     *  <p>Set to <code>false</code>, if the StandalonePrice should not be considered during Product price selection.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     * factory method
     * @return instance of StandalonePriceDraft
     */
    public static StandalonePriceDraft of() {
        return new StandalonePriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
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
        instance.setStaged(template.getStaged());
        instance.setActive(template.getActive());
        return instance;
    }

    public StandalonePriceDraft copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceDraft deepCopy(@Nullable final StandalonePriceDraft template) {
        if (template == null) {
            return null;
        }
        StandalonePriceDraftImpl instance = new StandalonePriceDraftImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTierDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscounted(
            com.commercetools.api.models.common.DiscountedPriceDraft.deepCopy(template.getDiscounted()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setStaged(
            com.commercetools.api.models.standalone_price.StagedPriceDraft.deepCopy(template.getStaged()));
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceDraft
     * @return builder
     */
    public static StandalonePriceDraftBuilder builder() {
        return StandalonePriceDraftBuilder.of();
    }

    /**
     * create builder for StandalonePriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDraftBuilder builder(final StandalonePriceDraft template) {
        return StandalonePriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceDraft(Function<StandalonePriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceDraft>";
            }
        };
    }
}
