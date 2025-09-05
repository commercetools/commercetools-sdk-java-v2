
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when some fields provided in the Checkout initialization request are invalid and have been updated to match our schema. An array of updates will be provided with a sequence of edits used to transform an invalid value into a valid one.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdatedFields updatedFields = UpdatedFields.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("updated_fields")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UpdatedFieldsImpl.class)
public interface UpdatedFields extends ResponseMessage {

    /**
     * discriminator value for UpdatedFields
     */
    String UPDATED_FIELDS = "updated_fields";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`warn`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Some fields are invalid and have been updated.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>Contains two arrays:</p>
     *  <ul>
     *   <li><code>invalidFields</code> contains a list of invalid fields with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</li>
     *   <li><code>updatedFields</code> contains the updated fields with its related <code>type</code>, <code>path</code> and <code>value</code> properties, where <code>type</code> can be <code>update</code>|<code>insert</code>|<code>delete</code>.</li>
     *  </ul>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Some fields are invalid and have been updated.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains two arrays:</p>
     *  <ul>
     *   <li><code>invalidFields</code> contains a list of invalid fields with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</li>
     *   <li><code>updatedFields</code> contains the updated fields with its related <code>type</code>, <code>path</code> and <code>value</code> properties, where <code>type</code> can be <code>update</code>|<code>insert</code>|<code>delete</code>.</li>
     *  </ul>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of UpdatedFields
     */
    public static UpdatedFields of() {
        return new UpdatedFieldsImpl();
    }

    /**
     * factory method to create a shallow copy UpdatedFields
     * @param template instance to be copied
     * @return copy instance
     */
    public static UpdatedFields of(final UpdatedFields template) {
        UpdatedFieldsImpl instance = new UpdatedFieldsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public UpdatedFields copyDeep();

    /**
     * factory method to create a deep copy of UpdatedFields
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UpdatedFields deepCopy(@Nullable final UpdatedFields template) {
        if (template == null) {
            return null;
        }
        UpdatedFieldsImpl instance = new UpdatedFieldsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for UpdatedFields
     * @return builder
     */
    public static UpdatedFieldsBuilder builder() {
        return UpdatedFieldsBuilder.of();
    }

    /**
     * create builder for UpdatedFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdatedFieldsBuilder builder(final UpdatedFields template) {
        return UpdatedFieldsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUpdatedFields(Function<UpdatedFields, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UpdatedFields> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UpdatedFields>() {
            @Override
            public String toString() {
                return "TypeReference<UpdatedFields>";
            }
        };
    }
}
