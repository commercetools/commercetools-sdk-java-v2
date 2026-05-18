
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMinCartQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMinCartQuantityChange setMinCartQuantityChange = SetMinCartQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMinCartQuantityChangeBuilder implements Builder<SetMinCartQuantityChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetMinCartQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMinCartQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMinCartQuantityChangeBuilder nextValue(final Integer nextValue) {
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
     * builds SetMinCartQuantityChange with checking for non-null required values
     * @return SetMinCartQuantityChange
     */
    public SetMinCartQuantityChange build() {
        Objects.requireNonNull(change, SetMinCartQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMinCartQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMinCartQuantityChange.class + ": nextValue is missing");
        return new SetMinCartQuantityChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMinCartQuantityChange without checking for non-null required values
     * @return SetMinCartQuantityChange
     */
    public SetMinCartQuantityChange buildUnchecked() {
        return new SetMinCartQuantityChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetMinCartQuantityChangeBuilder
     * @return builder
     */
    public static SetMinCartQuantityChangeBuilder of() {
        return new SetMinCartQuantityChangeBuilder();
    }

    /**
     * create builder for SetMinCartQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMinCartQuantityChangeBuilder of(final SetMinCartQuantityChange template) {
        SetMinCartQuantityChangeBuilder builder = new SetMinCartQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
