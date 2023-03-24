
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ClassificationShippingRateInputDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInputDraft classificationShippingRateInputDraft = ClassificationShippingRateInputDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ClassificationShippingRateInputDraftBuilder implements Builder<ClassificationShippingRateInputDraft> {

    private String key;

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     * @return Builder
     */

    public ClassificationShippingRateInputDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    /**
     * builds ClassificationShippingRateInputDraft with checking for non-null required values
     * @return ClassificationShippingRateInputDraft
     */
    public ClassificationShippingRateInputDraft build() {
        Objects.requireNonNull(key, ClassificationShippingRateInputDraft.class + ": key is missing");
        return new ClassificationShippingRateInputDraftImpl(key);
    }

    /**
     * builds ClassificationShippingRateInputDraft without checking for non-null required values
     * @return ClassificationShippingRateInputDraft
     */
    public ClassificationShippingRateInputDraft buildUnchecked() {
        return new ClassificationShippingRateInputDraftImpl(key);
    }

    public static ClassificationShippingRateInputDraftBuilder of() {
        return new ClassificationShippingRateInputDraftBuilder();
    }

    public static ClassificationShippingRateInputDraftBuilder of(final ClassificationShippingRateInputDraft template) {
        ClassificationShippingRateInputDraftBuilder builder = new ClassificationShippingRateInputDraftBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
