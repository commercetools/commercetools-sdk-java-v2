
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAnonymousIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAnonymousIdChange setAnonymousIdChange = SetAnonymousIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAnonymousIdChangeBuilder implements Builder<SetAnonymousIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setAnonymousId</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetAnonymousIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAnonymousIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAnonymousIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setAnonymousId</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAnonymousIdChange with checking for non-null required values
     * @return SetAnonymousIdChange
     */
    public SetAnonymousIdChange build() {
        Objects.requireNonNull(change, SetAnonymousIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAnonymousIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAnonymousIdChange.class + ": nextValue is missing");
        return new SetAnonymousIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetAnonymousIdChange without checking for non-null required values
     * @return SetAnonymousIdChange
     */
    public SetAnonymousIdChange buildUnchecked() {
        return new SetAnonymousIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAnonymousIdChangeBuilder
     * @return builder
     */
    public static SetAnonymousIdChangeBuilder of() {
        return new SetAnonymousIdChangeBuilder();
    }

    /**
     * create builder for SetAnonymousIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAnonymousIdChangeBuilder of(final SetAnonymousIdChange template) {
        SetAnonymousIdChangeBuilder builder = new SetAnonymousIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
