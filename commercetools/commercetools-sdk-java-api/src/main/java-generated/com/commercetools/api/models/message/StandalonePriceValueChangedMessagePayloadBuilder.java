
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValueChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValueChangedMessagePayload standalonePriceValueChangedMessagePayload = StandalonePriceValueChangedMessagePayload.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValueChangedMessagePayloadBuilder
        implements Builder<StandalonePriceValueChangedMessagePayload> {

    private com.commercetools.api.models.common.TypedMoney value;

    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney oldValue;

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder value(
            final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @param staged value to be set
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @param oldValue value to be set
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder oldValue(
            @Nullable final com.commercetools.api.models.common.TypedMoney oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @param builder function to build the oldValue value
     * @return Builder
     */

    public StandalonePriceValueChangedMessagePayloadBuilder oldValue(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.oldValue = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @return staged
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @return oldValue
     */

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getOldValue() {
        return this.oldValue;
    }

    /**
     * builds StandalonePriceValueChangedMessagePayload with checking for non-null required values
     * @return StandalonePriceValueChangedMessagePayload
     */
    public StandalonePriceValueChangedMessagePayload build() {
        Objects.requireNonNull(value, StandalonePriceValueChangedMessagePayload.class + ": value is missing");
        Objects.requireNonNull(staged, StandalonePriceValueChangedMessagePayload.class + ": staged is missing");
        return new StandalonePriceValueChangedMessagePayloadImpl(value, staged, oldValue);
    }

    /**
     * builds StandalonePriceValueChangedMessagePayload without checking for non-null required values
     * @return StandalonePriceValueChangedMessagePayload
     */
    public StandalonePriceValueChangedMessagePayload buildUnchecked() {
        return new StandalonePriceValueChangedMessagePayloadImpl(value, staged, oldValue);
    }

    /**
     * factory method for an instance of StandalonePriceValueChangedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceValueChangedMessagePayloadBuilder of() {
        return new StandalonePriceValueChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceValueChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValueChangedMessagePayloadBuilder of(
            final StandalonePriceValueChangedMessagePayload template) {
        StandalonePriceValueChangedMessagePayloadBuilder builder = new StandalonePriceValueChangedMessagePayloadBuilder();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
