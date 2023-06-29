
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * KeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     KeyReference keyReference = KeyReference.builder()
 *             .key("{key}")
 *             .typeId(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class KeyReferenceBuilder implements Builder<KeyReference> {

    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public KeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     * set the value to the typeId
     * @param typeId value to be set
     * @return Builder
     */

    public KeyReferenceBuilder typeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * value of key}
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * value of typeId}
     * @return typeId
     */

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     * builds KeyReference with checking for non-null required values
     * @return KeyReference
     */
    public KeyReference build() {
        Objects.requireNonNull(key, KeyReference.class + ": key is missing");
        Objects.requireNonNull(typeId, KeyReference.class + ": typeId is missing");
        return new KeyReferenceImpl(key, typeId);
    }

    /**
     * builds KeyReference without checking for non-null required values
     * @return KeyReference
     */
    public KeyReference buildUnchecked() {
        return new KeyReferenceImpl(key, typeId);
    }

    /**
     * factory method for an instance of KeyReferenceBuilder
     * @return builder
     */
    public static KeyReferenceBuilder of() {
        return new KeyReferenceBuilder();
    }

    /**
     * create builder for KeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static KeyReferenceBuilder of(final KeyReference template) {
        KeyReferenceBuilder builder = new KeyReferenceBuilder();
        builder.key = template.getKey();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
