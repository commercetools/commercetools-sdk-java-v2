
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMaxCartQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxCartQuantityChange setMaxCartQuantityChange = SetMaxCartQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMaxCartQuantityChangeBuilder implements Builder<SetMaxCartQuantityChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetMaxCartQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMaxCartQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMaxCartQuantityChangeBuilder nextValue(final Integer nextValue) {
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
     * builds SetMaxCartQuantityChange with checking for non-null required values
     * @return SetMaxCartQuantityChange
     */
    public SetMaxCartQuantityChange build() {
        Objects.requireNonNull(change, SetMaxCartQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMaxCartQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMaxCartQuantityChange.class + ": nextValue is missing");
        return new SetMaxCartQuantityChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMaxCartQuantityChange without checking for non-null required values
     * @return SetMaxCartQuantityChange
     */
    public SetMaxCartQuantityChange buildUnchecked() {
        return new SetMaxCartQuantityChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMaxCartQuantityChangeBuilder
     * @return builder
     */
    public static SetMaxCartQuantityChangeBuilder of() {
        return new SetMaxCartQuantityChangeBuilder();
    }

    /**
     * create builder for SetMaxCartQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMaxCartQuantityChangeBuilder of(final SetMaxCartQuantityChange template) {
        SetMaxCartQuantityChangeBuilder builder = new SetMaxCartQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
