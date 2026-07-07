
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OverlappingPriceValidityErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OverlappingPriceValidityError overlappingPriceValidityError = OverlappingPriceValidityError.builder()
 *             .message("{message}")
 *             .conflictingPrice("{conflictingPrice}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OverlappingPriceValidityErrorBuilder implements Builder<OverlappingPriceValidityError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String conflictingPrice;

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

    /**
     *  <p><code>"Two prices have overlapping validity periods."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of the conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder conflictingPrice(final String conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
        return this;
    }

    /**
     *  <p>Currency code of the Price.</p>
     * @param currency value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Country code of the Price.</p>
     * @param country value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     * @param channel value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Embedded Price is valid.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Embedded Price is valid.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the conflicting Embedded Price is valid.</p>
     * @param conflictingValidFrom value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder conflictingValidFrom(
            @Nullable final java.time.ZonedDateTime conflictingValidFrom) {
        this.conflictingValidFrom = conflictingValidFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the conflicting Embedded Price is valid.</p>
     * @param conflictingValidUntil value to be set
     * @return Builder
     */

    public OverlappingPriceValidityErrorBuilder conflictingValidUntil(
            @Nullable final java.time.ZonedDateTime conflictingValidUntil) {
        this.conflictingValidUntil = conflictingValidUntil;
        return this;
    }

    /**
     *  <p><code>"Two prices have overlapping validity periods."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>Unique identifier of the conflicting Embedded Price.</p>
     * @return conflictingPrice
     */

    public String getConflictingPrice() {
        return this.conflictingPrice;
    }

    /**
     *  <p>Currency code of the Price.</p>
     * @return currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Country code of the Price.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>Date and time (UTC) from which the Embedded Price is valid.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Embedded Price is valid.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Date and time (UTC) from which the conflicting Embedded Price is valid.</p>
     * @return conflictingValidFrom
     */

    @Nullable
    public java.time.ZonedDateTime getConflictingValidFrom() {
        return this.conflictingValidFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the conflicting Embedded Price is valid.</p>
     * @return conflictingValidUntil
     */

    @Nullable
    public java.time.ZonedDateTime getConflictingValidUntil() {
        return this.conflictingValidUntil;
    }

    /**
     * builds OverlappingPriceValidityError with checking for non-null required values
     * @return OverlappingPriceValidityError
     */
    public OverlappingPriceValidityError build() {
        Objects.requireNonNull(message, OverlappingPriceValidityError.class + ": message is missing");
        Objects.requireNonNull(conflictingPrice, OverlappingPriceValidityError.class + ": conflictingPrice is missing");
        Objects.requireNonNull(currency, OverlappingPriceValidityError.class + ": currency is missing");
        return new OverlappingPriceValidityErrorImpl(message, values, conflictingPrice, currency, country,
            customerGroup, channel, validFrom, validUntil, conflictingValidFrom, conflictingValidUntil);
    }

    /**
     * builds OverlappingPriceValidityError without checking for non-null required values
     * @return OverlappingPriceValidityError
     */
    public OverlappingPriceValidityError buildUnchecked() {
        return new OverlappingPriceValidityErrorImpl(message, values, conflictingPrice, currency, country,
            customerGroup, channel, validFrom, validUntil, conflictingValidFrom, conflictingValidUntil);
    }

    /**
     * factory method for an instance of OverlappingPriceValidityErrorBuilder
     * @return builder
     */
    public static OverlappingPriceValidityErrorBuilder of() {
        return new OverlappingPriceValidityErrorBuilder();
    }

    /**
     * create builder for OverlappingPriceValidityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OverlappingPriceValidityErrorBuilder of(final OverlappingPriceValidityError template) {
        OverlappingPriceValidityErrorBuilder builder = new OverlappingPriceValidityErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
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
