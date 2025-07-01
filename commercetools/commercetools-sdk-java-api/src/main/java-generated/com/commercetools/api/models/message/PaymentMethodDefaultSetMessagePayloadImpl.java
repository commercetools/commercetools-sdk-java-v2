
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
 *  <p>Generated after a successful Set Default update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodDefaultSetMessagePayloadImpl implements PaymentMethodDefaultSetMessagePayload, ModelBase {

    private String type;

    private Boolean _default;

    private Boolean oldDefault;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodDefaultSetMessagePayloadImpl(@JsonProperty("default") final Boolean _default,
            @JsonProperty("oldDefault") final Boolean oldDefault) {
        this._default = _default;
        this.oldDefault = oldDefault;
        this.type = PAYMENT_METHOD_DEFAULT_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodDefaultSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_DEFAULT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Default Payment Method after the Set Default update action.</p>
     */

    public Boolean getDefault() {
        return this._default;
    }

    /**
     *  <p>Default Payment Method before the Set Default update action.</p>
     */

    public Boolean getOldDefault() {
        return this.oldDefault;
    }

    public void setDefault(final Boolean _default) {
        this._default = _default;
    }

    public void setOldDefault(final Boolean oldDefault) {
        this.oldDefault = oldDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodDefaultSetMessagePayloadImpl that = (PaymentMethodDefaultSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(_default, that._default)
                .append(oldDefault, that.oldDefault)
                .append(type, that.type)
                .append(_default, that._default)
                .append(oldDefault, that.oldDefault)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(_default).append(oldDefault).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("default", _default)
                .append("oldDefault", oldDefault)
                .build();
    }

    @Override
    public PaymentMethodDefaultSetMessagePayload copyDeep() {
        return PaymentMethodDefaultSetMessagePayload.deepCopy(this);
    }
}
