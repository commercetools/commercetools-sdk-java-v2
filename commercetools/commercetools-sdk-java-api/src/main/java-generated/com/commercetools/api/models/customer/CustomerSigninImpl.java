
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
 * CustomerSignin
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSigninImpl implements CustomerSignin, ModelBase {

    private String email;

    private String password;

    @Deprecated
    private String anonymousCartId;

    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    private com.commercetools.api.models.customer.AnonymousCartSignInMode anonymousCartSignInMode;

    private String anonymousId;

    private Boolean updateProductData;

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public CustomerSigninImpl() {
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
     *  <p>Deprecated since it is now possible to identify an anonymous cart by using its <code>id</code> or external <code>key</code>.</p>
     */
    @Deprecated
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    /**
     *  <p>Identifies a Cart that will be assigned to the Customer.</p>
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    /**
     *  <ul>
     *   <li>Set to <code>MergeWithExistingCustomerCart</code> if LineItems of the anonymous Cart should be merged with the active Customer Cart that has been modified most recently.</li>
     *   <li>Set to <code>UseAsNewActiveCustomerCart</code> if the anonymous Cart should be used as the new active Customer Cart and no LineItems are to be merged.</li>
     *  </ul>
     */

    public com.commercetools.api.models.customer.AnonymousCartSignInMode getAnonymousCartSignInMode() {
        return this.anonymousCartSignInMode;
    }

    /**
     *  <p>If both <code>anonymousCart</code> and <code>anonymousId</code> are provided, the <code>anonymousId</code> on the CustomerSignin must match that of the anonymous Cart. Otherwise a 400 Bad Request <code>Invalid Operation</code> error is returned with the message: "Cart with the ID cart-id does not have the expected anonymousId.".</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart will be updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates will be updated.</li>
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
                .append(email, that.email)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("email", email)
                .append("password", password)
                .append("anonymousCartId", anonymousCartId)
                .append("anonymousCart", anonymousCart)
                .append("anonymousCartSignInMode", anonymousCartSignInMode)
                .append("anonymousId", anonymousId)
                .append("updateProductData", updateProductData)
                .build();
    }

}
