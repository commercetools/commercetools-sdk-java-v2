
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetExternalIdActionImpl implements PaymentSetExternalIdAction {

    private String action;

    private String externalId;

    @JsonCreator
    PaymentSetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
        this.externalId = externalId;
        this.action = SET_EXTERNAL_ID;
    }

    public PaymentSetExternalIdActionImpl() {
        this.action = SET_EXTERNAL_ID;
    }

    public String getAction() {
        return this.action;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetExternalIdActionImpl that = (PaymentSetExternalIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(externalId, that.externalId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(externalId).toHashCode();
    }

}
