
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectKeyReference customObjectKeyReference = CustomObjectKeyReference.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectKeyReferenceBuilder implements Builder<CustomObjectKeyReference> {

    private String key;

    private String container;

    /**
     *
     */

    public CustomObjectKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *
     */

    public CustomObjectKeyReferenceBuilder container(final String container) {
        this.container = container;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getContainer() {
        return this.container;
    }

    public CustomObjectKeyReference build() {
        Objects.requireNonNull(key, CustomObjectKeyReference.class + ": key is missing");
        Objects.requireNonNull(container, CustomObjectKeyReference.class + ": container is missing");
        return new CustomObjectKeyReferenceImpl(key, container);
    }

    /**
     * builds CustomObjectKeyReference without checking for non null required values
     */
    public CustomObjectKeyReference buildUnchecked() {
        return new CustomObjectKeyReferenceImpl(key, container);
    }

    public static CustomObjectKeyReferenceBuilder of() {
        return new CustomObjectKeyReferenceBuilder();
    }

    public static CustomObjectKeyReferenceBuilder of(final CustomObjectKeyReference template) {
        CustomObjectKeyReferenceBuilder builder = new CustomObjectKeyReferenceBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
