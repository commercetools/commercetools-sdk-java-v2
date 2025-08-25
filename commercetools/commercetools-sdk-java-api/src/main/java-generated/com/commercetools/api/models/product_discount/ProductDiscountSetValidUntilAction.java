
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetValidUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidUntilAction productDiscountSetValidUntilAction = ProductDiscountSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setValidUntil")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetValidUntilActionImpl.class)
public interface ProductDiscountSetValidUntilAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountSetValidUntilAction
     */
    String SET_VALID_UNTIL = "setValidUntil";

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take <span>Eventual Consistency</span> into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of ProductDiscountSetValidUntilAction
     */
    public static ProductDiscountSetValidUntilAction of() {
        return new ProductDiscountSetValidUntilActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountSetValidUntilAction of(final ProductDiscountSetValidUntilAction template) {
        ProductDiscountSetValidUntilActionImpl instance = new ProductDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public ProductDiscountSetValidUntilAction copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountSetValidUntilAction deepCopy(
            @Nullable final ProductDiscountSetValidUntilAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountSetValidUntilActionImpl instance = new ProductDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountSetValidUntilAction
     * @return builder
     */
    public static ProductDiscountSetValidUntilActionBuilder builder() {
        return ProductDiscountSetValidUntilActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetValidUntilActionBuilder builder(final ProductDiscountSetValidUntilAction template) {
        return ProductDiscountSetValidUntilActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountSetValidUntilAction(Function<ProductDiscountSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetValidUntilAction>";
            }
        };
    }
}
