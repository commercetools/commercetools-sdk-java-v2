
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemovedFromCategoryMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovedFromCategoryMessagePayload productRemovedFromCategoryMessagePayload = ProductRemovedFromCategoryMessagePayload.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemovedFromCategoryMessagePayloadBuilder
        implements Builder<ProductRemovedFromCategoryMessagePayload> {

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    /**
     *  <p>Category the Product was removed from.</p>
     * @return Builder
     */

    public ProductRemovedFromCategoryMessagePayloadBuilder category(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Category the Product was removed from.</p>
     * @param category
     * @return Builder
     */

    public ProductRemovedFromCategoryMessagePayloadBuilder category(
            final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged
     * @return Builder
     */

    public ProductRemovedFromCategoryMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductRemovedFromCategoryMessagePayload build() {
        Objects.requireNonNull(category, ProductRemovedFromCategoryMessagePayload.class + ": category is missing");
        Objects.requireNonNull(staged, ProductRemovedFromCategoryMessagePayload.class + ": staged is missing");
        return new ProductRemovedFromCategoryMessagePayloadImpl(category, staged);
    }

    /**
     * builds ProductRemovedFromCategoryMessagePayload without checking for non null required values
     */
    public ProductRemovedFromCategoryMessagePayload buildUnchecked() {
        return new ProductRemovedFromCategoryMessagePayloadImpl(category, staged);
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder of() {
        return new ProductRemovedFromCategoryMessagePayloadBuilder();
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder of(
            final ProductRemovedFromCategoryMessagePayload template) {
        ProductRemovedFromCategoryMessagePayloadBuilder builder = new ProductRemovedFromCategoryMessagePayloadBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
