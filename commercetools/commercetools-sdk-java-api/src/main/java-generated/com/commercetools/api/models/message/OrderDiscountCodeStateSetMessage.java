
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after the DiscountCodeState changes due to a recalculation.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeStateSetMessage orderDiscountCodeStateSetMessage = OrderDiscountCodeStateSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .state(DiscountCodeState.NOT_ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeStateSetMessageImpl.class)
public interface OrderDiscountCodeStateSetMessage extends OrderMessage {

    String ORDER_DISCOUNT_CODE_STATE_SET = "OrderDiscountCodeStateSet";

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     */
    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     */

    @JsonProperty("oldState")
    public DiscountCodeState getOldState();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public void setState(final DiscountCodeState state);

    public void setOldState(final DiscountCodeState oldState);

    public static OrderDiscountCodeStateSetMessage of() {
        return new OrderDiscountCodeStateSetMessageImpl();
    }

    public static OrderDiscountCodeStateSetMessage of(final OrderDiscountCodeStateSetMessage template) {
        OrderDiscountCodeStateSetMessageImpl instance = new OrderDiscountCodeStateSetMessageImpl();
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
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    public static OrderDiscountCodeStateSetMessageBuilder builder() {
        return OrderDiscountCodeStateSetMessageBuilder.of();
    }

    public static OrderDiscountCodeStateSetMessageBuilder builder(final OrderDiscountCodeStateSetMessage template) {
        return OrderDiscountCodeStateSetMessageBuilder.of(template);
    }

    default <T> T withOrderDiscountCodeStateSetMessage(Function<OrderDiscountCodeStateSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeStateSetMessage>";
            }
        };
    }
}
