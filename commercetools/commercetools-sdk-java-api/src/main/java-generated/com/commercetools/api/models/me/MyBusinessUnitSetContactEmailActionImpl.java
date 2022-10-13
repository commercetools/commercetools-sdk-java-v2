
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Setting the contact email on a Business Unit generates a BusinessUnitContactEmailSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetContactEmailActionImpl implements MyBusinessUnitSetContactEmailAction, ModelBase {

    private String action;

    private String contactEmail;

    @JsonCreator
    MyBusinessUnitSetContactEmailActionImpl(@JsonProperty("contactEmail") final String contactEmail) {
        this.contactEmail = contactEmail;
        this.action = SET_CONTACT_EMAIL;
    }

    public MyBusinessUnitSetContactEmailActionImpl() {
        this.action = SET_CONTACT_EMAIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     */

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(final String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyBusinessUnitSetContactEmailActionImpl that = (MyBusinessUnitSetContactEmailActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(contactEmail, that.contactEmail).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(contactEmail).toHashCode();
    }

}
