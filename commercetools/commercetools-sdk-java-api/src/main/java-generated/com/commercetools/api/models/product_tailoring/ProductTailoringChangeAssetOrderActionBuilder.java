
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringChangeAssetOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringChangeAssetOrderAction productTailoringChangeAssetOrderAction = ProductTailoringChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringChangeAssetOrderActionBuilder implements Builder<ProductTailoringChangeAssetOrderAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    private java.util.List<String> assetOrder;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringChangeAssetOrderActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringChangeAssetOrderActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringChangeAssetOrderActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariantTailoring in the desired new order.</p>
     * @param assetOrder value to be set
     * @return Builder
     */

    public ProductTailoringChangeAssetOrderActionBuilder assetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariantTailoring in the desired new order.</p>
     * @param assetOrder value to be set
     * @return Builder
     */

    public ProductTailoringChangeAssetOrderActionBuilder assetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariantTailoring in the desired new order.</p>
     * @param assetOrder value to be set
     * @return Builder
     */

    public ProductTailoringChangeAssetOrderActionBuilder plusAssetOrder(final String... assetOrder) {
        if (this.assetOrder == null) {
            this.assetOrder = new ArrayList<>();
        }
        this.assetOrder.addAll(Arrays.asList(assetOrder));
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
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariantTailoring in the desired new order.</p>
     * @return assetOrder
     */

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    /**
     * builds ProductTailoringChangeAssetOrderAction with checking for non-null required values
     * @return ProductTailoringChangeAssetOrderAction
     */
    public ProductTailoringChangeAssetOrderAction build() {
        Objects.requireNonNull(assetOrder, ProductTailoringChangeAssetOrderAction.class + ": assetOrder is missing");
        return new ProductTailoringChangeAssetOrderActionImpl(variantId, sku, staged, assetOrder);
    }

    /**
     * builds ProductTailoringChangeAssetOrderAction without checking for non-null required values
     * @return ProductTailoringChangeAssetOrderAction
     */
    public ProductTailoringChangeAssetOrderAction buildUnchecked() {
        return new ProductTailoringChangeAssetOrderActionImpl(variantId, sku, staged, assetOrder);
    }

    /**
     * factory method for an instance of ProductTailoringChangeAssetOrderActionBuilder
     * @return builder
     */
    public static ProductTailoringChangeAssetOrderActionBuilder of() {
        return new ProductTailoringChangeAssetOrderActionBuilder();
    }

    /**
     * create builder for ProductTailoringChangeAssetOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringChangeAssetOrderActionBuilder of(
            final ProductTailoringChangeAssetOrderAction template) {
        ProductTailoringChangeAssetOrderActionBuilder builder = new ProductTailoringChangeAssetOrderActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
