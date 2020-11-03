package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeSetKeyActionImpl;

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
@JsonDeserialize(as = ProductTypeSetKeyActionImpl.class)
public interface ProductTypeSetKeyAction extends ProductTypeUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductTypeSetKeyActionImpl of(){
        return new ProductTypeSetKeyActionImpl();
    }
    

    public static ProductTypeSetKeyActionImpl of(final ProductTypeSetKeyAction template) {
        ProductTypeSetKeyActionImpl instance = new ProductTypeSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withProductTypeSetKeyAction(Function<ProductTypeSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
