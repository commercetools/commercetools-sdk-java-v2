
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
 *  <p>Generated when the <span>Checkout properties</span> contains one or more deprecated fields.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeprecatedFields deprecatedFields = DeprecatedFields.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("deprecated_fields")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DeprecatedFieldsImpl.class)
public interface DeprecatedFields extends ResponseMessage {

    /**
     * discriminator value for DeprecatedFields
     */
    String DEPRECATED_FIELDS = "deprecated_fields";

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
     *  <p>Some fields are deprecated.</p>
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
     *  <p>Contains the <code>deprecatedFields</code> array.</p>
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
     *  <p>Some fields are deprecated.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>deprecatedFields</code> array.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of DeprecatedFields
     */
    public static DeprecatedFields of() {
        return new DeprecatedFieldsImpl();
    }

    /**
     * factory method to create a shallow copy DeprecatedFields
     * @param template instance to be copied
     * @return copy instance
     */
    public static DeprecatedFields of(final DeprecatedFields template) {
        DeprecatedFieldsImpl instance = new DeprecatedFieldsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public DeprecatedFields copyDeep();

    /**
     * factory method to create a deep copy of DeprecatedFields
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeprecatedFields deepCopy(@Nullable final DeprecatedFields template) {
        if (template == null) {
            return null;
        }
        DeprecatedFieldsImpl instance = new DeprecatedFieldsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for DeprecatedFields
     * @return builder
     */
    public static DeprecatedFieldsBuilder builder() {
        return DeprecatedFieldsBuilder.of();
    }

    /**
     * create builder for DeprecatedFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeprecatedFieldsBuilder builder(final DeprecatedFields template) {
        return DeprecatedFieldsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeprecatedFields(Function<DeprecatedFields, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeprecatedFields> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeprecatedFields>() {
            @Override
            public String toString() {
                return "TypeReference<DeprecatedFields>";
            }
        };
    }
}
