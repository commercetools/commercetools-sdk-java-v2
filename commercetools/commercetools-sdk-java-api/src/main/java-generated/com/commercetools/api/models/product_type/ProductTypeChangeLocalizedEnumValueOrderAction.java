
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueOrderAction extends ProductTypeUpdateAction {

    String CHANGE_LOCALIZED_ENUM_VALUE_ORDER = "changeLocalizedEnumValueOrder";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributeLocalizedEnumValue> getValues();

    public void setAttributeName(final String attributeName);

    @JsonIgnore
    public void setValues(final AttributeLocalizedEnumValue... values);

    public void setValues(final List<AttributeLocalizedEnumValue> values);

    public static ProductTypeChangeLocalizedEnumValueOrderAction of() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
    }

    public static ProductTypeChangeLocalizedEnumValueOrderAction of(
            final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        ProductTypeChangeLocalizedEnumValueOrderActionImpl instance = new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(template.getValues());
        return instance;
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder() {
        return ProductTypeChangeLocalizedEnumValueOrderActionBuilder.of();
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionBuilder builder(
            final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        return ProductTypeChangeLocalizedEnumValueOrderActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeLocalizedEnumValueOrderAction(
            Function<ProductTypeChangeLocalizedEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLocalizedEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangeLocalizedEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangeLocalizedEnumValueOrderAction>";
            }
        };
    }
}
