
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetDefaultVariantActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDefaultVariantAction productSetDefaultVariantAction = ProductSetDefaultVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetDefaultVariantActionBuilder implements Builder<ProductSetDefaultVariantAction> {

    @Nullable
    private com.commercetools.api.models.variant.VariantResourceIdentifier variant;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The Variant to set as default. If empty, any existing value will be removed.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductSetDefaultVariantActionBuilder variant(
            Function<com.commercetools.api.models.variant.VariantResourceIdentifierBuilder, com.commercetools.api.models.variant.VariantResourceIdentifierBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.variant.VariantResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Variant to set as default. If empty, any existing value will be removed.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public ProductSetDefaultVariantActionBuilder withVariant(
            Function<com.commercetools.api.models.variant.VariantResourceIdentifierBuilder, com.commercetools.api.models.variant.VariantResourceIdentifier> builder) {
        this.variant = builder.apply(com.commercetools.api.models.variant.VariantResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Variant to set as default. If empty, any existing value will be removed.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ProductSetDefaultVariantActionBuilder variant(
            @Nullable final com.commercetools.api.models.variant.VariantResourceIdentifier variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>defaultVariant</code> is updated. If <code>false</code>, both the current and staged <code>defaultVariant</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetDefaultVariantActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The Variant to set as default. If empty, any existing value will be removed.</p>
     * @return variant
     */

    @Nullable
    public com.commercetools.api.models.variant.VariantResourceIdentifier getVariant() {
        return this.variant;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>defaultVariant</code> is updated. If <code>false</code>, both the current and staged <code>defaultVariant</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetDefaultVariantAction with checking for non-null required values
     * @return ProductSetDefaultVariantAction
     */
    public ProductSetDefaultVariantAction build() {
        return new ProductSetDefaultVariantActionImpl(variant, staged);
    }

    /**
     * builds ProductSetDefaultVariantAction without checking for non-null required values
     * @return ProductSetDefaultVariantAction
     */
    public ProductSetDefaultVariantAction buildUnchecked() {
        return new ProductSetDefaultVariantActionImpl(variant, staged);
    }

    /**
     * factory method for an instance of ProductSetDefaultVariantActionBuilder
     * @return builder
     */
    public static ProductSetDefaultVariantActionBuilder of() {
        return new ProductSetDefaultVariantActionBuilder();
    }

    /**
     * create builder for ProductSetDefaultVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetDefaultVariantActionBuilder of(final ProductSetDefaultVariantAction template) {
        ProductSetDefaultVariantActionBuilder builder = new ProductSetDefaultVariantActionBuilder();
        builder.variant = template.getVariant();
        builder.staged = template.getStaged();
        return builder;
    }

}
