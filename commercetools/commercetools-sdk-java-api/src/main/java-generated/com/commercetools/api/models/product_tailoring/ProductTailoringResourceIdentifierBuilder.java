
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringResourceIdentifier productTailoringResourceIdentifier = ProductTailoringResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringResourceIdentifierBuilder implements Builder<ProductTailoringResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public ProductTailoringResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public ProductTailoringResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ProductTailoringResourceIdentifier with checking for non-null required values
     * @return ProductTailoringResourceIdentifier
     */
    public ProductTailoringResourceIdentifier build() {
        return new ProductTailoringResourceIdentifierImpl(id, key);
    }

    /**
     * builds ProductTailoringResourceIdentifier without checking for non-null required values
     * @return ProductTailoringResourceIdentifier
     */
    public ProductTailoringResourceIdentifier buildUnchecked() {
        return new ProductTailoringResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of ProductTailoringResourceIdentifierBuilder
     * @return builder
     */
    public static ProductTailoringResourceIdentifierBuilder of() {
        return new ProductTailoringResourceIdentifierBuilder();
    }

    /**
     * create builder for ProductTailoringResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringResourceIdentifierBuilder of(final ProductTailoringResourceIdentifier template) {
        ProductTailoringResourceIdentifierBuilder builder = new ProductTailoringResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
