package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveActionImpl;

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
@JsonDeserialize(as = DiscountCodeChangeIsActiveActionImpl.class)
public interface DiscountCodeChangeIsActiveAction extends DiscountCodeUpdateAction {

    
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    public void setIsActive(final Boolean isActive);

    public static DiscountCodeChangeIsActiveActionImpl of(){
        return new DiscountCodeChangeIsActiveActionImpl();
    }
    

    public static DiscountCodeChangeIsActiveActionImpl of(final DiscountCodeChangeIsActiveAction template) {
        DiscountCodeChangeIsActiveActionImpl instance = new DiscountCodeChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

}
