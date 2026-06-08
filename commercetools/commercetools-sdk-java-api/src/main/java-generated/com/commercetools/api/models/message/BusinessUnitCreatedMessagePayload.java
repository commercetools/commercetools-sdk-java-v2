
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnit;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/business-units:POST" rel="nofollow">Create BusinessUnit</a> request.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCreatedMessagePayloadImpl.class)
public interface BusinessUnitCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCreatedMessagePayload
     */
    String BUSINESS_UNIT_CREATED = "BusinessUnitCreated";

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> that was created.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnit getBusinessUnit();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> that was created.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnit businessUnit);

    /**
     * factory method
     * @return instance of BusinessUnitCreatedMessagePayload
     */
    public static BusinessUnitCreatedMessagePayload of() {
        return new BusinessUnitCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCreatedMessagePayload of(final BusinessUnitCreatedMessagePayload template) {
        BusinessUnitCreatedMessagePayloadImpl instance = new BusinessUnitCreatedMessagePayloadImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public BusinessUnitCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCreatedMessagePayload deepCopy(
            @Nullable final BusinessUnitCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCreatedMessagePayloadImpl instance = new BusinessUnitCreatedMessagePayloadImpl();
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnit.deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCreatedMessagePayload
     * @return builder
     */
    public static BusinessUnitCreatedMessagePayloadBuilder builder() {
        return BusinessUnitCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCreatedMessagePayloadBuilder builder(final BusinessUnitCreatedMessagePayload template) {
        return BusinessUnitCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCreatedMessagePayload(Function<BusinessUnitCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCreatedMessagePayload>";
            }
        };
    }
}
