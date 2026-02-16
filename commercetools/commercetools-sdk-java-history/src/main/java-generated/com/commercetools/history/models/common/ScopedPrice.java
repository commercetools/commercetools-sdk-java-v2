
package com.commercetools.history.models.common;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Scoped Price is contained in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> which is returned in response to a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionSearchFilterScopedPrice" rel="nofollow">Product Projection Search</a> request when <span>Scoped Price Search</span> is used.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScopedPrice scopedPrice = ScopedPrice.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .currentValue(currentValueBuilder -> currentValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ScopedPriceImpl.class)
public interface ScopedPrice {

    /**
     *  <p>Platform-generated unique identifier of the Price.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Original value of the Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>If available, either the original price <code>value</code> or <code>discounted</code> value.</p>
     * @return currentValue
     */
    @NotNull
    @Valid
    @JsonProperty("currentValue")
    public TypedMoney getCurrentValue();

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Reference to a CustomerGroup.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Reference to a Channel.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p>Date and time from which the Price is valid.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time until which the Price is valid.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Is set when a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> exists. If set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> uses the discounted value for the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddLineItemAction" rel="nofollow">Cart Price calculation</a>.</p>
     *  <p>When a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueRelative" rel="nofollow">relative Product Discount</a> is applied and the fractional part of the discounted Price is 0.5, the discounted Price is <span>rounded half down</span> in favor of the Customer.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Custom Fields of the Price.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Platform-generated unique identifier of the Price.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Original value of the Price.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     *  <p>If available, either the original price <code>value</code> or <code>discounted</code> value.</p>
     * @param currentValue value to be set
     */

    public void setCurrentValue(final TypedMoney currentValue);

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Reference to a CustomerGroup.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Reference to a Channel.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelReference channel);

    /**
     *  <p>Date and time from which the Price is valid.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time until which the Price is valid.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Is set when a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> exists. If set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> uses the discounted value for the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddLineItemAction" rel="nofollow">Cart Price calculation</a>.</p>
     *  <p>When a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueRelative" rel="nofollow">relative Product Discount</a> is applied and the fractional part of the discounted Price is 0.5, the discounted Price is <span>rounded half down</span> in favor of the Customer.</p>
     * @param discounted value to be set
     */

    public void setDiscounted(final DiscountedPrice discounted);

    /**
     *  <p>Custom Fields of the Price.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of ScopedPrice
     */
    public static ScopedPrice of() {
        return new ScopedPriceImpl();
    }

    /**
     * factory method to create a shallow copy ScopedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static ScopedPrice of(final ScopedPrice template) {
        ScopedPriceImpl instance = new ScopedPriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        instance.setCurrentValue(template.getCurrentValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(template.getDiscounted());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public ScopedPrice copyDeep();

    /**
     * factory method to create a deep copy of ScopedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ScopedPrice deepCopy(@Nullable final ScopedPrice template) {
        if (template == null) {
            return null;
        }
        ScopedPriceImpl instance = new ScopedPriceImpl();
        instance.setId(template.getId());
        instance.setValue(com.commercetools.history.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setCurrentValue(
            com.commercetools.history.models.common.TypedMoney.deepCopy(template.getCurrentValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.history.models.common.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.history.models.common.ChannelReference.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(
            com.commercetools.history.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setCustom(com.commercetools.history.models.common.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ScopedPrice
     * @return builder
     */
    public static ScopedPriceBuilder builder() {
        return ScopedPriceBuilder.of();
    }

    /**
     * create builder for ScopedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ScopedPriceBuilder builder(final ScopedPrice template) {
        return ScopedPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withScopedPrice(Function<ScopedPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ScopedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScopedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<ScopedPrice>";
            }
        };
    }
}
