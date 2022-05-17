
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DuplicateStandalonePriceScopeErrorBuilder implements Builder<DuplicateStandalonePriceScopeError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice;

    private String sku;

    private String currency;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    public DuplicateStandalonePriceScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder conflictingStandalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder> builder) {
        this.conflictingStandalonePrice = builder
                .apply(com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder.of())
                .build();
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder conflictingStandalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice) {
        this.conflictingStandalonePrice = conflictingStandalonePrice;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public DuplicateStandalonePriceScopeErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.standalone_price.StandalonePriceReference getConflictingStandalonePrice() {
        return this.conflictingStandalonePrice;
    }

    public String getSku() {
        return this.sku;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
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

    public DuplicateStandalonePriceScopeError build() {
        Objects.requireNonNull(message, DuplicateStandalonePriceScopeError.class + ": message is missing");
        Objects.requireNonNull(values, DuplicateStandalonePriceScopeError.class + ": values are missing");
        Objects.requireNonNull(conflictingStandalonePrice,
            DuplicateStandalonePriceScopeError.class + ": conflictingStandalonePrice is missing");
        Objects.requireNonNull(sku, DuplicateStandalonePriceScopeError.class + ": sku is missing");
        Objects.requireNonNull(currency, DuplicateStandalonePriceScopeError.class + ": currency is missing");
        return new DuplicateStandalonePriceScopeErrorImpl(message, values, conflictingStandalonePrice, sku, currency,
            country, customerGroup, channel, validFrom, validUntil);
    }

    /**
     * builds DuplicateStandalonePriceScopeError without checking for non null required values
     */
    public DuplicateStandalonePriceScopeError buildUnchecked() {
        return new DuplicateStandalonePriceScopeErrorImpl(message, values, conflictingStandalonePrice, sku, currency,
            country, customerGroup, channel, validFrom, validUntil);
    }

    public static DuplicateStandalonePriceScopeErrorBuilder of() {
        return new DuplicateStandalonePriceScopeErrorBuilder();
    }

    public static DuplicateStandalonePriceScopeErrorBuilder of(final DuplicateStandalonePriceScopeError template) {
        DuplicateStandalonePriceScopeErrorBuilder builder = new DuplicateStandalonePriceScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingStandalonePrice = template.getConflictingStandalonePrice();
        builder.sku = template.getSku();
        builder.currency = template.getCurrency();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
