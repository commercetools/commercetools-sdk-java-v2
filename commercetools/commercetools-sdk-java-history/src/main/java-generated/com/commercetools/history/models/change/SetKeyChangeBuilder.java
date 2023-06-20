
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetKeyChange setKeyChange = SetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetKeyChangeBuilder implements Builder<SetKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetKeyChangeBuilder nextValue(final String nextValue) {
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
     * builds SetKeyChange with checking for non-null required values
     * @return SetKeyChange
     */
    public SetKeyChange build() {
        Objects.requireNonNull(change, SetKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetKeyChange.class + ": nextValue is missing");
        return new SetKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetKeyChange without checking for non-null required values
     * @return SetKeyChange
     */
    public SetKeyChange buildUnchecked() {
        return new SetKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetKeyChangeBuilder
     * @return builder
     */
    public static SetKeyChangeBuilder of() {
        return new SetKeyChangeBuilder();
    }

    /**
     * create builder for SetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetKeyChangeBuilder of(final SetKeyChange template) {
        SetKeyChangeBuilder builder = new SetKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
