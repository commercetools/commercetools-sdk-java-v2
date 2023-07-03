
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStatusChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStatusChange changeStatusChange = ChangeStatusChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitStatus.ACTIVE)
 *             .nextValue(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeStatusChangeBuilder implements Builder<ChangeStatusChange> {

    private String change;

    private com.commercetools.history.models.common.BusinessUnitStatus previousValue;

    private com.commercetools.history.models.common.BusinessUnitStatus nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeStatusChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeStatusChangeBuilder previousValue(
            final com.commercetools.history.models.common.BusinessUnitStatus previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeStatusChangeBuilder nextValue(
            final com.commercetools.history.models.common.BusinessUnitStatus nextValue) {
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

    public com.commercetools.history.models.common.BusinessUnitStatus getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.BusinessUnitStatus getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeStatusChange with checking for non-null required values
     * @return ChangeStatusChange
     */
    public ChangeStatusChange build() {
        Objects.requireNonNull(change, ChangeStatusChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeStatusChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeStatusChange.class + ": nextValue is missing");
        return new ChangeStatusChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeStatusChange without checking for non-null required values
     * @return ChangeStatusChange
     */
    public ChangeStatusChange buildUnchecked() {
        return new ChangeStatusChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeStatusChangeBuilder
     * @return builder
     */
    public static ChangeStatusChangeBuilder of() {
        return new ChangeStatusChangeBuilder();
    }

    /**
     * create builder for ChangeStatusChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStatusChangeBuilder of(final ChangeStatusChange template) {
        ChangeStatusChangeBuilder builder = new ChangeStatusChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
