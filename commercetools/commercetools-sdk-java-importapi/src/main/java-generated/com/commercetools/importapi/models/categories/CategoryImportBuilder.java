
package com.commercetools.importapi.models.categories;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategoryImportBuilder implements Builder<CategoryImport> {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.importapi.models.common.CategoryKeyReference parent;

    @Nullable
    private String orderHint;

    @Nullable
    private String externalId;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    public CategoryImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public CategoryImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategoryImportBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CategoryImportBuilder slug(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategoryImportBuilder slug(final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public CategoryImportBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategoryImportBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public CategoryImportBuilder parent(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder> builder) {
        this.parent = builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()).build();
        return this;
    }

    public CategoryImportBuilder parent(
            @Nullable final com.commercetools.importapi.models.common.CategoryKeyReference parent) {
        this.parent = parent;
        return this;
    }

    public CategoryImportBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    public CategoryImportBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public CategoryImportBuilder metaTitle(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CategoryImportBuilder metaTitle(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public CategoryImportBuilder metaDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public CategoryImportBuilder metaDescription(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    public CategoryImportBuilder metaKeywords(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public CategoryImportBuilder metaKeywords(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    public CategoryImportBuilder assets(@Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    public CategoryImportBuilder assets(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }

    public CategoryImportBuilder plusAssets(@Nullable final com.commercetools.importapi.models.common.Asset... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    public CategoryImportBuilder plusAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    public CategoryImportBuilder withAssets(
            Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }

    public CategoryImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    public CategoryImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CategoryKeyReference getParent() {
        return this.parent;
    }

    @Nullable
    public String getOrderHint() {
        return this.orderHint;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public CategoryImport build() {
        Objects.requireNonNull(key, CategoryImport.class + ": key is missing");
        Objects.requireNonNull(name, CategoryImport.class + ": name is missing");
        Objects.requireNonNull(slug, CategoryImport.class + ": slug is missing");
        return new CategoryImportImpl(key, name, slug, description, parent, orderHint, externalId, metaTitle,
            metaDescription, metaKeywords, assets, custom);
    }

    /**
     * builds CategoryImport without checking for non null required values
     */
    public CategoryImport buildUnchecked() {
        return new CategoryImportImpl(key, name, slug, description, parent, orderHint, externalId, metaTitle,
            metaDescription, metaKeywords, assets, custom);
    }

    public static CategoryImportBuilder of() {
        return new CategoryImportBuilder();
    }

    public static CategoryImportBuilder of(final CategoryImport template) {
        CategoryImportBuilder builder = new CategoryImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.parent = template.getParent();
        builder.orderHint = template.getOrderHint();
        builder.externalId = template.getExternalId();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.assets = template.getAssets();
        builder.custom = template.getCustom();
        return builder;
    }

}
