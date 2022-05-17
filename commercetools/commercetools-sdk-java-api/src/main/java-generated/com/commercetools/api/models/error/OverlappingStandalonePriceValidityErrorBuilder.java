
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OverlappingStandalonePriceValidityErrorBuilder
        implements Builder<OverlappingStandalonePriceValidityError> {

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

    @Nullable
    private java.time.ZonedDateTime conflictingValidFrom;

    @Nullable
    private java.time.ZonedDateTime conflictingValidUntil;

    public OverlappingStandalonePriceValidityErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder conflictingStandalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder> builder) {
        this.conflictingStandalonePrice = builder
                .apply(com.commercetools.api.models.standalone_price.StandalonePriceReferenceBuilder.of())
                .build();
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder conflictingStandalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePriceReference conflictingStandalonePrice) {
        this.conflictingStandalonePrice = conflictingStandalonePrice;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder conflictingValidFrom(
            @Nullable final java.time.ZonedDateTime conflictingValidFrom) {
        this.conflictingValidFrom = conflictingValidFrom;
        return this;
    }

    public OverlappingStandalonePriceValidityErrorBuilder conflictingValidUntil(
            @Nullable final java.time.ZonedDateTime conflictingValidUntil) {
        this.conflictingValidUntil = conflictingValidUntil;
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

    @Nullable
    public java.time.ZonedDateTime getConflictingValidFrom() {
        return this.conflictingValidFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getConflictingValidUntil() {
        return this.conflictingValidUntil;
    }

    public OverlappingStandalonePriceValidityError build() {
        Objects.requireNonNull(message, OverlappingStandalonePriceValidityError.class + ": message is missing");
        Objects.requireNonNull(values, OverlappingStandalonePriceValidityError.class + ": values are missing");
        Objects.requireNonNull(conflictingStandalonePrice,
            OverlappingStandalonePriceValidityError.class + ": conflictingStandalonePrice is missing");
        Objects.requireNonNull(sku, OverlappingStandalonePriceValidityError.class + ": sku is missing");
        Objects.requireNonNull(currency, OverlappingStandalonePriceValidityError.class + ": currency is missing");
        return new OverlappingStandalonePriceValidityErrorImpl(message, values, conflictingStandalonePrice, sku,
            currency, country, customerGroup, channel, validFrom, validUntil, conflictingValidFrom,
            conflictingValidUntil);
    }

    /**
     * builds OverlappingStandalonePriceValidityError without checking for non null required values
     */
    public OverlappingStandalonePriceValidityError buildUnchecked() {
        return new OverlappingStandalonePriceValidityErrorImpl(message, values, conflictingStandalonePrice, sku,
            currency, country, customerGroup, channel, validFrom, validUntil, conflictingValidFrom,
            conflictingValidUntil);
    }

    public static OverlappingStandalonePriceValidityErrorBuilder of() {
        return new OverlappingStandalonePriceValidityErrorBuilder();
    }

    public static OverlappingStandalonePriceValidityErrorBuilder of(
            final OverlappingStandalonePriceValidityError template) {
        OverlappingStandalonePriceValidityErrorBuilder builder = new OverlappingStandalonePriceValidityErrorBuilder();
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
        builder.conflictingValidFrom = template.getConflictingValidFrom();
        builder.conflictingValidUntil = template.getConflictingValidUntil();
        return builder;
    }

}
