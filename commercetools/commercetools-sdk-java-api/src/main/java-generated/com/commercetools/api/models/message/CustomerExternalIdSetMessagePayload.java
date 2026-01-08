
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetExternalIdAction" rel="nofollow">Set External ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerExternalIdSetMessagePayload customerExternalIdSetMessagePayload = CustomerExternalIdSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerExternalIdSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerExternalIdSetMessagePayloadImpl.class)
public interface CustomerExternalIdSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerExternalIdSetMessagePayload
     */
    String CUSTOMER_EXTERNAL_ID_SET = "CustomerExternalIdSet";

    /**
     *  <p>The identifier that was set.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>The identifier that was set.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     * factory method
     * @return instance of CustomerExternalIdSetMessagePayload
     */
    public static CustomerExternalIdSetMessagePayload of() {
        return new CustomerExternalIdSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerExternalIdSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerExternalIdSetMessagePayload of(final CustomerExternalIdSetMessagePayload template) {
        CustomerExternalIdSetMessagePayloadImpl instance = new CustomerExternalIdSetMessagePayloadImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public CustomerExternalIdSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerExternalIdSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerExternalIdSetMessagePayload deepCopy(
            @Nullable final CustomerExternalIdSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerExternalIdSetMessagePayloadImpl instance = new CustomerExternalIdSetMessagePayloadImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    /**
     * builder factory method for CustomerExternalIdSetMessagePayload
     * @return builder
     */
    public static CustomerExternalIdSetMessagePayloadBuilder builder() {
        return CustomerExternalIdSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerExternalIdSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerExternalIdSetMessagePayloadBuilder builder(
            final CustomerExternalIdSetMessagePayload template) {
        return CustomerExternalIdSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerExternalIdSetMessagePayload(Function<CustomerExternalIdSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerExternalIdSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerExternalIdSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerExternalIdSetMessagePayload>";
            }
        };
    }
}
