
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action does not set any Cart field in particular, but it triggers several Cart updates to bring prices and discounts to the latest state. Those can become stale over time when no Cart updates have been performed for a while and prices on related Products have changed in the meanwhile.</p>
 *  <p>If the <code>priceMode</code> of the Product related to a Line Item is of <code>Embedded</code> ProductPriceMode, the updated <code>price</code> of that LineItem may not correspond to a Price in the <code>variant.prices</code> anymore.</p>
 *
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
@JsonDeserialize(as = CartRecalculateActionImpl.class)
public interface CartRecalculateAction extends CartUpdateAction {

    String RECALCULATE = "recalculate";

    /**
     *  <ul>
     *   <li>Leave empty or set to <code>false</code> to only update the Prices and TaxRates of the Line Items.</li>
     *   <li>Set to <code>true</code> to update the Line Items' product data (like <code>name</code>, <code>variant</code> and <code>productType</code>) also.</li>
     *  </ul>
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setUpdateProductData(final Boolean updateProductData);

    public static CartRecalculateAction of() {
        return new CartRecalculateActionImpl();
    }

    public static CartRecalculateAction of(final CartRecalculateAction template) {
        CartRecalculateActionImpl instance = new CartRecalculateActionImpl();
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public static CartRecalculateActionBuilder builder() {
        return CartRecalculateActionBuilder.of();
    }

    public static CartRecalculateActionBuilder builder(final CartRecalculateAction template) {
        return CartRecalculateActionBuilder.of(template);
    }

    default <T> T withCartRecalculateAction(Function<CartRecalculateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartRecalculateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRecalculateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRecalculateAction>";
            }
        };
    }
}
