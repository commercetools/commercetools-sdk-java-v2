
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSigninImpl.class)
public interface CustomerSignin {

    @NotNull
    @JsonProperty("email")
    public String getEmail();

    @NotNull
    @JsonProperty("password")
    public String getPassword();

    @Deprecated
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

    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId);

    public void setAnonymousCart(final CartResourceIdentifier anonymousCart);

    public void setAnonymousCartSignInMode(final AnonymousCartSignInMode anonymousCartSignInMode);

    public void setAnonymousId(final String anonymousId);

    public void setUpdateProductData(final Boolean updateProductData);

    public static CustomerSignin of() {
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

    public static CustomerSigninBuilder builder() {
        return CustomerSigninBuilder.of();
    }

    public static CustomerSigninBuilder builder(final CustomerSignin template) {
        return CustomerSigninBuilder.of(template);
    }

    default <T> T withCustomerSignin(Function<CustomerSignin, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSignin> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSignin>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSignin>";
            }
        };
    }
}
