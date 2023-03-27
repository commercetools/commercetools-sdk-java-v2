
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLastNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLastNameChange setLastNameChange = SetLastNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLastNameChangeBuilder implements Builder<SetLastNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setLastName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLastNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLastNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLastNameChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setLastName</code></p>
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
     * builds SetLastNameChange with checking for non-null required values
     * @return SetLastNameChange
     */
    public SetLastNameChange build() {
        Objects.requireNonNull(change, SetLastNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLastNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLastNameChange.class + ": nextValue is missing");
        return new SetLastNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetLastNameChange without checking for non-null required values
     * @return SetLastNameChange
     */
    public SetLastNameChange buildUnchecked() {
        return new SetLastNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetLastNameChangeBuilder
     * @return builder
     */
    public static SetLastNameChangeBuilder of() {
        return new SetLastNameChangeBuilder();
    }

    /**
     * create builder for SetLastNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLastNameChangeBuilder of(final SetLastNameChange template) {
        SetLastNameChangeBuilder builder = new SetLastNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
