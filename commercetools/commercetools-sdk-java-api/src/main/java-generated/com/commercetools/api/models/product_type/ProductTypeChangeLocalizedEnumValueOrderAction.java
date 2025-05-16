
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates the order of localized enum <code>values</code> in an AttributeLocalizedEnumType AttributeDefinition. It can update an AttributeLocalizedEnumType AttributeDefinition or an AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeLocalizedEnumValueOrderAction productTypeChangeLocalizedEnumValueOrderAction = ProductTypeChangeLocalizedEnumValueOrderAction.builder()
 *             .attributeName("{attributeName}")
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeLocalizedEnumValueOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueOrderAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangeLocalizedEnumValueOrderAction
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_ORDER = "changeLocalizedEnumValueOrder";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributeLocalizedEnumValue> getValues();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final AttributeLocalizedEnumValue... values);

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an EnumValuesMustMatch error is returned.</p>
     * @param values values to be set
     */

    public void setValues(final List<AttributeLocalizedEnumValue> values);

    /**
     * factory method
     * @return instance of ProductTypeChangeLocalizedEnumValueOrderAction
     */
    public static ProductTypeChangeLocalizedEnumValueOrderAction of() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangeLocalizedEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangeLocalizedEnumValueOrderAction of(
            final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        ProductTypeChangeLocalizedEnumValueOrderActionImpl instance = new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(template.getValues());
        return instance;
    }

    public ProductTypeChangeLocalizedEnumValueOrderAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeChangeLocalizedEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangeLocalizedEnumValueOrderAction deepCopy(
            @Nullable final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangeLocalizedEnumValueOrderActionImpl instance = new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_type.AttributeLocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangeLocalizedEnumValueOrderAction
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder() {
        return ProductTypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangeLocalizedEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder(
            final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        return ProductTypeChangeLocalizedEnumValueOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangeLocalizedEnumValueOrderAction(
            Function<ProductTypeChangeLocalizedEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLocalizedEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLocalizedEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeLocalizedEnumValueOrderAction>";
            }
        };
    }
}
