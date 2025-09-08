
package com.commercetools.checkout.models.error;

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
 *  <p>Returned when a server-side problem occurs. In some cases, the requested action may successfully complete after the error is returned. Therefore, it is recommended to verify the status of the requested resource after receiving a 500 error.</p>
 *  <p>If you encounter this error, report it to the <span>Checkout support team</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeneralErrorImpl implements GeneralError, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GeneralErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = GENERAL;
    }

    /**
     * create empty instance
     */
    public GeneralErrorImpl() {
        this.code = GENERAL;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     */

    public String getMessage() {
        return this.message;
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

        GeneralErrorImpl that = (GeneralErrorImpl) o;

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
    public GeneralError copyDeep() {
        return GeneralError.deepCopy(this);
    }
}
