
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
     *  <p>To update a Product using the <span>Import API</span> and the <span>Merchant Center</span>, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     *  <p>To update a Product using the <span>Import API</span> and the <span>Merchant Center</span>, the Product <code>key</code> must match the pattern <code>^[A-Za-z0-9_-]{2,256}$</code>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductSetKeyAction with checking for non-null required values
     * @return ProductSetKeyAction
     */
    public ProductSetKeyAction build() {
        return new ProductSetKeyActionImpl(key);
    }

    /**
     * builds ProductSetKeyAction without checking for non-null required values
     * @return ProductSetKeyAction
     */
    public ProductSetKeyAction buildUnchecked() {
        return new ProductSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ProductSetKeyActionBuilder
     * @return builder
     */
    public static ProductSetKeyActionBuilder of() {
        return new ProductSetKeyActionBuilder();
    }

    /**
     * create builder for ProductSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetKeyActionBuilder of(final ProductSetKeyAction template) {
        ProductSetKeyActionBuilder builder = new ProductSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
