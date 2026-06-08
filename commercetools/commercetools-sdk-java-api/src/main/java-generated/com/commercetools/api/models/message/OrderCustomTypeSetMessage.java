
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomTypeSetMessage orderCustomTypeSetMessage = OrderCustomTypeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomTypeSetMessageImpl.class)
public interface OrderCustomTypeSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomTypeSetMessage
     */
    String ORDER_CUSTOM_TYPE_SET = "OrderCustomTypeSet";

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of OrderCustomTypeSetMessage
     */
    public static OrderCustomTypeSetMessage of() {
        return new OrderCustomTypeSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomTypeSetMessage of(final OrderCustomTypeSetMessage template) {
        OrderCustomTypeSetMessageImpl instance = new OrderCustomTypeSetMessageImpl();
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
        instance.setCustomFields(template.getCustomFields());
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public OrderCustomTypeSetMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomTypeSetMessage deepCopy(@Nullable final OrderCustomTypeSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomTypeSetMessageImpl instance = new OrderCustomTypeSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for OrderCustomTypeSetMessage
     * @return builder
     */
    public static OrderCustomTypeSetMessageBuilder builder() {
        return OrderCustomTypeSetMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomTypeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomTypeSetMessageBuilder builder(final OrderCustomTypeSetMessage template) {
        return OrderCustomTypeSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomTypeSetMessage(Function<OrderCustomTypeSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomTypeSetMessage>";
            }
        };
    }
}
