package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.UserProvidedIdentifiersImpl;

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
@JsonDeserialize(as = UserProvidedIdentifiersImpl.class)
public interface UserProvidedIdentifiers  {


    
    
    @JsonProperty("key")
    public String getKey();
    
    
    @JsonProperty("externalId")
    public String getExternalId();
    
    
    @JsonProperty("orderNumber")
    public String getOrderNumber();
    
    
    @JsonProperty("customerNumber")
    public String getCustomerNumber();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    
    public void setKey(final String key);
    
    
    
    public void setExternalId(final String externalId);
    
    
    
    public void setOrderNumber(final String orderNumber);
    
    
    
    public void setCustomerNumber(final String customerNumber);
    
    
    
    public void setSku(final String sku);
    
    
    
    public void setSlug(final LocalizedString slug);
    

    public static UserProvidedIdentifiers of(){
        return new UserProvidedIdentifiersImpl();
    }
    

    public static UserProvidedIdentifiers of(final UserProvidedIdentifiers template) {
        UserProvidedIdentifiersImpl instance = new UserProvidedIdentifiersImpl();
        instance.setKey(template.getKey());
        instance.setExternalId(template.getExternalId());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setSku(template.getSku());
        instance.setSlug(template.getSlug());
        return instance;
    }

    public static UserProvidedIdentifiersBuilder builder(){
        return UserProvidedIdentifiersBuilder.of();
    }
    
    public static UserProvidedIdentifiersBuilder builder(final UserProvidedIdentifiers template){
        return UserProvidedIdentifiersBuilder.of(template);
    }
    

    default <T> T withUserProvidedIdentifiers(Function<UserProvidedIdentifiers, T> helper) {
        return helper.apply(this);
    }
}
