
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
@JsonDeserialize(as = ProductTypeChangePlainEnumValueOrderActionImpl.class)
public interface ProductTypeChangePlainEnumValueOrderAction extends ProductTypeUpdateAction {

    String CHANGE_PLAIN_ENUM_VALUE_ORDER = "changePlainEnumValueOrder";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributePlainEnumValue> getValues();

    public void setAttributeName(final String attributeName);

    @JsonIgnore
    public void setValues(final AttributePlainEnumValue... values);

    public void setValues(final List<AttributePlainEnumValue> values);

    public static ProductTypeChangePlainEnumValueOrderAction of() {
        return new ProductTypeChangePlainEnumValueOrderActionImpl();
    }

    public static ProductTypeChangePlainEnumValueOrderAction of(
            final ProductTypeChangePlainEnumValueOrderAction template) {
        ProductTypeChangePlainEnumValueOrderActionImpl instance = new ProductTypeChangePlainEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(template.getValues());
        return instance;
    }

    public static ProductTypeChangePlainEnumValueOrderActionBuilder builder() {
        return ProductTypeChangePlainEnumValueOrderActionBuilder.of();
    }

    public static ProductTypeChangePlainEnumValueOrderActionBuilder builder(
            final ProductTypeChangePlainEnumValueOrderAction template) {
        return ProductTypeChangePlainEnumValueOrderActionBuilder.of(template);
    }

    default <T> T withProductTypeChangePlainEnumValueOrderAction(
            Function<ProductTypeChangePlainEnumValueOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeChangePlainEnumValueOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeChangePlainEnumValueOrderAction>";
            }
        };
    }
}
