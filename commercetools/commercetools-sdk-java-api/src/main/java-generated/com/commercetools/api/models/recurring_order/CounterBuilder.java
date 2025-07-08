
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CounterBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Counter counter = Counter.builder()
 *             .totalToSkip(1)
 *             .skipped(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CounterBuilder implements Builder<Counter> {

    private Integer totalToSkip;

    private Integer skipped;

    @Nullable
    private java.time.ZonedDateTime lastSkippedAt;

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @param totalToSkip value to be set
     * @return Builder
     */

    public CounterBuilder totalToSkip(final Integer totalToSkip) {
        this.totalToSkip = totalToSkip;
        return this;
    }

    /**
     *  <p>Number of Orders that were already skipped.</p>
     * @param skipped value to be set
     * @return Builder
     */

    public CounterBuilder skipped(final Integer skipped) {
        this.skipped = skipped;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the last Order creation was skipped.</p>
     * @param lastSkippedAt value to be set
     * @return Builder
     */

    public CounterBuilder lastSkippedAt(@Nullable final java.time.ZonedDateTime lastSkippedAt) {
        this.lastSkippedAt = lastSkippedAt;
        return this;
    }

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @return totalToSkip
     */

    public Integer getTotalToSkip() {
        return this.totalToSkip;
    }

    /**
     *  <p>Number of Orders that were already skipped.</p>
     * @return skipped
     */

    public Integer getSkipped() {
        return this.skipped;
    }

    /**
     *  <p>Date and time (UTC) when the last Order creation was skipped.</p>
     * @return lastSkippedAt
     */

    @Nullable
    public java.time.ZonedDateTime getLastSkippedAt() {
        return this.lastSkippedAt;
    }

    /**
     * builds Counter with checking for non-null required values
     * @return Counter
     */
    public Counter build() {
        Objects.requireNonNull(totalToSkip, Counter.class + ": totalToSkip is missing");
        Objects.requireNonNull(skipped, Counter.class + ": skipped is missing");
        return new CounterImpl(totalToSkip, skipped, lastSkippedAt);
    }

    /**
     * builds Counter without checking for non-null required values
     * @return Counter
     */
    public Counter buildUnchecked() {
        return new CounterImpl(totalToSkip, skipped, lastSkippedAt);
    }

    /**
     * factory method for an instance of CounterBuilder
     * @return builder
     */
    public static CounterBuilder of() {
        return new CounterBuilder();
    }

    /**
     * create builder for Counter instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CounterBuilder of(final Counter template) {
        CounterBuilder builder = new CounterBuilder();
        builder.totalToSkip = template.getTotalToSkip();
        builder.skipped = template.getSkipped();
        builder.lastSkippedAt = template.getLastSkippedAt();
        return builder;
    }

}
