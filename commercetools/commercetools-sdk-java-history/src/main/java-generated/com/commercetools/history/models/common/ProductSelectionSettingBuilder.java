
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSettingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetting productSelectionSetting = ProductSelectionSetting.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSettingBuilder implements Builder<ProductSelectionSetting> {

    private com.commercetools.history.models.common.ProductSelectionReference productSelection;

    private Boolean active;

    /**
     *  <p>Reference to a ProductSelection.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public ProductSelectionSettingBuilder productSelection(
            Function<com.commercetools.history.models.common.ProductSelectionReferenceBuilder, com.commercetools.history.models.common.ProductSelectionReferenceBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.history.models.common.ProductSelectionReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a ProductSelection.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public ProductSelectionSettingBuilder withProductSelection(
            Function<com.commercetools.history.models.common.ProductSelectionReferenceBuilder, com.commercetools.history.models.common.ProductSelectionReference> builder) {
        this.productSelection = builder
                .apply(com.commercetools.history.models.common.ProductSelectionReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a ProductSelection.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public ProductSelectionSettingBuilder productSelection(
            final com.commercetools.history.models.common.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     * @param active value to be set
     * @return Builder
     */

    public ProductSelectionSettingBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>Reference to a ProductSelection.</p>
     * @return productSelection
     */

    public com.commercetools.history.models.common.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     * @return active
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * builds ProductSelectionSetting with checking for non-null required values
     * @return ProductSelectionSetting
     */
    public ProductSelectionSetting build() {
        Objects.requireNonNull(productSelection, ProductSelectionSetting.class + ": productSelection is missing");
        Objects.requireNonNull(active, ProductSelectionSetting.class + ": active is missing");
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    /**
     * builds ProductSelectionSetting without checking for non-null required values
     * @return ProductSelectionSetting
     */
    public ProductSelectionSetting buildUnchecked() {
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    /**
     * factory method for an instance of ProductSelectionSettingBuilder
     * @return builder
     */
    public static ProductSelectionSettingBuilder of() {
        return new ProductSelectionSettingBuilder();
    }

    /**
     * create builder for ProductSelectionSetting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSettingBuilder of(final ProductSelectionSetting template) {
        ProductSelectionSettingBuilder builder = new ProductSelectionSettingBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
