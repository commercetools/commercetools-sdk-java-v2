
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddedToCategoryMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddedToCategoryMessagePayload productAddedToCategoryMessagePayload = ProductAddedToCategoryMessagePayload.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddedToCategoryMessagePayloadBuilder implements Builder<ProductAddedToCategoryMessagePayload> {

    private com.commercetools.api.models.category.CategoryReference category;

    private Boolean staged;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> was added to.</p>
     * @param builder function to build the category value
     * @return Builder
     */

    public ProductAddedToCategoryMessagePayloadBuilder category(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> was added to.</p>
     * @param builder function to build the category value
     * @return Builder
     */

    public ProductAddedToCategoryMessagePayloadBuilder withCategory(
            Function<com.commercetools.api.models.category.CategoryReferenceBuilder, com.commercetools.api.models.category.CategoryReference> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> was added to.</p>
     * @param category value to be set
     * @return Builder
     */

    public ProductAddedToCategoryMessagePayloadBuilder category(
            final com.commercetools.api.models.category.CategoryReference category) {
        this.category = category;
        return this;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductAddedToCategoryMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> was added to.</p>
     * @return category
     */

    public com.commercetools.api.models.category.CategoryReference getCategory() {
        return this.category;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductAddedToCategoryMessagePayload with checking for non-null required values
     * @return ProductAddedToCategoryMessagePayload
     */
    public ProductAddedToCategoryMessagePayload build() {
        Objects.requireNonNull(category, ProductAddedToCategoryMessagePayload.class + ": category is missing");
        Objects.requireNonNull(staged, ProductAddedToCategoryMessagePayload.class + ": staged is missing");
        return new ProductAddedToCategoryMessagePayloadImpl(category, staged);
    }

    /**
     * builds ProductAddedToCategoryMessagePayload without checking for non-null required values
     * @return ProductAddedToCategoryMessagePayload
     */
    public ProductAddedToCategoryMessagePayload buildUnchecked() {
        return new ProductAddedToCategoryMessagePayloadImpl(category, staged);
    }

    /**
     * factory method for an instance of ProductAddedToCategoryMessagePayloadBuilder
     * @return builder
     */
    public static ProductAddedToCategoryMessagePayloadBuilder of() {
        return new ProductAddedToCategoryMessagePayloadBuilder();
    }

    /**
     * create builder for ProductAddedToCategoryMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddedToCategoryMessagePayloadBuilder of(final ProductAddedToCategoryMessagePayload template) {
        ProductAddedToCategoryMessagePayloadBuilder builder = new ProductAddedToCategoryMessagePayloadBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
