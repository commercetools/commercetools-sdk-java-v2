
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPurchaseOrderNumberChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPurchaseOrderNumberChange setPurchaseOrderNumberChange = SetPurchaseOrderNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPurchaseOrderNumberChangeBuilder implements Builder<SetPurchaseOrderNumberChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetPurchaseOrderNumberChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPurchaseOrderNumberChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPurchaseOrderNumberChangeBuilder nextValue(final String nextValue) {
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
     * builds SetPurchaseOrderNumberChange with checking for non-null required values
     * @return SetPurchaseOrderNumberChange
     */
    public SetPurchaseOrderNumberChange build() {
        Objects.requireNonNull(change, SetPurchaseOrderNumberChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetPurchaseOrderNumberChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPurchaseOrderNumberChange.class + ": nextValue is missing");
        return new SetPurchaseOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetPurchaseOrderNumberChange without checking for non-null required values
     * @return SetPurchaseOrderNumberChange
     */
    public SetPurchaseOrderNumberChange buildUnchecked() {
        return new SetPurchaseOrderNumberChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetPurchaseOrderNumberChangeBuilder
     * @return builder
     */
    public static SetPurchaseOrderNumberChangeBuilder of() {
        return new SetPurchaseOrderNumberChangeBuilder();
    }

    /**
     * create builder for SetPurchaseOrderNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPurchaseOrderNumberChangeBuilder of(final SetPurchaseOrderNumberChange template) {
        SetPurchaseOrderNumberChangeBuilder builder = new SetPurchaseOrderNumberChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
