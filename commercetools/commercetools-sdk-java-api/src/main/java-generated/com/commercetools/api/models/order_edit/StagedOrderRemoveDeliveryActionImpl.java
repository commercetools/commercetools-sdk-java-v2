
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
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:DeliveryRemovedMessage" rel="nofollow">DeliveryRemoved</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveDeliveryActionImpl implements StagedOrderRemoveDeliveryAction, ModelBase {

    private String action;

    private String deliveryId;

    private String deliveryKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderRemoveDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("deliveryKey") final String deliveryKey) {
        this.deliveryId = deliveryId;
        this.deliveryKey = deliveryKey;
        this.action = REMOVE_DELIVERY;
    }

    /**
     * create empty instance
     */
    public StagedOrderRemoveDeliveryActionImpl() {
        this.action = REMOVE_DELIVERY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     */

    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setDeliveryKey(final String deliveryKey) {
        this.deliveryKey = deliveryKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderRemoveDeliveryActionImpl that = (StagedOrderRemoveDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(deliveryKey, that.deliveryKey)
                .append(action, that.action)
                .append(deliveryId, that.deliveryId)
                .append(deliveryKey, that.deliveryKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deliveryId).append(deliveryKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("deliveryId", deliveryId)
                .append("deliveryKey", deliveryKey)
                .build();
    }

    @Override
    public StagedOrderRemoveDeliveryAction copyDeep() {
        return StagedOrderRemoveDeliveryAction.deepCopy(this);
    }
}
