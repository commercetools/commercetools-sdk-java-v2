
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerEmailChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerEmailChange setCustomerEmailChange = SetCustomerEmailChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerEmailChangeBuilder implements Builder<SetCustomerEmailChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomerEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerEmailChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerEmailChangeBuilder nextValue(final String nextValue) {
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
     * builds SetCustomerEmailChange with checking for non-null required values
     * @return SetCustomerEmailChange
     */
    public SetCustomerEmailChange build() {
        Objects.requireNonNull(change, SetCustomerEmailChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerEmailChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerEmailChange.class + ": nextValue is missing");
        return new SetCustomerEmailChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerEmailChange without checking for non-null required values
     * @return SetCustomerEmailChange
     */
    public SetCustomerEmailChange buildUnchecked() {
        return new SetCustomerEmailChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomerEmailChangeBuilder
     * @return builder
     */
    public static SetCustomerEmailChangeBuilder of() {
        return new SetCustomerEmailChangeBuilder();
    }

    /**
     * create builder for SetCustomerEmailChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerEmailChangeBuilder of(final SetCustomerEmailChange template) {
        SetCustomerEmailChangeBuilder builder = new SetCustomerEmailChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
