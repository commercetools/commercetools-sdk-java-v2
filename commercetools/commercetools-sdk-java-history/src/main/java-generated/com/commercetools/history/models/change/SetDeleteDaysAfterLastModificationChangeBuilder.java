
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDeleteDaysAfterLastModificationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDeleteDaysAfterLastModificationChange setDeleteDaysAfterLastModificationChange = SetDeleteDaysAfterLastModificationChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeleteDaysAfterLastModificationChangeBuilder
        implements Builder<SetDeleteDaysAfterLastModificationChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetDeleteDaysAfterLastModificationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDeleteDaysAfterLastModificationChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDeleteDaysAfterLastModificationChangeBuilder nextValue(final Integer nextValue) {
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

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetDeleteDaysAfterLastModificationChange with checking for non-null required values
     * @return SetDeleteDaysAfterLastModificationChange
     */
    public SetDeleteDaysAfterLastModificationChange build() {
        Objects.requireNonNull(change, SetDeleteDaysAfterLastModificationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetDeleteDaysAfterLastModificationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeleteDaysAfterLastModificationChange.class + ": nextValue is missing");
        return new SetDeleteDaysAfterLastModificationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDeleteDaysAfterLastModificationChange without checking for non-null required values
     * @return SetDeleteDaysAfterLastModificationChange
     */
    public SetDeleteDaysAfterLastModificationChange buildUnchecked() {
        return new SetDeleteDaysAfterLastModificationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetDeleteDaysAfterLastModificationChangeBuilder
     * @return builder
     */
    public static SetDeleteDaysAfterLastModificationChangeBuilder of() {
        return new SetDeleteDaysAfterLastModificationChangeBuilder();
    }

    /**
     * create builder for SetDeleteDaysAfterLastModificationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDeleteDaysAfterLastModificationChangeBuilder of(
            final SetDeleteDaysAfterLastModificationChange template) {
        SetDeleteDaysAfterLastModificationChangeBuilder builder = new SetDeleteDaysAfterLastModificationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
