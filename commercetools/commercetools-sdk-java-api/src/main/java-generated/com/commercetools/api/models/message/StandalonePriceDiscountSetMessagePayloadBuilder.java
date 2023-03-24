
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceDiscountSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDiscountSetMessagePayload standalonePriceDiscountSetMessagePayload = StandalonePriceDiscountSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDiscountSetMessagePayloadBuilder
        implements Builder<StandalonePriceDiscountSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceDiscountSetMessagePayloadBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StandalonePriceDiscountSetMessagePayloadBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     * builds StandalonePriceDiscountSetMessagePayload with checking for non-null required values
     * @return StandalonePriceDiscountSetMessagePayload
     */
    public StandalonePriceDiscountSetMessagePayload build() {
        return new StandalonePriceDiscountSetMessagePayloadImpl(discounted);
    }

    /**
     * builds StandalonePriceDiscountSetMessagePayload without checking for non-null required values
     * @return StandalonePriceDiscountSetMessagePayload
     */
    public StandalonePriceDiscountSetMessagePayload buildUnchecked() {
        return new StandalonePriceDiscountSetMessagePayloadImpl(discounted);
    }

    public static StandalonePriceDiscountSetMessagePayloadBuilder of() {
        return new StandalonePriceDiscountSetMessagePayloadBuilder();
    }

    public static StandalonePriceDiscountSetMessagePayloadBuilder of(
            final StandalonePriceDiscountSetMessagePayload template) {
        StandalonePriceDiscountSetMessagePayloadBuilder builder = new StandalonePriceDiscountSetMessagePayloadBuilder();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
