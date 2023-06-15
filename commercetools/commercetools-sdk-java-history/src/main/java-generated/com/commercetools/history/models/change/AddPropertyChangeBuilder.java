
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPropertyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPropertyChange addPropertyChange = AddPropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPropertyChangeBuilder implements Builder<AddPropertyChange> {

    private String change;

    private java.lang.Object nextValue;

    private String path;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddPropertyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddPropertyChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Path to the new property that was added.</p>
     * @param path value to be set
     * @return Builder
     */

    public AddPropertyChangeBuilder path(final String path) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Path to the new property that was added.</p>
     * @return path
     */

    public String getPath() {
        return this.path;
    }

    /**
     * builds AddPropertyChange with checking for non-null required values
     * @return AddPropertyChange
     */
    public AddPropertyChange build() {
        Objects.requireNonNull(change, AddPropertyChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddPropertyChange.class + ": nextValue is missing");
        Objects.requireNonNull(path, AddPropertyChange.class + ": path is missing");
        return new AddPropertyChangeImpl(change, nextValue, path);
    }

    /**
     * builds AddPropertyChange without checking for non-null required values
     * @return AddPropertyChange
     */
    public AddPropertyChange buildUnchecked() {
        return new AddPropertyChangeImpl(change, nextValue, path);
    }

    /**
     * factory method for an instance of AddPropertyChangeBuilder
     * @return builder
     */
    public static AddPropertyChangeBuilder of() {
        return new AddPropertyChangeBuilder();
    }

    /**
     * create builder for AddPropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPropertyChangeBuilder of(final AddPropertyChange template) {
        AddPropertyChangeBuilder builder = new AddPropertyChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.path = template.getPath();
        return builder;
    }

}
