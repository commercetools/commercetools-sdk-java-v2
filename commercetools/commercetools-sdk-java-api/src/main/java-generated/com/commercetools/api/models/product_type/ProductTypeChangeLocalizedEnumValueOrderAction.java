package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeChangeLocalizedEnumValueOrderActionImpl.class)
public interface ProductTypeChangeLocalizedEnumValueOrderAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributeLocalizedEnumValue> getValues();

    public void setAttributeName(final String attributeName);
    
    public void setValues(final List<AttributeLocalizedEnumValue> values);

    public static ProductTypeChangeLocalizedEnumValueOrderActionImpl of(){
        return new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
    }
    

    public static ProductTypeChangeLocalizedEnumValueOrderActionImpl of(final ProductTypeChangeLocalizedEnumValueOrderAction template) {
        ProductTypeChangeLocalizedEnumValueOrderActionImpl instance = new ProductTypeChangeLocalizedEnumValueOrderActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setValues(template.getValues());
        return instance;
    }

}
