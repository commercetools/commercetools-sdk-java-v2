
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
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodDefaultSetMessage" rel="nofollow">PaymentMethodDefaultSet</a> Message.</p>
 *  <p>An inactive Payment Method cannot be set as the default, and the action will return an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetDefaultActionImpl implements PaymentMethodSetDefaultAction, ModelBase {

    private String action;

    private Boolean _default;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodSetDefaultActionImpl(@JsonProperty("default") final Boolean _default) {
        this._default = _default;
        this.action = SET_DEFAULT;
    }

    /**
     * create empty instance
     */
    public PaymentMethodSetDefaultActionImpl() {
        this.action = SET_DEFAULT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public Boolean getDefault() {
        return this._default;
    }

    public void setDefault(final Boolean _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodSetDefaultActionImpl that = (PaymentMethodSetDefaultActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(_default, that._default)
                .append(action, that.action)
                .append(_default, that._default)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(_default).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("default", _default)
                .build();
    }

    @Override
    public PaymentMethodSetDefaultAction copyDeep() {
        return PaymentMethodSetDefaultAction.deepCopy(this);
    }
}
