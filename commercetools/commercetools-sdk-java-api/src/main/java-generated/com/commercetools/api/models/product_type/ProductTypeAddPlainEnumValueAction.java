package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueActionImpl;

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
@JsonDeserialize(as = ProductTypeAddPlainEnumValueActionImpl.class)
public interface ProductTypeAddPlainEnumValueAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @NotNull
    @Valid
    @JsonProperty("value")
    public AttributePlainEnumValue getValue();

    public void setAttributeName(final String attributeName);
    
    public void setValue(final AttributePlainEnumValue value);

    public static ProductTypeAddPlainEnumValueActionImpl of(){
        return new ProductTypeAddPlainEnumValueActionImpl();
    }
    

    public static ProductTypeAddPlainEnumValueActionImpl of(final ProductTypeAddPlainEnumValueAction template) {
        ProductTypeAddPlainEnumValueActionImpl instance = new ProductTypeAddPlainEnumValueActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T extends Accessor<ProductTypeAddPlainEnumValueAction>> T withProductTypeAddPlainEnumValueAction(Function<ProductTypeAddPlainEnumValueAction, T> helper) {
        return helper.apply(this);
    }
}
