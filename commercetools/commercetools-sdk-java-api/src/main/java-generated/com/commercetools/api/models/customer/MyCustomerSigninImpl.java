
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
public class MyCustomerSigninImpl implements MyCustomerSignin, ModelBase {

    private String email;

    private String password;

    private com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode;

    private Boolean updateProductData;

    @JsonCreator
    MyCustomerSigninImpl(@JsonProperty("email") final String email, @JsonProperty("password") final String password,
            @JsonProperty("activeCartSignInMode") final com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode,
            @JsonProperty("updateProductData") final Boolean updateProductData) {
        this.email = email;
        this.password = password;
        this.activeCartSignInMode = activeCartSignInMode;
        this.updateProductData = updateProductData;
    }

    public MyCustomerSigninImpl() {
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public com.commercetools.api.models.customer.AnonymousCartSignInMode getActiveCartSignInMode() {
        return this.activeCartSignInMode;
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

    public void setActiveCartSignInMode(
            final com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode) {
        this.activeCartSignInMode = activeCartSignInMode;
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

        MyCustomerSigninImpl that = (MyCustomerSigninImpl) o;

        return new EqualsBuilder().append(email, that.email)
                .append(password, that.password)
                .append(activeCartSignInMode, that.activeCartSignInMode)
                .append(updateProductData, that.updateProductData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(email)
                .append(password)
                .append(activeCartSignInMode)
                .append(updateProductData)
                .toHashCode();
    }

}
