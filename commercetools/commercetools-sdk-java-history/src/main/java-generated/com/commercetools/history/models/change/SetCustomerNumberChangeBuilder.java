
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerNumberChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerNumberChange setCustomerNumberChange = SetCustomerNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerNumberChangeBuilder implements Builder<SetCustomerNumberChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomerNumberChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerNumberChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerNumberChangeBuilder nextValue(final String nextValue) {
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
     * builds SetCustomerNumberChange with checking for non-null required values
     * @return SetCustomerNumberChange
     */
    public SetCustomerNumberChange build() {
        Objects.requireNonNull(change, SetCustomerNumberChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerNumberChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerNumberChange.class + ": nextValue is missing");
        return new SetCustomerNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerNumberChange without checking for non-null required values
     * @return SetCustomerNumberChange
     */
    public SetCustomerNumberChange buildUnchecked() {
        return new SetCustomerNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomerNumberChangeBuilder
     * @return builder
     */
    public static SetCustomerNumberChangeBuilder of() {
        return new SetCustomerNumberChangeBuilder();
    }

    /**
     * create builder for SetCustomerNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerNumberChangeBuilder of(final SetCustomerNumberChange template) {
        SetCustomerNumberChangeBuilder builder = new SetCustomerNumberChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
