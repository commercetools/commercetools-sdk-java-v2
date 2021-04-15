
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetVatIdActionImpl implements CustomerSetVatIdAction {

    private String action;

    private String vatId;

    @JsonCreator
    CustomerSetVatIdActionImpl(@JsonProperty("vatId") final String vatId) {
        this.vatId = vatId;
        this.action = SET_VAT_ID;
    }

    public CustomerSetVatIdActionImpl() {
        this.action = SET_VAT_ID;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If not defined, the vat Id is unset.</p>
    */
    public String getVatId() {
        return this.vatId;
    }

    public void setVatId(final String vatId) {
        this.vatId = vatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetVatIdActionImpl that = (CustomerSetVatIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(vatId, that.vatId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(vatId).toHashCode();
    }

}
