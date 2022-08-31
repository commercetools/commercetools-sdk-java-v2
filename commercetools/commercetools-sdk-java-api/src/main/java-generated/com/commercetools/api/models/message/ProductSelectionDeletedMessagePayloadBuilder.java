
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

    public ProductSelectionDeletedMessagePayload build() {
        return new ProductSelectionDeletedMessagePayloadImpl();
    }

    /**
     * builds ProductSelectionDeletedMessagePayload without checking for non null required values
     */
    public ProductSelectionDeletedMessagePayload buildUnchecked() {
        return new ProductSelectionDeletedMessagePayloadImpl();
    }

    public static ProductSelectionDeletedMessagePayloadBuilder of() {
        return new ProductSelectionDeletedMessagePayloadBuilder();
    }

    public static ProductSelectionDeletedMessagePayloadBuilder of(
            final ProductSelectionDeletedMessagePayload template) {
        ProductSelectionDeletedMessagePayloadBuilder builder = new ProductSelectionDeletedMessagePayloadBuilder();
        return builder;
    }

}
