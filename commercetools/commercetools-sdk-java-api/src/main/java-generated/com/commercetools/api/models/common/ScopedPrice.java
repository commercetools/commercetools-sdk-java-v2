
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
 *  <p>Scoped Price is contained in a ProductVariant which is returned in response to a Search Product Projection request when Price Selection is used.</p>
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
public interface ScopedPrice extends com.commercetools.api.models.Customizable<ScopedPrice> {

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
     *  <p>Is set when a matching ProductDiscount exists. If set, the Cart uses the discounted value for the Cart Price calculation.</p>
     *  <p>When a relative Product Discount is applied and the fractional part of the discounted Price is 0.5, the discounted Price is rounded half down in favor of the Customer.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *  <p>Custom Fields for the Price.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setValue(final TypedMoney value);

    public void setCurrentValue(final TypedMoney currentValue);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setCustom(final CustomFields custom);

    public static ScopedPrice of() {
        return new ScopedPriceImpl();
    }

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

    public static ScopedPriceBuilder builder() {
        return ScopedPriceBuilder.of();
    }

    public static ScopedPriceBuilder builder(final ScopedPrice template) {
        return ScopedPriceBuilder.of(template);
    }

    default <T> T withScopedPrice(Function<ScopedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ScopedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ScopedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<ScopedPrice>";
            }
        };
    }
}
