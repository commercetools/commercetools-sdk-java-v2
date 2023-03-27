
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetIsValidChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetIsValidChange setIsValidChange = SetIsValidChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetIsValidChangeBuilder implements Builder<SetIsValidChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     *  <p>Shape of the action for <code>setIsValid</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetIsValidChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetIsValidChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetIsValidChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setIsValid</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetIsValidChange with checking for non-null required values
     * @return SetIsValidChange
     */
    public SetIsValidChange build() {
        Objects.requireNonNull(change, SetIsValidChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetIsValidChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetIsValidChange.class + ": nextValue is missing");
        return new SetIsValidChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetIsValidChange without checking for non-null required values
     * @return SetIsValidChange
     */
    public SetIsValidChange buildUnchecked() {
        return new SetIsValidChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetIsValidChangeBuilder
     * @return builder
     */
    public static SetIsValidChangeBuilder of() {
        return new SetIsValidChangeBuilder();
    }

    /**
     * create builder for SetIsValidChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetIsValidChangeBuilder of(final SetIsValidChange template) {
        SetIsValidChangeBuilder builder = new SetIsValidChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
