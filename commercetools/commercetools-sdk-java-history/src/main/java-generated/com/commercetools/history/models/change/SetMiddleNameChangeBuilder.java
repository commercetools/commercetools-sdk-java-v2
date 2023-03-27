
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMiddleNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMiddleNameChange setMiddleNameChange = SetMiddleNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMiddleNameChangeBuilder implements Builder<SetMiddleNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setMiddleName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetMiddleNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMiddleNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMiddleNameChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setMiddleName</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetMiddleNameChange with checking for non-null required values
     * @return SetMiddleNameChange
     */
    public SetMiddleNameChange build() {
        Objects.requireNonNull(change, SetMiddleNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMiddleNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMiddleNameChange.class + ": nextValue is missing");
        return new SetMiddleNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMiddleNameChange without checking for non-null required values
     * @return SetMiddleNameChange
     */
    public SetMiddleNameChange buildUnchecked() {
        return new SetMiddleNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMiddleNameChangeBuilder
     * @return builder
     */
    public static SetMiddleNameChangeBuilder of() {
        return new SetMiddleNameChangeBuilder();
    }

    /**
     * create builder for SetMiddleNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMiddleNameChangeBuilder of(final SetMiddleNameChange template) {
        SetMiddleNameChangeBuilder builder = new SetMiddleNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
