
package com.commercetools.api.models.product_selection;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionResourceIdentifier productSelectionResourceIdentifier = ProductSelectionResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionResourceIdentifierBuilder implements Builder<ProductSelectionResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductSelectionResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced ProductSelection. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductSelectionResourceIdentifierBuilder key(@Nullable final String key) {
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

    /**
     * builds ProductSelectionResourceIdentifier with checking for non-null required values
     * @return ProductSelectionResourceIdentifier
     */
    public ProductSelectionResourceIdentifier build() {
        return new ProductSelectionResourceIdentifierImpl(id, key);
    }

    /**
     * builds ProductSelectionResourceIdentifier without checking for non-null required values
     * @return ProductSelectionResourceIdentifier
     */
    public ProductSelectionResourceIdentifier buildUnchecked() {
        return new ProductSelectionResourceIdentifierImpl(id, key);
    }

    public static ProductSelectionResourceIdentifierBuilder of() {
        return new ProductSelectionResourceIdentifierBuilder();
    }

    public static ProductSelectionResourceIdentifierBuilder of(final ProductSelectionResourceIdentifier template) {
        ProductSelectionResourceIdentifierBuilder builder = new ProductSelectionResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
