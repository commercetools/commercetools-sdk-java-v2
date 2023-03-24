
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartValueTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartValueType cartValueType = CartValueType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartValueTypeBuilder implements Builder<CartValueType> {

    /**
     * builds CartValueType with checking for non-null required values
     * @return CartValueType
     */
    public CartValueType build() {
        return new CartValueTypeImpl();
    }

    /**
     * builds CartValueType without checking for non-null required values
     * @return CartValueType
     */
    public CartValueType buildUnchecked() {
        return new CartValueTypeImpl();
    }

    public static CartValueTypeBuilder of() {
        return new CartValueTypeBuilder();
    }

    public static CartValueTypeBuilder of(final CartValueType template) {
        CartValueTypeBuilder builder = new CartValueTypeBuilder();
        return builder;
    }

}
