
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionChangeNameAction productSelectionChangeNameAction = ProductSelectionChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionChangeNameActionBuilder implements Builder<ProductSelectionChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The new name to be set for the ProductSelection.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ProductSelectionChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new name to be set for the ProductSelection.</p>
     * @param name value to be set
     * @return Builder
     */

    public ProductSelectionChangeNameActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The new name to be set for the ProductSelection.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds ProductSelectionChangeNameAction with checking for non-null required values
     * @return ProductSelectionChangeNameAction
     */
    public ProductSelectionChangeNameAction build() {
        Objects.requireNonNull(name, ProductSelectionChangeNameAction.class + ": name is missing");
        return new ProductSelectionChangeNameActionImpl(name);
    }

    /**
     * builds ProductSelectionChangeNameAction without checking for non-null required values
     * @return ProductSelectionChangeNameAction
     */
    public ProductSelectionChangeNameAction buildUnchecked() {
        return new ProductSelectionChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ProductSelectionChangeNameActionBuilder
     * @return builder
     */
    public static ProductSelectionChangeNameActionBuilder of() {
        return new ProductSelectionChangeNameActionBuilder();
    }

    /**
     * create builder for ProductSelectionChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionChangeNameActionBuilder of(final ProductSelectionChangeNameAction template) {
        ProductSelectionChangeNameActionBuilder builder = new ProductSelectionChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
