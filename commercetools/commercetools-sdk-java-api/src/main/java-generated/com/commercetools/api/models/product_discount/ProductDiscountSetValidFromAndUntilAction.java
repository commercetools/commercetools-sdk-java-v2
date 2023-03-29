
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
 * ProductDiscountSetValidFromAndUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAndUntilAction productDiscountSetValidFromAndUntilAction = ProductDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetValidFromAndUntilActionImpl.class)
public interface ProductDiscountSetValidFromAndUntilAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountSetValidFromAndUntilAction
     */
    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value to set. Take Eventual Consistency into account for calculated undiscounted values.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of ProductDiscountSetValidFromAndUntilAction
     */
    public static ProductDiscountSetValidFromAndUntilAction of() {
        return new ProductDiscountSetValidFromAndUntilActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountSetValidFromAndUntilAction of(
            final ProductDiscountSetValidFromAndUntilAction template) {
        ProductDiscountSetValidFromAndUntilActionImpl instance = new ProductDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountSetValidFromAndUntilAction deepCopy(
            @Nullable final ProductDiscountSetValidFromAndUntilAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountSetValidFromAndUntilActionImpl instance = new ProductDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountSetValidFromAndUntilAction
     * @return builder
     */
    public static ProductDiscountSetValidFromAndUntilActionBuilder builder() {
        return ProductDiscountSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetValidFromAndUntilActionBuilder builder(
            final ProductDiscountSetValidFromAndUntilAction template) {
        return ProductDiscountSetValidFromAndUntilActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountSetValidFromAndUntilAction(
            Function<ProductDiscountSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetValidFromAndUntilAction>";
            }
        };
    }
}
