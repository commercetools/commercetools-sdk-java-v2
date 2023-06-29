
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStoreModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStoreModeChange setStoreModeChange = SetStoreModeChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitStoreMode.EXPLICIT)
 *             .nextValue(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStoreModeChangeBuilder implements Builder<SetStoreModeChange> {

    private String change;

    private com.commercetools.history.models.common.BusinessUnitStoreMode previousValue;

    private com.commercetools.history.models.common.BusinessUnitStoreMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetStoreModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStoreModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.BusinessUnitStoreMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetStoreModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.BusinessUnitStoreMode nextValue) {
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

    public com.commercetools.history.models.common.BusinessUnitStoreMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.BusinessUnitStoreMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetStoreModeChange with checking for non-null required values
     * @return SetStoreModeChange
     */
    public SetStoreModeChange build() {
        Objects.requireNonNull(change, SetStoreModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStoreModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStoreModeChange.class + ": nextValue is missing");
        return new SetStoreModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStoreModeChange without checking for non-null required values
     * @return SetStoreModeChange
     */
    public SetStoreModeChange buildUnchecked() {
        return new SetStoreModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetStoreModeChangeBuilder
     * @return builder
     */
    public static SetStoreModeChangeBuilder of() {
        return new SetStoreModeChangeBuilder();
    }

    /**
     * create builder for SetStoreModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStoreModeChangeBuilder of(final SetStoreModeChange template) {
        SetStoreModeChangeBuilder builder = new SetStoreModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
