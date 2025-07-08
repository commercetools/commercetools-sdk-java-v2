
package com.commercetools.importapi.models.product_selections;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSelectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSelection variantSelection = VariantSelection.builder()
 *             .type(VariantSelectionType.INCLUDE_ONLY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSelectionBuilder implements Builder<VariantSelection> {

    private com.commercetools.importapi.models.product_selections.VariantSelectionType type;

    @Nullable
    private java.util.List<String> skus;

    /**
     *  <p>Type of variant selection.</p>
     * @param type value to be set
     * @return Builder
     */

    public VariantSelectionBuilder type(
            final com.commercetools.importapi.models.product_selections.VariantSelectionType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @param skus value to be set
     * @return Builder
     */

    public VariantSelectionBuilder skus(@Nullable final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @param skus value to be set
     * @return Builder
     */

    public VariantSelectionBuilder skus(@Nullable final java.util.List<String> skus) {
        this.skus = skus;
        return this;
    }

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @param skus value to be set
     * @return Builder
     */

    public VariantSelectionBuilder plusSkus(@Nullable final String... skus) {
        if (this.skus == null) {
            this.skus = new ArrayList<>();
        }
        this.skus.addAll(Arrays.asList(skus));
        return this;
    }

    /**
     *  <p>Type of variant selection.</p>
     * @return type
     */

    public com.commercetools.importapi.models.product_selections.VariantSelectionType getType() {
        return this.type;
    }

    /**
     *  <p>List of SKUs to include or exclude.</p>
     * @return skus
     */

    @Nullable
    public java.util.List<String> getSkus() {
        return this.skus;
    }

    /**
     * builds VariantSelection with checking for non-null required values
     * @return VariantSelection
     */
    public VariantSelection build() {
        Objects.requireNonNull(type, VariantSelection.class + ": type is missing");
        return new VariantSelectionImpl(type, skus);
    }

    /**
     * builds VariantSelection without checking for non-null required values
     * @return VariantSelection
     */
    public VariantSelection buildUnchecked() {
        return new VariantSelectionImpl(type, skus);
    }

    /**
     * factory method for an instance of VariantSelectionBuilder
     * @return builder
     */
    public static VariantSelectionBuilder of() {
        return new VariantSelectionBuilder();
    }

    /**
     * create builder for VariantSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSelectionBuilder of(final VariantSelection template) {
        VariantSelectionBuilder builder = new VariantSelectionBuilder();
        builder.type = template.getType();
        builder.skus = template.getSkus();
        return builder;
    }

}
