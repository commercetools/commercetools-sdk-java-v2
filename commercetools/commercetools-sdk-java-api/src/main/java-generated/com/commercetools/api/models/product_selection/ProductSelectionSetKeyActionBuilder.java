
package com.commercetools.api.models.product_selection;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetKeyAction productSelectionSetKeyAction = ProductSelectionSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetKeyActionBuilder implements Builder<ProductSelectionSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSelectionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductSelectionSetKeyAction with checking for non-null required values
     * @return ProductSelectionSetKeyAction
     */
    public ProductSelectionSetKeyAction build() {
        return new ProductSelectionSetKeyActionImpl(key);
    }

    /**
     * builds ProductSelectionSetKeyAction without checking for non-null required values
     * @return ProductSelectionSetKeyAction
     */
    public ProductSelectionSetKeyAction buildUnchecked() {
        return new ProductSelectionSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ProductSelectionSetKeyActionBuilder
     * @return builder
     */
    public static ProductSelectionSetKeyActionBuilder of() {
        return new ProductSelectionSetKeyActionBuilder();
    }

    /**
     * create builder for ProductSelectionSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetKeyActionBuilder of(final ProductSelectionSetKeyAction template) {
        ProductSelectionSetKeyActionBuilder builder = new ProductSelectionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
