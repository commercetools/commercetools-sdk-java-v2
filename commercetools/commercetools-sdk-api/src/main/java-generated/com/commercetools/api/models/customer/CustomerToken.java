package com.commercetools.api.models.customer;

import java.time.ZonedDateTime;
import com.commercetools.api.models.customer.CustomerTokenImpl;

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
@JsonDeserialize(as = CustomerTokenImpl.class)
public interface CustomerToken  {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    
    @NotNull
    @JsonProperty("customerId")
    public String getCustomerId();
    
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();
    
    @NotNull
    @JsonProperty("value")
    public String getValue();

    public void setId(final String id);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    public void setCustomerId(final String customerId);
    
    public void setExpiresAt(final ZonedDateTime expiresAt);
    
    public void setValue(final String value);

    public static CustomerTokenImpl of(){
        return new CustomerTokenImpl();
    }
    

    public static CustomerTokenImpl of(final CustomerToken template) {
        CustomerTokenImpl instance = new CustomerTokenImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setValue(template.getValue());
        return instance;
    }

}
