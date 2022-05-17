
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSigninImpl.class)
public interface MyCustomerSignin {

    @NotNull
    @JsonProperty("email")
    public String getEmail();

    @NotNull
    @JsonProperty("password")
    public String getPassword();

    @JsonProperty("activeCartSignInMode")
    public AnonymousCartSignInMode getActiveCartSignInMode();

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setEmail(final String email);

    public void setPassword(final String password);

    public void setActiveCartSignInMode(final AnonymousCartSignInMode activeCartSignInMode);

    public void setUpdateProductData(final Boolean updateProductData);

    public static MyCustomerSignin of() {
        return new MyCustomerSigninImpl();
    }

    public static MyCustomerSignin of(final MyCustomerSignin template) {
        MyCustomerSigninImpl instance = new MyCustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setActiveCartSignInMode(template.getActiveCartSignInMode());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public static MyCustomerSigninBuilder builder() {
        return MyCustomerSigninBuilder.of();
    }

    public static MyCustomerSigninBuilder builder(final MyCustomerSignin template) {
        return MyCustomerSigninBuilder.of(template);
    }

    default <T> T withMyCustomerSignin(Function<MyCustomerSignin, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSignin> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSignin>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSignin>";
            }
        };
    }
}
