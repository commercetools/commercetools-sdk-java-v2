
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeDescriptionChange changeDescriptionChange = ChangeDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeDescriptionChangeBuilder implements Builder<ChangeDescriptionChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeDescription</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeDescriptionChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeDescriptionChangeBuilder nextValue(final String nextValue) {
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
     * builds ChangeDescriptionChange with checking for non-null required values
     * @return ChangeDescriptionChange
     */
    public ChangeDescriptionChange build() {
        Objects.requireNonNull(change, ChangeDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeDescriptionChange.class + ": nextValue is missing");
        return new ChangeDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeDescriptionChange without checking for non-null required values
     * @return ChangeDescriptionChange
     */
    public ChangeDescriptionChange buildUnchecked() {
        return new ChangeDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeDescriptionChangeBuilder of() {
        return new ChangeDescriptionChangeBuilder();
    }

    public static ChangeDescriptionChangeBuilder of(final ChangeDescriptionChange template) {
        ChangeDescriptionChangeBuilder builder = new ChangeDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
