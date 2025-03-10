
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderBusinessUnitSetMessage orderBusinessUnitSetMessage = OrderBusinessUnitSetMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderBusinessUnitSetMessageImpl.class)
public interface OrderBusinessUnitSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderBusinessUnitSetMessage
     */
    String ORDER_BUSINESS_UNIT_SET = "OrderBusinessUnitSet";

    /**
     *  <p>BusinessUnit on the Order after the Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>BusinessUnit on the Order before the Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
     * @return oldbusinessUnit
     */
    @Valid
    @JsonProperty("oldbusinessUnit")
    public BusinessUnitKeyReference getOldbusinessUnit();

    /**
     *  <p>BusinessUnit on the Order after the Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>BusinessUnit on the Order before the Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
     * @param oldbusinessUnit value to be set
     */

    public void setOldbusinessUnit(final BusinessUnitKeyReference oldbusinessUnit);

    /**
     * factory method
     * @return instance of OrderBusinessUnitSetMessage
     */
    public static OrderBusinessUnitSetMessage of() {
        return new OrderBusinessUnitSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderBusinessUnitSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderBusinessUnitSetMessage of(final OrderBusinessUnitSetMessage template) {
        OrderBusinessUnitSetMessageImpl instance = new OrderBusinessUnitSetMessageImpl();
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
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setOldbusinessUnit(template.getOldbusinessUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderBusinessUnitSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderBusinessUnitSetMessage deepCopy(@Nullable final OrderBusinessUnitSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderBusinessUnitSetMessageImpl instance = new OrderBusinessUnitSetMessageImpl();
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
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        instance.setOldbusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitKeyReference
                .deepCopy(template.getOldbusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for OrderBusinessUnitSetMessage
     * @return builder
     */
    public static OrderBusinessUnitSetMessageBuilder builder() {
        return OrderBusinessUnitSetMessageBuilder.of();
    }

    /**
     * create builder for OrderBusinessUnitSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBusinessUnitSetMessageBuilder builder(final OrderBusinessUnitSetMessage template) {
        return OrderBusinessUnitSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderBusinessUnitSetMessage(Function<OrderBusinessUnitSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderBusinessUnitSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderBusinessUnitSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderBusinessUnitSetMessage>";
            }
        };
    }
}
