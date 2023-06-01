package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessageImpl;

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
 *  <p>Generated after a successful Set Customer Email update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerEmailSetMessage orderCustomerEmailSetMessage = OrderCustomerEmailSetMessage.builder()
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
@JsonDeserialize(as = OrderCustomerEmailSetMessageImpl.class)
public interface OrderCustomerEmailSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomerEmailSetMessage
     */
    String ORDER_CUSTOMER_EMAIL_SET = "OrderCustomerEmailSet";

    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     * @return email
     */
    
    @JsonProperty("email")
    public String getEmail();
    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     * @return oldEmail
     */
    
    @JsonProperty("oldEmail")
    public String getOldEmail();

    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     * @param email value to be set
     */
    
    public void setEmail(final String email);
    
    
    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     * @param oldEmail value to be set
     */
    
    public void setOldEmail(final String oldEmail);
    

    /**
     * factory method
     * @return instance of OrderCustomerEmailSetMessage
     */
    public static OrderCustomerEmailSetMessage of(){
        return new OrderCustomerEmailSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderCustomerEmailSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomerEmailSetMessage of(final OrderCustomerEmailSetMessage template) {
        OrderCustomerEmailSetMessageImpl instance = new OrderCustomerEmailSetMessageImpl();
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
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomerEmailSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomerEmailSetMessage deepCopy(@Nullable final OrderCustomerEmailSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomerEmailSetMessageImpl instance = new OrderCustomerEmailSetMessageImpl();
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
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    /**
     * builder factory method for OrderCustomerEmailSetMessage
     * @return builder
     */
    public static OrderCustomerEmailSetMessageBuilder builder() {
        return OrderCustomerEmailSetMessageBuilder.of();
    }
    
    /**
     * create builder for OrderCustomerEmailSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerEmailSetMessageBuilder builder(final OrderCustomerEmailSetMessage template) {
        return OrderCustomerEmailSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomerEmailSetMessage(Function<OrderCustomerEmailSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerEmailSetMessage>";
            }
        };
    }
}
