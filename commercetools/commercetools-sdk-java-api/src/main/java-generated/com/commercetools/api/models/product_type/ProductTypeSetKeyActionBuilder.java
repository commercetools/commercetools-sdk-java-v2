
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetKeyAction productTypeSetKeyAction = ProductTypeSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeSetKeyActionBuilder implements Builder<ProductTypeSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductTypeSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductTypeSetKeyAction build() {
        return new ProductTypeSetKeyActionImpl(key);
    }

    /**
     * builds ProductTypeSetKeyAction without checking for non null required values
     */
    public ProductTypeSetKeyAction buildUnchecked() {
        return new ProductTypeSetKeyActionImpl(key);
    }

    public static ProductTypeSetKeyActionBuilder of() {
        return new ProductTypeSetKeyActionBuilder();
    }

    public static ProductTypeSetKeyActionBuilder of(final ProductTypeSetKeyAction template) {
        ProductTypeSetKeyActionBuilder builder = new ProductTypeSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
