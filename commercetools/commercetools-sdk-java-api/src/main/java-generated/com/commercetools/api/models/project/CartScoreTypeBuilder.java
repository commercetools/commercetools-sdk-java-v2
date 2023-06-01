package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.project.CartScoreType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartScoreTypeBuilder implements Builder<CartScoreType> {




    /**
     * builds CartScoreType with checking for non-null required values
     * @return CartScoreType
     */
    public CartScoreType build() {
        return new CartScoreTypeImpl();
    }
    
    /**
     * builds CartScoreType without checking for non-null required values
     * @return CartScoreType
     */
    public CartScoreType buildUnchecked() {
        return new CartScoreTypeImpl();
    }

    /**
     * factory method for an instance of CartScoreTypeBuilder
     * @return builder 
     */
    public static CartScoreTypeBuilder of() {
        return new CartScoreTypeBuilder();
    }

    /**
     * create builder for CartScoreType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartScoreTypeBuilder of(final CartScoreType template) {
        CartScoreTypeBuilder builder = new CartScoreTypeBuilder();
        return builder;
    }

}
