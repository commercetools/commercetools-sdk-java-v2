
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetMetaKeywordsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaKeywordsAction categorySetMetaKeywordsAction = CategorySetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetMetaKeywordsActionBuilder implements Builder<CategorySetMetaKeywordsAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public CategorySetMetaKeywordsActionBuilder metaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the metaKeywords value
     * @return Builder
     */

    public CategorySetMetaKeywordsActionBuilder withMetaKeywords(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaKeywords = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param metaKeywords value to be set
     * @return Builder
     */

    public CategorySetMetaKeywordsActionBuilder metaKeywords(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return metaKeywords
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     * builds CategorySetMetaKeywordsAction with checking for non-null required values
     * @return CategorySetMetaKeywordsAction
     */
    public CategorySetMetaKeywordsAction build() {
        return new CategorySetMetaKeywordsActionImpl(metaKeywords);
    }

    /**
     * builds CategorySetMetaKeywordsAction without checking for non-null required values
     * @return CategorySetMetaKeywordsAction
     */
    public CategorySetMetaKeywordsAction buildUnchecked() {
        return new CategorySetMetaKeywordsActionImpl(metaKeywords);
    }

    /**
     * factory method for an instance of CategorySetMetaKeywordsActionBuilder
     * @return builder
     */
    public static CategorySetMetaKeywordsActionBuilder of() {
        return new CategorySetMetaKeywordsActionBuilder();
    }

    /**
     * create builder for CategorySetMetaKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetMetaKeywordsActionBuilder of(final CategorySetMetaKeywordsAction template) {
        CategorySetMetaKeywordsActionBuilder builder = new CategorySetMetaKeywordsActionBuilder();
        builder.metaKeywords = template.getMetaKeywords();
        return builder;
    }

}
