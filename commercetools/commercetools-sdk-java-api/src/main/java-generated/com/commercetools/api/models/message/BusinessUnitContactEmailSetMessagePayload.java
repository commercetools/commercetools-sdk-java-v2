package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set Contact Email update action.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = BusinessUnitContactEmailSetMessagePayloadImpl.class)
public interface BusinessUnitContactEmailSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitContactEmailSetMessagePayload
     */
    String BUSINESS_UNIT_CONTACT_EMAIL_SET = "BusinessUnitContactEmailSet";

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @return contactEmail
     */
    
    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @param contactEmail value to be set
     */
    
    public void setContactEmail(final String contactEmail);
    

    /**
     * factory method
     * @return instance of BusinessUnitContactEmailSetMessagePayload
     */
    public static BusinessUnitContactEmailSetMessagePayload of(){
        return new BusinessUnitContactEmailSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy BusinessUnitContactEmailSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitContactEmailSetMessagePayload of(final BusinessUnitContactEmailSetMessagePayload template) {
        BusinessUnitContactEmailSetMessagePayloadImpl instance = new BusinessUnitContactEmailSetMessagePayloadImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitContactEmailSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitContactEmailSetMessagePayload deepCopy(@Nullable final BusinessUnitContactEmailSetMessagePayload template) {
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
    public static BusinessUnitContactEmailSetMessagePayloadBuilder builder(final BusinessUnitContactEmailSetMessagePayload template) {
        return BusinessUnitContactEmailSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitContactEmailSetMessagePayload(Function<BusinessUnitContactEmailSetMessagePayload, T> helper) {
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
