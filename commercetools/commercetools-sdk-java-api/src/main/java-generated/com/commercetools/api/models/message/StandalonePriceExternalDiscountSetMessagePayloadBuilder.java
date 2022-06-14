
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
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */

    public StandalonePriceExternalDiscountSetMessagePayloadBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */

    public StandalonePriceExternalDiscountSetMessagePayloadBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public StandalonePriceExternalDiscountSetMessagePayload build() {
        return new StandalonePriceExternalDiscountSetMessagePayloadImpl(discounted);
    }

    /**
     * builds StandalonePriceExternalDiscountSetMessagePayload without checking for non null required values
     */
    public StandalonePriceExternalDiscountSetMessagePayload buildUnchecked() {
        return new StandalonePriceExternalDiscountSetMessagePayloadImpl(discounted);
    }

    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder of() {
        return new StandalonePriceExternalDiscountSetMessagePayloadBuilder();
    }

    public static StandalonePriceExternalDiscountSetMessagePayloadBuilder of(
            final StandalonePriceExternalDiscountSetMessagePayload template) {
        StandalonePriceExternalDiscountSetMessagePayloadBuilder builder = new StandalonePriceExternalDiscountSetMessagePayloadBuilder();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
