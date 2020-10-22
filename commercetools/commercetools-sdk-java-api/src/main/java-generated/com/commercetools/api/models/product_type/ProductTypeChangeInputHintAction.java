package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.TextInputHint;
import com.commercetools.api.models.product_type.ProductTypeChangeInputHintActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeInputHintActionImpl.class)
public interface ProductTypeChangeInputHintAction extends ProductTypeUpdateAction {

    
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();
    
    @NotNull
    @JsonProperty("newValue")
    public TextInputHint getNewValue();

    public void setAttributeName(final String attributeName);
    
    public void setNewValue(final TextInputHint newValue);

    public static ProductTypeChangeInputHintActionImpl of(){
        return new ProductTypeChangeInputHintActionImpl();
    }
    

    public static ProductTypeChangeInputHintActionImpl of(final ProductTypeChangeInputHintAction template) {
        ProductTypeChangeInputHintActionImpl instance = new ProductTypeChangeInputHintActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setNewValue(template.getNewValue());
        return instance;
    }

    default <T extends Accessor<ProductTypeChangeInputHintAction>> T withProductTypeChangeInputHintAction(Function<ProductTypeChangeInputHintAction, T> helper) {
        return helper.apply(this);
    }
}
