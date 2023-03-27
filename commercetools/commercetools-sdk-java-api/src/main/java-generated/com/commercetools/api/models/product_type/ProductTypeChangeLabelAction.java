
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeLabelAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLabelAction productTypeChangeLabelAction = ProductTypeChangeLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .label(labelBuilder -> labelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeLabelActionImpl.class)
public interface ProductTypeChangeLabelAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeLabelAction
     */
    String CHANGE_LABEL = "changeLabel";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     * factory method
     * @return instance of ProductTypeChangeLabelAction
     */
    public static ProductTypeChangeLabelAction of() {
        return new ProductTypeChangeLabelActionImpl();
    }

    /**
     * factory method to copy an instance of ProductTypeChangeLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeLabelAction of(final ProductTypeChangeLabelAction template) {
        ProductTypeChangeLabelActionImpl instance = new ProductTypeChangeLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeLabelAction
     * @return builder
     */
    public static ProductTypeChangeLabelActionBuilder builder() {
        return ProductTypeChangeLabelActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeLabelActionBuilder builder(final ProductTypeChangeLabelAction template) {
        return ProductTypeChangeLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeLabelAction(Function<ProductTypeChangeLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeLabelAction>";
            }
        };
    }
}
