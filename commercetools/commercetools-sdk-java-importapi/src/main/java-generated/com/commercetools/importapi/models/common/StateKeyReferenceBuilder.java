
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateKeyReference stateKeyReference = StateKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateKeyReferenceBuilder implements Builder<StateKeyReference> {

    private String key;

    /**
     *
     * @param key
     * @return Builder
     */

    public StateKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public StateKeyReference build() {
        Objects.requireNonNull(key, StateKeyReference.class + ": key is missing");
        return new StateKeyReferenceImpl(key);
    }

    /**
     * builds StateKeyReference without checking for non null required values
     */
    public StateKeyReference buildUnchecked() {
        return new StateKeyReferenceImpl(key);
    }

    public static StateKeyReferenceBuilder of() {
        return new StateKeyReferenceBuilder();
    }

    public static StateKeyReferenceBuilder of(final StateKeyReference template) {
        StateKeyReferenceBuilder builder = new StateKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
