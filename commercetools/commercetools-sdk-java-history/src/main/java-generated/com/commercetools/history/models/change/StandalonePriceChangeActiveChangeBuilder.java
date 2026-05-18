
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceChangeActiveChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeActiveChange standalonePriceChangeActiveChange = StandalonePriceChangeActiveChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeActiveChangeBuilder implements Builder<StandalonePriceChangeActiveChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceChangeActiveChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceChangeActiveChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceChangeActiveChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds StandalonePriceChangeActiveChange with checking for non-null required values
     * @return StandalonePriceChangeActiveChange
     */
    public StandalonePriceChangeActiveChange build() {
        Objects.requireNonNull(change, StandalonePriceChangeActiveChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, StandalonePriceChangeActiveChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceChangeActiveChange.class + ": nextValue is missing");
        return new StandalonePriceChangeActiveChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceChangeActiveChange without checking for non-null required values
     * @return StandalonePriceChangeActiveChange
     */
    public StandalonePriceChangeActiveChange buildUnchecked() {
        return new StandalonePriceChangeActiveChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceChangeActiveChangeBuilder
     * @return builder
     */
    public static StandalonePriceChangeActiveChangeBuilder of() {
        return new StandalonePriceChangeActiveChangeBuilder();
    }

    /**
     * create builder for StandalonePriceChangeActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeActiveChangeBuilder of(final StandalonePriceChangeActiveChange template) {
        StandalonePriceChangeActiveChangeBuilder builder = new StandalonePriceChangeActiveChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
