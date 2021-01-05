package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartRecalculateActionImpl;

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
@JsonDeserialize(as = MyCartRecalculateActionImpl.class)
public interface MyCartRecalculateAction extends MyCartUpdateAction {

    
    
    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setUpdateProductData(final Boolean updateProductData);

    public static MyCartRecalculateAction of(){
        return new MyCartRecalculateActionImpl();
    }
    

    public static MyCartRecalculateAction of(final MyCartRecalculateAction template) {
        MyCartRecalculateActionImpl instance = new MyCartRecalculateActionImpl();
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public static MyCartRecalculateActionBuilder builder(){
        return MyCartRecalculateActionBuilder.of();
    }
    
    public static MyCartRecalculateActionBuilder builder(final MyCartRecalculateAction template){
        return MyCartRecalculateActionBuilder.of(template);
    }
    

    default <T> T withMyCartRecalculateAction(Function<MyCartRecalculateAction, T> helper) {
        return helper.apply(this);
    }
}
