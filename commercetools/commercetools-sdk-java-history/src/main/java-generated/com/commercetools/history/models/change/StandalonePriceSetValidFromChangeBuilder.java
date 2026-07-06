
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetValidFromChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromChange standalonePriceSetValidFromChange = StandalonePriceSetValidFromChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidFromChangeBuilder implements Builder<StandalonePriceSetValidFromChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetValidFromChangeBuilder nextValue(final String nextValue) {
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds StandalonePriceSetValidFromChange with checking for non-null required values
     * @return StandalonePriceSetValidFromChange
     */
    public StandalonePriceSetValidFromChange build() {
        Objects.requireNonNull(change, StandalonePriceSetValidFromChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, StandalonePriceSetValidFromChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceSetValidFromChange.class + ": nextValue is missing");
        return new StandalonePriceSetValidFromChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceSetValidFromChange without checking for non-null required values
     * @return StandalonePriceSetValidFromChange
     */
    public StandalonePriceSetValidFromChange buildUnchecked() {
        return new StandalonePriceSetValidFromChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceSetValidFromChangeBuilder
     * @return builder
     */
    public static StandalonePriceSetValidFromChangeBuilder of() {
        return new StandalonePriceSetValidFromChangeBuilder();
    }

    /**
     * create builder for StandalonePriceSetValidFromChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromChangeBuilder of(final StandalonePriceSetValidFromChange template) {
        StandalonePriceSetValidFromChangeBuilder builder = new StandalonePriceSetValidFromChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
