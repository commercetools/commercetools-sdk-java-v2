
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeKeyChange changeKeyChange = ChangeKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeKeyChangeBuilder implements Builder<ChangeKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeKey</code></p>
     * @param change
     * @return Builder
     */

    public ChangeKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public ChangeKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public ChangeKeyChangeBuilder nextValue(final String nextValue) {
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

    public ChangeKeyChange build() {
        Objects.requireNonNull(change, ChangeKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeKeyChange.class + ": nextValue is missing");
        return new ChangeKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeKeyChange without checking for non null required values
     */
    public ChangeKeyChange buildUnchecked() {
        return new ChangeKeyChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeKeyChangeBuilder of() {
        return new ChangeKeyChangeBuilder();
    }

    public static ChangeKeyChangeBuilder of(final ChangeKeyChange template) {
        ChangeKeyChangeBuilder builder = new ChangeKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
