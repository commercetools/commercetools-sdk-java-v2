
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetSkuActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetSkuAction variantSetSkuAction = VariantSetSkuAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetSkuActionBuilder implements Builder<VariantSetSkuAction> {

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param sku value to be set
     * @return Builder
     */

    public VariantSetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Whether only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetSkuActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Whether only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantSetSkuAction with checking for non-null required values
     * @return VariantSetSkuAction
     */
    public VariantSetSkuAction build() {
        return new VariantSetSkuActionImpl(sku, staged);
    }

    /**
     * builds VariantSetSkuAction without checking for non-null required values
     * @return VariantSetSkuAction
     */
    public VariantSetSkuAction buildUnchecked() {
        return new VariantSetSkuActionImpl(sku, staged);
    }

    /**
     * factory method for an instance of VariantSetSkuActionBuilder
     * @return builder
     */
    public static VariantSetSkuActionBuilder of() {
        return new VariantSetSkuActionBuilder();
    }

    /**
     * create builder for VariantSetSkuAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetSkuActionBuilder of(final VariantSetSkuAction template) {
        VariantSetSkuActionBuilder builder = new VariantSetSkuActionBuilder();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
