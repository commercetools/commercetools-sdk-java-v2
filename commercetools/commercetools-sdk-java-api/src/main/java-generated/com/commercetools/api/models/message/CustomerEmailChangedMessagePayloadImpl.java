
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
 *  <p>Generated after a successful Change Email update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailChangedMessagePayloadImpl implements CustomerEmailChangedMessagePayload, ModelBase {

    private String type;

    private String email;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerEmailChangedMessagePayloadImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.type = CUSTOMER_EMAIL_CHANGED;
    }

    /**
     * create empty instance
     */
    public CustomerEmailChangedMessagePayloadImpl() {
        this.type = CUSTOMER_EMAIL_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>email</code> that was set during the Change Email update action.</p>
     */

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerEmailChangedMessagePayloadImpl that = (CustomerEmailChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(email, that.email)
                .append(type, that.type)
                .append(email, that.email)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(email).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("email", email)
                .build();
    }

}
