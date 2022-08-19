
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Discount Code update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeRemovedMessage orderDiscountCodeRemovedMessage = OrderDiscountCodeRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeRemovedMessageImpl.class)
public interface OrderDiscountCodeRemovedMessage extends OrderMessage {

    String ORDER_DISCOUNT_CODE_REMOVED = "OrderDiscountCodeRemoved";

    /**
     *  <p>DiscountCode that was removed.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static OrderDiscountCodeRemovedMessage of() {
        return new OrderDiscountCodeRemovedMessageImpl();
    }

    public static OrderDiscountCodeRemovedMessage of(final OrderDiscountCodeRemovedMessage template) {
        OrderDiscountCodeRemovedMessageImpl instance = new OrderDiscountCodeRemovedMessageImpl();
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
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static OrderDiscountCodeRemovedMessageBuilder builder() {
        return OrderDiscountCodeRemovedMessageBuilder.of();
    }

    public static OrderDiscountCodeRemovedMessageBuilder builder(final OrderDiscountCodeRemovedMessage template) {
        return OrderDiscountCodeRemovedMessageBuilder.of(template);
    }

    default <T> T withOrderDiscountCodeRemovedMessage(Function<OrderDiscountCodeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeRemovedMessage>";
            }
        };
    }
}
