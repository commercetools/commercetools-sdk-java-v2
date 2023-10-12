
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerTokenBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerToken customerToken = CustomerToken.builder()
 *             .id("{id}")
 *             .customerId("{customerId}")
 *             .value("{value}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerTokenBuilder implements Builder<CustomerToken> {

    private String id;

    private String customerId;

    private String value;

    private java.time.ZonedDateTime expiresAt;

    private java.time.ZonedDateTime createdAt;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>Unique identifier of the token.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerTokenBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Customer.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CustomerTokenBuilder customerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Value of the token.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerTokenBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the token expires.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public CustomerTokenBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the token was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CustomerTokenBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>When the token is created, <code>lastModifiedAt</code> is set to <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CustomerTokenBuilder lastModifiedAt(@Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Unique identifier of the token.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>The <code>id</code> of the Customer.</p>
     * @return customerId
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Value of the token.</p>
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     *  <p>Date and time (UTC) the token expires.</p>
     * @return expiresAt
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>Date and time (UTC) the token was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>When the token is created, <code>lastModifiedAt</code> is set to <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * builds CustomerToken with checking for non-null required values
     * @return CustomerToken
     */
    public CustomerToken build() {
        Objects.requireNonNull(id, CustomerToken.class + ": id is missing");
        Objects.requireNonNull(customerId, CustomerToken.class + ": customerId is missing");
        Objects.requireNonNull(value, CustomerToken.class + ": value is missing");
        Objects.requireNonNull(expiresAt, CustomerToken.class + ": expiresAt is missing");
        Objects.requireNonNull(createdAt, CustomerToken.class + ": createdAt is missing");
        return new CustomerTokenImpl(id, customerId, value, expiresAt, createdAt, lastModifiedAt);
    }

    /**
     * builds CustomerToken without checking for non-null required values
     * @return CustomerToken
     */
    public CustomerToken buildUnchecked() {
        return new CustomerTokenImpl(id, customerId, value, expiresAt, createdAt, lastModifiedAt);
    }

    /**
     * factory method for an instance of CustomerTokenBuilder
     * @return builder
     */
    public static CustomerTokenBuilder of() {
        return new CustomerTokenBuilder();
    }

    /**
     * create builder for CustomerToken instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerTokenBuilder of(final CustomerToken template) {
        CustomerTokenBuilder builder = new CustomerTokenBuilder();
        builder.id = template.getId();
        builder.customerId = template.getCustomerId();
        builder.value = template.getValue();
        builder.expiresAt = template.getExpiresAt();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
