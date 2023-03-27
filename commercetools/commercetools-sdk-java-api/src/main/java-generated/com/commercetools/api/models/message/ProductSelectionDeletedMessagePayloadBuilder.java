
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDeletedMessagePayload productSelectionDeletedMessagePayload = ProductSelectionDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionDeletedMessagePayloadBuilder implements Builder<ProductSelectionDeletedMessagePayload> {

    /**
     * builds ProductSelectionDeletedMessagePayload with checking for non-null required values
     * @return ProductSelectionDeletedMessagePayload
     */
    public ProductSelectionDeletedMessagePayload build() {
        return new ProductSelectionDeletedMessagePayloadImpl();
    }

    /**
     * builds ProductSelectionDeletedMessagePayload without checking for non-null required values
     * @return ProductSelectionDeletedMessagePayload
     */
    public ProductSelectionDeletedMessagePayload buildUnchecked() {
        return new ProductSelectionDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of ProductSelectionDeletedMessagePayloadBuilder
     * @return builder
     */
    public static ProductSelectionDeletedMessagePayloadBuilder of() {
        return new ProductSelectionDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionDeletedMessagePayloadBuilder of(
            final ProductSelectionDeletedMessagePayload template) {
        ProductSelectionDeletedMessagePayloadBuilder builder = new ProductSelectionDeletedMessagePayloadBuilder();
        return builder;
    }

}
