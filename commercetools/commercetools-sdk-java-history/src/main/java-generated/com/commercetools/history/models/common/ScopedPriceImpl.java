
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Scoped Price is contained in a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> which is returned in response to a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjectionSearchFilterScopedPrice" rel="nofollow">Product Projection Search</a> request when <span>Scoped Price Search</span> is used.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScopedPriceImpl implements ScopedPrice, ModelBase {

    private String id;

    private com.commercetools.history.models.common.TypedMoney value;

    private com.commercetools.history.models.common.TypedMoney currentValue;

    private String country;

    private com.commercetools.history.models.common.CustomerGroupReference customerGroup;

    private com.commercetools.history.models.common.ChannelReference channel;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.history.models.common.DiscountedPrice discounted;

    private com.commercetools.history.models.common.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ScopedPriceImpl(@JsonProperty("id") final String id,
            @JsonProperty("value") final com.commercetools.history.models.common.TypedMoney value,
            @JsonProperty("currentValue") final com.commercetools.history.models.common.TypedMoney currentValue,
            @JsonProperty("country") final String country,
            @JsonProperty("customerGroup") final com.commercetools.history.models.common.CustomerGroupReference customerGroup,
            @JsonProperty("channel") final com.commercetools.history.models.common.ChannelReference channel,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("discounted") final com.commercetools.history.models.common.DiscountedPrice discounted,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom) {
        this.id = id;
        this.value = value;
        this.currentValue = currentValue;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.discounted = discounted;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ScopedPriceImpl() {
    }

    /**
     *  <p>Platform-generated unique identifier of the Price.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Original value of the Price.</p>
     */

    public com.commercetools.history.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>If available, either the original price <code>value</code> or <code>discounted</code> value.</p>
     */

    public com.commercetools.history.models.common.TypedMoney getCurrentValue() {
        return this.currentValue;
    }

    /**
     *  <p>Country code of the geographic location.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */

    public com.commercetools.history.models.common.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Reference to a Channel.</p>
     */

    public com.commercetools.history.models.common.ChannelReference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time from which the Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time until which the Price is valid.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Is set when a matching <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscount" rel="nofollow">ProductDiscount</a> exists. If set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> uses the discounted value for the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddLineItemAction" rel="nofollow">Cart Price calculation</a>.</p>
     *  <p>When a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDiscountValueRelative" rel="nofollow">relative Product Discount</a> is applied and the fractional part of the discounted Price is 0.5, the discounted Price is <span>rounded half down</span> in favor of the Customer.</p>
     */

    public com.commercetools.history.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Custom Fields for the Price.</p>
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setValue(final com.commercetools.history.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setCurrentValue(final com.commercetools.history.models.common.TypedMoney currentValue) {
        this.currentValue = currentValue;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setCustomerGroup(final com.commercetools.history.models.common.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setChannel(final com.commercetools.history.models.common.ChannelReference channel) {
        this.channel = channel;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setDiscounted(final com.commercetools.history.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ScopedPriceImpl that = (ScopedPriceImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(value, that.value)
                .append(currentValue, that.currentValue)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(discounted, that.discounted)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(value, that.value)
                .append(currentValue, that.currentValue)
                .append(country, that.country)
                .append(customerGroup, that.customerGroup)
                .append(channel, that.channel)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(discounted, that.discounted)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(value)
                .append(currentValue)
                .append(country)
                .append(customerGroup)
                .append(channel)
                .append(validFrom)
                .append(validUntil)
                .append(discounted)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("value", value)
                .append("currentValue", currentValue)
                .append("country", country)
                .append("customerGroup", customerGroup)
                .append("channel", channel)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("discounted", discounted)
                .append("custom", custom)
                .build();
    }

    @Override
    public ScopedPrice copyDeep() {
        return ScopedPrice.deepCopy(this);
    }
}
