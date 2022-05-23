
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

/**
 * OrderCustomerSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerSetMessagePayload orderCustomerSetMessagePayload = OrderCustomerSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomerSetMessagePayloadImpl.class)
public interface OrderCustomerSetMessagePayload extends OrderMessagePayload {

    String ORDER_CUSTOMER_SET = "OrderCustomerSet";

    /**
     <*  <p>Reference to a Customer.</p>>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     <*  <p>Reference to a CustomerGroup.</p>>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     <*  <p>Reference to a Customer.</p>>
     */
    @Valid
    @JsonProperty("oldCustomer")
    public CustomerReference getOldCustomer();

    /**
     <*  <p>Reference to a CustomerGroup.</p>>
     */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    public void setCustomer(final CustomerReference customer);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setOldCustomer(final CustomerReference oldCustomer);

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    public static OrderCustomerSetMessagePayload of() {
        return new OrderCustomerSetMessagePayloadImpl();
    }

    public static OrderCustomerSetMessagePayload of(final OrderCustomerSetMessagePayload template) {
        OrderCustomerSetMessagePayloadImpl instance = new OrderCustomerSetMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomer(template.getOldCustomer());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public static OrderCustomerSetMessagePayloadBuilder builder() {
        return OrderCustomerSetMessagePayloadBuilder.of();
    }

    public static OrderCustomerSetMessagePayloadBuilder builder(final OrderCustomerSetMessagePayload template) {
        return OrderCustomerSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomerSetMessagePayload(Function<OrderCustomerSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerSetMessagePayload>";
            }
        };
    }
}
