
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

    private com.commercetools.history.models.common.Reference productSelection;

    private Boolean active;

    /**
     *
     */

    public ProductSelectionSettingBuilder productSelection(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.productSelection = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public ProductSelectionSettingBuilder productSelection(
            final com.commercetools.history.models.common.Reference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *
     */

    public ProductSelectionSettingBuilder active(final Boolean active) {
        this.active = active;
        return this;
    }

    public com.commercetools.history.models.common.Reference getProductSelection() {
        return this.productSelection;
    }

    public Boolean getActive() {
        return this.active;
    }

    public ProductSelectionSetting build() {
        Objects.requireNonNull(productSelection, ProductSelectionSetting.class + ": productSelection is missing");
        Objects.requireNonNull(active, ProductSelectionSetting.class + ": active is missing");
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    /**
     * builds ProductSelectionSetting without checking for non null required values
     */
    public ProductSelectionSetting buildUnchecked() {
        return new ProductSelectionSettingImpl(productSelection, active);
    }

    public static ProductSelectionSettingBuilder of() {
        return new ProductSelectionSettingBuilder();
    }

    public static ProductSelectionSettingBuilder of(final ProductSelectionSetting template) {
        ProductSelectionSettingBuilder builder = new ProductSelectionSettingBuilder();
        builder.productSelection = template.getProductSelection();
        builder.active = template.getActive();
        return builder;
    }

}
