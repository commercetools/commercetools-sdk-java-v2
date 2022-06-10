
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
     */

    public CategoryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Category.</p>
     */

    public CategoryBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Category was initially created.</p>
     */

    public CategoryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Category was last updated.</p>
     */

    public CategoryBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CategoryBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CategoryBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CategoryBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CategoryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     */

    public CategoryBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     */

    public CategoryBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per Locale. A Category can have the same slug for different Locales, but they are unique across the Project. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     */

    public CategoryBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category per Locale. A Category can have the same slug for different Locales, but they are unique across the Project. Valid slugs match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>. For good performance, indexes are provided for the first 15 <code>languages</code> set in a Project.</p>
     */

    public CategoryBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     */

    public CategoryBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     */

    public CategoryBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     */

    public CategoryBuilder ancestors(final com.commercetools.api.models.category.CategoryReference... ancestors) {
        this.ancestors = new ArrayList<>(Arrays.asList(ancestors));
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
     */

    public CategoryBuilder ancestors(
            final java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors) {
        this.ancestors = ancestors;
        return this;
    }

    /**
     *  <p>Contains the parent path towards the root Category.</p>
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
     */

    public CategoryBuilder withAncestors(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.ancestors = new ArrayList<>();
        this.ancestors.add(builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Parent Category of this Category.</p>
     */

    public CategoryBuilder parent(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.parent = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Parent Category of this Category.</p>
     */

    public CategoryBuilder parent(@Nullable final com.commercetools.api.models.category.CategoryReference parent) {
        this.parent = parent;
        return this;
    }

    /**
     *  <p>Decimal value between 0 and 1 used to order Categories that are on the same level in the Category tree.</p>
     */

    public CategoryBuilder orderHint(final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     */

    public CategoryBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     */

    public CategoryBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     */

    public CategoryBuilder metaTitle(@Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     */

    public CategoryBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     */

    public CategoryBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     */

    public CategoryBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     */

    public CategoryBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     */

    public CategoryBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     */

    public CategoryBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     */

    public CategoryBuilder assets(@Nullable final com.commercetools.api.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     */

    public CategoryBuilder assets(@Nullable final java.util.List<com.commercetools.api.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
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
     */

    public CategoryBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetBuilder, com.commercetools.api.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Category.</p>
     */

    public CategoryBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<com.commercetools.api.models.category.CategoryReference> getAncestors() {
        return this.ancestors;
    }

    @Nullable
    public com.commercetools.api.models.category.CategoryReference getParent() {
        return this.parent;
    }

    public String getOrderHint() {
        return this.orderHint;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Asset> getAssets() {
        return this.assets;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

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
     * builds Category without checking for non null required values
     */
    public Category buildUnchecked() {
        return new CategoryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, slug,
            description, ancestors, parent, orderHint, externalId, metaTitle, metaDescription, metaKeywords, custom,
            assets, key);
    }

    public static CategoryBuilder of() {
        return new CategoryBuilder();
    }

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
