
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductCountChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductCountChange setProductCountChange = SetProductCountChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductCountChangeBuilder implements Builder<SetProductCountChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetProductCountChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductCountChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductCountChangeBuilder nextValue(final Integer nextValue) {
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
     * builds SetProductCountChange with checking for non-null required values
     * @return SetProductCountChange
     */
    public SetProductCountChange build() {
        Objects.requireNonNull(change, SetProductCountChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetProductCountChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductCountChange.class + ": nextValue is missing");
        return new SetProductCountChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetProductCountChange without checking for non-null required values
     * @return SetProductCountChange
     */
    public SetProductCountChange buildUnchecked() {
        return new SetProductCountChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetProductCountChangeBuilder
     * @return builder
     */
    public static SetProductCountChangeBuilder of() {
        return new SetProductCountChangeBuilder();
    }

    /**
     * create builder for SetProductCountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductCountChangeBuilder of(final SetProductCountChange template) {
        SetProductCountChangeBuilder builder = new SetProductCountChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
