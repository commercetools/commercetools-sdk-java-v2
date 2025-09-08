
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Price</a> that was created.</p>
     * @param builder function to build the standalonePrice value
     * @return Builder
     */

    public StandalonePriceCreatedMessagePayloadBuilder standalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.standalonePrice = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Price</a> that was created.</p>
     * @param builder function to build the standalonePrice value
     * @return Builder
     */

    public StandalonePriceCreatedMessagePayloadBuilder withStandalonePrice(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePrice> builder) {
        this.standalonePrice = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Price</a> that was created.</p>
     * @param standalonePrice value to be set
     * @return Builder
     */

    public StandalonePriceCreatedMessagePayloadBuilder standalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice) {
        this.standalonePrice = standalonePrice;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Price</a> that was created.</p>
     * @return standalonePrice
     */

    public com.commercetools.api.models.standalone_price.StandalonePrice getStandalonePrice() {
        return this.standalonePrice;
    }

    /**
     * builds StandalonePriceCreatedMessagePayload with checking for non-null required values
     * @return StandalonePriceCreatedMessagePayload
     */
    public StandalonePriceCreatedMessagePayload build() {
        Objects.requireNonNull(standalonePrice,
            StandalonePriceCreatedMessagePayload.class + ": standalonePrice is missing");
        return new StandalonePriceCreatedMessagePayloadImpl(standalonePrice);
    }

    /**
     * builds StandalonePriceCreatedMessagePayload without checking for non-null required values
     * @return StandalonePriceCreatedMessagePayload
     */
    public StandalonePriceCreatedMessagePayload buildUnchecked() {
        return new StandalonePriceCreatedMessagePayloadImpl(standalonePrice);
    }

    /**
     * factory method for an instance of StandalonePriceCreatedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceCreatedMessagePayloadBuilder of() {
        return new StandalonePriceCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceCreatedMessagePayloadBuilder of(final StandalonePriceCreatedMessagePayload template) {
        StandalonePriceCreatedMessagePayloadBuilder builder = new StandalonePriceCreatedMessagePayloadBuilder();
        builder.standalonePrice = template.getStandalonePrice();
        return builder;
    }

}
