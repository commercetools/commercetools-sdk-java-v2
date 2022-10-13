
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

/**
 *  <p>Generated after a successful Set Contact Email update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitContactEmailSetMessagePayloadImpl
        implements BusinessUnitContactEmailSetMessagePayload, ModelBase {

    private String type;

    private String contactEmail;

    @JsonCreator
    BusinessUnitContactEmailSetMessagePayloadImpl(@JsonProperty("contactEmail") final String contactEmail) {
        this.contactEmail = contactEmail;
        this.type = BUSINESS_UNIT_CONTACT_EMAIL_SET;
    }

    public BusinessUnitContactEmailSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_CONTACT_EMAIL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
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

        BusinessUnitContactEmailSetMessagePayloadImpl that = (BusinessUnitContactEmailSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(contactEmail, that.contactEmail).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(contactEmail).toHashCode();
    }

}
