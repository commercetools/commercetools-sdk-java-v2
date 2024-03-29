
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMethodInfoMethodChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoMethodChange setMethodInfoMethodChange = SetMethodInfoMethodChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMethodInfoMethodChangeBuilder implements Builder<SetMethodInfoMethodChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetMethodInfoMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMethodInfoMethodChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMethodInfoMethodChangeBuilder nextValue(final String nextValue) {
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
     * builds SetMethodInfoMethodChange with checking for non-null required values
     * @return SetMethodInfoMethodChange
     */
    public SetMethodInfoMethodChange build() {
        Objects.requireNonNull(change, SetMethodInfoMethodChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMethodInfoMethodChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMethodInfoMethodChange.class + ": nextValue is missing");
        return new SetMethodInfoMethodChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMethodInfoMethodChange without checking for non-null required values
     * @return SetMethodInfoMethodChange
     */
    public SetMethodInfoMethodChange buildUnchecked() {
        return new SetMethodInfoMethodChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMethodInfoMethodChangeBuilder
     * @return builder
     */
    public static SetMethodInfoMethodChangeBuilder of() {
        return new SetMethodInfoMethodChangeBuilder();
    }

    /**
     * create builder for SetMethodInfoMethodChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoMethodChangeBuilder of(final SetMethodInfoMethodChange template) {
        SetMethodInfoMethodChangeBuilder builder = new SetMethodInfoMethodChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
