
package com.commercetools.api.models.store;

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
     *  <p>Unique and immutable key of the referenced Store.</p>
     */

    public StoreKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StoreKeyReference build() {
        Objects.requireNonNull(key, StoreKeyReference.class + ": key is missing");
        return new StoreKeyReferenceImpl(key);
    }

    /**
     * builds StoreKeyReference without checking for non null required values
     */
    public StoreKeyReference buildUnchecked() {
        return new StoreKeyReferenceImpl(key);
    }

    public static StoreKeyReferenceBuilder of() {
        return new StoreKeyReferenceBuilder();
    }

    public static StoreKeyReferenceBuilder of(final StoreKeyReference template) {
        StoreKeyReferenceBuilder builder = new StoreKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
