
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailTokenCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenCreatedMessagePayload customerEmailTokenCreatedMessagePayload = CustomerEmailTokenCreatedMessagePayload.builder()
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailTokenCreatedMessagePayloadBuilder
        implements Builder<CustomerEmailTokenCreatedMessagePayload> {

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessagePayloadBuilder customerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessagePayloadBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
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
     *  <p>Date and time (UTC) the email token expires.</p>
     * @return expiresAt
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * builds CustomerEmailTokenCreatedMessagePayload with checking for non-null required values
     * @return CustomerEmailTokenCreatedMessagePayload
     */
    public CustomerEmailTokenCreatedMessagePayload build() {
        Objects.requireNonNull(customerId, CustomerEmailTokenCreatedMessagePayload.class + ": customerId is missing");
        Objects.requireNonNull(expiresAt, CustomerEmailTokenCreatedMessagePayload.class + ": expiresAt is missing");
        return new CustomerEmailTokenCreatedMessagePayloadImpl(customerId, expiresAt);
    }

    /**
     * builds CustomerEmailTokenCreatedMessagePayload without checking for non-null required values
     * @return CustomerEmailTokenCreatedMessagePayload
     */
    public CustomerEmailTokenCreatedMessagePayload buildUnchecked() {
        return new CustomerEmailTokenCreatedMessagePayloadImpl(customerId, expiresAt);
    }

    /**
     * factory method for an instance of CustomerEmailTokenCreatedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessagePayloadBuilder of() {
        return new CustomerEmailTokenCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerEmailTokenCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessagePayloadBuilder of(
            final CustomerEmailTokenCreatedMessagePayload template) {
        CustomerEmailTokenCreatedMessagePayloadBuilder builder = new CustomerEmailTokenCreatedMessagePayloadBuilder();
        builder.customerId = template.getCustomerId();
        builder.expiresAt = template.getExpiresAt();
        return builder;
    }

}
