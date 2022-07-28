
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeAssetOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeAssetOrderAction productChangeAssetOrderAction = ProductChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeAssetOrderActionBuilder implements Builder<ProductChangeAssetOrderAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    private java.util.List<String> assetOrder;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductChangeAssetOrderActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductChangeAssetOrderActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    public ProductChangeAssetOrderActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     */

    public ProductChangeAssetOrderActionBuilder assetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     */

    public ProductChangeAssetOrderActionBuilder assetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     */

    public ProductChangeAssetOrderActionBuilder plusAssetOrder(final String... assetOrder) {
        if (this.assetOrder == null) {
            this.assetOrder = new ArrayList<>();
        }
        this.assetOrder.addAll(Arrays.asList(assetOrder));
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

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public ProductChangeAssetOrderAction build() {
        Objects.requireNonNull(assetOrder, ProductChangeAssetOrderAction.class + ": assetOrder is missing");
        return new ProductChangeAssetOrderActionImpl(variantId, sku, staged, assetOrder);
    }

    /**
     * builds ProductChangeAssetOrderAction without checking for non null required values
     */
    public ProductChangeAssetOrderAction buildUnchecked() {
        return new ProductChangeAssetOrderActionImpl(variantId, sku, staged, assetOrder);
    }

    public static ProductChangeAssetOrderActionBuilder of() {
        return new ProductChangeAssetOrderActionBuilder();
    }

    public static ProductChangeAssetOrderActionBuilder of(final ProductChangeAssetOrderAction template) {
        ProductChangeAssetOrderActionBuilder builder = new ProductChangeAssetOrderActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
