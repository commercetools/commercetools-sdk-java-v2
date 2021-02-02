
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
@JsonDeserialize(as = ProductTypeChangePlainEnumValueLabelActionImpl.class)
public interface ProductTypeChangePlainEnumValueLabelAction extends ProductTypeUpdateAction {

    String CHANGE_PLAIN_ENUM_VALUE_LABEL = "changePlainEnumValueLabel";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

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
}
