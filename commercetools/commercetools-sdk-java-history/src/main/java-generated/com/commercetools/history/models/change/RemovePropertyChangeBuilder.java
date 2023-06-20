
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemovePropertyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePropertyChange removePropertyChange = RemovePropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemovePropertyChangeBuilder implements Builder<RemovePropertyChange> {

    private String change;

    private java.lang.Object previousValue;

    private String path;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemovePropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemovePropertyChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Path to the property that was removed.</p>
     * @param path value to be set
     * @return Builder
     */

    public RemovePropertyChangeBuilder path(final String path) {
        this.path = path;
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Path to the property that was removed.</p>
     * @return path
     */

    public String getPath() {
        return this.path;
    }

    /**
     * builds RemovePropertyChange with checking for non-null required values
     * @return RemovePropertyChange
     */
    public RemovePropertyChange build() {
        Objects.requireNonNull(change, RemovePropertyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemovePropertyChange.class + ": previousValue is missing");
        Objects.requireNonNull(path, RemovePropertyChange.class + ": path is missing");
        return new RemovePropertyChangeImpl(change, previousValue, path);
    }

    /**
     * builds RemovePropertyChange without checking for non-null required values
     * @return RemovePropertyChange
     */
    public RemovePropertyChange buildUnchecked() {
        return new RemovePropertyChangeImpl(change, previousValue, path);
    }

    /**
     * factory method for an instance of RemovePropertyChangeBuilder
     * @return builder
     */
    public static RemovePropertyChangeBuilder of() {
        return new RemovePropertyChangeBuilder();
    }

    /**
     * create builder for RemovePropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePropertyChangeBuilder of(final RemovePropertyChange template) {
        RemovePropertyChangeBuilder builder = new RemovePropertyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.path = template.getPath();
        return builder;
    }

}
