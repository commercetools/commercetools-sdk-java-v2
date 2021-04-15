package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetCustomFieldActionImpl.class)
public interface DiscountCodeSetCustomFieldAction extends DiscountCodeUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public Object getValue();

    
    public void setName(final String name);
    
    
    
    public void setValue(final Object value);
    

    public static DiscountCodeSetCustomFieldAction of(){
        return new DiscountCodeSetCustomFieldActionImpl();
    }
    

    public static DiscountCodeSetCustomFieldAction of(final DiscountCodeSetCustomFieldAction template) {
        DiscountCodeSetCustomFieldActionImpl instance = new DiscountCodeSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static DiscountCodeSetCustomFieldActionBuilder builder(){
        return DiscountCodeSetCustomFieldActionBuilder.of();
    }
    
    public static DiscountCodeSetCustomFieldActionBuilder builder(final DiscountCodeSetCustomFieldAction template){
        return DiscountCodeSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withDiscountCodeSetCustomFieldAction(Function<DiscountCodeSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
