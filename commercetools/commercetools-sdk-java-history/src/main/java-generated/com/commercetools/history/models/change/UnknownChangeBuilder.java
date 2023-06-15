
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnknownChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnknownChange unknownChange = UnknownChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnknownChangeBuilder implements Builder<UnknownChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     *  <p>Identifier for the type of modification.</p>
     * @param change value to be set
     * @return Builder
     */

    public UnknownChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public UnknownChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public UnknownChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Identifier for the type of modification.</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * builds UnknownChange with checking for non-null required values
     * @return UnknownChange
     */
    public UnknownChange build() {
        Objects.requireNonNull(change, UnknownChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, UnknownChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, UnknownChange.class + ": nextValue is missing");
        return new UnknownChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds UnknownChange without checking for non-null required values
     * @return UnknownChange
     */
    public UnknownChange buildUnchecked() {
        return new UnknownChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of UnknownChangeBuilder
     * @return builder
     */
    public static UnknownChangeBuilder of() {
        return new UnknownChangeBuilder();
    }

    /**
     * create builder for UnknownChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnknownChangeBuilder of(final UnknownChange template) {
        UnknownChangeBuilder builder = new UnknownChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
