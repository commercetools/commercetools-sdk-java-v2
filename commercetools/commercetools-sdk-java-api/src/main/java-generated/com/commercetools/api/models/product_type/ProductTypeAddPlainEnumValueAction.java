
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds an enum to the values of <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">AttributeEnumType</a> AttributeDefinition, or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of AttributeEnumType AttributeDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddPlainEnumValueAction productTypeAddPlainEnumValueAction = ProductTypeAddPlainEnumValueAction.builder()
 *             .attributeName("{attributeName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addPlainEnumValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeAddPlainEnumValueActionImpl.class)
public interface ProductTypeAddPlainEnumValueAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeAddPlainEnumValueAction
     */
    String ADD_PLAIN_ENUM_VALUE = "addPlainEnumValue";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Value to append to the array.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public AttributePlainEnumValue getValue();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Value to append to the array.</p>
     * @param value value to be set
     */

    public void setValue(final AttributePlainEnumValue value);

    /**
     * factory method
     * @return instance of ProductTypeAddPlainEnumValueAction
     */
    public static ProductTypeAddPlainEnumValueAction of() {
        return new ProductTypeAddPlainEnumValueActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeAddPlainEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeAddPlainEnumValueAction of(final ProductTypeAddPlainEnumValueAction template) {
        ProductTypeAddPlainEnumValueActionImpl instance = new ProductTypeAddPlainEnumValueActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ProductTypeAddPlainEnumValueAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeAddPlainEnumValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeAddPlainEnumValueAction deepCopy(
            @Nullable final ProductTypeAddPlainEnumValueAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeAddPlainEnumValueActionImpl instance = new ProductTypeAddPlainEnumValueActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValue(
            com.commercetools.api.models.product_type.AttributePlainEnumValue.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for ProductTypeAddPlainEnumValueAction
     * @return builder
     */
    public static ProductTypeAddPlainEnumValueActionBuilder builder() {
        return ProductTypeAddPlainEnumValueActionBuilder.of();
    }

    /**
     * create builder for ProductTypeAddPlainEnumValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeAddPlainEnumValueActionBuilder builder(final ProductTypeAddPlainEnumValueAction template) {
        return ProductTypeAddPlainEnumValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeAddPlainEnumValueAction(Function<ProductTypeAddPlainEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddPlainEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddPlainEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeAddPlainEnumValueAction>";
            }
        };
    }
}
