
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetKeyAction productTailoringSetKeyAction = ProductTailoringSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetKeyActionBuilder implements Builder<ProductTailoringSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductTailoringSetKeyAction with checking for non-null required values
     * @return ProductTailoringSetKeyAction
     */
    public ProductTailoringSetKeyAction build() {
        return new ProductTailoringSetKeyActionImpl(key);
    }

    /**
     * builds ProductTailoringSetKeyAction without checking for non-null required values
     * @return ProductTailoringSetKeyAction
     */
    public ProductTailoringSetKeyAction buildUnchecked() {
        return new ProductTailoringSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ProductTailoringSetKeyActionBuilder
     * @return builder
     */
    public static ProductTailoringSetKeyActionBuilder of() {
        return new ProductTailoringSetKeyActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetKeyActionBuilder of(final ProductTailoringSetKeyAction template) {
        ProductTailoringSetKeyActionBuilder builder = new ProductTailoringSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
