
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CounterDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CounterDraft counterDraft = CounterDraft.builder()
 *             .totalToSkip(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CounterDraftBuilder implements Builder<CounterDraft> {

    private Integer totalToSkip;

    /**
     *  <p>Number of Orders that will be skipped.</p>
     * @param totalToSkip value to be set
     * @return Builder
     */

    public CounterDraftBuilder totalToSkip(final Integer totalToSkip) {
        this.totalToSkip = totalToSkip;
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
     * builds CounterDraft with checking for non-null required values
     * @return CounterDraft
     */
    public CounterDraft build() {
        Objects.requireNonNull(totalToSkip, CounterDraft.class + ": totalToSkip is missing");
        return new CounterDraftImpl(totalToSkip);
    }

    /**
     * builds CounterDraft without checking for non-null required values
     * @return CounterDraft
     */
    public CounterDraft buildUnchecked() {
        return new CounterDraftImpl(totalToSkip);
    }

    /**
     * factory method for an instance of CounterDraftBuilder
     * @return builder
     */
    public static CounterDraftBuilder of() {
        return new CounterDraftBuilder();
    }

    /**
     * create builder for CounterDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CounterDraftBuilder of(final CounterDraft template) {
        CounterDraftBuilder builder = new CounterDraftBuilder();
        builder.totalToSkip = template.getTotalToSkip();
        return builder;
    }

}
