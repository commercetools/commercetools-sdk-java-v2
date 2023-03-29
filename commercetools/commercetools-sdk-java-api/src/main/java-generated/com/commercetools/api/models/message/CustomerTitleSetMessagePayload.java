
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Title update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerTitleSetMessagePayload customerTitleSetMessagePayload = CustomerTitleSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerTitleSetMessagePayloadImpl.class)
public interface CustomerTitleSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerTitleSetMessagePayload
     */
    String CUSTOMER_TITLE_SET = "CustomerTitleSet";

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * factory method
     * @return instance of CustomerTitleSetMessagePayload
     */
    public static CustomerTitleSetMessagePayload of() {
        return new CustomerTitleSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerTitleSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerTitleSetMessagePayload of(final CustomerTitleSetMessagePayload template) {
        CustomerTitleSetMessagePayloadImpl instance = new CustomerTitleSetMessagePayloadImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerTitleSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerTitleSetMessagePayload deepCopy(@Nullable final CustomerTitleSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerTitleSetMessagePayloadImpl instance = new CustomerTitleSetMessagePayloadImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * builder factory method for CustomerTitleSetMessagePayload
     * @return builder
     */
    public static CustomerTitleSetMessagePayloadBuilder builder() {
        return CustomerTitleSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerTitleSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerTitleSetMessagePayloadBuilder builder(final CustomerTitleSetMessagePayload template) {
        return CustomerTitleSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerTitleSetMessagePayload(Function<CustomerTitleSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerTitleSetMessagePayload>";
            }
        };
    }
}
