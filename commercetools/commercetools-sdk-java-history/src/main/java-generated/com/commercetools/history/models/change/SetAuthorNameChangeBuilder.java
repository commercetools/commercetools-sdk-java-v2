
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAuthorNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAuthorNameChange setAuthorNameChange = SetAuthorNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAuthorNameChangeBuilder implements Builder<SetAuthorNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetAuthorNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAuthorNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAuthorNameChangeBuilder nextValue(final String nextValue) {
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
     * builds SetAuthorNameChange with checking for non-null required values
     * @return SetAuthorNameChange
     */
    public SetAuthorNameChange build() {
        Objects.requireNonNull(change, SetAuthorNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAuthorNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAuthorNameChange.class + ": nextValue is missing");
        return new SetAuthorNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetAuthorNameChange without checking for non-null required values
     * @return SetAuthorNameChange
     */
    public SetAuthorNameChange buildUnchecked() {
        return new SetAuthorNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAuthorNameChangeBuilder
     * @return builder
     */
    public static SetAuthorNameChangeBuilder of() {
        return new SetAuthorNameChangeBuilder();
    }

    /**
     * create builder for SetAuthorNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAuthorNameChangeBuilder of(final SetAuthorNameChange template) {
        SetAuthorNameChangeBuilder builder = new SetAuthorNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
