
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetContactEmailChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetContactEmailChange setContactEmailChange = SetContactEmailChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetContactEmailChangeBuilder implements Builder<SetContactEmailChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetContactEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetContactEmailChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetContactEmailChangeBuilder nextValue(final String nextValue) {
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
     * builds SetContactEmailChange with checking for non-null required values
     * @return SetContactEmailChange
     */
    public SetContactEmailChange build() {
        Objects.requireNonNull(change, SetContactEmailChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetContactEmailChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetContactEmailChange.class + ": nextValue is missing");
        return new SetContactEmailChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetContactEmailChange without checking for non-null required values
     * @return SetContactEmailChange
     */
    public SetContactEmailChange buildUnchecked() {
        return new SetContactEmailChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetContactEmailChangeBuilder
     * @return builder
     */
    public static SetContactEmailChangeBuilder of() {
        return new SetContactEmailChangeBuilder();
    }

    /**
     * create builder for SetContactEmailChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetContactEmailChangeBuilder of(final SetContactEmailChange template) {
        SetContactEmailChangeBuilder builder = new SetContactEmailChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
