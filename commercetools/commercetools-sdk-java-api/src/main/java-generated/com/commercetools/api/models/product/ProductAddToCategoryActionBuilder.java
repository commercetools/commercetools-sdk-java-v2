
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddToCategoryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddToCategoryAction productAddToCategoryAction = ProductAddToCategoryAction.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddToCategoryActionBuilder implements Builder<ProductAddToCategoryAction> {

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    @Nullable
    private String orderHint;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The Category to add.</p>
     * @return Builder
     */

    public ProductAddToCategoryActionBuilder category(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Category to add.</p>
     * @param category
     * @return Builder
     */

    public ProductAddToCategoryActionBuilder category(
            final com.commercetools.api.models.category.CategoryResourceIdentifier category) {
        this.category = category;
        return this;
    }

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     * @param orderHint
     * @return Builder
     */

    public ProductAddToCategoryActionBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are updated. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are updated.</p>
     * @param staged
     * @return Builder
     */

    public ProductAddToCategoryActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

    @Nullable
    public String getOrderHint() {
        return this.orderHint;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddToCategoryAction build() {
        Objects.requireNonNull(category, ProductAddToCategoryAction.class + ": category is missing");
        return new ProductAddToCategoryActionImpl(category, orderHint, staged);
    }

    /**
     * builds ProductAddToCategoryAction without checking for non null required values
     */
    public ProductAddToCategoryAction buildUnchecked() {
        return new ProductAddToCategoryActionImpl(category, orderHint, staged);
    }

    public static ProductAddToCategoryActionBuilder of() {
        return new ProductAddToCategoryActionBuilder();
    }

    public static ProductAddToCategoryActionBuilder of(final ProductAddToCategoryAction template) {
        ProductAddToCategoryActionBuilder builder = new ProductAddToCategoryActionBuilder();
        builder.category = template.getCategory();
        builder.orderHint = template.getOrderHint();
        builder.staged = template.getStaged();
        return builder;
    }

}
