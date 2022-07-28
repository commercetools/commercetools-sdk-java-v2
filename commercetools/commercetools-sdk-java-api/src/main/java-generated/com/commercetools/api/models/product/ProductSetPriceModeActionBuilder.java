
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetPriceModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPriceModeAction productSetPriceModeAction = ProductSetPriceModeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetPriceModeActionBuilder implements Builder<ProductSetPriceModeAction> {

    @Nullable
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     */

    public ProductSetPriceModeActionBuilder priceMode(
            @Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public ProductSetPriceModeAction build() {
        return new ProductSetPriceModeActionImpl(priceMode);
    }

    /**
     * builds ProductSetPriceModeAction without checking for non null required values
     */
    public ProductSetPriceModeAction buildUnchecked() {
        return new ProductSetPriceModeActionImpl(priceMode);
    }

    public static ProductSetPriceModeActionBuilder of() {
        return new ProductSetPriceModeActionBuilder();
    }

    public static ProductSetPriceModeActionBuilder of(final ProductSetPriceModeAction template) {
        ProductSetPriceModeActionBuilder builder = new ProductSetPriceModeActionBuilder();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
