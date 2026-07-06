
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantPatchBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantPatch productVariantPatch = ProductVariantPatch.builder()
 *             .productVariant(productVariantBuilder -> productVariantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantPatchBuilder implements Builder<ProductVariantPatch> {

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    @Nullable
    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    @Nullable
    private Boolean staged;

    @Nullable
    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     * @param builder function to build the productVariant value
     * @return Builder
     */

    public ProductVariantPatchBuilder productVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     * @param builder function to build the productVariant value
     * @return Builder
     */

    public ProductVariantPatchBuilder withProductVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReference> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     * @param productVariant value to be set
     * @return Builder
     */

    public ProductVariantPatchBuilder productVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantPatchBuilder attributes(
            Function<com.commercetools.importapi.models.productvariants.AttributesBuilder, com.commercetools.importapi.models.productvariants.AttributesBuilder> builder) {
        this.attributes = builder.apply(com.commercetools.importapi.models.productvariants.AttributesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     * @param builder function to build the attributes value
     * @return Builder
     */

    public ProductVariantPatchBuilder withAttributes(
            Function<com.commercetools.importapi.models.productvariants.AttributesBuilder, com.commercetools.importapi.models.productvariants.Attributes> builder) {
        this.attributes = builder.apply(com.commercetools.importapi.models.productvariants.AttributesBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     * @param attributes value to be set
     * @return Builder
     */

    public ProductVariantPatchBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both <span>current and staged projected representations</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductVariantPatchBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantPatchBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductVariantPatchBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductVariantPatchBuilder product(
            @Nullable final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     * @return productVariant
     */

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     * @return attributes
     */

    @Nullable
    public com.commercetools.importapi.models.productvariants.Attributes getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both <span>current and staged projected representations</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @return product
     */

    @Nullable
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     * builds ProductVariantPatch with checking for non-null required values
     * @return ProductVariantPatch
     */
    public ProductVariantPatch build() {
        Objects.requireNonNull(productVariant, ProductVariantPatch.class + ": productVariant is missing");
        return new ProductVariantPatchImpl(productVariant, attributes, staged, product);
    }

    /**
     * builds ProductVariantPatch without checking for non-null required values
     * @return ProductVariantPatch
     */
    public ProductVariantPatch buildUnchecked() {
        return new ProductVariantPatchImpl(productVariant, attributes, staged, product);
    }

    /**
     * factory method for an instance of ProductVariantPatchBuilder
     * @return builder
     */
    public static ProductVariantPatchBuilder of() {
        return new ProductVariantPatchBuilder();
    }

    /**
     * create builder for ProductVariantPatch instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantPatchBuilder of(final ProductVariantPatch template) {
        ProductVariantPatchBuilder builder = new ProductVariantPatchBuilder();
        builder.productVariant = template.getProductVariant();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        builder.product = template.getProduct();
        return builder;
    }

}
