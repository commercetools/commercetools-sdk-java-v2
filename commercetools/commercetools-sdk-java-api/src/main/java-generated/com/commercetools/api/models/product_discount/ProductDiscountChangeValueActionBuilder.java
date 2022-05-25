
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeValueAction productDiscountChangeValueAction = ProductDiscountChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeValueActionBuilder implements Builder<ProductDiscountChangeValueAction> {

    private com.commercetools.api.models.product_discount.ProductDiscountValueDraft value;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProductDiscountChangeValueActionBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProductDiscountChangeValueActionBuilder value(
            Function<com.commercetools.api.models.product_discount.ProductDiscountValueDraftBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountValueDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountValueDraftBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue() {
        return this.value;
    }

    public ProductDiscountChangeValueAction build() {
        Objects.requireNonNull(value, ProductDiscountChangeValueAction.class + ": value is missing");
        return new ProductDiscountChangeValueActionImpl(value);
    }

    /**
     * builds ProductDiscountChangeValueAction without checking for non null required values
     */
    public ProductDiscountChangeValueAction buildUnchecked() {
        return new ProductDiscountChangeValueActionImpl(value);
    }

    public static ProductDiscountChangeValueActionBuilder of() {
        return new ProductDiscountChangeValueActionBuilder();
    }

    public static ProductDiscountChangeValueActionBuilder of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionBuilder builder = new ProductDiscountChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
