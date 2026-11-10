
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartResourceIdentifier cartResourceIdentifier = CartResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartResourceIdentifierBuilder implements Builder<CartResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CartResourceIdentifier with checking for non-null required values
     * @return CartResourceIdentifier
     */
    public CartResourceIdentifier build() {
        return new CartResourceIdentifierImpl(id, key);
    }

    /**
     * builds CartResourceIdentifier without checking for non-null required values
     * @return CartResourceIdentifier
     */
    public CartResourceIdentifier buildUnchecked() {
        return new CartResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of CartResourceIdentifierBuilder
     * @return builder
     */
    public static CartResourceIdentifierBuilder of() {
        return new CartResourceIdentifierBuilder();
    }

    /**
     * create builder for CartResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartResourceIdentifierBuilder of(final CartResourceIdentifier template) {
        CartResourceIdentifierBuilder builder = new CartResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
