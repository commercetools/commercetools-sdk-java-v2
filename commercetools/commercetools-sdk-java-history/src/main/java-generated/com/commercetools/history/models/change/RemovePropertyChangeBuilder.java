
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

    private String path;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for <code>removeProperty</code> on custom objects</p>
     * @param change
     * @return Builder
     */

    public RemovePropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value path to the property that was removed</p>
     * @param path
     * @return Builder
     */

    public RemovePropertyChangeBuilder path(final String path) {
        this.path = path;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public RemovePropertyChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPath() {
        return this.path;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public RemovePropertyChange build() {
        Objects.requireNonNull(change, RemovePropertyChange.class + ": change is missing");
        Objects.requireNonNull(path, RemovePropertyChange.class + ": path is missing");
        Objects.requireNonNull(previousValue, RemovePropertyChange.class + ": previousValue is missing");
        return new RemovePropertyChangeImpl(change, path, previousValue);
    }

    /**
     * builds RemovePropertyChange without checking for non null required values
     */
    public RemovePropertyChange buildUnchecked() {
        return new RemovePropertyChangeImpl(change, path, previousValue);
    }

    public static RemovePropertyChangeBuilder of() {
        return new RemovePropertyChangeBuilder();
    }

    public static RemovePropertyChangeBuilder of(final RemovePropertyChange template) {
        RemovePropertyChangeBuilder builder = new RemovePropertyChangeBuilder();
        builder.change = template.getChange();
        builder.path = template.getPath();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
