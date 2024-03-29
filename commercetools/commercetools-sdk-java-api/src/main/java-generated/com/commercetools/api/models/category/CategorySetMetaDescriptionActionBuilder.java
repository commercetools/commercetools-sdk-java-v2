
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetMetaDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaDescriptionAction categorySetMetaDescriptionAction = CategorySetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetMetaDescriptionActionBuilder implements Builder<CategorySetMetaDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString metaDescription;

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public CategorySetMetaDescriptionActionBuilder metaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the metaDescription value
     * @return Builder
     */

    public CategorySetMetaDescriptionActionBuilder withMetaDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.metaDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param metaDescription value to be set
     * @return Builder
     */

    public CategorySetMetaDescriptionActionBuilder metaDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return metaDescription
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     * builds CategorySetMetaDescriptionAction with checking for non-null required values
     * @return CategorySetMetaDescriptionAction
     */
    public CategorySetMetaDescriptionAction build() {
        return new CategorySetMetaDescriptionActionImpl(metaDescription);
    }

    /**
     * builds CategorySetMetaDescriptionAction without checking for non-null required values
     * @return CategorySetMetaDescriptionAction
     */
    public CategorySetMetaDescriptionAction buildUnchecked() {
        return new CategorySetMetaDescriptionActionImpl(metaDescription);
    }

    /**
     * factory method for an instance of CategorySetMetaDescriptionActionBuilder
     * @return builder
     */
    public static CategorySetMetaDescriptionActionBuilder of() {
        return new CategorySetMetaDescriptionActionBuilder();
    }

    /**
     * create builder for CategorySetMetaDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetMetaDescriptionActionBuilder of(final CategorySetMetaDescriptionAction template) {
        CategorySetMetaDescriptionActionBuilder builder = new CategorySetMetaDescriptionActionBuilder();
        builder.metaDescription = template.getMetaDescription();
        return builder;
    }

}
