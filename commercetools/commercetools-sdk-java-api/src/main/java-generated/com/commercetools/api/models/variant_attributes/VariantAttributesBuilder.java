
package com.commercetools.api.models.variant_attributes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAttributesBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributes variantAttributes = VariantAttributes.builder()
 *             .productId("{productId}")
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .plusVariants(variantsBuilder -> variantsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesBuilder implements Builder<VariantAttributes> {

    private String productId;

    @Nullable
    private String productKey;

    private java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> attributes;

    private java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> variants;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productId value to be set
     * @return Builder
     */

    public VariantAttributesBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public VariantAttributesBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantAttributesBuilder attributes(
            final com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantAttributesBuilder attributes(
            final java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param attributes value to be set
     * @return Builder
     */

    public VariantAttributesBuilder plusAttributes(
            final com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata... attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesBuilder plusAttributes(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder
                .apply(com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder.of())
                .build());
        return this;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesBuilder withAttributes(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder
                .apply(com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder.of())
                .build());
        return this;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesBuilder addAttributes(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> builder) {
        return plusAttributes(builder
                .apply(com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder.of()));
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public VariantAttributesBuilder setAttributes(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> builder) {
        return attributes(builder
                .apply(com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadataBuilder.of()));
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param variants value to be set
     * @return Builder
     */

    public VariantAttributesBuilder variants(
            final com.commercetools.api.models.variant_attributes.VariantAttributesVariant... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param variants value to be set
     * @return Builder
     */

    public VariantAttributesBuilder variants(
            final java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> variants) {
        this.variants = variants;
        return this;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param variants value to be set
     * @return Builder
     */

    public VariantAttributesBuilder plusVariants(
            final com.commercetools.api.models.variant_attributes.VariantAttributesVariant... variants) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants.addAll(Arrays.asList(variants));
        return this;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public VariantAttributesBuilder plusVariants(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder> builder) {
        if (this.variants == null) {
            this.variants = new ArrayList<>();
        }
        this.variants
                .add(builder.apply(com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public VariantAttributesBuilder withVariants(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder> builder) {
        this.variants = new ArrayList<>();
        this.variants
                .add(builder.apply(com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public VariantAttributesBuilder addVariants(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesVariant> builder) {
        return plusVariants(
            builder.apply(com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder.of()));
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @param builder function to build the variants value
     * @return Builder
     */

    public VariantAttributesBuilder setVariants(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesVariant> builder) {
        return variants(
            builder.apply(com.commercetools.api.models.variant_attributes.VariantAttributesVariantBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return productKey
     */

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Metadata for the requested Attributes, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Attributes not found in the ProductType are silently omitted.</p>
     * @return attributes
     */

    public java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesAttributeMetadata> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>All Variants of the Product with their requested Attributes and availability.</p>
     * @return variants
     */

    public java.util.List<com.commercetools.api.models.variant_attributes.VariantAttributesVariant> getVariants() {
        return this.variants;
    }

    /**
     * builds VariantAttributes with checking for non-null required values
     * @return VariantAttributes
     */
    public VariantAttributes build() {
        Objects.requireNonNull(productId, VariantAttributes.class + ": productId is missing");
        Objects.requireNonNull(attributes, VariantAttributes.class + ": attributes is missing");
        Objects.requireNonNull(variants, VariantAttributes.class + ": variants is missing");
        return new VariantAttributesImpl(productId, productKey, attributes, variants);
    }

    /**
     * builds VariantAttributes without checking for non-null required values
     * @return VariantAttributes
     */
    public VariantAttributes buildUnchecked() {
        return new VariantAttributesImpl(productId, productKey, attributes, variants);
    }

    /**
     * factory method for an instance of VariantAttributesBuilder
     * @return builder
     */
    public static VariantAttributesBuilder of() {
        return new VariantAttributesBuilder();
    }

    /**
     * create builder for VariantAttributes instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesBuilder of(final VariantAttributes template) {
        VariantAttributesBuilder builder = new VariantAttributesBuilder();
        builder.productId = template.getProductId();
        builder.productKey = template.getProductKey();
        builder.attributes = template.getAttributes();
        builder.variants = template.getVariants();
        return builder;
    }

}
