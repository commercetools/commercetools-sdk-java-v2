
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringCreatedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringCreatedMessage productTailoringCreatedMessage = ProductTailoringCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringCreatedMessageBuilder implements Builder<ProductTailoringCreatedMessage> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private Long sequenceNumber;

    private com.commercetools.api.models.common.Reference resource;

    private Long resourceVersion;

    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    @Nullable
    private String key;

    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    private Boolean published;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder store(
            final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder variants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder plusVariants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder plusVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder addVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        return plusVariants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()));
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder setVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        return variants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder attributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder plusAttributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder plusAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder withAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder addAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return plusAttributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder setAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return attributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @param published value to be set
     * @return Builder
     */

    public ProductTailoringCreatedMessageBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @return productKey
     */

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     * @return variants
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> getVariants() {
        return this.variants;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @return published
     */

    public Boolean getPublished() {
        return this.published;
    }

    /**
     * builds ProductTailoringCreatedMessage with checking for non-null required values
     * @return ProductTailoringCreatedMessage
     */
    public ProductTailoringCreatedMessage build() {
        Objects.requireNonNull(id, ProductTailoringCreatedMessage.class + ": id is missing");
        Objects.requireNonNull(version, ProductTailoringCreatedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, ProductTailoringCreatedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ProductTailoringCreatedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, ProductTailoringCreatedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, ProductTailoringCreatedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, ProductTailoringCreatedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(store, ProductTailoringCreatedMessage.class + ": store is missing");
        Objects.requireNonNull(product, ProductTailoringCreatedMessage.class + ": product is missing");
        Objects.requireNonNull(published, ProductTailoringCreatedMessage.class + ": published is missing");
        return new ProductTailoringCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, key, store, productKey, product,
            description, name, slug, metaTitle, metaDescription, metaKeywords, variants, attributes, published);
    }

    /**
     * builds ProductTailoringCreatedMessage without checking for non-null required values
     * @return ProductTailoringCreatedMessage
     */
    public ProductTailoringCreatedMessage buildUnchecked() {
        return new ProductTailoringCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, key, store, productKey, product,
            description, name, slug, metaTitle, metaDescription, metaKeywords, variants, attributes, published);
    }

    /**
     * factory method for an instance of ProductTailoringCreatedMessageBuilder
     * @return builder
     */
    public static ProductTailoringCreatedMessageBuilder of() {
        return new ProductTailoringCreatedMessageBuilder();
    }

    /**
     * create builder for ProductTailoringCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringCreatedMessageBuilder of(final ProductTailoringCreatedMessage template) {
        ProductTailoringCreatedMessageBuilder builder = new ProductTailoringCreatedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.key = template.getKey();
        builder.store = template.getStore();
        builder.productKey = template.getProductKey();
        builder.product = template.getProduct();
        builder.description = template.getDescription();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.variants = template.getVariants();
        builder.attributes = template.getAttributes();
        builder.published = template.getPublished();
        return builder;
    }

}
