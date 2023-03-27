
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemPrice lineItemPrice = LineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemPriceImpl.class)
public interface LineItemPrice {

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>References a customer group by key.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>References a channel by key.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>The tiered prices for this price.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    /**
     *  <p>Maps to <code>Price.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>Maps to <code>Price.value</code>.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>Maps to <code>Price.county</code>.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Maps to <code>Price.validFrom</code>.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Maps to <code>Price.validUntil</code>.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>References a customer group by key.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    /**
     *  <p>References a channel by key.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelKeyReference channel);

    /**
     *  <p>Sets a discounted price from an external service.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final PriceTier... tiers);

    /**
     *  <p>The tiered prices for this price.</p>
     * @param tiers values to be set
     */

    public void setTiers(final List<PriceTier> tiers);

    /**
     *  <p>Maps to <code>Price.custom</code>.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of LineItemPrice
     */
    public static LineItemPrice of() {
        return new LineItemPriceImpl();
    }

    /**
     * factory method to copy an instance of LineItemPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemPrice of(final LineItemPrice template) {
        LineItemPriceImpl instance = new LineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * builder factory method for LineItemPrice
     * @return builder
     */
    public static LineItemPriceBuilder builder() {
        return LineItemPriceBuilder.of();
    }

    /**
     * create builder for LineItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemPriceBuilder builder(final LineItemPrice template) {
        return LineItemPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemPrice(Function<LineItemPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemPrice>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemPrice>";
            }
        };
    }
}
