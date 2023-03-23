
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
 *  <p>Generated after a successful Set Associates update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociatesSetMessagePayload businessUnitAssociatesSetMessagePayload = BusinessUnitAssociatesSetMessagePayload.builder()
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociatesSetMessagePayloadImpl.class)
public interface BusinessUnitAssociatesSetMessagePayload extends MessagePayload {

    String BUSINESS_UNIT_ASSOCIATES_SET = "BusinessUnitAssociatesSet";

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @return associates
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<Associate> getAssociates();

    @JsonIgnore
    public void setAssociates(final Associate... associates);

    public void setAssociates(final List<Associate> associates);

    public static BusinessUnitAssociatesSetMessagePayload of() {
        return new BusinessUnitAssociatesSetMessagePayloadImpl();
    }

    public static BusinessUnitAssociatesSetMessagePayload of(final BusinessUnitAssociatesSetMessagePayload template) {
        BusinessUnitAssociatesSetMessagePayloadImpl instance = new BusinessUnitAssociatesSetMessagePayloadImpl();
        instance.setAssociates(template.getAssociates());
        return instance;
    }

    public static BusinessUnitAssociatesSetMessagePayloadBuilder builder() {
        return BusinessUnitAssociatesSetMessagePayloadBuilder.of();
    }

    public static BusinessUnitAssociatesSetMessagePayloadBuilder builder(
            final BusinessUnitAssociatesSetMessagePayload template) {
        return BusinessUnitAssociatesSetMessagePayloadBuilder.of(template);
    }

    default <T> T withBusinessUnitAssociatesSetMessagePayload(
            Function<BusinessUnitAssociatesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociatesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociatesSetMessagePayload>";
            }
        };
    }
}
