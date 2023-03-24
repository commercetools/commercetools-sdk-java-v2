
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeNameChange changeNameChange = ChangeNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeNameChangeBuilder implements Builder<ChangeNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeNameChangeBuilder nextValue(final String nextValue) {
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
     * builds ChangeNameChange with checking for non-null required values
     * @return ChangeNameChange
     */
    public ChangeNameChange build() {
        Objects.requireNonNull(change, ChangeNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeNameChange.class + ": nextValue is missing");
        return new ChangeNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeNameChange without checking for non-null required values
     * @return ChangeNameChange
     */
    public ChangeNameChange buildUnchecked() {
        return new ChangeNameChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeNameChangeBuilder of() {
        return new ChangeNameChangeBuilder();
    }

    public static ChangeNameChangeBuilder of(final ChangeNameChange template) {
        ChangeNameChangeBuilder builder = new ChangeNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
