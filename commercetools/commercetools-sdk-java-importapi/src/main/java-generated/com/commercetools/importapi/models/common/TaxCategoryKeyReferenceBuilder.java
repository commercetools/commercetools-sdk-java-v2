
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryKeyReference taxCategoryKeyReference = TaxCategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryKeyReferenceBuilder implements Builder<TaxCategoryKeyReference> {

    private String key;

    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory.</p>
     * @param key value to be set
     * @return Builder
     */

    public TaxCategoryKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds TaxCategoryKeyReference with checking for non-null required values
     * @return TaxCategoryKeyReference
     */
    public TaxCategoryKeyReference build() {
        Objects.requireNonNull(key, TaxCategoryKeyReference.class + ": key is missing");
        return new TaxCategoryKeyReferenceImpl(key);
    }

    /**
     * builds TaxCategoryKeyReference without checking for non-null required values
     * @return TaxCategoryKeyReference
     */
    public TaxCategoryKeyReference buildUnchecked() {
        return new TaxCategoryKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of TaxCategoryKeyReferenceBuilder
     * @return builder
     */
    public static TaxCategoryKeyReferenceBuilder of() {
        return new TaxCategoryKeyReferenceBuilder();
    }

    /**
     * create builder for TaxCategoryKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryKeyReferenceBuilder of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceBuilder builder = new TaxCategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
