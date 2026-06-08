
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action does not set any Cart field in particular, but it triggers several <span>Cart updates</span> to bring prices and discounts to the latest state. Those can become stale over time when no Cart updates have been performed for a while and prices on related Products have changed in the meanwhile.</p>
 *  <p>If the <code>priceMode</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> related to a Line Item is of <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a>, the updated <code>price</code> of that <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> may not correspond to a Price in the <code>variant.prices</code> anymore.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("recalculate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRecalculateActionImpl.class)
public interface CartRecalculateAction extends CartUpdateAction {

    /**
     * discriminator value for CartRecalculateAction
     */
    String RECALCULATE = "recalculate";

    /**
     *  <ul>
     *   <li>Leave empty or set as <code>false</code> to update only the Prices and TaxRates of the Line Items.</li>
     *   <li>Set as <code>true</code> to update the Product data (such as <code>name</code>, <code>variant</code>, <code>productType</code>, and Product Attributes) of the Line Items.</li>
     *  </ul>
     * @return updateProductData
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    /**
     *  <ul>
     *   <li>Leave empty or set as <code>false</code> to update only the Prices and TaxRates of the Line Items.</li>
     *   <li>Set as <code>true</code> to update the Product data (such as <code>name</code>, <code>variant</code>, <code>productType</code>, and Product Attributes) of the Line Items.</li>
     *  </ul>
     * @param updateProductData value to be set
     */

    public void setUpdateProductData(final Boolean updateProductData);

    /**
     * factory method
     * @return instance of CartRecalculateAction
     */
    public static CartRecalculateAction of() {
        return new CartRecalculateActionImpl();
    }

    /**
     * factory method to create a shallow copy CartRecalculateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRecalculateAction of(final CartRecalculateAction template) {
        CartRecalculateActionImpl instance = new CartRecalculateActionImpl();
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public CartRecalculateAction copyDeep();

    /**
     * factory method to create a deep copy of CartRecalculateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartRecalculateAction deepCopy(@Nullable final CartRecalculateAction template) {
        if (template == null) {
            return null;
        }
        CartRecalculateActionImpl instance = new CartRecalculateActionImpl();
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    /**
     * builder factory method for CartRecalculateAction
     * @return builder
     */
    public static CartRecalculateActionBuilder builder() {
        return CartRecalculateActionBuilder.of();
    }

    /**
     * create builder for CartRecalculateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRecalculateActionBuilder builder(final CartRecalculateAction template) {
        return CartRecalculateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRecalculateAction(Function<CartRecalculateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRecalculateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRecalculateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRecalculateAction>";
            }
        };
    }
}
