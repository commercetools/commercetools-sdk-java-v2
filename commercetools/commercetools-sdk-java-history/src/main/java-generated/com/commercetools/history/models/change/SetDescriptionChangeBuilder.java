
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDescriptionChange setDescriptionChange = SetDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDescriptionChangeBuilder implements Builder<SetDescriptionChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setDescription</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetDescriptionChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetDescriptionChangeBuilder nextValue(final String nextValue) {
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
     * builds SetDescriptionChange with checking for non-null required values
     * @return SetDescriptionChange
     */
    public SetDescriptionChange build() {
        Objects.requireNonNull(change, SetDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDescriptionChange.class + ": nextValue is missing");
        return new SetDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDescriptionChange without checking for non-null required values
     * @return SetDescriptionChange
     */
    public SetDescriptionChange buildUnchecked() {
        return new SetDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static SetDescriptionChangeBuilder of() {
        return new SetDescriptionChangeBuilder();
    }

    public static SetDescriptionChangeBuilder of(final SetDescriptionChange template) {
        SetDescriptionChangeBuilder builder = new SetDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
