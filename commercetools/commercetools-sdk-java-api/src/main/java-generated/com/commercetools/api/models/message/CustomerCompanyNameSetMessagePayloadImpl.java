
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerCompanyNameSetMessagePayloadImpl implements CustomerCompanyNameSetMessagePayload, ModelBase {

    private String type;

    private String companyName;

    @JsonCreator
    CustomerCompanyNameSetMessagePayloadImpl(@JsonProperty("companyName") final String companyName) {
        this.companyName = companyName;
        this.type = CUSTOMER_COMPANY_NAME_SET;
    }

    public CustomerCompanyNameSetMessagePayloadImpl() {
        this.type = CUSTOMER_COMPANY_NAME_SET;
    }

    public String getType() {
        return this.type;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerCompanyNameSetMessagePayloadImpl that = (CustomerCompanyNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(companyName, that.companyName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(companyName).toHashCode();
    }

}
