
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeNameAction productDiscountChangeNameAction = ProductDiscountChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeNameActionBuilder implements Builder<ProductDiscountChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductDiscountChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductDiscountChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds ProductDiscountChangeNameAction with checking for non-null required values
     * @return ProductDiscountChangeNameAction
     */
    public ProductDiscountChangeNameAction build() {
        Objects.requireNonNull(name, ProductDiscountChangeNameAction.class + ": name is missing");
        return new ProductDiscountChangeNameActionImpl(name);
    }

    /**
     * builds ProductDiscountChangeNameAction without checking for non-null required values
     * @return ProductDiscountChangeNameAction
     */
    public ProductDiscountChangeNameAction buildUnchecked() {
        return new ProductDiscountChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ProductDiscountChangeNameActionBuilder
     * @return builder
     */
    public static ProductDiscountChangeNameActionBuilder of() {
        return new ProductDiscountChangeNameActionBuilder();
    }

    /**
     * create builder for ProductDiscountChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeNameActionBuilder of(final ProductDiscountChangeNameAction template) {
        ProductDiscountChangeNameActionBuilder builder = new ProductDiscountChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
