
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryResourceIdentifier taxCategoryResourceIdentifier = TaxCategoryResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryResourceIdentifierBuilder implements Builder<TaxCategoryResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced TaxCategory. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public TaxCategoryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public TaxCategoryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced TaxCategory. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds TaxCategoryResourceIdentifier with checking for non-null required values
     * @return TaxCategoryResourceIdentifier
     */
    public TaxCategoryResourceIdentifier build() {
        return new TaxCategoryResourceIdentifierImpl(id, key);
    }

    /**
     * builds TaxCategoryResourceIdentifier without checking for non-null required values
     * @return TaxCategoryResourceIdentifier
     */
    public TaxCategoryResourceIdentifier buildUnchecked() {
        return new TaxCategoryResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of TaxCategoryResourceIdentifierBuilder
     * @return builder
     */
    public static TaxCategoryResourceIdentifierBuilder of() {
        return new TaxCategoryResourceIdentifierBuilder();
    }

    /**
     * create builder for TaxCategoryResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryResourceIdentifierBuilder of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierBuilder builder = new TaxCategoryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
