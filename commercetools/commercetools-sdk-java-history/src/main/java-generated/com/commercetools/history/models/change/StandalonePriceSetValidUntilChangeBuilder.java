
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetValidUntilChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidUntilChange standalonePriceSetValidUntilChange = StandalonePriceSetValidUntilChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidUntilChangeBuilder implements Builder<StandalonePriceSetValidUntilChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceSetValidUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetValidUntilChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetValidUntilChangeBuilder nextValue(final String nextValue) {
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
     * builds StandalonePriceSetValidUntilChange with checking for non-null required values
     * @return StandalonePriceSetValidUntilChange
     */
    public StandalonePriceSetValidUntilChange build() {
        Objects.requireNonNull(change, StandalonePriceSetValidUntilChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, StandalonePriceSetValidUntilChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceSetValidUntilChange.class + ": nextValue is missing");
        return new StandalonePriceSetValidUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceSetValidUntilChange without checking for non-null required values
     * @return StandalonePriceSetValidUntilChange
     */
    public StandalonePriceSetValidUntilChange buildUnchecked() {
        return new StandalonePriceSetValidUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceSetValidUntilChangeBuilder
     * @return builder
     */
    public static StandalonePriceSetValidUntilChangeBuilder of() {
        return new StandalonePriceSetValidUntilChangeBuilder();
    }

    /**
     * create builder for StandalonePriceSetValidUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidUntilChangeBuilder of(final StandalonePriceSetValidUntilChange template) {
        StandalonePriceSetValidUntilChangeBuilder builder = new StandalonePriceSetValidUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
