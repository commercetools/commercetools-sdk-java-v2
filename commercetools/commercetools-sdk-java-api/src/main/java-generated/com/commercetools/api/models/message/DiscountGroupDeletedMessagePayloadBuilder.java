
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupDeletedMessagePayload discountGroupDeletedMessagePayload = DiscountGroupDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupDeletedMessagePayloadBuilder implements Builder<DiscountGroupDeletedMessagePayload> {

    /**
     * builds DiscountGroupDeletedMessagePayload with checking for non-null required values
     * @return DiscountGroupDeletedMessagePayload
     */
    public DiscountGroupDeletedMessagePayload build() {
        return new DiscountGroupDeletedMessagePayloadImpl();
    }

    /**
     * builds DiscountGroupDeletedMessagePayload without checking for non-null required values
     * @return DiscountGroupDeletedMessagePayload
     */
    public DiscountGroupDeletedMessagePayload buildUnchecked() {
        return new DiscountGroupDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of DiscountGroupDeletedMessagePayloadBuilder
     * @return builder
     */
    public static DiscountGroupDeletedMessagePayloadBuilder of() {
        return new DiscountGroupDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountGroupDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupDeletedMessagePayloadBuilder of(final DiscountGroupDeletedMessagePayload template) {
        DiscountGroupDeletedMessagePayloadBuilder builder = new DiscountGroupDeletedMessagePayloadBuilder();
        return builder;
    }

}
