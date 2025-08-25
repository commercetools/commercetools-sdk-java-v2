
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentAddInterfaceInteractionAction" rel="nofollow">Add InterfaceInteraction</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentInteractionAddedMessagePayloadImpl implements PaymentInteractionAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.type.CustomFields interaction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentInteractionAddedMessagePayloadImpl(
            @JsonProperty("interaction") final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
        this.type = PAYMENT_INTERACTION_ADDED;
    }

    /**
     * create empty instance
     */
    public PaymentInteractionAddedMessagePayloadImpl() {
        this.type = PAYMENT_INTERACTION_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The interface interaction that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a>.</p>
     */

    public com.commercetools.api.models.type.CustomFields getInteraction() {
        return this.interaction;
    }

    public void setInteraction(final com.commercetools.api.models.type.CustomFields interaction) {
        this.interaction = interaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentInteractionAddedMessagePayloadImpl that = (PaymentInteractionAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(interaction, that.interaction)
                .append(type, that.type)
                .append(interaction, that.interaction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(interaction).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("interaction", interaction)
                .build();
    }

    @Override
    public PaymentInteractionAddedMessagePayload copyDeep() {
        return PaymentInteractionAddedMessagePayload.deepCopy(this);
    }
}
