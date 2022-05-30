
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
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */

    public CategoryChangeSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */

    public CategoryChangeSlugActionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public CategoryChangeSlugAction build() {
        Objects.requireNonNull(slug, CategoryChangeSlugAction.class + ": slug is missing");
        return new CategoryChangeSlugActionImpl(slug);
    }

    /**
     * builds CategoryChangeSlugAction without checking for non null required values
     */
    public CategoryChangeSlugAction buildUnchecked() {
        return new CategoryChangeSlugActionImpl(slug);
    }

    public static CategoryChangeSlugActionBuilder of() {
        return new CategoryChangeSlugActionBuilder();
    }

    public static CategoryChangeSlugActionBuilder of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionBuilder builder = new CategoryChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
