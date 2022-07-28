
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAssetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetCustomFieldAction productSetAssetCustomFieldAction = ProductSetAssetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAssetCustomFieldActionBuilder implements Builder<ProductSetAssetCustomFieldAction> {

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

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public ProductSetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ProductSetAssetCustomFieldAction build() {
        Objects.requireNonNull(name, ProductSetAssetCustomFieldAction.class + ": name is missing");
        return new ProductSetAssetCustomFieldActionImpl(variantId, sku, staged, assetId, assetKey, name, value);
    }

    /**
     * builds ProductSetAssetCustomFieldAction without checking for non null required values
     */
    public ProductSetAssetCustomFieldAction buildUnchecked() {
        return new ProductSetAssetCustomFieldActionImpl(variantId, sku, staged, assetId, assetKey, name, value);
    }

    public static ProductSetAssetCustomFieldActionBuilder of() {
        return new ProductSetAssetCustomFieldActionBuilder();
    }

    public static ProductSetAssetCustomFieldActionBuilder of(final ProductSetAssetCustomFieldAction template) {
        ProductSetAssetCustomFieldActionBuilder builder = new ProductSetAssetCustomFieldActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
