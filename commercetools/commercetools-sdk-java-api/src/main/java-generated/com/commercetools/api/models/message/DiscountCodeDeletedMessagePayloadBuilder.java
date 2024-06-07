
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeDeletedMessagePayload discountCodeDeletedMessagePayload = DiscountCodeDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeDeletedMessagePayloadBuilder implements Builder<DiscountCodeDeletedMessagePayload> {

    /**
     * builds DiscountCodeDeletedMessagePayload with checking for non-null required values
     * @return DiscountCodeDeletedMessagePayload
     */
    public DiscountCodeDeletedMessagePayload build() {
        return new DiscountCodeDeletedMessagePayloadImpl();
    }

    /**
     * builds DiscountCodeDeletedMessagePayload without checking for non-null required values
     * @return DiscountCodeDeletedMessagePayload
     */
    public DiscountCodeDeletedMessagePayload buildUnchecked() {
        return new DiscountCodeDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of DiscountCodeDeletedMessagePayloadBuilder
     * @return builder
     */
    public static DiscountCodeDeletedMessagePayloadBuilder of() {
        return new DiscountCodeDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountCodeDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeDeletedMessagePayloadBuilder of(final DiscountCodeDeletedMessagePayload template) {
        DiscountCodeDeletedMessagePayloadBuilder builder = new DiscountCodeDeletedMessagePayloadBuilder();
        return builder;
    }

}
