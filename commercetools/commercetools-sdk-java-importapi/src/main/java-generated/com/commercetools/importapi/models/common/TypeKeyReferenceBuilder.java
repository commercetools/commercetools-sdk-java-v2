
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeKeyReference typeKeyReference = TypeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeKeyReferenceBuilder implements Builder<TypeKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced Type.</p>
     * @param key value to be set
     * @return Builder
     */

    public TypeKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Type.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds TypeKeyReference with checking for non-null required values
     * @return TypeKeyReference
     */
    public TypeKeyReference build() {
        Objects.requireNonNull(key, TypeKeyReference.class + ": key is missing");
        return new TypeKeyReferenceImpl(key);
    }

    /**
     * builds TypeKeyReference without checking for non-null required values
     * @return TypeKeyReference
     */
    public TypeKeyReference buildUnchecked() {
        return new TypeKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of TypeKeyReferenceBuilder
     * @return builder
     */
    public static TypeKeyReferenceBuilder of() {
        return new TypeKeyReferenceBuilder();
    }

    /**
     * create builder for TypeKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeKeyReferenceBuilder of(final TypeKeyReference template) {
        TypeKeyReferenceBuilder builder = new TypeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
