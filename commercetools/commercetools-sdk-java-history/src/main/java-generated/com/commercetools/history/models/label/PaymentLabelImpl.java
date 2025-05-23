
package com.commercetools.history.models.label;

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
 * PaymentLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentLabelImpl implements PaymentLabel, ModelBase {

    private String type;

    private String key;

    private com.commercetools.history.models.common.Money amountPlanned;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentLabelImpl(@JsonProperty("key") final String key,
            @JsonProperty("amountPlanned") final com.commercetools.history.models.common.Money amountPlanned) {
        this.key = key;
        this.amountPlanned = amountPlanned;
        this.type = PAYMENT_LABEL;
    }

    /**
     * create empty instance
     */
    public PaymentLabelImpl() {
        this.type = PAYMENT_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Money value the Payment intends to receive from the Customer.</p>
     */

    public com.commercetools.history.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setAmountPlanned(final com.commercetools.history.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentLabelImpl that = (PaymentLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(amountPlanned, that.amountPlanned)
                .append(type, that.type)
                .append(key, that.key)
                .append(amountPlanned, that.amountPlanned)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(amountPlanned).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("amountPlanned", amountPlanned)
                .build();
    }

    @Override
    public PaymentLabel copyDeep() {
        return PaymentLabel.deepCopy(this);
    }
}
