
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeMasterVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeMasterVariantAction productChangeMasterVariantAction = ProductChangeMasterVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeMasterVariantActionBuilder implements Builder<ProductChangeMasterVariantAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     */

    public ProductChangeMasterVariantActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     */

    public ProductChangeMasterVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
     */

    public ProductChangeMasterVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
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

    public ProductChangeMasterVariantAction build() {
        return new ProductChangeMasterVariantActionImpl(variantId, sku, staged);
    }

    /**
     * builds ProductChangeMasterVariantAction without checking for non null required values
     */
    public ProductChangeMasterVariantAction buildUnchecked() {
        return new ProductChangeMasterVariantActionImpl(variantId, sku, staged);
    }

    public static ProductChangeMasterVariantActionBuilder of() {
        return new ProductChangeMasterVariantActionBuilder();
    }

    public static ProductChangeMasterVariantActionBuilder of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionBuilder builder = new ProductChangeMasterVariantActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
