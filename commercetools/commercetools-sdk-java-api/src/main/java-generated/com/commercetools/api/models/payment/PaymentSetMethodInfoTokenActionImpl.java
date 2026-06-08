
package com.commercetools.api.models.payment;

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
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfoTokenSetMessage" rel="nofollow">PaymentMethodInfoTokenSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoTokenActionImpl implements PaymentSetMethodInfoTokenAction, ModelBase {

    private String action;

    private com.commercetools.api.models.payment_method.PaymentMethodToken token;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetMethodInfoTokenActionImpl(
            @JsonProperty("token") final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
        this.action = SET_METHOD_INFO_TOKEN;
    }

    /**
     * create empty instance
     */
    public PaymentSetMethodInfoTokenActionImpl() {
        this.action = SET_METHOD_INFO_TOKEN;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.payment_method.PaymentMethodToken getToken() {
        return this.token;
    }

    public void setToken(final com.commercetools.api.models.payment_method.PaymentMethodToken token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetMethodInfoTokenActionImpl that = (PaymentSetMethodInfoTokenActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(token, that.token)
                .append(action, that.action)
                .append(token, that.token)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(token).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("token", token)
                .build();
    }

    @Override
    public PaymentSetMethodInfoTokenAction copyDeep() {
        return PaymentSetMethodInfoTokenAction.deepCopy(this);
    }
}
