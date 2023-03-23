
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
     * @param change
     * @return Builder
     */

    public SetPropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value path to the property that was changed</p>
     * @param path
     * @return Builder
     */

    public SetPropertyChangeBuilder path(final String path) {
        this.path = path;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetPropertyChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetPropertyChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPath() {
        return this.path;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetPropertyChange build() {
        Objects.requireNonNull(change, SetPropertyChange.class + ": change is missing");
        Objects.requireNonNull(path, SetPropertyChange.class + ": path is missing");
        Objects.requireNonNull(nextValue, SetPropertyChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetPropertyChange.class + ": previousValue is missing");
        return new SetPropertyChangeImpl(change, path, nextValue, previousValue);
    }

    /**
     * builds SetPropertyChange without checking for non null required values
     */
    public SetPropertyChange buildUnchecked() {
        return new SetPropertyChangeImpl(change, path, nextValue, previousValue);
    }

    public static SetPropertyChangeBuilder of() {
        return new SetPropertyChangeBuilder();
    }

    public static SetPropertyChangeBuilder of(final SetPropertyChange template) {
        SetPropertyChangeBuilder builder = new SetPropertyChangeBuilder();
        builder.change = template.getChange();
        builder.path = template.getPath();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
