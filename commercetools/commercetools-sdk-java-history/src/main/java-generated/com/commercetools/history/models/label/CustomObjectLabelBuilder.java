
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectLabel customObjectLabel = CustomObjectLabel.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectLabelBuilder implements Builder<CustomObjectLabel> {

    private String key;

    private String container;

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomObjectLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Namespace to group Custom Objects.</p>
     * @param container value to be set
     * @return Builder
     */

    public CustomObjectLabelBuilder container(final String container) {
        this.container = container;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Namespace to group Custom Objects.</p>
     * @return container
     */

    public String getContainer() {
        return this.container;
    }

    /**
     * builds CustomObjectLabel with checking for non-null required values
     * @return CustomObjectLabel
     */
    public CustomObjectLabel build() {
        Objects.requireNonNull(key, CustomObjectLabel.class + ": key is missing");
        Objects.requireNonNull(container, CustomObjectLabel.class + ": container is missing");
        return new CustomObjectLabelImpl(key, container);
    }

    /**
     * builds CustomObjectLabel without checking for non-null required values
     * @return CustomObjectLabel
     */
    public CustomObjectLabel buildUnchecked() {
        return new CustomObjectLabelImpl(key, container);
    }

    /**
     * factory method for an instance of CustomObjectLabelBuilder
     * @return builder
     */
    public static CustomObjectLabelBuilder of() {
        return new CustomObjectLabelBuilder();
    }

    /**
     * create builder for CustomObjectLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectLabelBuilder of(final CustomObjectLabel template) {
        CustomObjectLabelBuilder builder = new CustomObjectLabelBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
