package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidItemShippingDetailsErrorImpl;

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
@JsonDeserialize(as = InvalidItemShippingDetailsErrorImpl.class)
public interface InvalidItemShippingDetailsError extends ErrorObject {

    
    @NotNull
    @JsonProperty("subject")
    public String getSubject();
    
    @NotNull
    @JsonProperty("itemId")
    public String getItemId();

    public void setSubject(final String subject);
    
    public void setItemId(final String itemId);

    public static InvalidItemShippingDetailsErrorImpl of(){
        return new InvalidItemShippingDetailsErrorImpl();
    }
    

    public static InvalidItemShippingDetailsErrorImpl of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorImpl instance = new InvalidItemShippingDetailsErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setSubject(template.getSubject());
        instance.setItemId(template.getItemId());
        return instance;
    }

}
