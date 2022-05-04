
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
public class OrderEditAppliedMessagePayloadImpl implements OrderEditAppliedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order_edit.OrderEditReference edit;

    private com.commercetools.api.models.order_edit.OrderEditApplied result;

    @JsonCreator
    OrderEditAppliedMessagePayloadImpl(
            @JsonProperty("edit") final com.commercetools.api.models.order_edit.OrderEditReference edit,
            @JsonProperty("result") final com.commercetools.api.models.order_edit.OrderEditApplied result) {
        this.edit = edit;
        this.result = result;
        this.type = ORDER_EDIT_APPLIED;
    }

    public OrderEditAppliedMessagePayloadImpl() {
        this.type = ORDER_EDIT_APPLIED;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:OrderEdit">OrderEdit</a>.</p>
    */
    public com.commercetools.api.models.order_edit.OrderEditReference getEdit() {
        return this.edit;
    }

    public com.commercetools.api.models.order_edit.OrderEditApplied getResult() {
        return this.result;
    }

    public void setEdit(final com.commercetools.api.models.order_edit.OrderEditReference edit) {
        this.edit = edit;
    }

    public void setResult(final com.commercetools.api.models.order_edit.OrderEditApplied result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditAppliedMessagePayloadImpl that = (OrderEditAppliedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(edit, that.edit)
                .append(result, that.result)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(edit).append(result).toHashCode();
    }

}
