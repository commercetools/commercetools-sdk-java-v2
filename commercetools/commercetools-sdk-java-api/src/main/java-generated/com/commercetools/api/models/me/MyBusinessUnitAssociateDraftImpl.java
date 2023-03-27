
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
 * MyBusinessUnitAssociateDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitAssociateDraftImpl implements MyBusinessUnitAssociateDraft, ModelBase {

    private Long version;

    private com.commercetools.api.models.me.MyCustomerDraft customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitAssociateDraftImpl(@JsonProperty("version") final Long version,
            @JsonProperty("customer") final com.commercetools.api.models.me.MyCustomerDraft customer) {
        this.version = version;
        this.customer = customer;
    }

    /**
     * create empty instance
     */
    public MyBusinessUnitAssociateDraftImpl() {
    }

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     */

    public com.commercetools.api.models.me.MyCustomerDraft getCustomer() {
        return this.customer;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCustomer(final com.commercetools.api.models.me.MyCustomerDraft customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyBusinessUnitAssociateDraftImpl that = (MyBusinessUnitAssociateDraftImpl) o;

        return new EqualsBuilder().append(version, that.version).append(customer, that.customer).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(customer).toHashCode();
    }

}
