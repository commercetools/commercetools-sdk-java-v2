package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.CustomerResetPasswordImpl;

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
@JsonDeserialize(as = CustomerResetPasswordImpl.class)
public interface CustomerResetPassword  {

    
    @NotNull
    @JsonProperty("tokenValue")
    public String getTokenValue();
    
    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();
    
    
    @JsonProperty("version")
    public Long getVersion();

    public void setTokenValue(final String tokenValue);
    
    public void setNewPassword(final String newPassword);
    
    public void setVersion(final Long version);

    public static CustomerResetPasswordImpl of(){
        return new CustomerResetPasswordImpl();
    }
    

    public static CustomerResetPasswordImpl of(final CustomerResetPassword template) {
        CustomerResetPasswordImpl instance = new CustomerResetPasswordImpl();
        instance.setTokenValue(template.getTokenValue());
        instance.setNewPassword(template.getNewPassword());
        instance.setVersion(template.getVersion());
        return instance;
    }

    default <T> T withCustomerResetPassword(Function<CustomerResetPassword, T> helper) {
        return helper.apply(this);
    }
}
