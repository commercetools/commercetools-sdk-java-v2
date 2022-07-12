
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetMetaTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaTitleAction categorySetMetaTitleAction = CategorySetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetMetaTitleActionBuilder implements Builder<CategorySetMetaTitleAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaTitle;

    /**
     *  <p>Value to set.</p>
     */

    public CategorySetMetaTitleActionBuilder metaTitle(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaTitle = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     */

    public CategorySetMetaTitleActionBuilder metaTitle(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    public CategorySetMetaTitleAction build() {
        return new CategorySetMetaTitleActionImpl(metaTitle);
    }

    /**
     * builds CategorySetMetaTitleAction without checking for non null required values
     */
    public CategorySetMetaTitleAction buildUnchecked() {
        return new CategorySetMetaTitleActionImpl(metaTitle);
    }

    public static CategorySetMetaTitleActionBuilder of() {
        return new CategorySetMetaTitleActionBuilder();
    }

    public static CategorySetMetaTitleActionBuilder of(final CategorySetMetaTitleAction template) {
        CategorySetMetaTitleActionBuilder builder = new CategorySetMetaTitleActionBuilder();
        builder.metaTitle = template.getMetaTitle();
        return builder;
    }

}
