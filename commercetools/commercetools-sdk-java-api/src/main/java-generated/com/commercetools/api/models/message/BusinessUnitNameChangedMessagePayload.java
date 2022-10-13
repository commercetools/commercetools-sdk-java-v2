
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitNameChangedMessagePayload businessUnitNameChangedMessagePayload = BusinessUnitNameChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitNameChangedMessagePayloadImpl.class)
public interface BusinessUnitNameChangedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_NAME_CHANGED = "BusinessUnitNameChanged";

    /**
     *  <p>Updated name of the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static BusinessUnitNameChangedMessagePayload of() {
        return new BusinessUnitNameChangedMessagePayloadImpl();
    }

    public static BusinessUnitNameChangedMessagePayload of(final BusinessUnitNameChangedMessagePayload template) {
        BusinessUnitNameChangedMessagePayloadImpl instance = new BusinessUnitNameChangedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static BusinessUnitNameChangedMessagePayloadBuilder builder() {
        return BusinessUnitNameChangedMessagePayloadBuilder.of();
    }

    public static BusinessUnitNameChangedMessagePayloadBuilder builder(
            final BusinessUnitNameChangedMessagePayload template) {
        return BusinessUnitNameChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitNameChangedMessagePayload(Function<BusinessUnitNameChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitNameChangedMessagePayload>";
            }
        };
    }
}
