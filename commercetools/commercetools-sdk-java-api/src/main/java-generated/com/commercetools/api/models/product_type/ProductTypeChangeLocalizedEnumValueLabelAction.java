
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
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueLabelActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueLabelAction extends ProductTypeUpdateAction {

    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL = "changeLocalizedEnumValueLabel";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @Valid
    @JsonProperty("newValue")
    public AttributeLocalizedEnumValue getNewValue();

    public void setAttributeName(final String attributeName);

    public void setNewValue(final AttributeLocalizedEnumValue newValue);

    public static ProductTypeChangeLocalizedEnumValueLabelAction of() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionImpl();
    }

    public static ProductTypeChangeLocalizedEnumValueLabelAction of(
            final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        ProductTypeChangeLocalizedEnumValueLabelActionImpl instance = new ProductTypeChangeLocalizedEnumValueLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder() {
        return ProductTypeChangeLocalizedEnumValueLabelActionBuilder.of();
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionBuilder builder(
            final ProductTypeChangeLocalizedEnumValueLabelAction template) {
        return ProductTypeChangeLocalizedEnumValueLabelActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeLocalizedEnumValueLabelAction(
            Function<ProductTypeChangeLocalizedEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }
}
