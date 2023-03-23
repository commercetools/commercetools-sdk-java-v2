
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStatusChangedMessagePayload businessUnitStatusChangedMessagePayload = BusinessUnitStatusChangedMessagePayload.builder()
 *             .active(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitStatusChangedMessagePayloadImpl.class)
public interface BusinessUnitStatusChangedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_STATUS_CHANGED = "BusinessUnitStatusChanged";

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public BusinessUnitStatus getActive();

    public void setActive(final BusinessUnitStatus active);

    public static BusinessUnitStatusChangedMessagePayload of() {
        return new BusinessUnitStatusChangedMessagePayloadImpl();
    }

    public static BusinessUnitStatusChangedMessagePayload of(final BusinessUnitStatusChangedMessagePayload template) {
        BusinessUnitStatusChangedMessagePayloadImpl instance = new BusinessUnitStatusChangedMessagePayloadImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    public static BusinessUnitStatusChangedMessagePayloadBuilder builder() {
        return BusinessUnitStatusChangedMessagePayloadBuilder.of();
    }

    public static BusinessUnitStatusChangedMessagePayloadBuilder builder(
            final BusinessUnitStatusChangedMessagePayload template) {
        return BusinessUnitStatusChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitStatusChangedMessagePayload(
            Function<BusinessUnitStatusChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitStatusChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitStatusChangedMessagePayload>";
            }
        };
    }
}
