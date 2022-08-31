
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String CUSTOMER_TITLE_SET = "CustomerTitleSet";

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     */

    @JsonProperty("title")
    public String getTitle();

    public void setTitle(final String title);

    public static CustomerTitleSetMessagePayload of() {
        return new CustomerTitleSetMessagePayloadImpl();
    }

    public static CustomerTitleSetMessagePayload of(final CustomerTitleSetMessagePayload template) {
        CustomerTitleSetMessagePayloadImpl instance = new CustomerTitleSetMessagePayloadImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static CustomerTitleSetMessagePayloadBuilder builder() {
        return CustomerTitleSetMessagePayloadBuilder.of();
    }

    public static CustomerTitleSetMessagePayloadBuilder builder(final CustomerTitleSetMessagePayload template) {
        return CustomerTitleSetMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerTitleSetMessagePayload(Function<CustomerTitleSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerTitleSetMessagePayload>";
            }
        };
    }
}
