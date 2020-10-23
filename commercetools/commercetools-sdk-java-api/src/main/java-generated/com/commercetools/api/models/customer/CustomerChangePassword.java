package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.CustomerChangePasswordImpl;

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
@JsonDeserialize(as = CustomerChangePasswordImpl.class)
public interface CustomerChangePassword  {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("currentPassword")
    public String getCurrentPassword();
    
    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCurrentPassword(final String currentPassword);
    
    public void setNewPassword(final String newPassword);

    public static CustomerChangePasswordImpl of(){
        return new CustomerChangePasswordImpl();
    }
    

    public static CustomerChangePasswordImpl of(final CustomerChangePassword template) {
        CustomerChangePasswordImpl instance = new CustomerChangePasswordImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    default <T> T withCustomerChangePassword(Function<CustomerChangePassword, T> helper) {
        return helper.apply(this);
    }
}
