
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
 *  <p>Adds a localizable enum to the values of AttributeLocalizedEnumType. It can update an AttributeLocalizedEnumType AttributeDefinition or an AttributeSetType of AttributeLocalizedEnumType AttributeDefinition.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeAddLocalizedEnumValueAction productTypeAddLocalizedEnumValueAction = ProductTypeAddLocalizedEnumValueAction.builder()
 *             .attributeName("{attributeName}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeAddLocalizedEnumValueActionImpl.class)
public interface ProductTypeAddLocalizedEnumValueAction extends ProductTypeUpdateAction {

    String ADD_LOCALIZED_ENUM_VALUE = "addLocalizedEnumValue";

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Value to append to the array.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public AttributeLocalizedEnumValue getValue();

    public void setAttributeName(final String attributeName);

    public void setValue(final AttributeLocalizedEnumValue value);

    public static ProductTypeAddLocalizedEnumValueAction of() {
        return new ProductTypeAddLocalizedEnumValueActionImpl();
    }

    public static ProductTypeAddLocalizedEnumValueAction of(final ProductTypeAddLocalizedEnumValueAction template) {
        ProductTypeAddLocalizedEnumValueActionImpl instance = new ProductTypeAddLocalizedEnumValueActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ProductTypeAddLocalizedEnumValueActionBuilder builder() {
        return ProductTypeAddLocalizedEnumValueActionBuilder.of();
    }

    public static ProductTypeAddLocalizedEnumValueActionBuilder builder(
            final ProductTypeAddLocalizedEnumValueAction template) {
        return ProductTypeAddLocalizedEnumValueActionBuilder.of(template);
    }

    default <T> T withProductTypeAddLocalizedEnumValueAction(
            Function<ProductTypeAddLocalizedEnumValueAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddLocalizedEnumValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeAddLocalizedEnumValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeAddLocalizedEnumValueAction>";
            }
        };
    }
}
