
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
 * ProductDiscountChangePredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangePredicateAction productDiscountChangePredicateAction = ProductDiscountChangePredicateAction.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changePredicate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangePredicateActionImpl.class)
public interface ProductDiscountChangePredicateAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountChangePredicateAction
     */
    String CHANGE_PREDICATE = "changePredicate";

    /**
     *  <p>New value to set. Must be a valid ProductDiscount predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>New value to set. Must be a valid ProductDiscount predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of ProductDiscountChangePredicateAction
     */
    public static ProductDiscountChangePredicateAction of() {
        return new ProductDiscountChangePredicateActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountChangePredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountChangePredicateAction of(final ProductDiscountChangePredicateAction template) {
        ProductDiscountChangePredicateActionImpl instance = new ProductDiscountChangePredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public ProductDiscountChangePredicateAction copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountChangePredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountChangePredicateAction deepCopy(
            @Nullable final ProductDiscountChangePredicateAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountChangePredicateActionImpl instance = new ProductDiscountChangePredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountChangePredicateAction
     * @return builder
     */
    public static ProductDiscountChangePredicateActionBuilder builder() {
        return ProductDiscountChangePredicateActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountChangePredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangePredicateActionBuilder builder(
            final ProductDiscountChangePredicateAction template) {
        return ProductDiscountChangePredicateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountChangePredicateAction(Function<ProductDiscountChangePredicateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangePredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangePredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangePredicateAction>";
            }
        };
    }
}
