
package com.commercetools.checkout.models.recurring_payment_job;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>A single error on the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJob" rel="nofollow">RecurringPaymentJob</a>. Multiple errors may be included in the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPaymentJobStatus" rel="nofollow">RecurringPaymentJobStatus</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentJobErrorImpl implements RecurringPaymentJobError, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentJobErrorImpl(@JsonProperty("code") final String code,
            @JsonProperty("message") final String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentJobErrorImpl() {
    }

    /**
     *  <p>Error identifier.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the cause of the error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentJobErrorImpl that = (RecurringPaymentJobErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .build();
    }

    @Override
    public RecurringPaymentJobError copyDeep() {
        return RecurringPaymentJobError.deepCopy(this);
    }
}
