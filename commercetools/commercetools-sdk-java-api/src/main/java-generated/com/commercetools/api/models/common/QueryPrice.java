
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

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   QueryPrice queryPrice = QueryPrice.builder()
           .value(valueBuilder -> valueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QueryPriceImpl.class)
public interface QueryPrice extends com.commercetools.api.models.Customizable<QueryPrice> {

    /**
     *  <p>Platform-generated unique identifier of the given Price.</p>
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Money value of the given Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Country for which the given Price is valid.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>CustomerGroup for which the given Price is valid.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p><code>ProductDistribution</code> Channel for which the given Price is valid.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Date from which the given Price is valid.</p>
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date until which the given Price is valid.</p>
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>DiscountedPrice you specify for the given Price.</p>
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Custom Fields for the Price.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Price tier applied when the minimum quantity for the LineItem of a ProductVariant with the related Price is reached in a Cart.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    public void setId(final String id);

    public void setValue(final Money value);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setDiscounted(final DiscountedPriceDraft discounted);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    public void setTiers(final List<PriceTierDraft> tiers);

    public static QueryPrice of() {
        return new QueryPriceImpl();
    }

    public static QueryPrice of(final QueryPrice template) {
        QueryPriceImpl instance = new QueryPriceImpl();
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

    public static QueryPriceBuilder builder() {
        return QueryPriceBuilder.of();
    }

    public static QueryPriceBuilder builder(final QueryPrice template) {
        return QueryPriceBuilder.of(template);
    }

    default <T> T withQueryPrice(Function<QueryPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QueryPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QueryPrice>() {
            @Override
            public String toString() {
                return "TypeReference<QueryPrice>";
            }
        };
    }
}
