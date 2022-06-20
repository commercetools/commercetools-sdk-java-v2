
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates the label of a single enum <code>value</code> in an AttributeEnumType AttributeDefinition, or AttributeSetType of AttributeEnumType AttributeDefinition.</p>
 *  <p>All Products will be updated to the new label in an eventually consistent way.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangePlainEnumValueLabelAction productTypeChangePlainEnumValueLabelAction = ProductTypeChangePlainEnumValueLabelAction.builder()
 *             .attributeName("{attributeName}")
 *             .newValue(newValueBuilder -> newValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangePlainEnumValueLabelActionImpl.class)
public interface ProductTypeChangePlainEnumValueLabelAction extends ProductTypeUpdateAction {

    String CHANGE_PLAIN_ENUM_VALUE_LABEL = "changePlainEnumValueLabel";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>New value to set. Must be different from the existing value.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("newValue")
    public AttributePlainEnumValue getNewValue();

    public void setAttributeName(final String attributeName);

    public void setNewValue(final AttributePlainEnumValue newValue);

    public static ProductTypeChangePlainEnumValueLabelAction of() {
        return new ProductTypeChangePlainEnumValueLabelActionImpl();
    }

    public static ProductTypeChangePlainEnumValueLabelAction of(
            final ProductTypeChangePlainEnumValueLabelAction template) {
        ProductTypeChangePlainEnumValueLabelActionImpl instance = new ProductTypeChangePlainEnumValueLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    public static ProductTypeChangePlainEnumValueLabelActionBuilder builder() {
        return ProductTypeChangePlainEnumValueLabelActionBuilder.of();
    }

    public static ProductTypeChangePlainEnumValueLabelActionBuilder builder(
            final ProductTypeChangePlainEnumValueLabelAction template) {
        return ProductTypeChangePlainEnumValueLabelActionBuilder.of(template);
    }

    default <T> T withProductTypeChangePlainEnumValueLabelAction(
            Function<ProductTypeChangePlainEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangePlainEnumValueLabelAction>";
            }
        };
    }
}
