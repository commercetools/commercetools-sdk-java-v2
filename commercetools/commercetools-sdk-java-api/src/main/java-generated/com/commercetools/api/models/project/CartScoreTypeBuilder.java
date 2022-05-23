
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartScoreTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartScoreType cartScoreType = CartScoreType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartScoreTypeBuilder implements Builder<CartScoreType> {

    public CartScoreType build() {
        return new CartScoreTypeImpl();
    }

    /**
     * builds CartScoreType without checking for non null required values
     */
    public CartScoreType buildUnchecked() {
        return new CartScoreTypeImpl();
    }

    public static CartScoreTypeBuilder of() {
        return new CartScoreTypeBuilder();
    }

    public static CartScoreTypeBuilder of(final CartScoreType template) {
        CartScoreTypeBuilder builder = new CartScoreTypeBuilder();
        return builder;
    }

}
