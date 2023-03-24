
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemoveFromCategoryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveFromCategoryAction productRemoveFromCategoryAction = ProductRemoveFromCategoryAction.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveFromCategoryActionBuilder implements Builder<ProductRemoveFromCategoryAction> {

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The Category to remove.</p>
     * @param builder function to build the category value
     * @return Builder
     */

    public ProductRemoveFromCategoryActionBuilder category(
            Function<com.commercetools.api.models.category.CategoryResourceIdentifierBuilder, com.commercetools.api.models.category.CategoryResourceIdentifierBuilder> builder) {
        this.category = builder.apply(com.commercetools.api.models.category.CategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Category to remove.</p>
     * @param category value to be set
     * @return Builder
     */

    public ProductRemoveFromCategoryActionBuilder category(
            final com.commercetools.api.models.category.CategoryResourceIdentifier category) {
        this.category = category;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are removed. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductRemoveFromCategoryActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductRemoveFromCategoryAction with checking for non-null required values
     * @return ProductRemoveFromCategoryAction
     */
    public ProductRemoveFromCategoryAction build() {
        Objects.requireNonNull(category, ProductRemoveFromCategoryAction.class + ": category is missing");
        return new ProductRemoveFromCategoryActionImpl(category, staged);
    }

    /**
     * builds ProductRemoveFromCategoryAction without checking for non-null required values
     * @return ProductRemoveFromCategoryAction
     */
    public ProductRemoveFromCategoryAction buildUnchecked() {
        return new ProductRemoveFromCategoryActionImpl(category, staged);
    }

    public static ProductRemoveFromCategoryActionBuilder of() {
        return new ProductRemoveFromCategoryActionBuilder();
    }

    public static ProductRemoveFromCategoryActionBuilder of(final ProductRemoveFromCategoryAction template) {
        ProductRemoveFromCategoryActionBuilder builder = new ProductRemoveFromCategoryActionBuilder();
        builder.category = template.getCategory();
        builder.staged = template.getStaged();
        return builder;
    }

}
