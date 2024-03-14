
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryDraft categoryDraft = CategoryDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryDraftBuilder implements Builder<CategoryDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.category.CategoryResourceIdentifier parent;

    @Nullable
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
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    @Nullable
    private String key;

    /**
     *  <p>Name of the Category.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CategoryDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CategoryDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     * @param name value to be set
     * @return Builder
     */

    public CategoryDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public CategoryDraftBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public CategoryDraftBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CategoryDraftBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CategoryDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CategoryDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Category.</p>
     * @param description value to be set
     * @return Builder
     */

    public CategoryDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     * @param builder function to build the parent value
     * @return Builder
     */

    public CategoryDraftBuilder parent(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        this.parent = builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     * @param builder function to build the parent value
     * @return Builder
     */

    public CategoryDraftBuilder withParent(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifier> builder) {
        this.parent = builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     * @param parent value to be set
     * @return Builder
     */

    public CategoryDraftBuilder parent(
            @Nullable final com.commercetools.api.models.category.CategoryResourceIdentifier parent) {
        this.parent = parent;
        return this;
    }

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree. If not set, a random value will be assigned.</p>
     * @param orderHint value to be set
     * @return Builder
     */

    public CategoryDraftBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     *  <p>Additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     * @param externalId value to be set
     * @return Builder
     */

    public CategoryDraftBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public CategoryDraftBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public CategoryDraftBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Category used by external search engines for improved search engine performance.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public CategoryDraftBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public CategoryDraftBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public CategoryDraftBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Category used by external search engines for improved search engine performance.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public CategoryDraftBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public CategoryDraftBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public CategoryDraftBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Keywords related to the Category for improved search engine performance.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public CategoryDraftBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CategoryDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CategoryDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Category.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CategoryDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param assets value to be set
     * @return Builder
     */

    public CategoryDraftBuilder assets(@Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param assets value to be set
     * @return Builder
     */

    public CategoryDraftBuilder assets(
            @Nullable final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param assets value to be set
     * @return Builder
     */

    public CategoryDraftBuilder plusAssets(@Nullable final com.commercetools.api.models.common.AssetDraft... assets) {
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

    public CategoryDraftBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryDraftBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryDraftBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Media related to the Category.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public CategoryDraftBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier for the Category.</p>
     * @param key value to be set
     * @return Builder
     */

    public CategoryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Category.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined identifier used as a deep-link URL to the related Category. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
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
     *  <p>Parent Category of the Category. The parent can be set by its <code>id</code> or <code>key</code>.</p>
     * @return parent
     */

    @Nullable
    public com.commercetools.api.models.category.CategoryResourceIdentifier getParent() {
        return this.parent;
    }

    /**
     *  <p>Decimal value between 0 and 1. Frontend applications can use this value for ordering Categories within the same level in the category tree. If not set, a random value will be assigned.</p>
     * @return orderHint
     */

    @Nullable
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
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Media related to the Category.</p>
     * @return assets
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     *  <p>User-defined unique identifier for the Category.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CategoryDraft with checking for non-null required values
     * @return CategoryDraft
     */
    public CategoryDraft build() {
        Objects.requireNonNull(name, CategoryDraft.class + ": name is missing");
        Objects.requireNonNull(slug, CategoryDraft.class + ": slug is missing");
        return new CategoryDraftImpl(name, slug, description, parent, orderHint, externalId, metaTitle, metaDescription,
            metaKeywords, custom, assets, key);
    }

    /**
     * builds CategoryDraft without checking for non-null required values
     * @return CategoryDraft
     */
    public CategoryDraft buildUnchecked() {
        return new CategoryDraftImpl(name, slug, description, parent, orderHint, externalId, metaTitle, metaDescription,
            metaKeywords, custom, assets, key);
    }

    /**
     * factory method for an instance of CategoryDraftBuilder
     * @return builder
     */
    public static CategoryDraftBuilder of() {
        return new CategoryDraftBuilder();
    }

    /**
     * create builder for CategoryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryDraftBuilder of(final CategoryDraft template) {
        CategoryDraftBuilder builder = new CategoryDraftBuilder();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
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
