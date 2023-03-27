
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMaxApplicationsPerCustomerChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxApplicationsPerCustomerChange setMaxApplicationsPerCustomerChange = SetMaxApplicationsPerCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMaxApplicationsPerCustomerChangeBuilder implements Builder<SetMaxApplicationsPerCustomerChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     *  <p>Shape of the action for <code>setMaxApplicationsPerCustomer</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetMaxApplicationsPerCustomerChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMaxApplicationsPerCustomerChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMaxApplicationsPerCustomerChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setMaxApplicationsPerCustomer</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetMaxApplicationsPerCustomerChange with checking for non-null required values
     * @return SetMaxApplicationsPerCustomerChange
     */
    public SetMaxApplicationsPerCustomerChange build() {
        Objects.requireNonNull(change, SetMaxApplicationsPerCustomerChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMaxApplicationsPerCustomerChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMaxApplicationsPerCustomerChange.class + ": nextValue is missing");
        return new SetMaxApplicationsPerCustomerChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMaxApplicationsPerCustomerChange without checking for non-null required values
     * @return SetMaxApplicationsPerCustomerChange
     */
    public SetMaxApplicationsPerCustomerChange buildUnchecked() {
        return new SetMaxApplicationsPerCustomerChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMaxApplicationsPerCustomerChangeBuilder
     * @return builder
     */
    public static SetMaxApplicationsPerCustomerChangeBuilder of() {
        return new SetMaxApplicationsPerCustomerChangeBuilder();
    }

    /**
     * create builder for SetMaxApplicationsPerCustomerChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMaxApplicationsPerCustomerChangeBuilder of(final SetMaxApplicationsPerCustomerChange template) {
        SetMaxApplicationsPerCustomerChangeBuilder builder = new SetMaxApplicationsPerCustomerChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
