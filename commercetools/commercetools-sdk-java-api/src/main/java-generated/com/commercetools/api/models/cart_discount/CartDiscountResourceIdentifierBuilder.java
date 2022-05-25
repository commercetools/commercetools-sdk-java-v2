
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountResourceIdentifier cartDiscountResourceIdentifier = CartDiscountResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountResourceIdentifierBuilder implements Builder<CartDiscountResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public CartDiscountResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public CartDiscountResourceIdentifierBuilder key(@Nullable final String key) {
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

    public CartDiscountResourceIdentifier build() {
        return new CartDiscountResourceIdentifierImpl(id, key);
    }

    /**
     * builds CartDiscountResourceIdentifier without checking for non null required values
     */
    public CartDiscountResourceIdentifier buildUnchecked() {
        return new CartDiscountResourceIdentifierImpl(id, key);
    }

    public static CartDiscountResourceIdentifierBuilder of() {
        return new CartDiscountResourceIdentifierBuilder();
    }

    public static CartDiscountResourceIdentifierBuilder of(final CartDiscountResourceIdentifier template) {
        CartDiscountResourceIdentifierBuilder builder = new CartDiscountResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
