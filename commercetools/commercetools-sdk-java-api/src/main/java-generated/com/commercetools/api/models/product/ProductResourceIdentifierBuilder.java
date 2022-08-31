
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductResourceIdentifier productResourceIdentifier = ProductResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductResourceIdentifierBuilder implements Builder<ProductResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Product.</p>
     */

    public ProductResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Product.</p>
     */

    public ProductResourceIdentifierBuilder key(@Nullable final String key) {
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

    public ProductResourceIdentifier build() {
        return new ProductResourceIdentifierImpl(id, key);
    }

    /**
     * builds ProductResourceIdentifier without checking for non null required values
     */
    public ProductResourceIdentifier buildUnchecked() {
        return new ProductResourceIdentifierImpl(id, key);
    }

    public static ProductResourceIdentifierBuilder of() {
        return new ProductResourceIdentifierBuilder();
    }

    public static ProductResourceIdentifierBuilder of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierBuilder builder = new ProductResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
