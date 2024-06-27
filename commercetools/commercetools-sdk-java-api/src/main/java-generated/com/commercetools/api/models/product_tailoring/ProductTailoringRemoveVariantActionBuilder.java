
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringRemoveVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringRemoveVariantAction productTailoringRemoveVariantAction = ProductTailoringRemoveVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringRemoveVariantActionBuilder implements Builder<ProductTailoringRemoveVariantAction> {

    @Nullable
    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove from the Tailoring.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTailoringRemoveVariantActionBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove from the Tailoring.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringRemoveVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Product Variant Tailoring is removed. If <code>false</code>, both the current and staged Product Variant Tailoring is removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringRemoveVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove from the Tailoring.</p>
     * @return id
     */

    @Nullable
    public Long getId() {
        return this.id;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove from the Tailoring.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>If <code>true</code>, only the staged Product Variant Tailoring is removed. If <code>false</code>, both the current and staged Product Variant Tailoring is removed.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringRemoveVariantAction with checking for non-null required values
     * @return ProductTailoringRemoveVariantAction
     */
    public ProductTailoringRemoveVariantAction build() {
        return new ProductTailoringRemoveVariantActionImpl(id, sku, staged);
    }

    /**
     * builds ProductTailoringRemoveVariantAction without checking for non-null required values
     * @return ProductTailoringRemoveVariantAction
     */
    public ProductTailoringRemoveVariantAction buildUnchecked() {
        return new ProductTailoringRemoveVariantActionImpl(id, sku, staged);
    }

    /**
     * factory method for an instance of ProductTailoringRemoveVariantActionBuilder
     * @return builder
     */
    public static ProductTailoringRemoveVariantActionBuilder of() {
        return new ProductTailoringRemoveVariantActionBuilder();
    }

    /**
     * create builder for ProductTailoringRemoveVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringRemoveVariantActionBuilder of(final ProductTailoringRemoveVariantAction template) {
        ProductTailoringRemoveVariantActionBuilder builder = new ProductTailoringRemoveVariantActionBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
