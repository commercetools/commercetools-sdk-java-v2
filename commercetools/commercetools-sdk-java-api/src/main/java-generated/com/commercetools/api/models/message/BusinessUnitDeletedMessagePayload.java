
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Business Unit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDeletedMessagePayload businessUnitDeletedMessagePayload = BusinessUnitDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitDeletedMessagePayloadImpl.class)
public interface BusinessUnitDeletedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_DELETED = "BusinessUnitDeleted";

    public static BusinessUnitDeletedMessagePayload of() {
        return new BusinessUnitDeletedMessagePayloadImpl();
    }

    public static BusinessUnitDeletedMessagePayload of(final BusinessUnitDeletedMessagePayload template) {
        BusinessUnitDeletedMessagePayloadImpl instance = new BusinessUnitDeletedMessagePayloadImpl();
        return instance;
    }

    public static BusinessUnitDeletedMessagePayloadBuilder builder() {
        return BusinessUnitDeletedMessagePayloadBuilder.of();
    }

    public static BusinessUnitDeletedMessagePayloadBuilder builder(final BusinessUnitDeletedMessagePayload template) {
        return BusinessUnitDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitDeletedMessagePayload(Function<BusinessUnitDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDeletedMessagePayload>";
            }
        };
    }
}
