
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPasswordTokenCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordTokenCreatedMessagePayload customerPasswordTokenCreatedMessagePayload = CustomerPasswordTokenCreatedMessagePayload.builder()
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .invalidateOlderTokens(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordTokenCreatedMessagePayloadBuilder
        implements Builder<CustomerPasswordTokenCreatedMessagePayload> {

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    @Nullable
    private String value;

    private Boolean invalidateOlderTokens;

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CustomerPasswordTokenCreatedMessagePayloadBuilder customerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the password token expires.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public CustomerPasswordTokenCreatedMessagePayloadBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerPasswordTokenCreatedMessagePayloadBuilder value(@Nullable final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, all password tokens issued previously for the Customer are invalidated.</p>
     * @param invalidateOlderTokens value to be set
     * @return Builder
     */

    public CustomerPasswordTokenCreatedMessagePayloadBuilder invalidateOlderTokens(
            final Boolean invalidateOlderTokens) {
        this.invalidateOlderTokens = invalidateOlderTokens;
        return this;
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return customerId
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Date and time (UTC) the password token expires.</p>
     * @return expiresAt
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @return value
     */

    @Nullable
    public String getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, all password tokens issued previously for the Customer are invalidated.</p>
     * @return invalidateOlderTokens
     */

    public Boolean getInvalidateOlderTokens() {
        return this.invalidateOlderTokens;
    }

    /**
     * builds CustomerPasswordTokenCreatedMessagePayload with checking for non-null required values
     * @return CustomerPasswordTokenCreatedMessagePayload
     */
    public CustomerPasswordTokenCreatedMessagePayload build() {
        Objects.requireNonNull(customerId,
            CustomerPasswordTokenCreatedMessagePayload.class + ": customerId is missing");
        Objects.requireNonNull(expiresAt, CustomerPasswordTokenCreatedMessagePayload.class + ": expiresAt is missing");
        Objects.requireNonNull(invalidateOlderTokens,
            CustomerPasswordTokenCreatedMessagePayload.class + ": invalidateOlderTokens is missing");
        return new CustomerPasswordTokenCreatedMessagePayloadImpl(customerId, expiresAt, value, invalidateOlderTokens);
    }

    /**
     * builds CustomerPasswordTokenCreatedMessagePayload without checking for non-null required values
     * @return CustomerPasswordTokenCreatedMessagePayload
     */
    public CustomerPasswordTokenCreatedMessagePayload buildUnchecked() {
        return new CustomerPasswordTokenCreatedMessagePayloadImpl(customerId, expiresAt, value, invalidateOlderTokens);
    }

    /**
     * factory method for an instance of CustomerPasswordTokenCreatedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerPasswordTokenCreatedMessagePayloadBuilder of() {
        return new CustomerPasswordTokenCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerPasswordTokenCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordTokenCreatedMessagePayloadBuilder of(
            final CustomerPasswordTokenCreatedMessagePayload template) {
        CustomerPasswordTokenCreatedMessagePayloadBuilder builder = new CustomerPasswordTokenCreatedMessagePayloadBuilder();
        builder.customerId = template.getCustomerId();
        builder.expiresAt = template.getExpiresAt();
        builder.value = template.getValue();
        builder.invalidateOlderTokens = template.getInvalidateOlderTokens();
        return builder;
    }

}
