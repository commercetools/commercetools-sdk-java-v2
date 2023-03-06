
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRecalculateActionBuilder implements Builder<CartRecalculateAction> {

    @Nullable
    private Boolean updateProductData;

    /**
     *  <ul>
     *   <li>Leave empty or set to <code>false</code> to only update the Prices and TaxRates of the Line Items.</li>
     *   <li>Set to <code>true</code> to update the Line Items' product data (like <code>name</code>, <code>variant</code> and <code>productType</code>) also.</li>
     *  </ul>
     */

    public CartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public CartRecalculateAction build() {
        return new CartRecalculateActionImpl(updateProductData);
    }

    /**
     * builds CartRecalculateAction without checking for non null required values
     */
    public CartRecalculateAction buildUnchecked() {
        return new CartRecalculateActionImpl(updateProductData);
    }

    public static CartRecalculateActionBuilder of() {
        return new CartRecalculateActionBuilder();
    }

    public static CartRecalculateActionBuilder of(final CartRecalculateAction template) {
        CartRecalculateActionBuilder builder = new CartRecalculateActionBuilder();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
