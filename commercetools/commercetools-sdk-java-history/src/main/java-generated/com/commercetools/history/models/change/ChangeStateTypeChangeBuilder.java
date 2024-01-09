
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStateTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStateTypeChange changeStateTypeChange = ChangeStateTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(StateTypeEnum.ORDER_STATE)
 *             .nextValue(StateTypeEnum.ORDER_STATE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeStateTypeChangeBuilder implements Builder<ChangeStateTypeChange> {

    private String change;

    private com.commercetools.history.models.common.StateTypeEnum previousValue;

    private com.commercetools.history.models.common.StateTypeEnum nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeStateTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeStateTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateTypeEnum previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeStateTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.StateTypeEnum nextValue) {
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

    public com.commercetools.history.models.common.StateTypeEnum getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.StateTypeEnum getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeStateTypeChange with checking for non-null required values
     * @return ChangeStateTypeChange
     */
    public ChangeStateTypeChange build() {
        Objects.requireNonNull(change, ChangeStateTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeStateTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeStateTypeChange.class + ": nextValue is missing");
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeStateTypeChange without checking for non-null required values
     * @return ChangeStateTypeChange
     */
    public ChangeStateTypeChange buildUnchecked() {
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeStateTypeChangeBuilder
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder of() {
        return new ChangeStateTypeChangeBuilder();
    }

    /**
     * create builder for ChangeStateTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStateTypeChangeBuilder of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeBuilder builder = new ChangeStateTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
