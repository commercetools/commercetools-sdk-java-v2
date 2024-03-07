
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetMetaKeywordsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaKeywordsAction productTailoringSetMetaKeywordsAction = ProductTailoringSetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetMetaKeywordsActionBuilder implements Builder<ProductTailoringSetMetaKeywordsAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringSetMetaKeywordsActionBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public ProductTailoringSetMetaKeywordsActionBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public ProductTailoringSetMetaKeywordsActionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetMetaKeywordsActionBuilder staged(@Nullable final Boolean staged) {
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
     * builds ProductTailoringSetMetaKeywordsAction with checking for non-null required values
     * @return ProductTailoringSetMetaKeywordsAction
     */
    public ProductTailoringSetMetaKeywordsAction build() {
        return new ProductTailoringSetMetaKeywordsActionImpl(metaKeywords, staged);
    }

    /**
     * builds ProductTailoringSetMetaKeywordsAction without checking for non-null required values
     * @return ProductTailoringSetMetaKeywordsAction
     */
    public ProductTailoringSetMetaKeywordsAction buildUnchecked() {
        return new ProductTailoringSetMetaKeywordsActionImpl(metaKeywords, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetMetaKeywordsActionBuilder
     * @return builder
     */
    public static ProductTailoringSetMetaKeywordsActionBuilder of() {
        return new ProductTailoringSetMetaKeywordsActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetMetaKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaKeywordsActionBuilder of(
            final ProductTailoringSetMetaKeywordsAction template) {
        ProductTailoringSetMetaKeywordsActionBuilder builder = new ProductTailoringSetMetaKeywordsActionBuilder();
        builder.metaKeywords = template.getMetaKeywords();
        builder.staged = template.getStaged();
        return builder;
    }

}
