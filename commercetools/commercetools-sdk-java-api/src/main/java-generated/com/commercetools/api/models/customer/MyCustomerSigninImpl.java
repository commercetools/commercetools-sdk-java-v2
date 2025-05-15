
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * MyCustomerSignin
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSigninImpl implements MyCustomerSignin, ModelBase {

    private String email;

    private String password;

    private com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode;

    private Boolean updateProductData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerSigninImpl(@JsonProperty("email") final String email, @JsonProperty("password") final String password,
            @JsonProperty("activeCartSignInMode") final com.commercetools.api.models.customer.AnonymousCartSignInMode activeCartSignInMode,
            @JsonProperty("updateProductData") final Boolean updateProductData) {
        this.email = email;
        this.password = password;
        this.activeCartSignInMode = activeCartSignInMode;
        this.updateProductData = updateProductData;
    }

    /**
     * create empty instance
     */
    public MyCustomerSigninImpl() {
    }

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Password of the Customer.</p>
     */

    public String getPassword() {
        return this.password;
    }

    /**
     *  <ul>
     *   <li>If <code>MergeWithExistingCustomerCart</code>, LineItems of the anonymous Cart are merged with the recently modified active Customer Cart.</li>
     *   <li>If <code>UseAsNewActiveCustomerCart</code>, the anonymous Cart is used as the new active Customer Cart, and no LineItems are merged.</li>
     *  </ul>
     */

    public com.commercetools.api.models.customer.AnonymousCartSignInMode getActiveCartSignInMode() {
        return this.activeCartSignInMode;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart is updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates are updated.</li>
     *  </ul>
     */

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
                .append(email, that.email)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("email", email)
                .append("password", password)
                .append("activeCartSignInMode", activeCartSignInMode)
                .append("updateProductData", updateProductData)
                .build();
    }

    @Override
    public MyCustomerSignin copyDeep() {
        return MyCustomerSignin.deepCopy(this);
    }
}
