
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UserProvidedIdentifiersBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UserProvidedIdentifiers userProvidedIdentifiers = UserProvidedIdentifiers.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UserProvidedIdentifiersBuilder implements Builder<UserProvidedIdentifiers> {

    @Nullable
    private String key;

    @Nullable
    private String externalId;

    @Nullable
    private String orderNumber;

    @Nullable
    private String customerNumber;

    @Nullable
    private String sku;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.message.ContainerAndKey containerAndKey;

    /**
     *  <p>User-provided unique identifier of the resource.</p>
     * @param key value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of the resource.</p>
     * @param externalId value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of an Order.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of a Customer.</p>
     * @param customerNumber value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Unique SKU of a Product Variant.</p>
     * @param sku value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier usually used in deep-link URLs for a Product. The value corresponds to the slug in the <code>current</code> Product Projection.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier usually used in deep-link URLs for a Product. The value corresponds to the slug in the <code>current</code> Product Projection.</p>
     * @param slug value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Unique identifier of a Custom Object.</p>
     * @param builder function to build the containerAndKey value
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder containerAndKey(
            Function<com.commercetools.api.models.message.ContainerAndKeyBuilder, com.commercetools.api.models.message.ContainerAndKeyBuilder> builder) {
        this.containerAndKey = builder.apply(com.commercetools.api.models.message.ContainerAndKeyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of a Custom Object.</p>
     * @param containerAndKey value to be set
     * @return Builder
     */

    public UserProvidedIdentifiersBuilder containerAndKey(
            @Nullable final com.commercetools.api.models.message.ContainerAndKey containerAndKey) {
        this.containerAndKey = containerAndKey;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of the resource.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>User-provided unique identifier of the resource.</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>User-provided unique identifier of an Order.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-provided unique identifier of a Customer.</p>
     * @return customerNumber
     */

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     *  <p>Unique SKU of a Product Variant.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Unique identifier usually used in deep-link URLs for a Product. The value corresponds to the slug in the <code>current</code> Product Projection.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Unique identifier of a Custom Object.</p>
     * @return containerAndKey
     */

    @Nullable
    public com.commercetools.api.models.message.ContainerAndKey getContainerAndKey() {
        return this.containerAndKey;
    }

    /**
     * builds UserProvidedIdentifiers with checking for non-null required values
     * @return UserProvidedIdentifiers
     */
    public UserProvidedIdentifiers build() {
        return new UserProvidedIdentifiersImpl(key, externalId, orderNumber, customerNumber, sku, slug,
            containerAndKey);
    }

    /**
     * builds UserProvidedIdentifiers without checking for non-null required values
     * @return UserProvidedIdentifiers
     */
    public UserProvidedIdentifiers buildUnchecked() {
        return new UserProvidedIdentifiersImpl(key, externalId, orderNumber, customerNumber, sku, slug,
            containerAndKey);
    }

    /**
     * factory method for an instance of UserProvidedIdentifiersBuilder
     * @return builder
     */
    public static UserProvidedIdentifiersBuilder of() {
        return new UserProvidedIdentifiersBuilder();
    }

    /**
     * create builder for UserProvidedIdentifiers instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UserProvidedIdentifiersBuilder of(final UserProvidedIdentifiers template) {
        UserProvidedIdentifiersBuilder builder = new UserProvidedIdentifiersBuilder();
        builder.key = template.getKey();
        builder.externalId = template.getExternalId();
        builder.orderNumber = template.getOrderNumber();
        builder.customerNumber = template.getCustomerNumber();
        builder.sku = template.getSku();
        builder.slug = template.getSlug();
        builder.containerAndKey = template.getContainerAndKey();
        return builder;
    }

}
