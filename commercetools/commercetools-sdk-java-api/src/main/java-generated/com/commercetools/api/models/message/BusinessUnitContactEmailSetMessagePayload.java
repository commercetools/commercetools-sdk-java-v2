
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitContactEmailSetMessagePayloadImpl.class)
public interface BusinessUnitContactEmailSetMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_CONTACT_EMAIL_SET = "BusinessUnitContactEmailSet";

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    public void setContactEmail(final String contactEmail);

    public static BusinessUnitContactEmailSetMessagePayload of() {
        return new BusinessUnitContactEmailSetMessagePayloadImpl();
    }

    public static BusinessUnitContactEmailSetMessagePayload of(
            final BusinessUnitContactEmailSetMessagePayload template) {
        BusinessUnitContactEmailSetMessagePayloadImpl instance = new BusinessUnitContactEmailSetMessagePayloadImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    public static BusinessUnitContactEmailSetMessagePayloadBuilder builder() {
        return BusinessUnitContactEmailSetMessagePayloadBuilder.of();
    }

    public static BusinessUnitContactEmailSetMessagePayloadBuilder builder(
            final BusinessUnitContactEmailSetMessagePayload template) {
        return BusinessUnitContactEmailSetMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitContactEmailSetMessagePayload(
            Function<BusinessUnitContactEmailSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitContactEmailSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitContactEmailSetMessagePayload>";
            }
        };
    }
}
