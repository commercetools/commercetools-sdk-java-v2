
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
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartDiscountResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartDiscountResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CartDiscountResourceIdentifier with checking for non-null required values
     * @return CartDiscountResourceIdentifier
     */
    public CartDiscountResourceIdentifier build() {
        return new CartDiscountResourceIdentifierImpl(id, key);
    }

    /**
     * builds CartDiscountResourceIdentifier without checking for non-null required values
     * @return CartDiscountResourceIdentifier
     */
    public CartDiscountResourceIdentifier buildUnchecked() {
        return new CartDiscountResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of CartDiscountResourceIdentifierBuilder
     * @return builder
     */
    public static CartDiscountResourceIdentifierBuilder of() {
        return new CartDiscountResourceIdentifierBuilder();
    }

    /**
     * create builder for CartDiscountResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountResourceIdentifierBuilder of(final CartDiscountResourceIdentifier template) {
        CartDiscountResourceIdentifierBuilder builder = new CartDiscountResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
