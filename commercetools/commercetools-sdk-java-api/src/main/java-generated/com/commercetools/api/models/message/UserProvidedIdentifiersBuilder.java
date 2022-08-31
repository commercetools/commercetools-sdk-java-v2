
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
     */

    public UserProvidedIdentifiersBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of the resource.</p>
     */

    public UserProvidedIdentifiersBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of an Order.</p>
     */

    public UserProvidedIdentifiersBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>User-provided unique identifier of a Customer.</p>
     */

    public UserProvidedIdentifiersBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Unique SKU of a Product Variant.</p>
     */

    public UserProvidedIdentifiersBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Unique identifier usually used in deep-link URLs for a Product. The value corresponds to the slug in the <code>current</code> Product Projection.</p>
     */

    public UserProvidedIdentifiersBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier usually used in deep-link URLs for a Product. The value corresponds to the slug in the <code>current</code> Product Projection.</p>
     */

    public UserProvidedIdentifiersBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Unique identifier of a Custom Object.</p>
     */

    public UserProvidedIdentifiersBuilder containerAndKey(
            Function<com.commercetools.api.models.message.ContainerAndKeyBuilder, com.commercetools.api.models.message.ContainerAndKeyBuilder> builder) {
        this.containerAndKey = builder.apply(com.commercetools.api.models.message.ContainerAndKeyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of a Custom Object.</p>
     */

    public UserProvidedIdentifiersBuilder containerAndKey(
            @Nullable final com.commercetools.api.models.message.ContainerAndKey containerAndKey) {
        this.containerAndKey = containerAndKey;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.message.ContainerAndKey getContainerAndKey() {
        return this.containerAndKey;
    }

    public UserProvidedIdentifiers build() {
        return new UserProvidedIdentifiersImpl(key, externalId, orderNumber, customerNumber, sku, slug,
            containerAndKey);
    }

    /**
     * builds UserProvidedIdentifiers without checking for non null required values
     */
    public UserProvidedIdentifiers buildUnchecked() {
        return new UserProvidedIdentifiersImpl(key, externalId, orderNumber, customerNumber, sku, slug,
            containerAndKey);
    }

    public static UserProvidedIdentifiersBuilder of() {
        return new UserProvidedIdentifiersBuilder();
    }

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
