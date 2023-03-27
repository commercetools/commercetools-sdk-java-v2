
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreKeyReference storeKeyReference = StoreKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreKeyReferenceBuilder implements Builder<StoreKeyReference> {

    private String key;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public StoreKeyReferenceBuilder key(final String key) {
        this.key = key;
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
     * builds StoreKeyReference with checking for non-null required values
     * @return StoreKeyReference
     */
    public StoreKeyReference build() {
        Objects.requireNonNull(key, StoreKeyReference.class + ": key is missing");
        return new StoreKeyReferenceImpl(key);
    }

    /**
     * builds StoreKeyReference without checking for non-null required values
     * @return StoreKeyReference
     */
    public StoreKeyReference buildUnchecked() {
        return new StoreKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of StoreKeyReferenceBuilder
     * @return builder
     */
    public static StoreKeyReferenceBuilder of() {
        return new StoreKeyReferenceBuilder();
    }

    /**
     * create builder for StoreKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreKeyReferenceBuilder of(final StoreKeyReference template) {
        StoreKeyReferenceBuilder builder = new StoreKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
