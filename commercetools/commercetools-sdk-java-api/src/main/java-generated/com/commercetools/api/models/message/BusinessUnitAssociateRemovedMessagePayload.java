
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateRemovedMessagePayload businessUnitAssociateRemovedMessagePayload = BusinessUnitAssociateRemovedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateRemovedMessagePayloadImpl.class)
public interface BusinessUnitAssociateRemovedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_ASSOCIATE_REMOVED = "BusinessUnitAssociateRemoved";

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    public void setAssociate(final Associate associate);

    public static BusinessUnitAssociateRemovedMessagePayload of() {
        return new BusinessUnitAssociateRemovedMessagePayloadImpl();
    }

    public static BusinessUnitAssociateRemovedMessagePayload of(
            final BusinessUnitAssociateRemovedMessagePayload template) {
        BusinessUnitAssociateRemovedMessagePayloadImpl instance = new BusinessUnitAssociateRemovedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public static BusinessUnitAssociateRemovedMessagePayloadBuilder builder() {
        return BusinessUnitAssociateRemovedMessagePayloadBuilder.of();
    }

    public static BusinessUnitAssociateRemovedMessagePayloadBuilder builder(
            final BusinessUnitAssociateRemovedMessagePayload template) {
        return BusinessUnitAssociateRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitAssociateRemovedMessagePayload(
            Function<BusinessUnitAssociateRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateRemovedMessagePayload>";
            }
        };
    }
}
