
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderRemoveCustomLineItemActionImpl implements StagedOrderRemoveCustomLineItemAction, ModelBase {

    private String action;

    private String customLineItemId;

    @JsonCreator
    StagedOrderRemoveCustomLineItemActionImpl(@JsonProperty("customLineItemId") final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        this.action = REMOVE_CUSTOM_LINE_ITEM;
    }

    public StagedOrderRemoveCustomLineItemActionImpl() {
        this.action = REMOVE_CUSTOM_LINE_ITEM;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderRemoveCustomLineItemActionImpl that = (StagedOrderRemoveCustomLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).toHashCode();
    }

}
