
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderCustomerGroupSetMessageImpl.class)
public interface OrderCustomerGroupSetMessage extends Message {

    String ORDER_CUSTOMER_GROUP_SET = "OrderCustomerGroupSet";

    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    public static OrderCustomerGroupSetMessage of() {
        return new OrderCustomerGroupSetMessageImpl();
    }

    public static OrderCustomerGroupSetMessage of(final OrderCustomerGroupSetMessage template) {
        OrderCustomerGroupSetMessageImpl instance = new OrderCustomerGroupSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public static OrderCustomerGroupSetMessageBuilder builder() {
        return OrderCustomerGroupSetMessageBuilder.of();
    }

    public static OrderCustomerGroupSetMessageBuilder builder(final OrderCustomerGroupSetMessage template) {
        return OrderCustomerGroupSetMessageBuilder.of(template);
    }

    default <T> T withOrderCustomerGroupSetMessage(Function<OrderCustomerGroupSetMessage, T> helper) {
        return helper.apply(this);
    }
}
