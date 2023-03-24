
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductUnpublishedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUnpublishedMessagePayload productUnpublishedMessagePayload = ProductUnpublishedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductUnpublishedMessagePayloadBuilder implements Builder<ProductUnpublishedMessagePayload> {

    /**
     * builds ProductUnpublishedMessagePayload with checking for non-null required values
     * @return ProductUnpublishedMessagePayload
     */
    public ProductUnpublishedMessagePayload build() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    /**
     * builds ProductUnpublishedMessagePayload without checking for non-null required values
     * @return ProductUnpublishedMessagePayload
     */
    public ProductUnpublishedMessagePayload buildUnchecked() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    public static ProductUnpublishedMessagePayloadBuilder of() {
        return new ProductUnpublishedMessagePayloadBuilder();
    }

    public static ProductUnpublishedMessagePayloadBuilder of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadBuilder builder = new ProductUnpublishedMessagePayloadBuilder();
        return builder;
    }

}
