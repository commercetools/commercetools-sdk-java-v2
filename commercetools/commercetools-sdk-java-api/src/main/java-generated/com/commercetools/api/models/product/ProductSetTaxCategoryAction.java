
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Cannot be staged. Published Products are immediately updated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetTaxCategoryAction productSetTaxCategoryAction = ProductSetTaxCategoryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTaxCategory")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetTaxCategoryActionImpl.class)
public interface ProductSetTaxCategoryAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetTaxCategoryAction
     */
    String SET_TAX_CATEGORY = "setTaxCategory";

    /**
     *  <p>The Tax Category to set. If empty, any existing value will be removed.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>The Tax Category to set. If empty, any existing value will be removed.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     * factory method
     * @return instance of ProductSetTaxCategoryAction
     */
    public static ProductSetTaxCategoryAction of() {
        return new ProductSetTaxCategoryActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetTaxCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetTaxCategoryAction of(final ProductSetTaxCategoryAction template) {
        ProductSetTaxCategoryActionImpl instance = new ProductSetTaxCategoryActionImpl();
        instance.setTaxCategory(template.getTaxCategory());
        return instance;
    }

    public ProductSetTaxCategoryAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetTaxCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetTaxCategoryAction deepCopy(@Nullable final ProductSetTaxCategoryAction template) {
        if (template == null) {
            return null;
        }
        ProductSetTaxCategoryActionImpl instance = new ProductSetTaxCategoryActionImpl();
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        return instance;
    }

    /**
     * builder factory method for ProductSetTaxCategoryAction
     * @return builder
     */
    public static ProductSetTaxCategoryActionBuilder builder() {
        return ProductSetTaxCategoryActionBuilder.of();
    }

    /**
     * create builder for ProductSetTaxCategoryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetTaxCategoryActionBuilder builder(final ProductSetTaxCategoryAction template) {
        return ProductSetTaxCategoryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetTaxCategoryAction(Function<ProductSetTaxCategoryAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetTaxCategoryAction ofUnset() {
        return ProductSetTaxCategoryAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetTaxCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetTaxCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetTaxCategoryAction>";
            }
        };
    }
}
