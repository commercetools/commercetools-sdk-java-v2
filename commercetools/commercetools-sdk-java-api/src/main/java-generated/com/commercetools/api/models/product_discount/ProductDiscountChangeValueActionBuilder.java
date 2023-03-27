
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
     * @param value value to be set
     * @return Builder
     */

    public ProductDiscountChangeValueActionBuilder value(
            final com.commercetools.api.models.product_discount.ProductDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public ProductDiscountChangeValueActionBuilder value(
            Function<com.commercetools.api.models.product_discount.ProductDiscountValueDraftBuilder, Builder<? extends com.commercetools.api.models.product_discount.ProductDiscountValueDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountValueDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return value
     */

    public com.commercetools.api.models.product_discount.ProductDiscountValueDraft getValue() {
        return this.value;
    }

    /**
     * builds ProductDiscountChangeValueAction with checking for non-null required values
     * @return ProductDiscountChangeValueAction
     */
    public ProductDiscountChangeValueAction build() {
        Objects.requireNonNull(value, ProductDiscountChangeValueAction.class + ": value is missing");
        return new ProductDiscountChangeValueActionImpl(value);
    }

    /**
     * builds ProductDiscountChangeValueAction without checking for non-null required values
     * @return ProductDiscountChangeValueAction
     */
    public ProductDiscountChangeValueAction buildUnchecked() {
        return new ProductDiscountChangeValueActionImpl(value);
    }

    /**
     * factory method for an instance of ProductDiscountChangeValueActionBuilder
     * @return builder
     */
    public static ProductDiscountChangeValueActionBuilder of() {
        return new ProductDiscountChangeValueActionBuilder();
    }

    /**
     * create builder for ProductDiscountChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeValueActionBuilder of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionBuilder builder = new ProductDiscountChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
