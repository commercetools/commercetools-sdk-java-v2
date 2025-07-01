
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
 *  <p>Generated after a successful Set MethodInfo Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoNameSetMessagePayloadImpl implements PaymentMethodInfoNameSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString oldName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoNameSetMessagePayloadImpl(
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("oldName") final com.commercetools.api.models.common.LocalizedString oldName) {
        this.name = name;
        this.oldName = oldName;
        this.type = PAYMENT_METHOD_INFO_NAME_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoNameSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_INFO_NAME_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Payment Method after the Set MethodInfo Name update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Name of the Payment Method before the Set MethodInfo Name update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getOldName() {
        return this.oldName;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setOldName(final com.commercetools.api.models.common.LocalizedString oldName) {
        this.oldName = oldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoNameSetMessagePayloadImpl that = (PaymentMethodInfoNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(oldName, that.oldName)
                .append(type, that.type)
                .append(name, that.name)
                .append(oldName, that.oldName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(oldName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("oldName", oldName)
                .build();
    }

    @Override
    public PaymentMethodInfoNameSetMessagePayload copyDeep() {
        return PaymentMethodInfoNameSetMessagePayload.deepCopy(this);
    }
}
