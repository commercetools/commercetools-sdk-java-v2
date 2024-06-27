
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetAssetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetCustomTypeAction productTailoringSetAssetCustomTypeAction = ProductTailoringSetAssetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetAssetCustomTypeActionBuilder
        implements Builder<ProductTailoringSetAssetCustomTypeAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param type value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     * @param fields value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds ProductTailoringSetAssetCustomTypeAction with checking for non-null required values
     * @return ProductTailoringSetAssetCustomTypeAction
     */
    public ProductTailoringSetAssetCustomTypeAction build() {
        return new ProductTailoringSetAssetCustomTypeActionImpl(variantId, sku, staged, assetId, assetKey, type,
            fields);
    }

    /**
     * builds ProductTailoringSetAssetCustomTypeAction without checking for non-null required values
     * @return ProductTailoringSetAssetCustomTypeAction
     */
    public ProductTailoringSetAssetCustomTypeAction buildUnchecked() {
        return new ProductTailoringSetAssetCustomTypeActionImpl(variantId, sku, staged, assetId, assetKey, type,
            fields);
    }

    /**
     * factory method for an instance of ProductTailoringSetAssetCustomTypeActionBuilder
     * @return builder
     */
    public static ProductTailoringSetAssetCustomTypeActionBuilder of() {
        return new ProductTailoringSetAssetCustomTypeActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetAssetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetCustomTypeActionBuilder of(
            final ProductTailoringSetAssetCustomTypeAction template) {
        ProductTailoringSetAssetCustomTypeActionBuilder builder = new ProductTailoringSetAssetCustomTypeActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
