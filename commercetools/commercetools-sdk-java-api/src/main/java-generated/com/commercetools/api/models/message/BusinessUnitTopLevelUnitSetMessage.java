
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> <code>topLevelUnit</code> is modified due to a hierarchy change after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitTopLevelUnitSetMessage businessUnitTopLevelUnitSetMessage = BusinessUnitTopLevelUnitSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .oldTopLevelUnit(oldTopLevelUnitBuilder -> oldTopLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitTopLevelUnitSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitTopLevelUnitSetMessageImpl.class)
public interface BusinessUnitTopLevelUnitSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitTopLevelUnitSetMessage
     */
    String BUSINESS_UNIT_TOP_LEVEL_UNIT_SET = "BusinessUnitTopLevelUnitSet";

    /**
     *  <p>Top-level unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @return topLevelUnit
     */
    @NotNull
    @Valid
    @JsonProperty("topLevelUnit")
    public BusinessUnitKeyReference getTopLevelUnit();

    /**
     *  <p>Top-level unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @return oldTopLevelUnit
     */
    @NotNull
    @Valid
    @JsonProperty("oldTopLevelUnit")
    public BusinessUnitKeyReference getOldTopLevelUnit();

    /**
     *  <p>Top-level unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param topLevelUnit value to be set
     */

    public void setTopLevelUnit(final BusinessUnitKeyReference topLevelUnit);

    /**
     *  <p>Top-level unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     * @param oldTopLevelUnit value to be set
     */

    public void setOldTopLevelUnit(final BusinessUnitKeyReference oldTopLevelUnit);

    /**
     * factory method
     * @return instance of BusinessUnitTopLevelUnitSetMessage
     */
    public static BusinessUnitTopLevelUnitSetMessage of() {
        return new BusinessUnitTopLevelUnitSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitTopLevelUnitSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitTopLevelUnitSetMessage of(final BusinessUnitTopLevelUnitSetMessage template) {
        BusinessUnitTopLevelUnitSetMessageImpl instance = new BusinessUnitTopLevelUnitSetMessageImpl();
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
        instance.setTopLevelUnit(template.getTopLevelUnit());
        instance.setOldTopLevelUnit(template.getOldTopLevelUnit());
        return instance;
    }

    public BusinessUnitTopLevelUnitSetMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitTopLevelUnitSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitTopLevelUnitSetMessage deepCopy(
            @Nullable final BusinessUnitTopLevelUnitSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitTopLevelUnitSetMessageImpl instance = new BusinessUnitTopLevelUnitSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setTopLevelUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getTopLevelUnit()));
        instance.setOldTopLevelUnit(com.commercetools.api.models.business_unit.BusinessUnitKeyReference
                .deepCopy(template.getOldTopLevelUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitTopLevelUnitSetMessage
     * @return builder
     */
    public static BusinessUnitTopLevelUnitSetMessageBuilder builder() {
        return BusinessUnitTopLevelUnitSetMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitTopLevelUnitSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTopLevelUnitSetMessageBuilder builder(final BusinessUnitTopLevelUnitSetMessage template) {
        return BusinessUnitTopLevelUnitSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitTopLevelUnitSetMessage(Function<BusinessUnitTopLevelUnitSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTopLevelUnitSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTopLevelUnitSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitTopLevelUnitSetMessage>";
            }
        };
    }
}
