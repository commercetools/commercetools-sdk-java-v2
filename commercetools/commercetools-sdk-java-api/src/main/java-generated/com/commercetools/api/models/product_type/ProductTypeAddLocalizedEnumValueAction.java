
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
@JsonDeserialize(as = ProductTypeAddLocalizedEnumValueActionImpl.class)
public interface ProductTypeAddLocalizedEnumValueAction extends ProductTypeUpdateAction {

    String ADD_LOCALIZED_ENUM_VALUE = "addLocalizedEnumValue";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

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
}
