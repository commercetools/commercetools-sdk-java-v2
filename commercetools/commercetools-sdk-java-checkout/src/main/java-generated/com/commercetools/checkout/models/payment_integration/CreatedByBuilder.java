
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CreatedByBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CreatedBy createdBy = CreatedBy.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CreatedByBuilder implements Builder<CreatedBy> {

    @Nullable
    private String clientId;

    @Nullable
    private String externalUserId;

    @Nullable
    private com.commercetools.checkout.models.common.Reference customer;

    @Nullable
    private String anonymousId;

    /**
     *  <p>ID of the API client that created the PaymentIntegration.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public CreatedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>External user ID that created the PaymentIntegration.</p>
     * @param externalUserId value to be set
     * @return Builder
     */

    public CreatedByBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     *  <p>Customer reference if created by a customer.</p>
     * @param customer value to be set
     * @return Builder
     */

    public CreatedByBuilder customer(@Nullable final com.commercetools.checkout.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Customer reference if created by a customer.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public CreatedByBuilder customer(
            Function<com.commercetools.checkout.models.common.ReferenceBuilder, Builder<? extends com.commercetools.checkout.models.common.Reference>> builder) {
        this.customer = builder.apply(com.commercetools.checkout.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Anonymous ID if created by an anonymous user.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CreatedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>ID of the API client that created the PaymentIntegration.</p>
     * @return clientId
     */

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>External user ID that created the PaymentIntegration.</p>
     * @return externalUserId
     */

    @Nullable
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     *  <p>Customer reference if created by a customer.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.checkout.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Anonymous ID if created by an anonymous user.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     * builds CreatedBy with checking for non-null required values
     * @return CreatedBy
     */
    public CreatedBy build() {
        return new CreatedByImpl(clientId, externalUserId, customer, anonymousId);
    }

    /**
     * builds CreatedBy without checking for non-null required values
     * @return CreatedBy
     */
    public CreatedBy buildUnchecked() {
        return new CreatedByImpl(clientId, externalUserId, customer, anonymousId);
    }

    /**
     * factory method for an instance of CreatedByBuilder
     * @return builder
     */
    public static CreatedByBuilder of() {
        return new CreatedByBuilder();
    }

    /**
     * create builder for CreatedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CreatedByBuilder of(final CreatedBy template) {
        CreatedByBuilder builder = new CreatedByBuilder();
        builder.clientId = template.getClientId();
        builder.externalUserId = template.getExternalUserId();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
