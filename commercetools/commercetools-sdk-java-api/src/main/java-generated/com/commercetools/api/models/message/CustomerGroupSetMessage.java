
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
@JsonDeserialize(as = CustomerGroupSetMessageImpl.class)
public interface CustomerGroupSetMessage extends Message {

    String CUSTOMER_GROUP_SET = "CustomerGroupSet";

    /**
    *  <p><a href="/types#reference">Reference</a> to a <a href="ctp:api:type:CustomerGroup">CustomerGroup</a>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public static CustomerGroupSetMessage of() {
        return new CustomerGroupSetMessageImpl();
    }

    public static CustomerGroupSetMessage of(final CustomerGroupSetMessage template) {
        CustomerGroupSetMessageImpl instance = new CustomerGroupSetMessageImpl();
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
        return instance;
    }

    public static CustomerGroupSetMessageBuilder builder() {
        return CustomerGroupSetMessageBuilder.of();
    }

    public static CustomerGroupSetMessageBuilder builder(final CustomerGroupSetMessage template) {
        return CustomerGroupSetMessageBuilder.of(template);
    }

    default <T> T withCustomerGroupSetMessage(Function<CustomerGroupSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetMessage>";
            }
        };
    }
}
