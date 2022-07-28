
package com.commercetools.api.models.product;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * EmbeddedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EmbeddedPrice embeddedPrice = EmbeddedPrice.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EmbeddedPriceImpl.class)
public interface EmbeddedPrice {

    /**
     *  <p>Unique identifier of the EmbeddedPrice.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Money value of the EmbeddedPrice.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Country for which the EmbeddedPrice is valid.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>CustomerGroup for which the EmbeddedPrice is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Product distribution Channel for which the EmbeddedPrice is valid.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Date from which the EmbeddedPrice is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date until the EmbeddedPrice is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Price tiers if any are defined.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Set if a matching ProductDiscount exists. If set, the API uses the <code>discounted</code> value for the LineItem Price selection. When a relative Discount is applied and the fraction part of the <code>discounted</code> price is 0.5, the discounted Price is rounded in favor of the customer with the half down rounding.</p>
     *  <p>The service will unset or replace the value</p>
     *  <ul>
     *   <li>once a matching relative or absolute Product Discount with a higher <code>sortOrder</code> exists,</li>
     *   <li>if the referenced external Product Discount is deactivated, or</li>
     *   <li>if the Product changes and the external Product Discount predicate does not match the discounted Price any more.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Custom Fields for the EmbeddedPrice.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setValue(final TypedMoney value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    public void setTiers(final List<PriceTier> tiers);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setCustom(final CustomFields custom);

    public static EmbeddedPrice of() {
        return new EmbeddedPriceImpl();
    }

    public static EmbeddedPrice of(final EmbeddedPrice template) {
        EmbeddedPriceImpl instance = new EmbeddedPriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setTiers(template.getTiers());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static EmbeddedPriceBuilder builder() {
        return EmbeddedPriceBuilder.of();
    }

    public static EmbeddedPriceBuilder builder(final EmbeddedPrice template) {
        return EmbeddedPriceBuilder.of(template);
    }

    default <T> T withEmbeddedPrice(Function<EmbeddedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EmbeddedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EmbeddedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<EmbeddedPrice>";
            }
        };
    }
}
