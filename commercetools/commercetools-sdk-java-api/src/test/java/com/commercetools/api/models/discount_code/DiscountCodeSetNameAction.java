package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetNameActionImpl.class)
public interface DiscountCodeSetNameAction extends DiscountCodeUpdateAction {

    String SET_NAME = "setName";

    /**
    *  <p>If the <code>name</code> parameter is not included, the field will be emptied.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    
    public void setName(final LocalizedString name);
    

    public static DiscountCodeSetNameAction of(){
        return new DiscountCodeSetNameActionImpl();
    }
    

    public static DiscountCodeSetNameAction of(final DiscountCodeSetNameAction template) {
        DiscountCodeSetNameActionImpl instance = new DiscountCodeSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static DiscountCodeSetNameActionBuilder builder(){
        return DiscountCodeSetNameActionBuilder.of();
    }
    
    public static DiscountCodeSetNameActionBuilder builder(final DiscountCodeSetNameAction template){
        return DiscountCodeSetNameActionBuilder.of(template);
    }
    

    default <T> T withDiscountCodeSetNameAction(Function<DiscountCodeSetNameAction, T> helper) {
        return helper.apply(this);
    }
}
