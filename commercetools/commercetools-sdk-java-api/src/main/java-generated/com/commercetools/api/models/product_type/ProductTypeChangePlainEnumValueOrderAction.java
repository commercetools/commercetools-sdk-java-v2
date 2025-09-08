
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
 *  <p>Updates the order of enum <code>values</code> in an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">AttributeEnumType</a> AttributeDefinition. It can update an AttributeEnumType AttributeDefinition or an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of AttributeEnumType AttributeDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangePlainEnumValueOrderAction productTypeChangePlainEnumValueOrderAction = ProductTypeChangePlainEnumValueOrderAction.builder()
 *             .attributeName("{attributeName}")
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changePlainEnumValueOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangePlainEnumValueOrderActionImpl.class)
public interface ProductTypeChangePlainEnumValueOrderAction extends ProductTypeUpdateAction {

    /**
     * discriminator value for ProductTypeChangePlainEnumValueOrderAction
     */
    String CHANGE_PLAIN_ENUM_VALUE_ORDER = "changePlainEnumValueOrder";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an <a href="https://docs.commercetools.com/apis/ctp:api:type:EnumValuesMustMatchError" rel="nofollow">EnumValuesMustMatch</a> error is returned.</p>
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributePlainEnumValue> getValues();

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an <a href="https://docs.commercetools.com/apis/ctp:api:type:EnumValuesMustMatchError" rel="nofollow">EnumValuesMustMatch</a> error is returned.</p>
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final AttributePlainEnumValue... values);

    /**
     *  <p>Values must be equal to the values of the Attribute enum values (except for the order). If not, an <a href="https://docs.commercetools.com/apis/ctp:api:type:EnumValuesMustMatchError" rel="nofollow">EnumValuesMustMatch</a> error is returned.</p>
     * @param values values to be set
     */

    public void setValues(final List<AttributePlainEnumValue> values);

    /**
     * factory method
     * @return instance of ProductTypeChangePlainEnumValueOrderAction
     */
    public static ProductTypeChangePlainEnumValueOrderAction of() {
        return new ProductTypeChangePlainEnumValueOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeChangePlainEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeChangePlainEnumValueOrderAction of(
            final ProductTypeChangePlainEnumValueOrderAction template) {
        ProductTypeChangePlainEnumValueOrderActionImpl instance = new ProductTypeChangePlainEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(template.getValues());
        return instance;
    }

    public ProductTypeChangePlainEnumValueOrderAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeChangePlainEnumValueOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeChangePlainEnumValueOrderAction deepCopy(
            @Nullable final ProductTypeChangePlainEnumValueOrderAction template) {
        if (template == null) {
            return null;
        }
        ProductTypeChangePlainEnumValueOrderActionImpl instance = new ProductTypeChangePlainEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_type.AttributePlainEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeChangePlainEnumValueOrderAction
     * @return builder
     */
    public static ProductTypeChangePlainEnumValueOrderActionBuilder builder() {
        return ProductTypeChangePlainEnumValueOrderActionBuilder.of();
    }

    /**
     * create builder for ProductTypeChangePlainEnumValueOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangePlainEnumValueOrderActionBuilder builder(
            final ProductTypeChangePlainEnumValueOrderAction template) {
        return ProductTypeChangePlainEnumValueOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeChangePlainEnumValueOrderAction(
            Function<ProductTypeChangePlainEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangePlainEnumValueOrderAction>";
            }
        };
    }
}
