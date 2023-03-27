
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetRestockableInDaysChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetRestockableInDaysChange setRestockableInDaysChange = SetRestockableInDaysChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetRestockableInDaysChangeBuilder implements Builder<SetRestockableInDaysChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     *  <p>Shape of the action for <code>setRestockableInDays</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetRestockableInDaysChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetRestockableInDaysChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetRestockableInDaysChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setRestockableInDays</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetRestockableInDaysChange with checking for non-null required values
     * @return SetRestockableInDaysChange
     */
    public SetRestockableInDaysChange build() {
        Objects.requireNonNull(change, SetRestockableInDaysChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetRestockableInDaysChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetRestockableInDaysChange.class + ": nextValue is missing");
        return new SetRestockableInDaysChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetRestockableInDaysChange without checking for non-null required values
     * @return SetRestockableInDaysChange
     */
    public SetRestockableInDaysChange buildUnchecked() {
        return new SetRestockableInDaysChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetRestockableInDaysChangeBuilder
     * @return builder
     */
    public static SetRestockableInDaysChangeBuilder of() {
        return new SetRestockableInDaysChangeBuilder();
    }

    /**
     * create builder for SetRestockableInDaysChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetRestockableInDaysChangeBuilder of(final SetRestockableInDaysChange template) {
        SetRestockableInDaysChangeBuilder builder = new SetRestockableInDaysChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
