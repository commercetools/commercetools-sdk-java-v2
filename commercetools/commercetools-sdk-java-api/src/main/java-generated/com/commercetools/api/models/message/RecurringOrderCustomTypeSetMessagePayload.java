
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomTypeSetMessagePayload recurringOrderCustomTypeSetMessagePayload = RecurringOrderCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomTypeSetMessagePayloadImpl.class)
public interface RecurringOrderCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderCustomTypeSetMessagePayload
     */
    String RECURRING_ORDER_CUSTOM_TYPE_SET = "RecurringOrderCustomTypeSet";

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of RecurringOrderCustomTypeSetMessagePayload
     */
    public static RecurringOrderCustomTypeSetMessagePayload of() {
        return new RecurringOrderCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomTypeSetMessagePayload of(
            final RecurringOrderCustomTypeSetMessagePayload template) {
        RecurringOrderCustomTypeSetMessagePayloadImpl instance = new RecurringOrderCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public RecurringOrderCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomTypeSetMessagePayload deepCopy(
            @Nullable final RecurringOrderCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomTypeSetMessagePayloadImpl instance = new RecurringOrderCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomTypeSetMessagePayload
     * @return builder
     */
    public static RecurringOrderCustomTypeSetMessagePayloadBuilder builder() {
        return RecurringOrderCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomTypeSetMessagePayloadBuilder builder(
            final RecurringOrderCustomTypeSetMessagePayload template) {
        return RecurringOrderCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomTypeSetMessagePayload(
            Function<RecurringOrderCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomTypeSetMessagePayload>";
            }
        };
    }
}
