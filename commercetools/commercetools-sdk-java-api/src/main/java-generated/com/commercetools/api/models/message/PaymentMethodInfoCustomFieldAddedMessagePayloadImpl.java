
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
 *  <p>Generated after adding a Custom Field to a PaymentMethodInfo using the Set MethodInfo CustomField update action on Payments and the Set MethodInfo CustomField update action on My Payments. If a Custom Field already exists with the same name, a PaymentMethodInfoCustomFieldChanged Message is generated instead.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoCustomFieldAddedMessagePayloadImpl
        implements PaymentMethodInfoCustomFieldAddedMessagePayload, ModelBase {

    private String type;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoCustomFieldAddedMessagePayloadImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.name = name;
        this.value = value;
        this.type = PAYMENT_METHOD_INFO_CUSTOM_FIELD_ADDED;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoCustomFieldAddedMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_INFO_CUSTOM_FIELD_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoCustomFieldAddedMessagePayloadImpl that = (PaymentMethodInfoCustomFieldAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .append(type, that.type)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(name).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public PaymentMethodInfoCustomFieldAddedMessagePayload copyDeep() {
        return PaymentMethodInfoCustomFieldAddedMessagePayload.deepCopy(this);
    }
}
