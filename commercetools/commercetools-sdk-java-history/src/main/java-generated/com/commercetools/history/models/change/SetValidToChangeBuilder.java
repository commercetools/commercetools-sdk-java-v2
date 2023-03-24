
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidToChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidToChange setValidToChange = SetValidToChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidToChangeBuilder implements Builder<SetValidToChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setValidTo</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetValidToChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetValidToChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetValidToChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetValidToChange with checking for non-null required values
     * @return SetValidToChange
     */
    public SetValidToChange build() {
        Objects.requireNonNull(change, SetValidToChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidToChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidToChange.class + ": nextValue is missing");
        return new SetValidToChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidToChange without checking for non-null required values
     * @return SetValidToChange
     */
    public SetValidToChange buildUnchecked() {
        return new SetValidToChangeImpl(change, previousValue, nextValue);
    }

    public static SetValidToChangeBuilder of() {
        return new SetValidToChangeBuilder();
    }

    public static SetValidToChangeBuilder of(final SetValidToChange template) {
        SetValidToChangeBuilder builder = new SetValidToChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
