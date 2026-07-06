
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeSlugActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeSlugAction categoryChangeSlugAction = CategoryChangeSlugAction.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeSlugActionBuilder implements Builder<CategoryChangeSlugAction> {

    private com.commercetools.api.models.common.LocalizedString slug;

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a>, but it must be unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public CategoryChangeSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a>, but it must be unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public CategoryChangeSlugActionBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a>, but it must be unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CategoryChangeSlugActionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different <a href="https://docs.commercetools.com/apis/ctp:api:type:Locale" rel="nofollow">Locales</a>, but it must be unique across the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @return slug
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     * builds CategoryChangeSlugAction with checking for non-null required values
     * @return CategoryChangeSlugAction
     */
    public CategoryChangeSlugAction build() {
        Objects.requireNonNull(slug, CategoryChangeSlugAction.class + ": slug is missing");
        return new CategoryChangeSlugActionImpl(slug);
    }

    /**
     * builds CategoryChangeSlugAction without checking for non-null required values
     * @return CategoryChangeSlugAction
     */
    public CategoryChangeSlugAction buildUnchecked() {
        return new CategoryChangeSlugActionImpl(slug);
    }

    /**
     * factory method for an instance of CategoryChangeSlugActionBuilder
     * @return builder
     */
    public static CategoryChangeSlugActionBuilder of() {
        return new CategoryChangeSlugActionBuilder();
    }

    /**
     * create builder for CategoryChangeSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeSlugActionBuilder of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionBuilder builder = new CategoryChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
