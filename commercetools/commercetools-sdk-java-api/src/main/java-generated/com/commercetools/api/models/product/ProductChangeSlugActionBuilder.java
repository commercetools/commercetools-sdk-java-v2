
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeSlugActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeSlugAction productChangeSlugAction = ProductChangeSlugAction.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeSlugActionBuilder implements Builder<ProductChangeSlugAction> {

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Every slug must be unique across a project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (<code>_</code>) and hyphen (<code>-</code>) characters. Maximum size is <code>256</code>.</p>
     */

    public ProductChangeSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Every slug must be unique across a project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (<code>_</code>) and hyphen (<code>-</code>) characters. Maximum size is <code>256</code>.</p>
     */

    public ProductChangeSlugActionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *
     */

    public ProductChangeSlugActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductChangeSlugAction build() {
        Objects.requireNonNull(slug, ProductChangeSlugAction.class + ": slug is missing");
        return new ProductChangeSlugActionImpl(slug, staged);
    }

    /**
     * builds ProductChangeSlugAction without checking for non null required values
     */
    public ProductChangeSlugAction buildUnchecked() {
        return new ProductChangeSlugActionImpl(slug, staged);
    }

    public static ProductChangeSlugActionBuilder of() {
        return new ProductChangeSlugActionBuilder();
    }

    public static ProductChangeSlugActionBuilder of(final ProductChangeSlugAction template) {
        ProductChangeSlugActionBuilder builder = new ProductChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        builder.staged = template.getStaged();
        return builder;
    }

}
