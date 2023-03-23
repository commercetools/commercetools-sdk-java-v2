
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
 *  <p>Generated after a successful Add Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateAddedMessagePayload businessUnitAssociateAddedMessagePayload = BusinessUnitAssociateAddedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateAddedMessagePayloadImpl.class)
public interface BusinessUnitAssociateAddedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_ASSOCIATE_ADDED = "BusinessUnitAssociateAdded";

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    public void setAssociate(final Associate associate);

    public static BusinessUnitAssociateAddedMessagePayload of() {
        return new BusinessUnitAssociateAddedMessagePayloadImpl();
    }

    public static BusinessUnitAssociateAddedMessagePayload of(final BusinessUnitAssociateAddedMessagePayload template) {
        BusinessUnitAssociateAddedMessagePayloadImpl instance = new BusinessUnitAssociateAddedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public static BusinessUnitAssociateAddedMessagePayloadBuilder builder() {
        return BusinessUnitAssociateAddedMessagePayloadBuilder.of();
    }

    public static BusinessUnitAssociateAddedMessagePayloadBuilder builder(
            final BusinessUnitAssociateAddedMessagePayload template) {
        return BusinessUnitAssociateAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitAssociateAddedMessagePayload(
            Function<BusinessUnitAssociateAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateAddedMessagePayload>";
            }
        };
    }
}
