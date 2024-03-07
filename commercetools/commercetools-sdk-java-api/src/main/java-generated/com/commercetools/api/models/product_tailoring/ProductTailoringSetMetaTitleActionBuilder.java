
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetMetaTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaTitleAction productTailoringSetMetaTitleAction = ProductTailoringSetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetMetaTitleActionBuilder implements Builder<ProductTailoringSetMetaTitleAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringSetMetaTitleActionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductTailoringSetMetaTitleActionBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductTailoringSetMetaTitleActionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetMetaTitleActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaTitle
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetMetaTitleAction with checking for non-null required values
     * @return ProductTailoringSetMetaTitleAction
     */
    public ProductTailoringSetMetaTitleAction build() {
        return new ProductTailoringSetMetaTitleActionImpl(metaTitle, staged);
    }

    /**
     * builds ProductTailoringSetMetaTitleAction without checking for non-null required values
     * @return ProductTailoringSetMetaTitleAction
     */
    public ProductTailoringSetMetaTitleAction buildUnchecked() {
        return new ProductTailoringSetMetaTitleActionImpl(metaTitle, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetMetaTitleActionBuilder
     * @return builder
     */
    public static ProductTailoringSetMetaTitleActionBuilder of() {
        return new ProductTailoringSetMetaTitleActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetMetaTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaTitleActionBuilder of(final ProductTailoringSetMetaTitleAction template) {
        ProductTailoringSetMetaTitleActionBuilder builder = new ProductTailoringSetMetaTitleActionBuilder();
        builder.metaTitle = template.getMetaTitle();
        builder.staged = template.getStaged();
        return builder;
    }

}
