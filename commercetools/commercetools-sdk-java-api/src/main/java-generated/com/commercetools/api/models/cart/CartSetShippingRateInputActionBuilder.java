package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.CartSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingRateInputActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingRateInputAction cartSetShippingRateInputAction = CartSetShippingRateInputAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetShippingRateInputActionBuilder implements Builder<CartSetShippingRateInputAction> {

    
    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    
    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */
    
    public CartSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }
    
    
    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */
    
    public CartSetShippingRateInputActionBuilder shippingRateInput(Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of()).build();
        return this;
    }
                    

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput(){
        return this.shippingRateInput;
    }

    /**
     * builds CartSetShippingRateInputAction with checking for non-null required values
     * @return CartSetShippingRateInputAction
     */
    public CartSetShippingRateInputAction build() {
        return new CartSetShippingRateInputActionImpl(shippingRateInput);
    }
    
    /**
     * builds CartSetShippingRateInputAction without checking for non-null required values
     * @return CartSetShippingRateInputAction
     */
    public CartSetShippingRateInputAction buildUnchecked() {
        return new CartSetShippingRateInputActionImpl(shippingRateInput);
    }

    /**
     * factory method for an instance of CartSetShippingRateInputActionBuilder
     * @return builder 
     */
    public static CartSetShippingRateInputActionBuilder of() {
        return new CartSetShippingRateInputActionBuilder();
    }

    /**
     * create builder for CartSetShippingRateInputAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetShippingRateInputActionBuilder of(final CartSetShippingRateInputAction template) {
        CartSetShippingRateInputActionBuilder builder = new CartSetShippingRateInputActionBuilder();
        builder.shippingRateInput = template.getShippingRateInput();
        return builder;
    }

}
