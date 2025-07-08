
package com.commercetools.api.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The draft representation for prices to be embedded into ProductVariantDrafts when the ProductPriceMode is <code>Embedded</code>. For the <code>Standalone</code> ProductPriceMode use StandalonePriceDraft.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceDraft priceDraft = PriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceDraftImpl.class)
public interface PriceDraft extends com.commercetools.api.models.CustomizableDraft<PriceDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<PriceDraft> {

    /**
     *  <p>User-defined identifier for the Price. It must be unique per ProductVariant.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    /**
     *  <p>Custom Fields for the Price.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @return recurrencePolicy
     */
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyResourceIdentifier getRecurrencePolicy();

    /**
     *  <p>User-defined identifier for the Price. It must be unique per ProductVariant.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Money value of this Price.</p>
     *  <p>To set the money value in high precision, use HighPrecisionMoneyDraft.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>Set this field if this Price is only valid for the specified country.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelResourceIdentifier channel);

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Set this field to add a DiscountedPrice from an <strong>external service</strong>.</p>
     *  <p>Otherwise, Composable Commerce sets this field automatically if at least one ProductDiscount applies. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>A ProductDiscountValue of type <code>external</code>.</li>
     *   <li>A <code>predicate</code> that matches the ProductVariant the Price is referenced from.</li>
     *  </ul>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPriceDraft discounted);

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
     *  <p>If <code>discounted</code> is set, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTierDraft> tiers);

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>RecurrencePolicy for which this Price is valid.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyResourceIdentifier recurrencePolicy);

    /**
     * factory method
     * @return instance of PriceDraft
     */
    public static PriceDraft of() {
        return new PriceDraftImpl();
    }

    /**
     * factory method to create a shallow copy PriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceDraft of(final PriceDraft template) {
        PriceDraftImpl instance = new PriceDraftImpl();
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public PriceDraft copyDeep();

    /**
     * factory method to create a deep copy of PriceDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceDraft deepCopy(@Nullable final PriceDraft template) {
        if (template == null) {
            return null;
        }
        PriceDraftImpl instance = new PriceDraftImpl();
        instance.setKey(template.getKey());
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(
            com.commercetools.api.models.common.DiscountedPriceDraft.deepCopy(template.getDiscounted()));
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTierDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for PriceDraft
     * @return builder
     */
    public static PriceDraftBuilder builder() {
        return PriceDraftBuilder.of();
    }

    /**
     * create builder for PriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceDraftBuilder builder(final PriceDraft template) {
        return PriceDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceDraft(Function<PriceDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PriceDraft>";
            }
        };
    }
}
