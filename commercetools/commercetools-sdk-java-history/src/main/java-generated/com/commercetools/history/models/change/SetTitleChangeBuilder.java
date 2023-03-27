
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTitleChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTitleChange setTitleChange = SetTitleChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTitleChangeBuilder implements Builder<SetTitleChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setTitle</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetTitleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTitleChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTitleChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setTitle</code></p>
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
     * builds SetTitleChange with checking for non-null required values
     * @return SetTitleChange
     */
    public SetTitleChange build() {
        Objects.requireNonNull(change, SetTitleChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTitleChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTitleChange.class + ": nextValue is missing");
        return new SetTitleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTitleChange without checking for non-null required values
     * @return SetTitleChange
     */
    public SetTitleChange buildUnchecked() {
        return new SetTitleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTitleChangeBuilder
     * @return builder
     */
    public static SetTitleChangeBuilder of() {
        return new SetTitleChangeBuilder();
    }

    /**
     * create builder for SetTitleChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTitleChangeBuilder of(final SetTitleChange template) {
        SetTitleChangeBuilder builder = new SetTitleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
