
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemoveVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveVariantAction productRemoveVariantAction = ProductRemoveVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveVariantActionBuilder implements Builder<ProductRemoveVariantAction> {

    @Nullable
    private Long id;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     */

    public ProductRemoveVariantActionBuilder id(@Nullable final Long id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     */

    public ProductRemoveVariantActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     */

    public ProductRemoveVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getId() {
        return this.id;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemoveVariantAction build() {
        return new ProductRemoveVariantActionImpl(id, sku, staged);
    }

    /**
     * builds ProductRemoveVariantAction without checking for non null required values
     */
    public ProductRemoveVariantAction buildUnchecked() {
        return new ProductRemoveVariantActionImpl(id, sku, staged);
    }

    public static ProductRemoveVariantActionBuilder of() {
        return new ProductRemoveVariantActionBuilder();
    }

    public static ProductRemoveVariantActionBuilder of(final ProductRemoveVariantAction template) {
        ProductRemoveVariantActionBuilder builder = new ProductRemoveVariantActionBuilder();
        builder.id = template.getId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
