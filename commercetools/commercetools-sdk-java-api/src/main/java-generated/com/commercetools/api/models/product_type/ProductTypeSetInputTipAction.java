package com.commercetools.api.models.product_type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipActionImpl;

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
@JsonDeserialize(as = ProductTypeSetInputTipActionImpl.class)
public interface ProductTypeSetInputTipAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    public void setAttributeName(final String attributeName);
    
    public void setInputTip(final LocalizedString inputTip);

    public static ProductTypeSetInputTipActionImpl of(){
        return new ProductTypeSetInputTipActionImpl();
    }
    

    public static ProductTypeSetInputTipActionImpl of(final ProductTypeSetInputTipAction template) {
        ProductTypeSetInputTipActionImpl instance = new ProductTypeSetInputTipActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setInputTip(template.getInputTip());
        return instance;
    }

    default <T> T withProductTypeSetInputTipAction(Function<ProductTypeSetInputTipAction, T> helper) {
        return helper.apply(this);
    }
}
