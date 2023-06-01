package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUnfreezeCartAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUnfreezeCartActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnfreezeCartAction cartUnfreezeCartAction = CartUnfreezeCartAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartUnfreezeCartActionBuilder implements Builder<CartUnfreezeCartAction> {




    /**
     * builds CartUnfreezeCartAction with checking for non-null required values
     * @return CartUnfreezeCartAction
     */
    public CartUnfreezeCartAction build() {
        return new CartUnfreezeCartActionImpl();
    }
    
    /**
     * builds CartUnfreezeCartAction without checking for non-null required values
     * @return CartUnfreezeCartAction
     */
    public CartUnfreezeCartAction buildUnchecked() {
        return new CartUnfreezeCartActionImpl();
    }

    /**
     * factory method for an instance of CartUnfreezeCartActionBuilder
     * @return builder 
     */
    public static CartUnfreezeCartActionBuilder of() {
        return new CartUnfreezeCartActionBuilder();
    }

    /**
     * create builder for CartUnfreezeCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnfreezeCartActionBuilder of(final CartUnfreezeCartAction template) {
        CartUnfreezeCartActionBuilder builder = new CartUnfreezeCartActionBuilder();
        return builder;
    }

}
