
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetMetaTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaTitleAction productSetMetaTitleAction = ProductSetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetMetaTitleActionBuilder implements Builder<ProductSetMetaTitleAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductSetMetaTitleActionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaTitle value
     * @return Builder
     */

    public ProductSetMetaTitleActionBuilder withMetaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaTitle value to be set
     * @return Builder
     */

    public ProductSetMetaTitleActionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetMetaTitleActionBuilder staged(@Nullable final Boolean staged) {
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
     * builds ProductSetMetaTitleAction with checking for non-null required values
     * @return ProductSetMetaTitleAction
     */
    public ProductSetMetaTitleAction build() {
        return new ProductSetMetaTitleActionImpl(metaTitle, staged);
    }

    /**
     * builds ProductSetMetaTitleAction without checking for non-null required values
     * @return ProductSetMetaTitleAction
     */
    public ProductSetMetaTitleAction buildUnchecked() {
        return new ProductSetMetaTitleActionImpl(metaTitle, staged);
    }

    /**
     * factory method for an instance of ProductSetMetaTitleActionBuilder
     * @return builder
     */
    public static ProductSetMetaTitleActionBuilder of() {
        return new ProductSetMetaTitleActionBuilder();
    }

    /**
     * create builder for ProductSetMetaTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetMetaTitleActionBuilder of(final ProductSetMetaTitleAction template) {
        ProductSetMetaTitleActionBuilder builder = new ProductSetMetaTitleActionBuilder();
        builder.metaTitle = template.getMetaTitle();
        builder.staged = template.getStaged();
        return builder;
    }

}
