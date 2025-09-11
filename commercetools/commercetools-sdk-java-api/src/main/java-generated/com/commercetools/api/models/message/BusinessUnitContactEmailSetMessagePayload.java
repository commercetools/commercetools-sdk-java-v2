
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetContactEmailAction" rel="nofollow">Set Contact Email</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitContactEmailSetMessagePayload businessUnitContactEmailSetMessagePayload = BusinessUnitContactEmailSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitContactEmailSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitContactEmailSetMessagePayloadImpl.class)
public interface BusinessUnitContactEmailSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitContactEmailSetMessagePayload
     */
    String BUSINESS_UNIT_CONTACT_EMAIL_SET = "BusinessUnitContactEmailSet";

    /**
     *  <p>The contact email that was updated on the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>The contact email that was updated on the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param contactEmail value to be set
     */

    public void setContactEmail(final String contactEmail);

    /**
     * factory method
     * @return instance of BusinessUnitContactEmailSetMessagePayload
     */
    public static BusinessUnitContactEmailSetMessagePayload of() {
        return new BusinessUnitContactEmailSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitContactEmailSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitContactEmailSetMessagePayload of(
            final BusinessUnitContactEmailSetMessagePayload template) {
        BusinessUnitContactEmailSetMessagePayloadImpl instance = new BusinessUnitContactEmailSetMessagePayloadImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    public BusinessUnitContactEmailSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitContactEmailSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitContactEmailSetMessagePayload deepCopy(
            @Nullable final BusinessUnitContactEmailSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitContactEmailSetMessagePayloadImpl instance = new BusinessUnitContactEmailSetMessagePayloadImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitContactEmailSetMessagePayload
     * @return builder
     */
    public static BusinessUnitContactEmailSetMessagePayloadBuilder builder() {
        return BusinessUnitContactEmailSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitContactEmailSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitContactEmailSetMessagePayloadBuilder builder(
            final BusinessUnitContactEmailSetMessagePayload template) {
        return BusinessUnitContactEmailSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitContactEmailSetMessagePayload(
            Function<BusinessUnitContactEmailSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitContactEmailSetMessagePayload>";
            }
        };
    }
}
