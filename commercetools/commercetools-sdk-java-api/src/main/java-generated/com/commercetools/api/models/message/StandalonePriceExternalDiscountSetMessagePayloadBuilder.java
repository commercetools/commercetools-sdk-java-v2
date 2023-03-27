
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceExternalDiscountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceExternalDiscountSetMessagePayload standalonePriceExternalDiscountSetMessagePayload = StandalonePriceExternalDiscountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceExternalDiscountSetMessagePayloadBuilder
        implements Builder<StandalonePriceExternalDiscountSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceExternalDiscountSetMessagePayloadBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StandalonePriceExternalDiscountSetMessagePayloadBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>The <code>discounted</code> value of the StandalonePrice after the Set Discounted Price update action.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     * builds StandalonePriceExternalDiscountSetMessagePayload with checking for non-null required values
     * @return StandalonePriceExternalDiscountSetMessagePayload
     */
    public StandalonePriceExternalDiscountSetMessagePayload build() {
        return new StandalonePriceExternalDiscountSetMessagePayloadImpl(discounted);
    }

    /**
     * builds StandalonePriceExternalDiscountSetMessagePayload without checking for non-null required values
     * @return StandalonePriceExternalDiscountSetMessagePayload
     */
    public StandalonePriceExternalDiscountSetMessagePayload buildUnchecked() {
        return new StandalonePriceExternalDiscountSetMessagePayloadImpl(discounted);
    }

    /**
     * factory method for an instance of StandalonePriceExternalDiscountSetMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder of() {
        return new StandalonePriceExternalDiscountSetMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceExternalDiscountSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder of(
            final StandalonePriceExternalDiscountSetMessagePayload template) {
        StandalonePriceExternalDiscountSetMessagePayloadBuilder builder = new StandalonePriceExternalDiscountSetMessagePayloadBuilder();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
