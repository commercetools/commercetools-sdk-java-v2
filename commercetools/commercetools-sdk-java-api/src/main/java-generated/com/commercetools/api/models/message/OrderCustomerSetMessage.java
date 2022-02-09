
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderCustomerSetMessageImpl.class)
public interface OrderCustomerSetMessage extends OrderMessage {

    String ORDER_CUSTOMER_SET = "OrderCustomerSet";

    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
    *  <p><a href="/types#reference">Reference</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    @Valid
    @JsonProperty("oldCustomer")
    public CustomerReference getOldCustomer();

    /**
    *  <p><a href="/types#reference">Reference</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    public void setCustomer(final CustomerReference customer);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setOldCustomer(final CustomerReference oldCustomer);

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    public static OrderCustomerSetMessage of() {
        return new OrderCustomerSetMessageImpl();
    }

    public static OrderCustomerSetMessage of(final OrderCustomerSetMessage template) {
        OrderCustomerSetMessageImpl instance = new OrderCustomerSetMessageImpl();
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
        instance.setCustomer(template.getCustomer());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomer(template.getOldCustomer());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public static OrderCustomerSetMessageBuilder builder() {
        return OrderCustomerSetMessageBuilder.of();
    }

    public static OrderCustomerSetMessageBuilder builder(final OrderCustomerSetMessage template) {
        return OrderCustomerSetMessageBuilder.of(template);
    }

    default <T> T withOrderCustomerSetMessage(Function<OrderCustomerSetMessage, T> helper) {
        return helper.apply(this);
    }
}
