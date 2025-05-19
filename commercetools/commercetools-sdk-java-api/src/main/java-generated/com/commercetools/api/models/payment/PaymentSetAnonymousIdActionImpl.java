
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
 *  <p>If the Payment is already associated with a Customer, an InvalidOperation error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetAnonymousIdActionImpl implements PaymentSetAnonymousIdAction, ModelBase {

    private String action;

    private String anonymousId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final String anonymousId) {
        this.anonymousId = anonymousId;
        this.action = SET_ANONYMOUS_ID;
    }

    /**
     * create empty instance
     */
    public PaymentSetAnonymousIdActionImpl() {
        this.action = SET_ANONYMOUS_ID;
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

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetAnonymousIdActionImpl that = (PaymentSetAnonymousIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(anonymousId, that.anonymousId)
                .append(action, that.action)
                .append(anonymousId, that.anonymousId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(anonymousId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("anonymousId", anonymousId)
                .build();
    }

    @Override
    public PaymentSetAnonymousIdAction copyDeep() {
        return PaymentSetAnonymousIdAction.deepCopy(this);
    }
}
