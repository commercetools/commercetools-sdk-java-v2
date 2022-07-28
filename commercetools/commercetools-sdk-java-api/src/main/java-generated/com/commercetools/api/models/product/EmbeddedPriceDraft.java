
package com.commercetools.api.models.product;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The representation sent to the server when creating a new EmbeddedPrice.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EmbeddedPriceDraft embeddedPriceDraft = EmbeddedPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EmbeddedPriceDraftImpl.class)
public interface EmbeddedPriceDraft {

    /**
     *  <p>Sets the money value of the EmbeddedPrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Sets the country for which the EmbeddedPrice is valid. If not set, the Price is valid for any country.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Sets the CustomerGroup for which the EmbeddedPrice is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Sets the product distribution Channel for which the EmbeddedPrice is valid.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Sets a discounted Price from an <strong>external service</strong>. Absolute or relative ProductDiscount prices are automatically added to a Product's EmbeddedPrice when created. The DiscountedPrice must reference a ProductDiscount with:</p>
     *  <ul>
     *   <li>The <code>isActive</code> flag set to <code>true</code>.</li>
     *   <li>An <code>external</code> ProductDiscountValue.</li>
     *   <li>A <code>predicate</code> which matches the ProductVariant the EmbeddedPrice is referenced from.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Sets the date from which the EmbeddedPrice is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Sets the date until the EmbeddedPrice is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Sets Price tiers.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Custom Fields for the EmbeddedPrice.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setValue(final Money value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setDiscounted(final DiscountedPriceDraft discounted);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setCustom(final CustomFieldsDraft custom);

    public static EmbeddedPriceDraft of() {
        return new EmbeddedPriceDraftImpl();
    }

    public static EmbeddedPriceDraft of(final EmbeddedPriceDraft template) {
        EmbeddedPriceDraftImpl instance = new EmbeddedPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setDiscounted(template.getDiscounted());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static EmbeddedPriceDraftBuilder builder() {
        return EmbeddedPriceDraftBuilder.of();
    }

    public static EmbeddedPriceDraftBuilder builder(final EmbeddedPriceDraft template) {
        return EmbeddedPriceDraftBuilder.of(template);
    }

    default <T> T withEmbeddedPriceDraft(Function<EmbeddedPriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EmbeddedPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EmbeddedPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<EmbeddedPriceDraft>";
            }
        };
    }
}
