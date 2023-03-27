
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

/**
 * MyCustomerEmailVerify
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerEmailVerifyImpl implements MyCustomerEmailVerify, ModelBase {

    private String tokenValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerEmailVerifyImpl(@JsonProperty("tokenValue") final String tokenValue) {
        this.tokenValue = tokenValue;
    }

    /**
     * create empty instance
     */
    public MyCustomerEmailVerifyImpl() {
    }

    /**
     *  <p>Value of the token to verify Customer email.</p>
     */

    public String getTokenValue() {
        return this.tokenValue;
    }

    public void setTokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerEmailVerifyImpl that = (MyCustomerEmailVerifyImpl) o;

        return new EqualsBuilder().append(tokenValue, that.tokenValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tokenValue).toHashCode();
    }

}
