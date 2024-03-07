
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetSlugActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetSlugAction productTailoringSetSlugAction = ProductTailoringSetSlugAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetSlugActionBuilder implements Builder<ProductTailoringSetSlugAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringSetSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductTailoringSetSlugActionBuilder withSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductTailoringSetSlugActionBuilder slug(
            @Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetSlugActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return slug
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetSlugAction with checking for non-null required values
     * @return ProductTailoringSetSlugAction
     */
    public ProductTailoringSetSlugAction build() {
        return new ProductTailoringSetSlugActionImpl(slug, staged);
    }

    /**
     * builds ProductTailoringSetSlugAction without checking for non-null required values
     * @return ProductTailoringSetSlugAction
     */
    public ProductTailoringSetSlugAction buildUnchecked() {
        return new ProductTailoringSetSlugActionImpl(slug, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetSlugActionBuilder
     * @return builder
     */
    public static ProductTailoringSetSlugActionBuilder of() {
        return new ProductTailoringSetSlugActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetSlugActionBuilder of(final ProductTailoringSetSlugAction template) {
        ProductTailoringSetSlugActionBuilder builder = new ProductTailoringSetSlugActionBuilder();
        builder.slug = template.getSlug();
        builder.staged = template.getStaged();
        return builder;
    }

}
