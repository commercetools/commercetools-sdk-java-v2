
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringData productTailoringData = ProductTailoringData.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringDataBuilder implements Builder<ProductTailoringData> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    /**
     *  <p>Tailored name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringDataBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductTailoringDataBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringDataBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ProductTailoringDataBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @param description value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringDataBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringDataBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>Tailored description of the Product that is used by search engines.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringDataBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored description of the Product that is used by search engines.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public ProductTailoringDataBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored description of the Product that is used by search engines.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringDataBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringDataBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringDataBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringDataBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder variants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder variants(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder plusVariants(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringDataBuilder plusVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringDataBuilder withVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants.add(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringDataBuilder addVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        return plusVariants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()));
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public ProductTailoringDataBuilder setVariants(
            Function<com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder, com.commercetools.api.models.product_tailoring.ProductVariantTailoring> builder) {
        return variants(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductVariantTailoringBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder attributes(
            @Nullable final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductTailoringDataBuilder plusAttributes(
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

    public ProductTailoringDataBuilder plusAttributes(
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

    public ProductTailoringDataBuilder withAttributes(
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

    public ProductTailoringDataBuilder addAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return plusAttributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductTailoringDataBuilder setAttributes(
            Function<com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder, com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> builder) {
        return attributes(
            builder.apply(com.commercetools.api.models.product_tailoring.ProductTailoringAttributeBuilder.of()));
    }

    /**
     *  <p>Tailored name of the Product.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Tailored description of the Product that is used by search engines.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
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
     * builds ProductTailoringData with checking for non-null required values
     * @return ProductTailoringData
     */
    public ProductTailoringData build() {
        return new ProductTailoringDataImpl(name, description, metaTitle, metaDescription, metaKeywords, slug, variants,
            attributes);
    }

    /**
     * builds ProductTailoringData without checking for non-null required values
     * @return ProductTailoringData
     */
    public ProductTailoringData buildUnchecked() {
        return new ProductTailoringDataImpl(name, description, metaTitle, metaDescription, metaKeywords, slug, variants,
            attributes);
    }

    /**
     * factory method for an instance of ProductTailoringDataBuilder
     * @return builder
     */
    public static ProductTailoringDataBuilder of() {
        return new ProductTailoringDataBuilder();
    }

    /**
     * create builder for ProductTailoringData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringDataBuilder of(final ProductTailoringData template) {
        ProductTailoringDataBuilder builder = new ProductTailoringDataBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.metaTitle = template.getMetaTitle();
        builder.metaDescription = template.getMetaDescription();
        builder.metaKeywords = template.getMetaKeywords();
        builder.slug = template.getSlug();
        builder.variants = template.getVariants();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
