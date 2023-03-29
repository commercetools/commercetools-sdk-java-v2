
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetting
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetting productSelectionSetting = ProductSelectionSetting.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSettingImpl.class)
public interface ProductSelectionSetting {

    /**
     *  <p>Reference to a ProductSelection.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>Reference to a ProductSelection.</p>
     * @param productSelection value to be set
     */

    public void setProductSelection(final ProductSelectionReference productSelection);

    /**
     *  <p>If <code>true</code>, all Products assigned to this Product Selection are part of the Store's assortment.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     * factory method
     * @return instance of ProductSelectionSetting
     */
    public static ProductSelectionSetting of() {
        return new ProductSelectionSettingImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionSetting
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSetting of(final ProductSelectionSetting template) {
        ProductSelectionSettingImpl instance = new ProductSelectionSettingImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionSetting
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSetting deepCopy(@Nullable final ProductSelectionSetting template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSettingImpl instance = new ProductSelectionSettingImpl();
        instance.setProductSelection(Optional.ofNullable(template.getProductSelection())
                .map(com.commercetools.api.models.product_selection.ProductSelectionReference::deepCopy)
                .orElse(null));
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSetting
     * @return builder
     */
    public static ProductSelectionSettingBuilder builder() {
        return ProductSelectionSettingBuilder.of();
    }

    /**
     * create builder for ProductSelectionSetting instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSettingBuilder builder(final ProductSelectionSetting template) {
        return ProductSelectionSettingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSetting(Function<ProductSelectionSetting, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetting> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetting>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetting>";
            }
        };
    }
}
