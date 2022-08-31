
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
     *  <p>Set this field if this Price is only valid for the referenced CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Set this field if this Price is only valid for the referenced <code>ProductDistribution</code> Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Set this field if this Price is only valid from the specified date and time. Must be at least 1 ms earlier than <code>validUntil</code>.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Set this field if this Price is only valid until the specified date and time. Must be at least 1 ms later than <code>validFrom</code>.</p>
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
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Set this field to specify different Prices for certain LineItem quantities.</p>
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
