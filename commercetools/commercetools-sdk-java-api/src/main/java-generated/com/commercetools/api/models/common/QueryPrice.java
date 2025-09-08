
package com.commercetools.api.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * QueryPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryPrice queryPrice = QueryPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QueryPriceImpl.class)
public interface QueryPrice extends com.commercetools.api.models.Customizable<QueryPrice> {

    /**
     *  <p>Unique identifier of the given Price.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Money value of the given Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>Country for which the given Price is valid.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the given Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p><code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the given Price is valid.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Date from which the given Price is valid.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date until which the given Price is valid.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedPrice" rel="nofollow">DiscountedPrice</a> you specify for the given Price.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    /**
     *  <p>Custom Fields for the Price.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Price tier applied when the minimum quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> of a ProductVariant with the related Price is reached in a Cart.</p>
     *  <p>If <code>discounted</code> is specified, the tiered Price is ignored for a Product Variant.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTierDraft> getTiers();

    /**
     *  <p>Unique identifier of the given Price.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Money value of the given Price.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>Country for which the given Price is valid.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the given Price is valid.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p><code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the given Price is valid.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelReference channel);

    /**
     *  <p>Date from which the given Price is valid.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date until which the given Price is valid.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedPrice" rel="nofollow">DiscountedPrice</a> you specify for the given Price.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPriceDraft discounted);

    /**
     *  <p>Custom Fields for the Price.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Price tier applied when the minimum quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> of a ProductVariant with the related Price is reached in a Cart.</p>
     *  <p>If <code>discounted</code> is specified, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTierDraft... tiers);

    /**
     *  <p>Price tier applied when the minimum quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> of a ProductVariant with the related Price is reached in a Cart.</p>
     *  <p>If <code>discounted</code> is specified, the tiered Price is ignored for a Product Variant.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTierDraft> tiers);

    /**
     * factory method
     * @return instance of QueryPrice
     */
    public static QueryPrice of() {
        return new QueryPriceImpl();
    }

    /**
     * factory method to create a shallow copy QueryPrice
     * @param template instance to be copied
     * @return copy instance
     */
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

    public QueryPrice copyDeep();

    /**
     * factory method to create a deep copy of QueryPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QueryPrice deepCopy(@Nullable final QueryPrice template) {
        if (template == null) {
            return null;
        }
        QueryPriceImpl instance = new QueryPriceImpl();
        instance.setId(template.getId());
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(
            com.commercetools.api.models.common.DiscountedPriceDraft.deepCopy(template.getDiscounted()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceTierDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for QueryPrice
     * @return builder
     */
    public static QueryPriceBuilder builder() {
        return QueryPriceBuilder.of();
    }

    /**
     * create builder for QueryPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QueryPriceBuilder builder(final QueryPrice template) {
        return QueryPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQueryPrice(Function<QueryPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QueryPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QueryPrice>() {
            @Override
            public String toString() {
                return "TypeReference<QueryPrice>";
            }
        };
    }
}
