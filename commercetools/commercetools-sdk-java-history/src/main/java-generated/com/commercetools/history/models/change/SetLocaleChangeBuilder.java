
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLocaleChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLocaleChange setLocaleChange = SetLocaleChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLocaleChangeBuilder implements Builder<SetLocaleChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetLocaleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLocaleChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLocaleChangeBuilder nextValue(final String nextValue) {
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
     * builds SetLocaleChange with checking for non-null required values
     * @return SetLocaleChange
     */
    public SetLocaleChange build() {
        Objects.requireNonNull(change, SetLocaleChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLocaleChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLocaleChange.class + ": nextValue is missing");
        return new SetLocaleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetLocaleChange without checking for non-null required values
     * @return SetLocaleChange
     */
    public SetLocaleChange buildUnchecked() {
        return new SetLocaleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetLocaleChangeBuilder
     * @return builder
     */
    public static SetLocaleChangeBuilder of() {
        return new SetLocaleChangeBuilder();
    }

    /**
     * create builder for SetLocaleChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLocaleChangeBuilder of(final SetLocaleChange template) {
        SetLocaleChangeBuilder builder = new SetLocaleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
