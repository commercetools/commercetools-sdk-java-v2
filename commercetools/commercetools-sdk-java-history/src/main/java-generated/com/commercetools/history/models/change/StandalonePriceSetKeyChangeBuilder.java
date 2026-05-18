
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetKeyChange standalonePriceSetKeyChange = StandalonePriceSetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetKeyChangeBuilder implements Builder<StandalonePriceSetKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public StandalonePriceSetKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public StandalonePriceSetKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public StandalonePriceSetKeyChangeBuilder nextValue(final String nextValue) {
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
     * builds StandalonePriceSetKeyChange with checking for non-null required values
     * @return StandalonePriceSetKeyChange
     */
    public StandalonePriceSetKeyChange build() {
        Objects.requireNonNull(change, StandalonePriceSetKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, StandalonePriceSetKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, StandalonePriceSetKeyChange.class + ": nextValue is missing");
        return new StandalonePriceSetKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds StandalonePriceSetKeyChange without checking for non-null required values
     * @return StandalonePriceSetKeyChange
     */
    public StandalonePriceSetKeyChange buildUnchecked() {
        return new StandalonePriceSetKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of StandalonePriceSetKeyChangeBuilder
     * @return builder
     */
    public static StandalonePriceSetKeyChangeBuilder of() {
        return new StandalonePriceSetKeyChangeBuilder();
    }

    /**
     * create builder for StandalonePriceSetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetKeyChangeBuilder of(final StandalonePriceSetKeyChange template) {
        StandalonePriceSetKeyChangeBuilder builder = new StandalonePriceSetKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
