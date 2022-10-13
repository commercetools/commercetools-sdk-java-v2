
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Parent Unit update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitParentUnitChangedMessagePayload businessUnitParentUnitChangedMessagePayload = BusinessUnitParentUnitChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitParentUnitChangedMessagePayloadImpl.class)
public interface BusinessUnitParentUnitChangedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_PARENT_UNIT_CHANGED = "BusinessUnitParentUnitChanged";

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     */
    @Valid
    @JsonProperty("oldParentUnit")
    public BusinessUnitKeyReference getOldParentUnit();

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     */
    @Valid
    @JsonProperty("newParentUnit")
    public BusinessUnitKeyReference getNewParentUnit();

    public void setOldParentUnit(final BusinessUnitKeyReference oldParentUnit);

    public void setNewParentUnit(final BusinessUnitKeyReference newParentUnit);

    public static BusinessUnitParentUnitChangedMessagePayload of() {
        return new BusinessUnitParentUnitChangedMessagePayloadImpl();
    }

    public static BusinessUnitParentUnitChangedMessagePayload of(
            final BusinessUnitParentUnitChangedMessagePayload template) {
        BusinessUnitParentUnitChangedMessagePayloadImpl instance = new BusinessUnitParentUnitChangedMessagePayloadImpl();
        instance.setOldParentUnit(template.getOldParentUnit());
        instance.setNewParentUnit(template.getNewParentUnit());
        return instance;
    }

    public static BusinessUnitParentUnitChangedMessagePayloadBuilder builder() {
        return BusinessUnitParentUnitChangedMessagePayloadBuilder.of();
    }

    public static BusinessUnitParentUnitChangedMessagePayloadBuilder builder(
            final BusinessUnitParentUnitChangedMessagePayload template) {
        return BusinessUnitParentUnitChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitParentUnitChangedMessagePayload(
            Function<BusinessUnitParentUnitChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitParentUnitChangedMessagePayload>";
            }
        };
    }
}
