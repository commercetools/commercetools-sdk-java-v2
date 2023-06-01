package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartRecalculateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRecalculateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRecalculateAction cartRecalculateAction = CartRecalculateAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartRecalculateActionBuilder implements Builder<CartRecalculateAction> {

    
    @Nullable
    private Boolean updateProductData;

    
    /**
     *  <ul>
     *   <li>Leave empty or set to <code>false</code> to only update the Prices and TaxRates of the Line Items.</li>
     *   <li>Set to <code>true</code> to update the Line Items' product data (like <code>name</code>, <code>variant</code> and <code>productType</code>) also.</li>
     *  </ul>
     * @param updateProductData value to be set
     * @return Builder
     */
    
    public CartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }
    
    

    /**
     *  <ul>
     *   <li>Leave empty or set to <code>false</code> to only update the Prices and TaxRates of the Line Items.</li>
     *   <li>Set to <code>true</code> to update the Line Items' product data (like <code>name</code>, <code>variant</code> and <code>productType</code>) also.</li>
     *  </ul>
     * @return updateProductData
     */
    
    @Nullable
    public Boolean getUpdateProductData(){
        return this.updateProductData;
    }

    /**
     * builds CartRecalculateAction with checking for non-null required values
     * @return CartRecalculateAction
     */
    public CartRecalculateAction build() {
        return new CartRecalculateActionImpl(updateProductData);
    }
    
    /**
     * builds CartRecalculateAction without checking for non-null required values
     * @return CartRecalculateAction
     */
    public CartRecalculateAction buildUnchecked() {
        return new CartRecalculateActionImpl(updateProductData);
    }

    /**
     * factory method for an instance of CartRecalculateActionBuilder
     * @return builder 
     */
    public static CartRecalculateActionBuilder of() {
        return new CartRecalculateActionBuilder();
    }

    /**
     * create builder for CartRecalculateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRecalculateActionBuilder of(final CartRecalculateAction template) {
        CartRecalculateActionBuilder builder = new CartRecalculateActionBuilder();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
