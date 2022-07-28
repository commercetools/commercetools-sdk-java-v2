
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
     */

    public ProductSetMetaTitleActionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetMetaTitleActionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
     */

    public ProductSetMetaTitleActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetMetaTitleAction build() {
        return new ProductSetMetaTitleActionImpl(metaTitle, staged);
    }

    /**
     * builds ProductSetMetaTitleAction without checking for non null required values
     */
    public ProductSetMetaTitleAction buildUnchecked() {
        return new ProductSetMetaTitleActionImpl(metaTitle, staged);
    }

    public static ProductSetMetaTitleActionBuilder of() {
        return new ProductSetMetaTitleActionBuilder();
    }

    public static ProductSetMetaTitleActionBuilder of(final ProductSetMetaTitleAction template) {
        ProductSetMetaTitleActionBuilder builder = new ProductSetMetaTitleActionBuilder();
        builder.metaTitle = template.getMetaTitle();
        builder.staged = template.getStaged();
        return builder;
    }

}
