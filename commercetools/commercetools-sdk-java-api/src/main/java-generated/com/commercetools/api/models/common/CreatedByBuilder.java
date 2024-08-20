
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

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference associate;

    @Nullable
    private com.commercetools.api.models.common.Attribution attributedTo;

    /**
     *  <p><code>id</code> of the API Client which created the resource.</p>
     * @param clientId value to be set
     * @return Builder
     */

    public CreatedByBuilder clientId(@Nullable final String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     *  <p>External user ID provided by the <code>X-External-User-ID</code> HTTP Header or <code>external_user_id:{externalUserId}</code> scope.</p>
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
     *  <p>Indicates the Customer who created the resource in the context of a Business Unit. Only present when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public CreatedByBuilder associate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates the Customer who created the resource in the context of a Business Unit. Only present when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public CreatedByBuilder withAssociate(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Indicates the Customer who created the resource in the context of a Business Unit. Only present when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param associate value to be set
     * @return Builder
     */

    public CreatedByBuilder associate(
            @Nullable final com.commercetools.api.models.customer.CustomerReference associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>Indicates if the resource was created indirectly.</p>
     * @param builder function to build the attributedTo value
     * @return Builder
     */

    public CreatedByBuilder attributedTo(
            Function<com.commercetools.api.models.common.AttributionBuilder, com.commercetools.api.models.common.AttributionBuilder> builder) {
        this.attributedTo = builder.apply(com.commercetools.api.models.common.AttributionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates if the resource was created indirectly.</p>
     * @param builder function to build the attributedTo value
     * @return Builder
     */

    public CreatedByBuilder withAttributedTo(
            Function<com.commercetools.api.models.common.AttributionBuilder, com.commercetools.api.models.common.Attribution> builder) {
        this.attributedTo = builder.apply(com.commercetools.api.models.common.AttributionBuilder.of());
        return this;
    }

    /**
     *  <p>Indicates if the resource was created indirectly.</p>
     * @param attributedTo value to be set
     * @return Builder
     */

    public CreatedByBuilder attributedTo(@Nullable final com.commercetools.api.models.common.Attribution attributedTo) {
        this.attributedTo = attributedTo;
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
     *  <p>External user ID provided by the <code>X-External-User-ID</code> HTTP Header or <code>external_user_id:{externalUserId}</code> scope.</p>
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
     *  <p>Indicates the Customer who created the resource in the context of a Business Unit. Only present when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @return associate
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getAssociate() {
        return this.associate;
    }

    /**
     *  <p>Indicates if the resource was created indirectly.</p>
     * @return attributedTo
     */

    @Nullable
    public com.commercetools.api.models.common.Attribution getAttributedTo() {
        return this.attributedTo;
    }

    /**
     * builds CreatedBy with checking for non-null required values
     * @return CreatedBy
     */
    public CreatedBy build() {
        return new CreatedByImpl(clientId, externalUserId, customer, anonymousId, associate, attributedTo);
    }

    /**
     * builds CreatedBy without checking for non-null required values
     * @return CreatedBy
     */
    public CreatedBy buildUnchecked() {
        return new CreatedByImpl(clientId, externalUserId, customer, anonymousId, associate, attributedTo);
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
        builder.associate = template.getAssociate();
        builder.attributedTo = template.getAttributedTo();
        return builder;
    }

}
