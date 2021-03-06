
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ScopedPriceBuilder {

    private String id;

    private com.commercetools.api.models.common.TypedMoney value;

    private com.commercetools.api.models.common.TypedMoney currentValue;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public ScopedPriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ScopedPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public ScopedPriceBuilder currentValue(final com.commercetools.api.models.common.TypedMoney currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public ScopedPriceBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public ScopedPriceBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public ScopedPriceBuilder channel(@Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    public ScopedPriceBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ScopedPriceBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public ScopedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public ScopedPriceBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public com.commercetools.api.models.common.TypedMoney getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public ScopedPrice build() {
        return new ScopedPriceImpl(id, value, currentValue, country, customerGroup, channel, validFrom, validUntil,
            discounted, custom);
    }

    public static ScopedPriceBuilder of() {
        return new ScopedPriceBuilder();
    }

    public static ScopedPriceBuilder of(final ScopedPrice template) {
        ScopedPriceBuilder builder = new ScopedPriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        builder.currentValue = template.getCurrentValue();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.discounted = template.getDiscounted();
        builder.custom = template.getCustom();
        return builder;
    }

}
