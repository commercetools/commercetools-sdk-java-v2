
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDateOfBirthChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDateOfBirthChange setDateOfBirthChange = SetDateOfBirthChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDateOfBirthChangeBuilder implements Builder<SetDateOfBirthChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setDateOfBirth</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetDateOfBirthChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDateOfBirthChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDateOfBirthChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setDateOfBirth</code></p>
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
     * builds SetDateOfBirthChange with checking for non-null required values
     * @return SetDateOfBirthChange
     */
    public SetDateOfBirthChange build() {
        Objects.requireNonNull(change, SetDateOfBirthChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDateOfBirthChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDateOfBirthChange.class + ": nextValue is missing");
        return new SetDateOfBirthChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDateOfBirthChange without checking for non-null required values
     * @return SetDateOfBirthChange
     */
    public SetDateOfBirthChange buildUnchecked() {
        return new SetDateOfBirthChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDateOfBirthChangeBuilder
     * @return builder
     */
    public static SetDateOfBirthChangeBuilder of() {
        return new SetDateOfBirthChangeBuilder();
    }

    /**
     * create builder for SetDateOfBirthChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDateOfBirthChangeBuilder of(final SetDateOfBirthChange template) {
        SetDateOfBirthChangeBuilder builder = new SetDateOfBirthChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
