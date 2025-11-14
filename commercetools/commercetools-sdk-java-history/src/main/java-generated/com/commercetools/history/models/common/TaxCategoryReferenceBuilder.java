
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReference taxCategoryReference = TaxCategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryReferenceBuilder implements Builder<TaxCategoryReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public TaxCategoryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds TaxCategoryReference with checking for non-null required values
     * @return TaxCategoryReference
     */
    public TaxCategoryReference build() {
        Objects.requireNonNull(id, TaxCategoryReference.class + ": id is missing");
        return new TaxCategoryReferenceImpl(id);
    }

    /**
     * builds TaxCategoryReference without checking for non-null required values
     * @return TaxCategoryReference
     */
    public TaxCategoryReference buildUnchecked() {
        return new TaxCategoryReferenceImpl(id);
    }

    /**
     * factory method for an instance of TaxCategoryReferenceBuilder
     * @return builder
     */
    public static TaxCategoryReferenceBuilder of() {
        return new TaxCategoryReferenceBuilder();
    }

    /**
     * create builder for TaxCategoryReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryReferenceBuilder of(final TaxCategoryReference template) {
        TaxCategoryReferenceBuilder builder = new TaxCategoryReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
