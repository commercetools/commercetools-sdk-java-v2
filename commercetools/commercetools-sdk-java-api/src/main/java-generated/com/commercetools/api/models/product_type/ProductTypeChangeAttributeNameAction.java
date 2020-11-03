package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeChangeAttributeNameActionImpl.class)
public interface ProductTypeChangeAttributeNameAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @NotNull
    @JsonProperty("newAttributeName")
    public String getNewAttributeName();

    public void setAttributeName(final String attributeName);
    
    public void setNewAttributeName(final String newAttributeName);

    public static ProductTypeChangeAttributeNameActionImpl of(){
        return new ProductTypeChangeAttributeNameActionImpl();
    }
    

    public static ProductTypeChangeAttributeNameActionImpl of(final ProductTypeChangeAttributeNameAction template) {
        ProductTypeChangeAttributeNameActionImpl instance = new ProductTypeChangeAttributeNameActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewAttributeName(template.getNewAttributeName());
        return instance;
    }

    default <T> T withProductTypeChangeAttributeNameAction(Function<ProductTypeChangeAttributeNameAction, T> helper) {
        return helper.apply(this);
    }
}
