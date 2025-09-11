
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
 *  <p>Generated after successfully <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders/edits/{id}/apply:POST" rel="nofollow">applying an OrderEdit</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditAppliedMessagePayloadImpl implements OrderEditAppliedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order_edit.OrderEdit edit;

    private com.commercetools.api.models.order_edit.OrderEditApplied result;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditAppliedMessagePayloadImpl(
            @JsonProperty("edit") final com.commercetools.api.models.order_edit.OrderEdit edit,
            @JsonProperty("result") final com.commercetools.api.models.order_edit.OrderEditApplied result) {
        this.edit = edit;
        this.result = result;
        this.type = ORDER_EDIT_APPLIED;
    }

    /**
     * create empty instance
     */
    public OrderEditAppliedMessagePayloadImpl() {
        this.type = ORDER_EDIT_APPLIED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a> that was applied.</p>
     */

    public com.commercetools.api.models.order_edit.OrderEdit getEdit() {
        return this.edit;
    }

    /**
     *  <p>Information about a successfully applied <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>.</p>
     */

    public com.commercetools.api.models.order_edit.OrderEditApplied getResult() {
        return this.result;
    }

    public void setEdit(final com.commercetools.api.models.order_edit.OrderEdit edit) {
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
                .append(type, that.type)
                .append(edit, that.edit)
                .append(result, that.result)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(edit).append(result).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("edit", edit)
                .append("result", result)
                .build();
    }

    @Override
    public OrderEditAppliedMessagePayload copyDeep() {
        return OrderEditAppliedMessagePayload.deepCopy(this);
    }
}
