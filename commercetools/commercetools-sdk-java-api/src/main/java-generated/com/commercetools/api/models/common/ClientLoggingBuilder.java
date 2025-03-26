
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ClientLoggingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClientLogging clientLogging = ClientLogging.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ClientLoggingBuilder implements Builder<ClientLogging> {

    @Nullable
    private String clientId;

    @Nullable
    private String externalUserId;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference associate;

    /**
     *  <p><code>id</code> of the API Client which created the resource.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public ClientLoggingBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @param externalUserId value to be set
     * @return Builder
     */

    public ClientLoggingBuilder externalUserId(@Nullable final String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ClientLoggingBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ClientLoggingBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @param customer value to be set
     * @return Builder
     */

    public ClientLoggingBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Indicates that the resource was modified during an anonymous session with the logged ID.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public ClientLoggingBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ClientLoggingBuilder associate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public ClientLoggingBuilder withAssociate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param associate value to be set
     * @return Builder
     */

    public ClientLoggingBuilder associate(
            @Nullable final com.commercetools.api.models.customer.CustomerReference associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p><code>id</code> of the API Client which created the resource.</p>
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
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Indicates that the resource was modified during an anonymous session with the logged ID.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @return associate
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getAssociate() {
        return this.associate;
    }

    /**
     * builds ClientLogging with checking for non-null required values
     * @return ClientLogging
     */
    public ClientLogging build() {
        return new ClientLoggingImpl(clientId, externalUserId, customer, anonymousId, associate);
    }

    /**
     * builds ClientLogging without checking for non-null required values
     * @return ClientLogging
     */
    public ClientLogging buildUnchecked() {
        return new ClientLoggingImpl(clientId, externalUserId, customer, anonymousId, associate);
    }

    /**
     * factory method for an instance of ClientLoggingBuilder
     * @return builder
     */
    public static ClientLoggingBuilder of() {
        return new ClientLoggingBuilder();
    }

    /**
     * create builder for ClientLogging instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ClientLoggingBuilder of(final ClientLogging template) {
        ClientLoggingBuilder builder = new ClientLoggingBuilder();
        builder.clientId = template.getClientId();
        builder.externalUserId = template.getExternalUserId();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.associate = template.getAssociate();
        return builder;
    }

}
