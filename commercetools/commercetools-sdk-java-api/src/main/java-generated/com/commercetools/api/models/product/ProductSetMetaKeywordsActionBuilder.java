
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetMetaKeywordsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaKeywordsAction productSetMetaKeywordsAction = ProductSetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetMetaKeywordsActionBuilder implements Builder<ProductSetMetaKeywordsAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductSetMetaKeywordsActionBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductSetMetaKeywordsActionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetMetaKeywordsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetMetaKeywordsAction with checking for non-null required values
     * @return ProductSetMetaKeywordsAction
     */
    public ProductSetMetaKeywordsAction build() {
        return new ProductSetMetaKeywordsActionImpl(metaKeywords, staged);
    }

    /**
     * builds ProductSetMetaKeywordsAction without checking for non-null required values
     * @return ProductSetMetaKeywordsAction
     */
    public ProductSetMetaKeywordsAction buildUnchecked() {
        return new ProductSetMetaKeywordsActionImpl(metaKeywords, staged);
    }

    /**
     * factory method for an instance of ProductSetMetaKeywordsActionBuilder
     * @return builder
     */
    public static ProductSetMetaKeywordsActionBuilder of() {
        return new ProductSetMetaKeywordsActionBuilder();
    }

    /**
     * create builder for ProductSetMetaKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetMetaKeywordsActionBuilder of(final ProductSetMetaKeywordsAction template) {
        ProductSetMetaKeywordsActionBuilder builder = new ProductSetMetaKeywordsActionBuilder();
        builder.metaKeywords = template.getMetaKeywords();
        builder.staged = template.getStaged();
        return builder;
    }

}
