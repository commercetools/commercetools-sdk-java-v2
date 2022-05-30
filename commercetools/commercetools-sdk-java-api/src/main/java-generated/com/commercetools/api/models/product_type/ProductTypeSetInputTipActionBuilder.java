
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeSetInputTipActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetInputTipAction productTypeSetInputTipAction = ProductTypeSetInputTipAction.builder()
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeSetInputTipActionBuilder implements Builder<ProductTypeSetInputTipAction> {

    private String attributeName;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString inputTip;

    /**
     *
     */

    public ProductTypeSetInputTipActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductTypeSetInputTipActionBuilder inputTip(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.inputTip = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductTypeSetInputTipActionBuilder inputTip(
            @Nullable final com.commercetools.api.models.common.LocalizedString inputTip) {
        this.inputTip = inputTip;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getInputTip() {
        return this.inputTip;
    }

    public ProductTypeSetInputTipAction build() {
        Objects.requireNonNull(attributeName, ProductTypeSetInputTipAction.class + ": attributeName is missing");
        return new ProductTypeSetInputTipActionImpl(attributeName, inputTip);
    }

    /**
     * builds ProductTypeSetInputTipAction without checking for non null required values
     */
    public ProductTypeSetInputTipAction buildUnchecked() {
        return new ProductTypeSetInputTipActionImpl(attributeName, inputTip);
    }

    public static ProductTypeSetInputTipActionBuilder of() {
        return new ProductTypeSetInputTipActionBuilder();
    }

    public static ProductTypeSetInputTipActionBuilder of(final ProductTypeSetInputTipAction template) {
        ProductTypeSetInputTipActionBuilder builder = new ProductTypeSetInputTipActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.inputTip = template.getInputTip();
        return builder;
    }

}
