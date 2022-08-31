
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetKeyAction productSetKeyAction = ProductSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetKeyActionBuilder implements Builder<ProductSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductSetKeyAction build() {
        return new ProductSetKeyActionImpl(key);
    }

    /**
     * builds ProductSetKeyAction without checking for non null required values
     */
    public ProductSetKeyAction buildUnchecked() {
        return new ProductSetKeyActionImpl(key);
    }

    public static ProductSetKeyActionBuilder of() {
        return new ProductSetKeyActionBuilder();
    }

    public static ProductSetKeyActionBuilder of(final ProductSetKeyAction template) {
        ProductSetKeyActionBuilder builder = new ProductSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
