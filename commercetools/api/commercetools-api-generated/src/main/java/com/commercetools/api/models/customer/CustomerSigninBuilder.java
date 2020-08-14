package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.AnonymousCartSignInMode;
import com.commercetools.api.models.customer.CustomerSignin;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSigninBuilder {

    
    private String email;
    
    
    private String password;
    
    @Nullable
    private String anonymousCartId;
    
    @Nullable
    private com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;
    
    @Nullable
    private String anonymousId;
    
    @Nullable
    private Boolean updateProductData;

    public CustomerSigninBuilder email( final String email) {
        this.email = email;
        return this;
    }
    
    public CustomerSigninBuilder password( final String password) {
        this.password = password;
        return this;
    }
    
    public CustomerSigninBuilder anonymousCartId(@Nullable final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
        return this;
    }
    
    public CustomerSigninBuilder anonymousCartSignInMode(@Nullable final com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode) {
        this.anonymousCartSignInMode = anonymousCartSignInMode;
        return this;
    }
    
    public CustomerSigninBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }
    
    public CustomerSigninBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    
    public String getEmail(){
        return this.email;
    }
    
    
    public String getPassword(){
        return this.password;
    }
    
    @Nullable
    public String getAnonymousCartId(){
        return this.anonymousCartId;
    }
    
    @Nullable
    public com.commercetools.api.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode(){
        return this.anonymousCartSignInMode;
    }
    
    @Nullable
    public String getAnonymousId(){
        return this.anonymousId;
    }
    
    @Nullable
    public Boolean getUpdateProductData(){
        return this.updateProductData;
    }

    public CustomerSignin build() {
        return new CustomerSigninImpl(email, password, anonymousCartId, anonymousCartSignInMode, anonymousId, updateProductData);
    }

    public static CustomerSigninBuilder of() {
        return new CustomerSigninBuilder();
    }

    public static CustomerSigninBuilder of(final CustomerSignin template) {
        CustomerSigninBuilder builder = new CustomerSigninBuilder();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.anonymousCartId = template.getAnonymousCartId();
        builder.anonymousCartSignInMode = template.getAnonymousCartSignInMode();
        builder.anonymousId = template.getAnonymousId();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
