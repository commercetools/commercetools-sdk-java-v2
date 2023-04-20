
package com.commercetools.api.models.common;

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
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    /**
     *  <p><code>id</code> of the APIClient which created the resource.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public CreatedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @param externalUserId value to be set
     * @return Builder
     */

    public CreatedByBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public CreatedByBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public CreatedByBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     * @param customer value to be set
     * @return Builder
     */

    public CreatedByBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Indicates the anonymous session during which the resource was created.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CreatedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p><code>id</code> of the APIClient which created the resource.</p>
     * @return clientId
     */

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @return externalUserId
     */

    @Nullable
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Indicates the anonymous session during which the resource was created.</p>
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
