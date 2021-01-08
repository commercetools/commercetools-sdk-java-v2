package com.commercetools.api.models.customer;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.customer.AnonymousCartSignInMode;
import com.commercetools.api.models.customer.CustomerSigninImpl;

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
@JsonDeserialize(as = CustomerSigninImpl.class)
public interface CustomerSignin  {

    
    @NotNull
    @JsonProperty("email")
    public String getEmail();
    
    @NotNull
    @JsonProperty("password")
    public String getPassword();
    
    
    @JsonProperty("anonymousCartId")
    public String getAnonymousCartId();
    
    @Valid
    @JsonProperty("anonymousCart")
    public CartResourceIdentifier getAnonymousCart();
    
    
    @JsonProperty("anonymousCartSignInMode")
    public AnonymousCartSignInMode getAnonymousCartSignInMode();
    
    
    @JsonProperty("anonymousId")
    public String getAnonymousId();
    
    
    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setEmail(final String email);
    
    public void setPassword(final String password);
    
    public void setAnonymousCartId(final String anonymousCartId);
    
    public void setAnonymousCart(final CartResourceIdentifier anonymousCart);
    
    public void setAnonymousCartSignInMode(final AnonymousCartSignInMode anonymousCartSignInMode);
    
    public void setAnonymousId(final String anonymousId);
    
    public void setUpdateProductData(final Boolean updateProductData);

    public static CustomerSignin of(){
        return new CustomerSigninImpl();
    }
    

    public static CustomerSignin of(final CustomerSignin template) {
        CustomerSigninImpl instance = new CustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setAnonymousCartId(template.getAnonymousCartId());
        instance.setAnonymousCart(template.getAnonymousCart());
        instance.setAnonymousCartSignInMode(template.getAnonymousCartSignInMode());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public static CustomerSigninBuilder builder(){
        return CustomerSigninBuilder.of();
    }
    
    public static CustomerSigninBuilder builder(final CustomerSignin template){
        return CustomerSigninBuilder.of(template);
    }
    

    default <T> T withCustomerSignin(Function<CustomerSignin, T> helper) {
        return helper.apply(this);
    }
}
