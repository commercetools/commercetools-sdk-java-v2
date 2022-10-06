
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnit;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Business Unit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCreatedMessage businessUnitCreatedMessage = BusinessUnitCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCreatedMessageImpl.class)
public interface BusinessUnitCreatedMessage extends Message {

    String BUSINESS_UNIT_CREATED = "BusinessUnitCreated";

    /**
     *  <p>The Business Unit that was created.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnit getBusinessUnit();

    public void setBusinessUnit(final BusinessUnit businessUnit);

    public static BusinessUnitCreatedMessage of() {
        return new BusinessUnitCreatedMessageImpl();
    }

    public static BusinessUnitCreatedMessage of(final BusinessUnitCreatedMessage template) {
        BusinessUnitCreatedMessageImpl instance = new BusinessUnitCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public static BusinessUnitCreatedMessageBuilder builder() {
        return BusinessUnitCreatedMessageBuilder.of();
    }

    public static BusinessUnitCreatedMessageBuilder builder(final BusinessUnitCreatedMessage template) {
        return BusinessUnitCreatedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitCreatedMessage(Function<BusinessUnitCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCreatedMessage>";
            }
        };
    }
}
