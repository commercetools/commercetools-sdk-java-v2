
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceCreatedMessagePayload standalonePriceCreatedMessagePayload = StandalonePriceCreatedMessagePayload.builder()
 *             .standalonePrice(standalonePriceBuilder -> standalonePriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceCreatedMessagePayloadBuilder implements Builder<StandalonePriceCreatedMessagePayload> {

    private com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice;

    /**
     *  <p>The Standalone Price as it was created.</p>
     */

    public StandalonePriceCreatedMessagePayloadBuilder standalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.standalonePrice = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Standalone Price as it was created.</p>
     */

    public StandalonePriceCreatedMessagePayloadBuilder standalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice) {
        this.standalonePrice = standalonePrice;
        return this;
    }

    public com.commercetools.api.models.standalone_price.StandalonePrice getStandalonePrice() {
        return this.standalonePrice;
    }

    public StandalonePriceCreatedMessagePayload build() {
        Objects.requireNonNull(standalonePrice,
            StandalonePriceCreatedMessagePayload.class + ": standalonePrice is missing");
        return new StandalonePriceCreatedMessagePayloadImpl(standalonePrice);
    }

    /**
     * builds StandalonePriceCreatedMessagePayload without checking for non null required values
     */
    public StandalonePriceCreatedMessagePayload buildUnchecked() {
        return new StandalonePriceCreatedMessagePayloadImpl(standalonePrice);
    }

    public static StandalonePriceCreatedMessagePayloadBuilder of() {
        return new StandalonePriceCreatedMessagePayloadBuilder();
    }

    public static StandalonePriceCreatedMessagePayloadBuilder of(final StandalonePriceCreatedMessagePayload template) {
        StandalonePriceCreatedMessagePayloadBuilder builder = new StandalonePriceCreatedMessagePayloadBuilder();
        builder.standalonePrice = template.getStandalonePrice();
        return builder;
    }

}
