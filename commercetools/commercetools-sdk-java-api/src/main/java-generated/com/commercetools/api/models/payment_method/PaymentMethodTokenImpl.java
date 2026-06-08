
package com.commercetools.api.models.payment_method;

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
 * PaymentMethodToken
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodTokenImpl implements PaymentMethodToken, ModelBase {

    private String value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodTokenImpl(@JsonProperty("value") final String value) {
        this.value = value;
    }

    /**
     * create empty instance
     */
    public PaymentMethodTokenImpl() {
    }

    /**
     *  <p>Tokenized representation of the Payment Method.</p>
     *  <p>It is <em>displayed</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of an API Extension for Payments and PaymentMethods</li>
     *   <li>when querying Payments and PaymentMethods</li>
     *  </ul>
     *  <p>It is <em>masked</em> in the following instances:</p>
     *  <ul>
     *   <li>in the payload of Payment and PaymentMethod messages</li>
     *   <li>when querying MyPayments</li>
     *   <li>in referenced Payments and PaymentMethods embedded through <span>Reference Expansion</span></li>
     *  </ul>
     */

    public String getValue() {
        return this.value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodTokenImpl that = (PaymentMethodTokenImpl) o;

        return new EqualsBuilder().append(value, that.value).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value).build();
    }

    @Override
    public PaymentMethodToken copyDeep() {
        return PaymentMethodToken.deepCopy(this);
    }
}
