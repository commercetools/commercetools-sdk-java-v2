
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeBuyerAssignableChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeBuyerAssignableChange changeBuyerAssignableChange = ChangeBuyerAssignableChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeBuyerAssignableChangeBuilder implements Builder<ChangeBuyerAssignableChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeBuyerAssignableChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeBuyerAssignableChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeBuyerAssignableChangeBuilder nextValue(final Boolean nextValue) {
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

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeBuyerAssignableChange with checking for non-null required values
     * @return ChangeBuyerAssignableChange
     */
    public ChangeBuyerAssignableChange build() {
        Objects.requireNonNull(change, ChangeBuyerAssignableChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeBuyerAssignableChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeBuyerAssignableChange.class + ": nextValue is missing");
        return new ChangeBuyerAssignableChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeBuyerAssignableChange without checking for non-null required values
     * @return ChangeBuyerAssignableChange
     */
    public ChangeBuyerAssignableChange buildUnchecked() {
        return new ChangeBuyerAssignableChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeBuyerAssignableChangeBuilder
     * @return builder
     */
    public static ChangeBuyerAssignableChangeBuilder of() {
        return new ChangeBuyerAssignableChangeBuilder();
    }

    /**
     * create builder for ChangeBuyerAssignableChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeBuyerAssignableChangeBuilder of(final ChangeBuyerAssignableChange template) {
        ChangeBuyerAssignableChangeBuilder builder = new ChangeBuyerAssignableChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
