
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
     <*  <p>Unique identifier of the referenced TaxCategory. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public TaxCategoryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the referenced TaxCategory. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public TaxCategoryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public TaxCategoryResourceIdentifier build() {
        return new TaxCategoryResourceIdentifierImpl(id, key);
    }

    /**
     * builds TaxCategoryResourceIdentifier without checking for non null required values
     */
    public TaxCategoryResourceIdentifier buildUnchecked() {
        return new TaxCategoryResourceIdentifierImpl(id, key);
    }

    public static TaxCategoryResourceIdentifierBuilder of() {
        return new TaxCategoryResourceIdentifierBuilder();
    }

    public static TaxCategoryResourceIdentifierBuilder of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierBuilder builder = new TaxCategoryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
