
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVatIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVatIdChange setVatIdChange = SetVatIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetVatIdChangeBuilder implements Builder<SetVatIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetVatIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetVatIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetVatIdChangeBuilder nextValue(final String nextValue) {
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
     * builds SetVatIdChange with checking for non-null required values
     * @return SetVatIdChange
     */
    public SetVatIdChange build() {
        Objects.requireNonNull(change, SetVatIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetVatIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVatIdChange.class + ": nextValue is missing");
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetVatIdChange without checking for non-null required values
     * @return SetVatIdChange
     */
    public SetVatIdChange buildUnchecked() {
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetVatIdChangeBuilder
     * @return builder
     */
    public static SetVatIdChangeBuilder of() {
        return new SetVatIdChangeBuilder();
    }

    /**
     * create builder for SetVatIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVatIdChangeBuilder of(final SetVatIdChange template) {
        SetVatIdChangeBuilder builder = new SetVatIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
