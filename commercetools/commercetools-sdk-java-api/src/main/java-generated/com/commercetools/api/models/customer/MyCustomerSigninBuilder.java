
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCustomerSigninBuilder implements Builder<MyCustomerSignin> {

    private String email;

    private String password;

    @Nullable
    private com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode;

    @Nullable
    private Boolean updateProductData;

    public MyCustomerSigninBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public MyCustomerSigninBuilder password(final String password) {
        this.password = password;
        return this;
    }

    public MyCustomerSigninBuilder activeCartSignInMode(
            @Nullable final com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode) {
        this.activeCartSignInMode = activeCartSignInMode;
        return this;
    }

    public MyCustomerSigninBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Nullable
    public com.commercetools.api.models.customer.AnonymousCartSignInMode getActiveCartSignInMode() {
        return this.activeCartSignInMode;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public MyCustomerSignin build() {
        Objects.requireNonNull(email, MyCustomerSignin.class + ": email is missing");
        Objects.requireNonNull(password, MyCustomerSignin.class + ": password is missing");
        return new MyCustomerSigninImpl(email, password, activeCartSignInMode, updateProductData);
    }

    /**
     * builds MyCustomerSignin without checking for non null required values
     */
    public MyCustomerSignin buildUnchecked() {
        return new MyCustomerSigninImpl(email, password, activeCartSignInMode, updateProductData);
    }

    public static MyCustomerSigninBuilder of() {
        return new MyCustomerSigninBuilder();
    }

    public static MyCustomerSigninBuilder of(final MyCustomerSignin template) {
        MyCustomerSigninBuilder builder = new MyCustomerSigninBuilder();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.activeCartSignInMode = template.getActiveCartSignInMode();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
