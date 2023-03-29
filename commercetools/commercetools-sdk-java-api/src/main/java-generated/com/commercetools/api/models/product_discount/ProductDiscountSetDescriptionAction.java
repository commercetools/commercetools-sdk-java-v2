
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetDescriptionAction productDiscountSetDescriptionAction = ProductDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetDescriptionActionImpl.class)
public interface ProductDiscountSetDescriptionAction extends ProductDiscountUpdateAction {

    /**
     * discriminator value for ProductDiscountSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of ProductDiscountSetDescriptionAction
     */
    public static ProductDiscountSetDescriptionAction of() {
        return new ProductDiscountSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountSetDescriptionAction of(final ProductDiscountSetDescriptionAction template) {
        ProductDiscountSetDescriptionActionImpl instance = new ProductDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountSetDescriptionAction deepCopy(
            @Nullable final ProductDiscountSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductDiscountSetDescriptionActionImpl instance = new ProductDiscountSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for ProductDiscountSetDescriptionAction
     * @return builder
     */
    public static ProductDiscountSetDescriptionActionBuilder builder() {
        return ProductDiscountSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ProductDiscountSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetDescriptionActionBuilder builder(
            final ProductDiscountSetDescriptionAction template) {
        return ProductDiscountSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountSetDescriptionAction(Function<ProductDiscountSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountSetDescriptionAction>";
            }
        };
    }
}
