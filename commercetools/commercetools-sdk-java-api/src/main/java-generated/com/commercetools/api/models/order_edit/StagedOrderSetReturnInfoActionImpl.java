
package com.commercetools.api.models.order_edit;

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
 *  <p>Produces the Return Info Set Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnInfoActionImpl implements StagedOrderSetReturnInfoAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetReturnInfoActionImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
        this.action = SET_RETURN_INFO;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetReturnInfoActionImpl() {
        this.action = SET_RETURN_INFO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> getItems() {
        return this.items;
    }

    public void setItems(final com.commercetools.api.models.order.ReturnInfoDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetReturnInfoActionImpl that = (StagedOrderSetReturnInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(items, that.items)
                .append(action, that.action)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(items).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("items", items)
                .build();
    }

    @Override
    public StagedOrderSetReturnInfoAction copyDeep() {
        return StagedOrderSetReturnInfoAction.deepCopy(this);
    }
}
