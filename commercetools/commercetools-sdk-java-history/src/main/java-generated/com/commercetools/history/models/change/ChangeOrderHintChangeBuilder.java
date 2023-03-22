
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeOrderHintChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderHintChange changeOrderHintChange = ChangeOrderHintChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeOrderHintChangeBuilder implements Builder<ChangeOrderHintChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeOrderHint</code></p>
     * @param change
     * @return Builder
     */

    public ChangeOrderHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public ChangeOrderHintChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public ChangeOrderHintChangeBuilder nextValue(final String nextValue) {
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

    public ChangeOrderHintChange build() {
        Objects.requireNonNull(change, ChangeOrderHintChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeOrderHintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeOrderHintChange.class + ": nextValue is missing");
        return new ChangeOrderHintChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeOrderHintChange without checking for non null required values
     */
    public ChangeOrderHintChange buildUnchecked() {
        return new ChangeOrderHintChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeOrderHintChangeBuilder of() {
        return new ChangeOrderHintChangeBuilder();
    }

    public static ChangeOrderHintChangeBuilder of(final ChangeOrderHintChange template) {
        ChangeOrderHintChangeBuilder builder = new ChangeOrderHintChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
