package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartFreezeCartAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartFreezeCartActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartFreezeCartAction cartFreezeCartAction = CartFreezeCartAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartFreezeCartActionBuilder implements Builder<CartFreezeCartAction> {




    /**
     * builds CartFreezeCartAction with checking for non-null required values
     * @return CartFreezeCartAction
     */
    public CartFreezeCartAction build() {
        return new CartFreezeCartActionImpl();
    }
    
    /**
     * builds CartFreezeCartAction without checking for non-null required values
     * @return CartFreezeCartAction
     */
    public CartFreezeCartAction buildUnchecked() {
        return new CartFreezeCartActionImpl();
    }

    /**
     * factory method for an instance of CartFreezeCartActionBuilder
     * @return builder 
     */
    public static CartFreezeCartActionBuilder of() {
        return new CartFreezeCartActionBuilder();
    }

    /**
     * create builder for CartFreezeCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartFreezeCartActionBuilder of(final CartFreezeCartAction template) {
        CartFreezeCartActionBuilder builder = new CartFreezeCartActionBuilder();
        return builder;
    }

}
