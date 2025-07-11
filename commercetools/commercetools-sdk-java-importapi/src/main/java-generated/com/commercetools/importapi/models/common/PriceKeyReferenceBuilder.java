
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceKeyReference priceKeyReference = PriceKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceKeyReferenceBuilder implements Builder<PriceKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced Embedded Price.</p>
     * @param key value to be set
     * @return Builder
     */

    public PriceKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Embedded Price.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds PriceKeyReference with checking for non-null required values
     * @return PriceKeyReference
     */
    public PriceKeyReference build() {
        Objects.requireNonNull(key, PriceKeyReference.class + ": key is missing");
        return new PriceKeyReferenceImpl(key);
    }

    /**
     * builds PriceKeyReference without checking for non-null required values
     * @return PriceKeyReference
     */
    public PriceKeyReference buildUnchecked() {
        return new PriceKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of PriceKeyReferenceBuilder
     * @return builder
     */
    public static PriceKeyReferenceBuilder of() {
        return new PriceKeyReferenceBuilder();
    }

    /**
     * create builder for PriceKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceKeyReferenceBuilder of(final PriceKeyReference template) {
        PriceKeyReferenceBuilder builder = new PriceKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
