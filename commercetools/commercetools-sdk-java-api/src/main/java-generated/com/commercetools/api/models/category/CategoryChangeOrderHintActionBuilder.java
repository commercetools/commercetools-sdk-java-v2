
package com.commercetools.api.models.category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeOrderHintActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeOrderHintAction categoryChangeOrderHintAction = CategoryChangeOrderHintAction.builder()
 *             .orderHint("{orderHint}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeOrderHintActionBuilder implements Builder<CategoryChangeOrderHintAction> {

    private String orderHint;

    /**
     *  <p>New value to set. Must be a decimal value between 0 and 1.</p>
     */

    public CategoryChangeOrderHintActionBuilder orderHint(final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    public String getOrderHint() {
        return this.orderHint;
    }

    public CategoryChangeOrderHintAction build() {
        Objects.requireNonNull(orderHint, CategoryChangeOrderHintAction.class + ": orderHint is missing");
        return new CategoryChangeOrderHintActionImpl(orderHint);
    }

    /**
     * builds CategoryChangeOrderHintAction without checking for non null required values
     */
    public CategoryChangeOrderHintAction buildUnchecked() {
        return new CategoryChangeOrderHintActionImpl(orderHint);
    }

    public static CategoryChangeOrderHintActionBuilder of() {
        return new CategoryChangeOrderHintActionBuilder();
    }

    public static CategoryChangeOrderHintActionBuilder of(final CategoryChangeOrderHintAction template) {
        CategoryChangeOrderHintActionBuilder builder = new CategoryChangeOrderHintActionBuilder();
        builder.orderHint = template.getOrderHint();
        return builder;
    }

}
