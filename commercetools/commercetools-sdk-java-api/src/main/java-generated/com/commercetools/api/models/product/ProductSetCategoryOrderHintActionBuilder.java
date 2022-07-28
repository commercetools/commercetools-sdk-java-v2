
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetCategoryOrderHintActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetCategoryOrderHintAction productSetCategoryOrderHintAction = ProductSetCategoryOrderHintAction.builder()
 *             .categoryId("{categoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetCategoryOrderHintActionBuilder implements Builder<ProductSetCategoryOrderHintAction> {

    private String categoryId;

    @Nullable
    private String orderHint;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the Category to add the <code>orderHint</code>.</p>
     */

    public ProductSetCategoryOrderHintActionBuilder categoryId(final String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     */

    public ProductSetCategoryOrderHintActionBuilder orderHint(@Nullable final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>categoryOrderHints</code> is updated. If <code>false</code>, both the current and staged <code>categoryOrderHints</code> are updated.</p>
     */

    public ProductSetCategoryOrderHintActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public String getOrderHint() {
        return this.orderHint;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetCategoryOrderHintAction build() {
        Objects.requireNonNull(categoryId, ProductSetCategoryOrderHintAction.class + ": categoryId is missing");
        return new ProductSetCategoryOrderHintActionImpl(categoryId, orderHint, staged);
    }

    /**
     * builds ProductSetCategoryOrderHintAction without checking for non null required values
     */
    public ProductSetCategoryOrderHintAction buildUnchecked() {
        return new ProductSetCategoryOrderHintActionImpl(categoryId, orderHint, staged);
    }

    public static ProductSetCategoryOrderHintActionBuilder of() {
        return new ProductSetCategoryOrderHintActionBuilder();
    }

    public static ProductSetCategoryOrderHintActionBuilder of(final ProductSetCategoryOrderHintAction template) {
        ProductSetCategoryOrderHintActionBuilder builder = new ProductSetCategoryOrderHintActionBuilder();
        builder.categoryId = template.getCategoryId();
        builder.orderHint = template.getOrderHint();
        builder.staged = template.getStaged();
        return builder;
    }

}
