
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceModeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceModeSetMessagePayload productPriceModeSetMessagePayload = ProductPriceModeSetMessagePayload.builder()
 *             .to(ProductPriceModeEnum.EMBEDDED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceModeSetMessagePayloadBuilder implements Builder<ProductPriceModeSetMessagePayload> {

    private com.commercetools.api.models.product.ProductPriceModeEnum to;

    /**
     *  <p>The PriceMode that was set.</p>
     */

    public ProductPriceModeSetMessagePayloadBuilder to(
            final com.commercetools.api.models.product.ProductPriceModeEnum to) {
        this.to = to;
        return this;
    }

    public com.commercetools.api.models.product.ProductPriceModeEnum getTo() {
        return this.to;
    }

    public ProductPriceModeSetMessagePayload build() {
        Objects.requireNonNull(to, ProductPriceModeSetMessagePayload.class + ": to is missing");
        return new ProductPriceModeSetMessagePayloadImpl(to);
    }

    /**
     * builds ProductPriceModeSetMessagePayload without checking for non null required values
     */
    public ProductPriceModeSetMessagePayload buildUnchecked() {
        return new ProductPriceModeSetMessagePayloadImpl(to);
    }

    public static ProductPriceModeSetMessagePayloadBuilder of() {
        return new ProductPriceModeSetMessagePayloadBuilder();
    }

    public static ProductPriceModeSetMessagePayloadBuilder of(final ProductPriceModeSetMessagePayload template) {
        ProductPriceModeSetMessagePayloadBuilder builder = new ProductPriceModeSetMessagePayloadBuilder();
        builder.to = template.getTo();
        return builder;
    }

}
