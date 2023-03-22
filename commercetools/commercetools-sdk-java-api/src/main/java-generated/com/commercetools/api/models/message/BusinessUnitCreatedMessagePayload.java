
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
 *     BusinessUnitCreatedMessagePayload businessUnitCreatedMessagePayload = BusinessUnitCreatedMessagePayload.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCreatedMessagePayloadImpl.class)
public interface BusinessUnitCreatedMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_CREATED = "BusinessUnitCreated";

    /**
     *  <p>The Business Unit that was created.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnit getBusinessUnit();

    public void setBusinessUnit(final BusinessUnit businessUnit);

    public static BusinessUnitCreatedMessagePayload of() {
        return new BusinessUnitCreatedMessagePayloadImpl();
    }

    public static BusinessUnitCreatedMessagePayload of(final BusinessUnitCreatedMessagePayload template) {
        BusinessUnitCreatedMessagePayloadImpl instance = new BusinessUnitCreatedMessagePayloadImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public static BusinessUnitCreatedMessagePayloadBuilder builder() {
        return BusinessUnitCreatedMessagePayloadBuilder.of();
    }

    public static BusinessUnitCreatedMessagePayloadBuilder builder(final BusinessUnitCreatedMessagePayload template) {
        return BusinessUnitCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitCreatedMessagePayload(Function<BusinessUnitCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCreatedMessagePayload>";
            }
        };
    }
}
