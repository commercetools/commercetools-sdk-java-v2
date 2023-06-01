package com.commercetools.importapi.models.categories;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.Custom;
import com.commercetools.importapi.models.categories.CategoryImport;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryImport categoryImport = CategoryImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    
    /**
     *  <p>User-defined unique identifier.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public CategoryImportBuilder name(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public CategoryImportBuilder withName(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder name( final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */
    
    public CategoryImportBuilder slug(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */
    
    public CategoryImportBuilder withSlug(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder slug( final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public CategoryImportBuilder description(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public CategoryImportBuilder withDescription(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder description(@Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.parent</code>. The Reference to the parent Category with which the Category is associated. If referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Category is created.</p>
     * @param builder function to build the parent value
     * @return Builder
     */
    
    public CategoryImportBuilder parent(Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder> builder) {
        this.parent = builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.parent</code>. The Reference to the parent Category with which the Category is associated. If referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Category is created.</p>
     * @param builder function to build the parent value
     * @return Builder
     */
    
    public CategoryImportBuilder withParent(Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReference> builder) {
        this.parent = builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.parent</code>. The Reference to the parent Category with which the Category is associated. If referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Category is created.</p>
     * @param parent value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder parent(@Nullable final com.commercetools.importapi.models.common.CategoryKeyReference parent) {
        this.parent = parent;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.orderHint</code>.</p>
     * @param orderHint value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.externalId</code>.</p>
     * @param externalId value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */
    
    public CategoryImportBuilder metaTitle(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */
    
    public CategoryImportBuilder withMetaTitle(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     * @param metaTitle value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder metaTitle(@Nullable final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */
    
    public CategoryImportBuilder metaDescription(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */
    
    public CategoryImportBuilder withMetaDescription(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     * @param metaDescription value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder metaDescription(@Nullable final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */
    
    public CategoryImportBuilder metaKeywords(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */
    
    public CategoryImportBuilder withMetaKeywords(Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder metaKeywords(@Nullable final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }
    
    
    
    /**
     * set values to the assets
     * @param assets value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder assets(@Nullable final com.commercetools.importapi.models.common.Asset ...assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }
    
    /**
     * set value to the assets
     * @param assets value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder assets(@Nullable final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
        return this;
    }
    
    /**
     * add values to the assets
     * @param assets value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder plusAssets(@Nullable final com.commercetools.importapi.models.common.Asset ...assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }
    
    
    
    /**
     * add the value to the assets using the builder function
     * @param builder function to build the assets value
     * @return Builder
     */
    
    public CategoryImportBuilder plusAssets(Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the assets using the builder function
     * @param builder function to build the assets value
     * @return Builder
     */
    
    public CategoryImportBuilder withAssets(Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.AssetBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the assets using the builder function
     * @param builder function to build the assets value
     * @return Builder
     */
    
    public CategoryImportBuilder addAssets(Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return plusAssets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }
    
    /**
     * set the value to the assets using the builder function
     * @param builder function to build the assets value
     * @return Builder
     */
    
    public CategoryImportBuilder setAssets(Function<com.commercetools.importapi.models.common.AssetBuilder, com.commercetools.importapi.models.common.Asset> builder) {
        return assets(builder.apply(com.commercetools.importapi.models.common.AssetBuilder.of()));
    }
                    
    
    
    /**
     *  <p>The custom fields for this Category.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public CategoryImportBuilder custom(Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The custom fields for this Category.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public CategoryImportBuilder withCustom(Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The custom fields for this Category.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public CategoryImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     * @return name
     */
    
    
    public com.commercetools.importapi.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
     * @return slug
     */
    
    
    public com.commercetools.importapi.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Maps to <code>Category.parent</code>. The Reference to the parent Category with which the Category is associated. If referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Category is created.</p>
     * @return parent
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.CategoryKeyReference getParent(){
        return this.parent;
    }
    
    /**
     *  <p>Maps to <code>Category.orderHint</code>.</p>
     * @return orderHint
     */
    
    @Nullable
    public String getOrderHint(){
        return this.orderHint;
    }
    
    /**
     *  <p>Maps to <code>Category.externalId</code>.</p>
     * @return externalId
     */
    
    @Nullable
    public String getExternalId(){
        return this.externalId;
    }
    
    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     * @return metaTitle
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle(){
        return this.metaTitle;
    }
    
    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     * @return metaDescription
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription(){
        return this.metaDescription;
    }
    
    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     * @return metaKeywords
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords(){
        return this.metaKeywords;
    }
    
    /**
     * value of assets}
     * @return assets
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets(){
        return this.assets;
    }
    
    /**
     *  <p>The custom fields for this Category.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom(){
        return this.custom;
    }

    /**
     * builds CategoryImport with checking for non-null required values
     * @return CategoryImport
     */
    public CategoryImport build() {
        Objects.requireNonNull(key, CategoryImport.class + ": key is missing");
        Objects.requireNonNull(name, CategoryImport.class + ": name is missing");
        Objects.requireNonNull(slug, CategoryImport.class + ": slug is missing");
        return new CategoryImportImpl(key, name, slug, description, parent, orderHint, externalId, metaTitle, metaDescription, metaKeywords, assets, custom);
    }
    
    /**
     * builds CategoryImport without checking for non-null required values
     * @return CategoryImport
     */
    public CategoryImport buildUnchecked() {
        return new CategoryImportImpl(key, name, slug, description, parent, orderHint, externalId, metaTitle, metaDescription, metaKeywords, assets, custom);
    }

    /**
     * factory method for an instance of CategoryImportBuilder
     * @return builder 
     */
    public static CategoryImportBuilder of() {
        return new CategoryImportBuilder();
    }

    /**
     * create builder for CategoryImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
