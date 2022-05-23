
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
     <>
     */

    public PriceKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public PriceKeyReference build() {
        Objects.requireNonNull(key, PriceKeyReference.class + ": key is missing");
        return new PriceKeyReferenceImpl(key);
    }

    /**
     * builds PriceKeyReference without checking for non null required values
     */
    public PriceKeyReference buildUnchecked() {
        return new PriceKeyReferenceImpl(key);
    }

    public static PriceKeyReferenceBuilder of() {
        return new PriceKeyReferenceBuilder();
    }

    public static PriceKeyReferenceBuilder of(final PriceKeyReference template) {
        PriceKeyReferenceBuilder builder = new PriceKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
