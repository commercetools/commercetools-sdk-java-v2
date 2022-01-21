
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerSigninImpl implements CustomerSignin, ModelBase {

    private String email;

    private String password;

    @Deprecated
    private String anonymousCartId;

    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    private com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;

    private String anonymousId;

    private Boolean updateProductData;

    @JsonCreator
    CustomerSigninImpl(@JsonProperty("email") final String email, @JsonProperty("password") final String password,
            @JsonProperty("anonymousCartId") final String anonymousCartId,
            @JsonProperty("anonymousCart") final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart,
            @JsonProperty("anonymousCartSignInMode") final com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("updateProductData") final Boolean updateProductData) {
        this.email = email;
        this.password = password;
        this.anonymousCartId = anonymousCartId;
        this.anonymousCart = anonymousCart;
        this.anonymousCartSignInMode = anonymousCartSignInMode;
        this.anonymousId = anonymousId;
        this.updateProductData = updateProductData;
    }

    public CustomerSigninImpl() {
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Deprecated
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    public com.commercetools.api.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode() {
        return this.anonymousCartSignInMode;
    }

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
    }

    public void setAnonymousCart(final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
    }

    public void setAnonymousCartSignInMode(
            final com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode) {
        this.anonymousCartSignInMode = anonymousCartSignInMode;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setUpdateProductData(final Boolean updateProductData) {
        this.updateProductData = updateProductData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSigninImpl that = (CustomerSigninImpl) o;

        return new EqualsBuilder().append(email, that.email)
                .append(password, that.password)
                .append(anonymousCartId, that.anonymousCartId)
                .append(anonymousCart, that.anonymousCart)
                .append(anonymousCartSignInMode, that.anonymousCartSignInMode)
                .append(anonymousId, that.anonymousId)
                .append(updateProductData, that.updateProductData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(email)
                .append(password)
                .append(anonymousCartId)
                .append(anonymousCart)
                .append(anonymousCartSignInMode)
                .append(anonymousId)
                .append(updateProductData)
                .toHashCode();
    }

}
