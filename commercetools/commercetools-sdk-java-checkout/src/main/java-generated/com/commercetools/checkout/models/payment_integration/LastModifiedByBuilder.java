
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LastModifiedByBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LastModifiedBy lastModifiedBy = LastModifiedBy.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LastModifiedByBuilder implements Builder<LastModifiedBy> {

    @Nullable
    private String clientId;

    @Nullable
    private String sessionId;

    @Nullable
    private String externalUserId;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.checkout.models.common.Reference customer;

    @Nullable
    private com.commercetools.checkout.models.common.Reference associate;

    @Nullable
    private com.commercetools.checkout.models.common.Reference user;

    @Nullable
    private Boolean isPlatformClient;

    /**
     *  <p>ID of the API client that last modified the PaymentIntegration.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public LastModifiedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>Session ID associated with the modification of the PaymentIntegration.</p>
     * @param sessionId value to be set
     * @return Builder
     */

    public LastModifiedByBuilder sessionId(@Nullable final String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     *  <p>External user ID that last modified the PaymentIntegration.</p>
     * @param externalUserId value to be set
     * @return Builder
     */

    public LastModifiedByBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     *  <p>Anonymous ID if the resource was last modified by an anonymous user.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public LastModifiedByBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Customer reference or customer ID if the resource was last modified by a customer.</p>
     * @param customer value to be set
     * @return Builder
     */

    public LastModifiedByBuilder customer(@Nullable final com.commercetools.checkout.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Customer reference or customer ID if the resource was last modified by a customer.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public LastModifiedByBuilder customer(
            Function<com.commercetools.checkout.models.common.ReferenceBuilder, Builder<? extends com.commercetools.checkout.models.common.Reference>> builder) {
        this.customer = builder.apply(com.commercetools.checkout.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Associate (customer) reference if the resource was last modified by an associate.</p>
     * @param associate value to be set
     * @return Builder
     */

    public LastModifiedByBuilder associate(
            @Nullable final com.commercetools.checkout.models.common.Reference associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>Associate (customer) reference if the resource was last modified by an associate.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public LastModifiedByBuilder associate(
            Function<com.commercetools.checkout.models.common.ReferenceBuilder, Builder<? extends com.commercetools.checkout.models.common.Reference>> builder) {
        this.associate = builder.apply(com.commercetools.checkout.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User reference if the resource was last modified by a platform user.</p>
     * @param user value to be set
     * @return Builder
     */

    public LastModifiedByBuilder user(@Nullable final com.commercetools.checkout.models.common.Reference user) {
        this.user = user;
        return this;
    }

    /**
     *  <p>User reference if the resource was last modified by a platform user.</p>
     * @param builder function to build the user value
     * @return Builder
     */

    public LastModifiedByBuilder user(
            Function<com.commercetools.checkout.models.common.ReferenceBuilder, Builder<? extends com.commercetools.checkout.models.common.Reference>> builder) {
        this.user = builder.apply(com.commercetools.checkout.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates whether the resource was last modified by a platform client.</p>
     * @param isPlatformClient value to be set
     * @return Builder
     */

    public LastModifiedByBuilder isPlatformClient(@Nullable final Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
        return this;
    }

    /**
     *  <p>ID of the API client that last modified the PaymentIntegration.</p>
     * @return clientId
     */

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    /**
     *  <p>Session ID associated with the modification of the PaymentIntegration.</p>
     * @return sessionId
     */

    @Nullable
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     *  <p>External user ID that last modified the PaymentIntegration.</p>
     * @return externalUserId
     */

    @Nullable
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     *  <p>Anonymous ID if the resource was last modified by an anonymous user.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Customer reference or customer ID if the resource was last modified by a customer.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.checkout.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Associate (customer) reference if the resource was last modified by an associate.</p>
     * @return associate
     */

    @Nullable
    public com.commercetools.checkout.models.common.Reference getAssociate() {
        return this.associate;
    }

    /**
     *  <p>User reference if the resource was last modified by a platform user.</p>
     * @return user
     */

    @Nullable
    public com.commercetools.checkout.models.common.Reference getUser() {
        return this.user;
    }

    /**
     *  <p>Indicates whether the resource was last modified by a platform client.</p>
     * @return isPlatformClient
     */

    @Nullable
    public Boolean getIsPlatformClient() {
        return this.isPlatformClient;
    }

    /**
     * builds LastModifiedBy with checking for non-null required values
     * @return LastModifiedBy
     */
    public LastModifiedBy build() {
        return new LastModifiedByImpl(clientId, sessionId, externalUserId, anonymousId, customer, associate, user,
            isPlatformClient);
    }

    /**
     * builds LastModifiedBy without checking for non-null required values
     * @return LastModifiedBy
     */
    public LastModifiedBy buildUnchecked() {
        return new LastModifiedByImpl(clientId, sessionId, externalUserId, anonymousId, customer, associate, user,
            isPlatformClient);
    }

    /**
     * factory method for an instance of LastModifiedByBuilder
     * @return builder
     */
    public static LastModifiedByBuilder of() {
        return new LastModifiedByBuilder();
    }

    /**
     * create builder for LastModifiedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LastModifiedByBuilder of(final LastModifiedBy template) {
        LastModifiedByBuilder builder = new LastModifiedByBuilder();
        builder.clientId = template.getClientId();
        builder.sessionId = template.getSessionId();
        builder.externalUserId = template.getExternalUserId();
        builder.anonymousId = template.getAnonymousId();
        builder.customer = template.getCustomer();
        builder.associate = template.getAssociate();
        builder.user = template.getUser();
        builder.isPlatformClient = template.getIsPlatformClient();
        return builder;
    }

}
