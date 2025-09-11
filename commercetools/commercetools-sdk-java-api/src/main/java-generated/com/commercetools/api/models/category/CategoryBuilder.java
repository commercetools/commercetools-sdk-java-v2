
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Category category = Category.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .plusAncestors(ancestorsBuilder -> ancestorsBuilder)
 *             .orderHint("{orderHint}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryBuilder implements Builder<Category> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors;

    @Nullable
    private com.commercetools.api.models.category.CategoryReference parent;

    private String orderHint;

    @Nullable
    private String externalId;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Asset> assets;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the Category.</p>
     * @param id value to be set
     * @return Builder
     */

    public CategoryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Category.</p>
     * @param version value to be set
     * @return Builder
     */

    public CategoryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Category was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CategoryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Category was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CategoryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Category.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CategoryBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Category.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CategoryBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Category.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CategoryBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Category.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CategoryBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Category.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CategoryBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Category.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CategoryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CategoryBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CategoryBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     * @param name value to be set
     * @return Builder
     */

    public CategoryBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a>. A Category can have the same slug for different Locales, but they are unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public CategoryBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a>. A Category can have the same slug for different Locales, but they are unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public CategoryBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a>. A Category can have the same slug for different Locales, but they are unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CategoryBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CategoryBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CategoryBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     * @param description value to be set
     * @return Builder
     */

    public CategoryBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param ancestors value to be set
     * @return Builder
     */

    public CategoryBuilder ancestors(final com.commercetools.api.models.category.CategoryReference... ancestors) {
        this.ancestors = new ArrayList<>(Arrays.asList(ancestors));
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param ancestors value to be set
     * @return Builder
     */

    public CategoryBuilder ancestors(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors) {
        this.ancestors = ancestors;
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param ancestors value to be set
     * @return Builder
     */

    public CategoryBuilder plusAncestors(final com.commercetools.api.models.category.CategoryReference... ancestors) {
        if (this.ancestors == null) {
            this.ancestors = new ArrayList<>();
        }
        this.ancestors.addAll(Arrays.asList(ancestors));
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param builder function to build the ancestors value
     * @return Builder
     */

    public CategoryBuilder plusAncestors(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        if (this.ancestors == null) {
            this.ancestors = new ArrayList<>();
        }
        this.ancestors.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param builder function to build the ancestors value
     * @return Builder
     */

    public CategoryBuilder withAncestors(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.ancestors = new ArrayList<>();
        this.ancestors.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param builder function to build the ancestors value
     * @return Builder
     */

    public CategoryBuilder addAncestors(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        return plusAncestors(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()));
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @param builder function to build the ancestors value
     * @return Builder
     */

    public CategoryBuilder setAncestors(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        return ancestors(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()));
    }

    /**
     *  <p>Parent Category of this Category.</p>
     * @param builder function to build the parent value
     * @return Builder
     */

    public CategoryBuilder parent(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.parent = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Parent Category of this Category.</p>
     * @param builder function to build the parent value
     * @return Builder
     */

    public CategoryBuilder withParent(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        this.parent = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent Category of this Category.</p>
     * @param parent value to be set
     * @return Builder
     */

    public CategoryBuilder parent(@Nullable final com.commercetools.api.models.category.CategoryReference parent) {
        this.parent = parent;
        return this;
    }

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree.</p>
     * @param orderHint value to be set
     * @return Builder
     */

    public CategoryBuilder orderHint(final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     *  <p>Additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     * @param externalId value to be set
     * @return Builder
     */

    public CategoryBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public CategoryBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public CategoryBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public CategoryBuilder metaTitle(@Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public CategoryBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public CategoryBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public CategoryBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public CategoryBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public CategoryBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public CategoryBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CategoryBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CategoryBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CategoryBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param assets value to be set
     * @return Builder
     */

    public CategoryBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param assets value to be set
     * @return Builder
     */

    public CategoryBuilder assets(@Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param assets value to be set
     * @return Builder
     */

    public CategoryBuilder plusAssets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the Category.</p>
     * @param key value to be set
     * @return Builder
     */

    public CategoryBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the Category.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Category.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Category was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Category was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Category.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Category.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Name of the Category.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locale</a>. A Category can have the same slug for different Locales, but they are unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For <span>good performance</span>, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Description of the Category.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     * @return ancestors
     */

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getAncestors() {
        return this.ancestors;
    }

    /**
     *  <p>Parent Category of this Category.</p>
     * @return parent
     */

    @Nullable
    public com.commercetools.api.models.category.CategoryReference getParent() {
        return this.parent;
    }

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree.</p>
     * @return orderHint
     */

    public String getOrderHint() {
        return this.orderHint;
    }

    /**
     *  <p>Additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     * @return externalId
     */

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>User-defined unique identifier of the Category.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds Category with checking for non-null required values
     * @return Category
     */
    public Category build() {
        Objects.requireNonNull(id, Category.class + ": id is missing");
        Objects.requireNonNull(version, Category.class + ": version is missing");
        Objects.requireNonNull(createdAt, Category.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Category.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, Category.class + ": name is missing");
        Objects.requireNonNull(slug, Category.class + ": slug is missing");
        Objects.requireNonNull(ancestors, Category.class + ": ancestors is missing");
        Objects.requireNonNull(orderHint, Category.class + ": orderHint is missing");
        return new CategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, slug,
            description, ancestors, parent, orderHint, externalId, metaTitle, metaDescription, metaKeywords, custom,
            assets, key);
    }

    /**
     * builds Category without checking for non-null required values
     * @return Category
     */
    public Category buildUnchecked() {
        return new CategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, slug,
            description, ancestors, parent, orderHint, externalId, metaTitle, metaDescription, metaKeywords, custom,
            assets, key);
    }

    /**
     * factory method for an instance of CategoryBuilder
     * @return builder
     */
    public static CategoryBuilder of() {
        return new CategoryBuilder();
    }

    /**
     * create builder for Category instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryBuilder of(final Category template) {
        CategoryBuilder builder = new CategoryBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.ancestors = template.getAncestors();
        builder.parent = template.getParent();
        builder.orderHint = template.getOrderHint();
        builder.externalId = template.getExternalId();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.custom = template.getCustom();
        builder.assets = template.getAssets();
        builder.key = template.getKey();
        return builder;
    }

}
