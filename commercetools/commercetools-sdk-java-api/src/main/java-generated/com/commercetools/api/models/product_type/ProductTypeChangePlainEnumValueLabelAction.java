package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeChangePlainEnumValueLabelActionImpl.class)
public interface ProductTypeChangePlainEnumValueLabelAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @NotNull
    @Valid
    @JsonProperty("newValue")
    public AttributePlainEnumValue getNewValue();

    public void setAttributeName(final String attributeName);
    
    public void setNewValue(final AttributePlainEnumValue newValue);

    public static ProductTypeChangePlainEnumValueLabelActionImpl of(){
        return new ProductTypeChangePlainEnumValueLabelActionImpl();
    }
    

    public static ProductTypeChangePlainEnumValueLabelActionImpl of(final ProductTypeChangePlainEnumValueLabelAction template) {
        ProductTypeChangePlainEnumValueLabelActionImpl instance = new ProductTypeChangePlainEnumValueLabelActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    default <T extends Accessor<ProductTypeChangePlainEnumValueLabelAction>> T withProductTypeChangePlainEnumValueLabelAction(Function<ProductTypeChangePlainEnumValueLabelAction, T> helper) {
        return helper.apply(this);
    }
}
