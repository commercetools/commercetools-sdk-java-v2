
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeEmailAction" rel="nofollow">Change Email</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailChangedMessagePayloadImpl implements CustomerEmailChangedMessagePayload, ModelBase {

    private String type;

    private String email;

    private String oldEmail;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerEmailChangedMessagePayloadImpl(@JsonProperty("email") final String email,
            @JsonProperty("oldEmail") final String oldEmail) {
        this.email = email;
        this.oldEmail = oldEmail;
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
     *  <p>The <code>email</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeEmailAction" rel="nofollow">Change Email</a> update action.</p>
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>The <code>email</code> that was set before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeEmailAction" rel="nofollow">Change Email</a> update action.</p>
     */

    public String getOldEmail() {
        return this.oldEmail;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setOldEmail(final String oldEmail) {
        this.oldEmail = oldEmail;
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
                .append(oldEmail, that.oldEmail)
                .append(type, that.type)
                .append(email, that.email)
                .append(oldEmail, that.oldEmail)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(email).append(oldEmail).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("email", email)
                .append("oldEmail", oldEmail)
                .build();
    }

    @Override
    public CustomerEmailChangedMessagePayload copyDeep() {
        return CustomerEmailChangedMessagePayload.deepCopy(this);
    }
}
