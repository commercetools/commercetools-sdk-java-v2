
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ContainerAndKeyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ContainerAndKey containerAndKey = ContainerAndKey.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ContainerAndKeyBuilder implements Builder<ContainerAndKey> {

    private String key;

    private String container;

    /**
     *  <p>User-defined identifier that is unique within the given container.</p>
     */

    public ContainerAndKeyBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Namespace to group Custom Objects.</p>
     */

    public ContainerAndKeyBuilder container(final String container) {
        this.container = container;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getContainer() {
        return this.container;
    }

    public ContainerAndKey build() {
        Objects.requireNonNull(key, ContainerAndKey.class + ": key is missing");
        Objects.requireNonNull(container, ContainerAndKey.class + ": container is missing");
        return new ContainerAndKeyImpl(key, container);
    }

    /**
     * builds ContainerAndKey without checking for non null required values
     */
    public ContainerAndKey buildUnchecked() {
        return new ContainerAndKeyImpl(key, container);
    }

    public static ContainerAndKeyBuilder of() {
        return new ContainerAndKeyBuilder();
    }

    public static ContainerAndKeyBuilder of(final ContainerAndKey template) {
        ContainerAndKeyBuilder builder = new ContainerAndKeyBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
