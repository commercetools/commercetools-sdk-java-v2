
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
 * ProductDiscountSetValidFromAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetValidFromAction productDiscountSetValidFromAction = ProductDiscountSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setValidFrom")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetValidFromActionImpl.class)
public interface ProductDiscountSetValidFromAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountSetValidFromAction
     */
    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set. If empty, any existing value will be removed. Take Eventual Consistency into account for calculated discount values.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     * factory method
     * @return instance of ProductDiscountSetValidFromAction
     */
    public static ProductDiscountSetValidFromAction of() {
        return new ProductDiscountSetValidFromActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountSetValidFromAction of(final ProductDiscountSetValidFromAction template) {
        ProductDiscountSetValidFromActionImpl instance = new ProductDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    public ProductDiscountSetValidFromAction copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountSetValidFromAction deepCopy(
            @Nullable final ProductDiscountSetValidFromAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountSetValidFromActionImpl instance = new ProductDiscountSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountSetValidFromAction
     * @return builder
     */
    public static ProductDiscountSetValidFromActionBuilder builder() {
        return ProductDiscountSetValidFromActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetValidFromActionBuilder builder(final ProductDiscountSetValidFromAction template) {
        return ProductDiscountSetValidFromActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountSetValidFromAction(Function<ProductDiscountSetValidFromAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetValidFromAction>";
            }
        };
    }
}
