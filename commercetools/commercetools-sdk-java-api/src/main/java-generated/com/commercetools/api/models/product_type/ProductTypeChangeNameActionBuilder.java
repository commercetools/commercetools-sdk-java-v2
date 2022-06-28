
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeNameAction productTypeChangeNameAction = ProductTypeChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeNameActionBuilder implements Builder<ProductTypeChangeNameAction> {

    private String name;

    /**
     *  <p>New value to set.</p>
     */

    public ProductTypeChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ProductTypeChangeNameAction build() {
        Objects.requireNonNull(name, ProductTypeChangeNameAction.class + ": name is missing");
        return new ProductTypeChangeNameActionImpl(name);
    }

    /**
     * builds ProductTypeChangeNameAction without checking for non null required values
     */
    public ProductTypeChangeNameAction buildUnchecked() {
        return new ProductTypeChangeNameActionImpl(name);
    }

    public static ProductTypeChangeNameActionBuilder of() {
        return new ProductTypeChangeNameActionBuilder();
    }

    public static ProductTypeChangeNameActionBuilder of(final ProductTypeChangeNameAction template) {
        ProductTypeChangeNameActionBuilder builder = new ProductTypeChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
