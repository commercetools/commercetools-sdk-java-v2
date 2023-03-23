
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidFromChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromChange setValidFromChange = SetValidFromChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidFromChangeBuilder implements Builder<SetValidFromChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setValidFrom</code></p>
     * @param change
     * @return Builder
     */

    public SetValidFromChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetValidFromChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetValidFromChangeBuilder nextValue(final String nextValue) {
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

    public SetValidFromChange build() {
        Objects.requireNonNull(change, SetValidFromChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidFromChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidFromChange.class + ": nextValue is missing");
        return new SetValidFromChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidFromChange without checking for non null required values
     */
    public SetValidFromChange buildUnchecked() {
        return new SetValidFromChangeImpl(change, previousValue, nextValue);
    }

    public static SetValidFromChangeBuilder of() {
        return new SetValidFromChangeBuilder();
    }

    public static SetValidFromChangeBuilder of(final SetValidFromChange template) {
        SetValidFromChangeBuilder builder = new SetValidFromChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
