
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetPriceKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPriceKeyAction productSetPriceKeyAction = ProductSetPriceKeyAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetPriceKeyActionBuilder implements Builder<ProductSetPriceKeyAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    @Nullable
    private String key;

    /**
     *  <p>The <code>id</code> of the Price to set the key.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public ProductSetPriceKeyActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetPriceKeyActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSetPriceKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Price to set the key.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductSetPriceKeyAction with checking for non-null required values
     * @return ProductSetPriceKeyAction
     */
    public ProductSetPriceKeyAction build() {
        Objects.requireNonNull(priceId, ProductSetPriceKeyAction.class + ": priceId is missing");
        return new ProductSetPriceKeyActionImpl(priceId, staged, key);
    }

    /**
     * builds ProductSetPriceKeyAction without checking for non-null required values
     * @return ProductSetPriceKeyAction
     */
    public ProductSetPriceKeyAction buildUnchecked() {
        return new ProductSetPriceKeyActionImpl(priceId, staged, key);
    }

    /**
     * factory method for an instance of ProductSetPriceKeyActionBuilder
     * @return builder
     */
    public static ProductSetPriceKeyActionBuilder of() {
        return new ProductSetPriceKeyActionBuilder();
    }

    /**
     * create builder for ProductSetPriceKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetPriceKeyActionBuilder of(final ProductSetPriceKeyAction template) {
        ProductSetPriceKeyActionBuilder builder = new ProductSetPriceKeyActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.key = template.getKey();
        return builder;
    }

}
