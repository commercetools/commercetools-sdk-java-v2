
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPropertyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPropertyChange setPropertyChange = SetPropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPropertyChangeBuilder implements Builder<SetPropertyChange> {

    private String change;

    private String path;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for <code>setProperty</code> on custom objects</p>
     * @param change value to be set
     * @return Builder
     */

    public SetPropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value path to the property that was changed</p>
     * @param path value to be set
     * @return Builder
     */

    public SetPropertyChangeBuilder path(final String path) {
        this.path = path;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPropertyChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPropertyChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setProperty</code> on custom objects</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value path to the property that was changed</p>
     * @return path
     */

    public String getPath() {
        return this.path;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetPropertyChange with checking for non-null required values
     * @return SetPropertyChange
     */
    public SetPropertyChange build() {
        Objects.requireNonNull(change, SetPropertyChange.class + ": change is missing");
        Objects.requireNonNull(path, SetPropertyChange.class + ": path is missing");
        Objects.requireNonNull(nextValue, SetPropertyChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetPropertyChange.class + ": previousValue is missing");
        return new SetPropertyChangeImpl(change, path, nextValue, previousValue);
    }

    /**
     * builds SetPropertyChange without checking for non-null required values
     * @return SetPropertyChange
     */
    public SetPropertyChange buildUnchecked() {
        return new SetPropertyChangeImpl(change, path, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetPropertyChangeBuilder
     * @return builder
     */
    public static SetPropertyChangeBuilder of() {
        return new SetPropertyChangeBuilder();
    }

    /**
     * create builder for SetPropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPropertyChangeBuilder of(final SetPropertyChange template) {
        SetPropertyChangeBuilder builder = new SetPropertyChangeBuilder();
        builder.change = template.getChange();
        builder.path = template.getPath();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
