
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductDiscountChangeSortOrderAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeSortOrderAction productDiscountChangeSortOrderAction = ProductDiscountChangeSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeSortOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeSortOrderActionImpl.class)
public interface ProductDiscountChangeSortOrderAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountChangeSortOrderAction
     */
    String CHANGE_SORT_ORDER = "changeSortOrder";

    /**
     *  <p>New value to set. Must not be empty. The string value must be a number between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>New value to set. Must not be empty. The string value must be a number between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     * factory method
     * @return instance of ProductDiscountChangeSortOrderAction
     */
    public static ProductDiscountChangeSortOrderAction of() {
        return new ProductDiscountChangeSortOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountChangeSortOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountChangeSortOrderAction of(final ProductDiscountChangeSortOrderAction template) {
        ProductDiscountChangeSortOrderActionImpl instance = new ProductDiscountChangeSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    public ProductDiscountChangeSortOrderAction copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountChangeSortOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountChangeSortOrderAction deepCopy(
            @Nullable final ProductDiscountChangeSortOrderAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountChangeSortOrderActionImpl instance = new ProductDiscountChangeSortOrderActionImpl();
        instance.setSortOrder(template.getSortOrder());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountChangeSortOrderAction
     * @return builder
     */
    public static ProductDiscountChangeSortOrderActionBuilder builder() {
        return ProductDiscountChangeSortOrderActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountChangeSortOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeSortOrderActionBuilder builder(
            final ProductDiscountChangeSortOrderAction template) {
        return ProductDiscountChangeSortOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountChangeSortOrderAction(Function<ProductDiscountChangeSortOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeSortOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeSortOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangeSortOrderAction>";
            }
        };
    }
}
