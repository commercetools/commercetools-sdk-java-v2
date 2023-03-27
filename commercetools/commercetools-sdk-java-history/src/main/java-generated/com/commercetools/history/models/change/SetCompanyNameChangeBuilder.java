
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCompanyNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCompanyNameChange setCompanyNameChange = SetCompanyNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCompanyNameChangeBuilder implements Builder<SetCompanyNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setCompanyName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetCompanyNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCompanyNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCompanyNameChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setCompanyName</code></p>
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
     * builds SetCompanyNameChange with checking for non-null required values
     * @return SetCompanyNameChange
     */
    public SetCompanyNameChange build() {
        Objects.requireNonNull(change, SetCompanyNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCompanyNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCompanyNameChange.class + ": nextValue is missing");
        return new SetCompanyNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCompanyNameChange without checking for non-null required values
     * @return SetCompanyNameChange
     */
    public SetCompanyNameChange buildUnchecked() {
        return new SetCompanyNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCompanyNameChangeBuilder
     * @return builder
     */
    public static SetCompanyNameChangeBuilder of() {
        return new SetCompanyNameChangeBuilder();
    }

    /**
     * create builder for SetCompanyNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCompanyNameChangeBuilder of(final SetCompanyNameChange template) {
        SetCompanyNameChangeBuilder builder = new SetCompanyNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
