
package com.commercetools.importapi.models.products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImport productImport = ProductImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductImportBuilder implements Builder<ProductImport> {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.ProductTypeKeyReference productType;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    @Nullable
    private com.commercetools.importapi.models.products.SearchKeywords searchKeywords;

    @Nullable
    private com.commercetools.importapi.models.common.StateKeyReference state;

    @Nullable
    private Boolean publish;

    @Nullable
    private com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode;

    /**
     *  <p>User-defined unique identifier. If a Product with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductImportBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductImportBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductImportBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ProductImportBuilder productType(
            Function<com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public ProductImportBuilder withProductType(
            Function<com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductTypeKeyReference> builder) {
        this.productType = builder.apply(com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     * @param productType value to be set
     * @return Builder
     */

    public ProductImportBuilder productType(
            final com.commercetools.importapi.models.common.ProductTypeKeyReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductImportBuilder slug(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductImportBuilder withSlug(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductImportBuilder slug(final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductImportBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductImportBuilder withDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductImportBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductImportBuilder categories(
            @Nullable final com.commercetools.importapi.models.common.CategoryKeyReference... categories) {
        this.categories = new ArrayList<>(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductImportBuilder categories(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> categories) {
        this.categories = categories;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param categories value to be set
     * @return Builder
     */

    public ProductImportBuilder plusCategories(
            @Nullable final com.commercetools.importapi.models.common.CategoryKeyReference... categories) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.addAll(Arrays.asList(categories));
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductImportBuilder plusCategories(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder> builder) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories
                .add(builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductImportBuilder withCategories(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder> builder) {
        this.categories = new ArrayList<>();
        this.categories
                .add(builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductImportBuilder addCategories(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReference> builder) {
        return plusCategories(
            builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param builder function to build the categories value
     * @return Builder
     */

    public ProductImportBuilder setCategories(
            Function<com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.CategoryKeyReference> builder) {
        return categories(builder.apply(com.commercetools.importapi.models.common.CategoryKeyReferenceBuilder.of()));
    }

    /**
     * set values to the attributes
     * @param attributes value to be set
     * @return Builder
     */

    public ProductImportBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     * set value to the attributes
     * @param attributes value to be set
     * @return Builder
     */

    public ProductImportBuilder attributes(
            @Nullable final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * add values to the attributes
     * @param attributes value to be set
     * @return Builder
     */

    public ProductImportBuilder plusAttributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     * add a value to the attributes using the builder function
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductImportBuilder plusAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the attributes using the builder function
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductImportBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributeBuilder, Builder<? extends com.commercetools.importapi.models.productvariants.Attribute>> builder) {
        this.attributes = new ArrayList<>();
        this.attributes
                .add(builder.apply(com.commercetools.importapi.models.productvariants.AttributeBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductImportBuilder metaTitle(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductImportBuilder withMetaTitle(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductImportBuilder metaTitle(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductImportBuilder metaDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductImportBuilder withMetaDescription(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductImportBuilder metaDescription(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductImportBuilder metaKeywords(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductImportBuilder withMetaKeywords(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductImportBuilder metaKeywords(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductImportBuilder taxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductImportBuilder withTaxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReference> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ProductImportBuilder taxCategory(
            @Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductImportBuilder searchKeywords(
            Function<com.commercetools.importapi.models.products.SearchKeywordsBuilder, com.commercetools.importapi.models.products.SearchKeywordsBuilder> builder) {
        this.searchKeywords = builder.apply(com.commercetools.importapi.models.products.SearchKeywordsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     * @param builder function to build the searchKeywords value
     * @return Builder
     */

    public ProductImportBuilder withSearchKeywords(
            Function<com.commercetools.importapi.models.products.SearchKeywordsBuilder, com.commercetools.importapi.models.products.SearchKeywords> builder) {
        this.searchKeywords = builder.apply(com.commercetools.importapi.models.products.SearchKeywordsBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     * @param searchKeywords value to be set
     * @return Builder
     */

    public ProductImportBuilder searchKeywords(
            @Nullable final com.commercetools.importapi.models.products.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
        return this;
    }

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductImportBuilder state(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ProductImportBuilder withState(
            Function<com.commercetools.importapi.models.common.StateKeyReferenceBuilder, com.commercetools.importapi.models.common.StateKeyReference> builder) {
        this.state = builder.apply(com.commercetools.importapi.models.common.StateKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param state value to be set
     * @return Builder
     */

    public ProductImportBuilder state(
            @Nullable final com.commercetools.importapi.models.common.StateKeyReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see Managing the published state of Products.</p>
     * @param publish value to be set
     * @return Builder
     */

    public ProductImportBuilder publish(@Nullable final Boolean publish) {
        this.publish = publish;
        return this;
    }

    /**
     *  <p>Maps to <code>Product.priceMode</code>.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public ProductImportBuilder priceMode(
            @Nullable final com.commercetools.importapi.models.common.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>User-defined unique identifier. If a Product with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     * @return name
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     * @return productType
     */

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     * @return slug
     */

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @return categories
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.CategoryKeyReference> getCategories() {
        return this.categories;
    }

    /**
     * value of attributes}
     * @return attributes
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     * @return searchKeywords
     */

    @Nullable
    public com.commercetools.importapi.models.products.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.importapi.models.common.StateKeyReference getState() {
        return this.state;
    }

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see Managing the published state of Products.</p>
     * @return publish
     */

    @Nullable
    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Maps to <code>Product.priceMode</code>.</p>
     * @return priceMode
     */

    @Nullable
    public com.commercetools.importapi.models.common.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    /**
     * builds ProductImport with checking for non-null required values
     * @return ProductImport
     */
    public ProductImport build() {
        Objects.requireNonNull(key, ProductImport.class + ": key is missing");
        Objects.requireNonNull(name, ProductImport.class + ": name is missing");
        Objects.requireNonNull(productType, ProductImport.class + ": productType is missing");
        Objects.requireNonNull(slug, ProductImport.class + ": slug is missing");
        return new ProductImportImpl(key, name, productType, slug, description, categories, attributes, metaTitle,
            metaDescription, metaKeywords, taxCategory, searchKeywords, state, publish, priceMode);
    }

    /**
     * builds ProductImport without checking for non-null required values
     * @return ProductImport
     */
    public ProductImport buildUnchecked() {
        return new ProductImportImpl(key, name, productType, slug, description, categories, attributes, metaTitle,
            metaDescription, metaKeywords, taxCategory, searchKeywords, state, publish, priceMode);
    }

    /**
     * factory method for an instance of ProductImportBuilder
     * @return builder
     */
    public static ProductImportBuilder of() {
        return new ProductImportBuilder();
    }

    /**
     * create builder for ProductImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImportBuilder of(final ProductImport template) {
        ProductImportBuilder builder = new ProductImportBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.productType = template.getProductType();
        builder.slug = template.getSlug();
        builder.description = template.getDescription();
        builder.categories = template.getCategories();
        builder.attributes = template.getAttributes();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.taxCategory = template.getTaxCategory();
        builder.searchKeywords = template.getSearchKeywords();
        builder.state = template.getState();
        builder.publish = template.getPublish();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
