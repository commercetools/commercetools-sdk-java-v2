package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CustomerGroupSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Set Customer Group update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetMessage customerGroupSetMessage = CustomerGroupSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupSetMessageImpl.class)
public interface CustomerGroupSetMessage extends Message {

    /**
     * discriminator value for CustomerGroupSetMessage
     */
    String CUSTOMER_GROUP_SET = "CustomerGroupSet";

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Customer Group that was set during the Set Customer Group update action.</p>
     * @param customerGroup value to be set
     */
    
    public void setCustomerGroup(final CustomerGroupReference customerGroup);
    

    /**
     * factory method
     * @return instance of CustomerGroupSetMessage
     */
    public static CustomerGroupSetMessage of(){
        return new CustomerGroupSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy CustomerGroupSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of CustomerGroupSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupSetMessage deepCopy(@Nullable final CustomerGroupSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerGroupSetMessageImpl instance = new CustomerGroupSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupSetMessage
     * @return builder
     */
    public static CustomerGroupSetMessageBuilder builder() {
        return CustomerGroupSetMessageBuilder.of();
    }
    
    /**
     * create builder for CustomerGroupSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetMessageBuilder builder(final CustomerGroupSetMessage template) {
        return CustomerGroupSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupSetMessage(Function<CustomerGroupSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupSetMessage>";
            }
        };
    }
}
