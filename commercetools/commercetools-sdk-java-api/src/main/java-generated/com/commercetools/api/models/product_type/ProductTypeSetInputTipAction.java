
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductTypeSetInputTipAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetInputTipAction productTypeSetInputTipAction = ProductTypeSetInputTipAction.builder()
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setInputTip")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeSetInputTipActionImpl.class)
public interface ProductTypeSetInputTipAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeSetInputTipAction
     */
    String SET_INPUT_TIP = "setInputTip";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return inputTip
     */
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param inputTip value to be set
     */

    public void setInputTip(final LocalizedString inputTip);

    /**
     * factory method
     * @return instance of ProductTypeSetInputTipAction
     */
    public static ProductTypeSetInputTipAction of() {
        return new ProductTypeSetInputTipActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeSetInputTipAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeSetInputTipAction of(final ProductTypeSetInputTipAction template) {
        ProductTypeSetInputTipActionImpl instance = new ProductTypeSetInputTipActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setInputTip(template.getInputTip());
        return instance;
    }

    public ProductTypeSetInputTipAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeSetInputTipAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeSetInputTipAction deepCopy(@Nullable final ProductTypeSetInputTipAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeSetInputTipActionImpl instance = new ProductTypeSetInputTipActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setInputTip(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getInputTip()));
        return instance;
    }

    /**
     * builder factory method for ProductTypeSetInputTipAction
     * @return builder
     */
    public static ProductTypeSetInputTipActionBuilder builder() {
        return ProductTypeSetInputTipActionBuilder.of();
    }

    /**
     * create builder for ProductTypeSetInputTipAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeSetInputTipActionBuilder builder(final ProductTypeSetInputTipAction template) {
        return ProductTypeSetInputTipActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeSetInputTipAction(Function<ProductTypeSetInputTipAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetInputTipAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetInputTipAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeSetInputTipAction>";
            }
        };
    }
}
