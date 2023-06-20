
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIsActiveChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsActiveChange changeIsActiveChange = ChangeIsActiveChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeIsActiveChangeBuilder implements Builder<ChangeIsActiveChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeIsActiveChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeIsActiveChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeIsActiveChangeBuilder nextValue(final Boolean nextValue) {
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
     * builds ChangeIsActiveChange with checking for non-null required values
     * @return ChangeIsActiveChange
     */
    public ChangeIsActiveChange build() {
        Objects.requireNonNull(change, ChangeIsActiveChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeIsActiveChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeIsActiveChange.class + ": nextValue is missing");
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeIsActiveChange without checking for non-null required values
     * @return ChangeIsActiveChange
     */
    public ChangeIsActiveChange buildUnchecked() {
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeIsActiveChangeBuilder
     * @return builder
     */
    public static ChangeIsActiveChangeBuilder of() {
        return new ChangeIsActiveChangeBuilder();
    }

    /**
     * create builder for ChangeIsActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIsActiveChangeBuilder of(final ChangeIsActiveChange template) {
        ChangeIsActiveChangeBuilder builder = new ChangeIsActiveChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
