
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeIsActiveAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeIsActiveAction productDiscountChangeIsActiveAction = ProductDiscountChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeIsActiveActionImpl.class)
public interface ProductDiscountChangeIsActiveAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountChangeIsActiveAction
     */
    String CHANGE_IS_ACTIVE = "changeIsActive";

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to Product Prices.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to Product Prices.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     * factory method
     * @return instance of ProductDiscountChangeIsActiveAction
     */
    public static ProductDiscountChangeIsActiveAction of() {
        return new ProductDiscountChangeIsActiveActionImpl();
    }

    /**
     * factory method to copy an instance of ProductDiscountChangeIsActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountChangeIsActiveAction of(final ProductDiscountChangeIsActiveAction template) {
        ProductDiscountChangeIsActiveActionImpl instance = new ProductDiscountChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountChangeIsActiveAction
     * @return builder
     */
    public static ProductDiscountChangeIsActiveActionBuilder builder() {
        return ProductDiscountChangeIsActiveActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountChangeIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeIsActiveActionBuilder builder(
            final ProductDiscountChangeIsActiveAction template) {
        return ProductDiscountChangeIsActiveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountChangeIsActiveAction(Function<ProductDiscountChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeIsActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeIsActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangeIsActiveAction>";
            }
        };
    }
}
