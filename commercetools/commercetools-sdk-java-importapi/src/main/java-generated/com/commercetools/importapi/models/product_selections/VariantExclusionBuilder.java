
package com.commercetools.importapi.models.product_selections;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantExclusionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantExclusion variantExclusion = VariantExclusion.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantExclusionBuilder implements Builder<VariantExclusion> {

    @Nullable
    private java.util.List<String> skus;

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @param skus value to be set
     * @return Builder
     */

    public VariantExclusionBuilder skus(@Nullable final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @param skus value to be set
     * @return Builder
     */

    public VariantExclusionBuilder skus(@Nullable final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @param skus value to be set
     * @return Builder
     */

    public VariantExclusionBuilder plusSkus(@Nullable final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>List of SKUs to be excluded.</p>
     * @return skus
     */

    @Nullable
    public java.util.List<String> getSkus() {
        return this.skus;
    }

    /**
     * builds VariantExclusion with checking for non-null required values
     * @return VariantExclusion
     */
    public VariantExclusion build() {
        return new VariantExclusionImpl(skus);
    }

    /**
     * builds VariantExclusion without checking for non-null required values
     * @return VariantExclusion
     */
    public VariantExclusion buildUnchecked() {
        return new VariantExclusionImpl(skus);
    }

    /**
     * factory method for an instance of VariantExclusionBuilder
     * @return builder
     */
    public static VariantExclusionBuilder of() {
        return new VariantExclusionBuilder();
    }

    /**
     * create builder for VariantExclusion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantExclusionBuilder of(final VariantExclusion template) {
        VariantExclusionBuilder builder = new VariantExclusionBuilder();
        builder.skus = template.getSkus();
        return builder;
    }

}
