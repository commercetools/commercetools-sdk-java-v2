package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.project.CartValueType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of CartValueTypeBuilder
     * @return builder 
     */
    public static CartValueTypeBuilder of() {
        return new CartValueTypeBuilder();
    }

    /**
     * create builder for CartValueType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartValueTypeBuilder of(final CartValueType template) {
        CartValueTypeBuilder builder = new CartValueTypeBuilder();
        return builder;
    }

}
