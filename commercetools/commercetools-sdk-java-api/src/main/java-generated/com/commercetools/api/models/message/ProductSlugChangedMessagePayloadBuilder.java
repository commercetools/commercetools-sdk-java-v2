
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSlugChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSlugChangedMessagePayload productSlugChangedMessagePayload = ProductSlugChangedMessagePayload.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSlugChangedMessagePayloadBuilder implements Builder<ProductSlugChangedMessagePayload> {

    private com.commercetools.api.models.common.LocalizedString slug;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldSlug;

    /**
     *  <p>The slug of the Product after the Change Slug update action.</p>
     * @param builder function to build the slug value
     * @return Builder
     */

    public ProductSlugChangedMessagePayloadBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The slug of the Product after the Change Slug update action.</p>
     * @param slug value to be set
     * @return Builder
     */

    public ProductSlugChangedMessagePayloadBuilder slug(
            final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>The slug of the Product before the Change Slug update action.</p>
     * @param builder function to build the oldSlug value
     * @return Builder
     */

    public ProductSlugChangedMessagePayloadBuilder oldSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The slug of the Product before the Change Slug update action.</p>
     * @param oldSlug value to be set
     * @return Builder
     */

    public ProductSlugChangedMessagePayloadBuilder oldSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.oldSlug = oldSlug;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldSlug() {
        return this.oldSlug;
    }

    /**
     * builds ProductSlugChangedMessagePayload with checking for non-null required values
     * @return ProductSlugChangedMessagePayload
     */
    public ProductSlugChangedMessagePayload build() {
        Objects.requireNonNull(slug, ProductSlugChangedMessagePayload.class + ": slug is missing");
        return new ProductSlugChangedMessagePayloadImpl(slug, oldSlug);
    }

    /**
     * builds ProductSlugChangedMessagePayload without checking for non-null required values
     * @return ProductSlugChangedMessagePayload
     */
    public ProductSlugChangedMessagePayload buildUnchecked() {
        return new ProductSlugChangedMessagePayloadImpl(slug, oldSlug);
    }

    public static ProductSlugChangedMessagePayloadBuilder of() {
        return new ProductSlugChangedMessagePayloadBuilder();
    }

    public static ProductSlugChangedMessagePayloadBuilder of(final ProductSlugChangedMessagePayload template) {
        ProductSlugChangedMessagePayloadBuilder builder = new ProductSlugChangedMessagePayloadBuilder();
        builder.slug = template.getSlug();
        builder.oldSlug = template.getOldSlug();
        return builder;
    }

}
