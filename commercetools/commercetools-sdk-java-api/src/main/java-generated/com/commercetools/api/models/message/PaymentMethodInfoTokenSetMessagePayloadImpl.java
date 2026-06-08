
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoTokenSetMessagePayloadImpl implements PaymentMethodInfoTokenSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    private com.commercetools.api.models.payment_method.PaymentMethodToken oldToken;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoTokenSetMessagePayloadImpl(
            @JsonProperty("token") final com.commercetools.api.models.payment_method.PaymentMethodToken token,
            @JsonProperty("oldToken") final com.commercetools.api.models.payment_method.PaymentMethodToken oldToken) {
        this.token = token;
        this.oldToken = oldToken;
        this.type = PAYMENT_METHOD_INFO_TOKEN_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoTokenSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_INFO_TOKEN_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Token of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    /**
     *  <p>Token of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfo Token</a> update action.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodToken getOldToken() {
        return this.oldToken;
    }

    public void setToken(final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
    }

    public void setOldToken(final com.commercetools.api.models.payment_method.PaymentMethodToken oldToken) {
        this.oldToken = oldToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoTokenSetMessagePayloadImpl that = (PaymentMethodInfoTokenSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(token, that.token)
                .append(oldToken, that.oldToken)
                .append(type, that.type)
                .append(token, that.token)
                .append(oldToken, that.oldToken)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(token).append(oldToken).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("token", token)
                .append("oldToken", oldToken)
                .build();
    }

    @Override
    public PaymentMethodInfoTokenSetMessagePayload copyDeep() {
        return PaymentMethodInfoTokenSetMessagePayload.deepCopy(this);
    }
}
