
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCustomTypeSetMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCustomTypeSetMessagePayloadBuilder
        implements Builder<RecurringOrderCustomTypeSetMessagePayload> {

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String previousTypeId;

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public RecurringOrderCustomTypeSetMessagePayloadBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public RecurringOrderCustomTypeSetMessagePayloadBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public RecurringOrderCustomTypeSetMessagePayloadBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     * @return Builder
     */

    public RecurringOrderCustomTypeSetMessagePayloadBuilder previousTypeId(@Nullable final String previousTypeId) {
        this.previousTypeId = previousTypeId;
        return this;
    }

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @Nullable
    public String getPreviousTypeId() {
        return this.previousTypeId;
    }

    /**
     * builds RecurringOrderCustomTypeSetMessagePayload with checking for non-null required values
     * @return RecurringOrderCustomTypeSetMessagePayload
     */
    public RecurringOrderCustomTypeSetMessagePayload build() {
        Objects.requireNonNull(customFields,
            RecurringOrderCustomTypeSetMessagePayload.class + ": customFields is missing");
        return new RecurringOrderCustomTypeSetMessagePayloadImpl(customFields, previousTypeId);
    }

    /**
     * builds RecurringOrderCustomTypeSetMessagePayload without checking for non-null required values
     * @return RecurringOrderCustomTypeSetMessagePayload
     */
    public RecurringOrderCustomTypeSetMessagePayload buildUnchecked() {
        return new RecurringOrderCustomTypeSetMessagePayloadImpl(customFields, previousTypeId);
    }

    /**
     * factory method for an instance of RecurringOrderCustomTypeSetMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderCustomTypeSetMessagePayloadBuilder of() {
        return new RecurringOrderCustomTypeSetMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomTypeSetMessagePayloadBuilder of(
            final RecurringOrderCustomTypeSetMessagePayload template) {
        RecurringOrderCustomTypeSetMessagePayloadBuilder builder = new RecurringOrderCustomTypeSetMessagePayloadBuilder();
        builder.customFields = template.getCustomFields();
        builder.previousTypeId = template.getPreviousTypeId();
        return builder;
    }

}
