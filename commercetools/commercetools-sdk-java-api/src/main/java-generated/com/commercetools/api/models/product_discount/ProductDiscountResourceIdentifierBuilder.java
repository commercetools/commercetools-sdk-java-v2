
package com.commercetools.api.models.product_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountResourceIdentifier productDiscountResourceIdentifier = ProductDiscountResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountResourceIdentifierBuilder implements Builder<ProductDiscountResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     <*  <p>Unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public ProductDiscountResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>User-defined unique identifier of the referenced ProductDiscount. Either <code>id</code> or <code>key</code> is required.</p>>
     */

    public ProductDiscountResourceIdentifierBuilder key(@Nullable final String key) {
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

    public ProductDiscountResourceIdentifier build() {
        return new ProductDiscountResourceIdentifierImpl(id, key);
    }

    /**
     * builds ProductDiscountResourceIdentifier without checking for non null required values
     */
    public ProductDiscountResourceIdentifier buildUnchecked() {
        return new ProductDiscountResourceIdentifierImpl(id, key);
    }

    public static ProductDiscountResourceIdentifierBuilder of() {
        return new ProductDiscountResourceIdentifierBuilder();
    }

    public static ProductDiscountResourceIdentifierBuilder of(final ProductDiscountResourceIdentifier template) {
        ProductDiscountResourceIdentifierBuilder builder = new ProductDiscountResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
