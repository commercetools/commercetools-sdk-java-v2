package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderCustomerSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set Customer Id update action.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderCustomerSetMessagePayloadImpl.class)
public interface OrderCustomerSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomerSetMessagePayload
     */
    String ORDER_CUSTOMER_SET = "OrderCustomerSet";

    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @return oldCustomer
     */
    @Valid
    @JsonProperty("oldCustomer")
    public CustomerReference getOldCustomer();
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @return oldCustomerGroup
     */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @param customer value to be set
     */
    
    public void setCustomer(final CustomerReference customer);
    
    
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @param customerGroup value to be set
     */
    
    public void setCustomerGroup(final CustomerGroupReference customerGroup);
    
    
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @param oldCustomer value to be set
     */
    
    public void setOldCustomer(final CustomerReference oldCustomer);
    
    
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @param oldCustomerGroup value to be set
     */
    
    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);
    

    /**
     * factory method
     * @return instance of OrderCustomerSetMessagePayload
     */
    public static OrderCustomerSetMessagePayload of(){
        return new OrderCustomerSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderCustomerSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomerSetMessagePayload of(final OrderCustomerSetMessagePayload template) {
        OrderCustomerSetMessagePayloadImpl instance = new OrderCustomerSetMessagePayloadImpl();
        instance.setCustomer(template.getCustomer());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomer(template.getOldCustomer());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomerSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomerSetMessagePayload deepCopy(@Nullable final OrderCustomerSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomerSetMessagePayloadImpl instance = new OrderCustomerSetMessagePayloadImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setOldCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getOldCustomer()));
        instance.setOldCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getOldCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomerSetMessagePayload
     * @return builder
     */
    public static OrderCustomerSetMessagePayloadBuilder builder() {
        return OrderCustomerSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderCustomerSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerSetMessagePayloadBuilder builder(final OrderCustomerSetMessagePayload template) {
        return OrderCustomerSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomerSetMessagePayload(Function<OrderCustomerSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerSetMessagePayload>";
            }
        };
    }
}
