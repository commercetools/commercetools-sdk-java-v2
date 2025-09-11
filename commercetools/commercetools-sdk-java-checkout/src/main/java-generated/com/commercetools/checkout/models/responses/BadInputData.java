
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
 *  <p>Generated when the <span>Checkout properties</span> contains invalid fields.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BadInputData badInputData = BadInputData.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("invalid_fields")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BadInputDataImpl.class)
public interface BadInputData extends ResponseMessage {

    /**
     * discriminator value for BadInputData
     */
    String INVALID_FIELDS = "invalid_fields";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Some fields are invalid.</p>
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
     *  <p>Contains the <code>invalidFields</code> array of objects with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Some fields are invalid.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>invalidFields</code> array of objects with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of BadInputData
     */
    public static BadInputData of() {
        return new BadInputDataImpl();
    }

    /**
     * factory method to create a shallow copy BadInputData
     * @param template instance to be copied
     * @return copy instance
     */
    public static BadInputData of(final BadInputData template) {
        BadInputDataImpl instance = new BadInputDataImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public BadInputData copyDeep();

    /**
     * factory method to create a deep copy of BadInputData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BadInputData deepCopy(@Nullable final BadInputData template) {
        if (template == null) {
            return null;
        }
        BadInputDataImpl instance = new BadInputDataImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for BadInputData
     * @return builder
     */
    public static BadInputDataBuilder builder() {
        return BadInputDataBuilder.of();
    }

    /**
     * create builder for BadInputData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BadInputDataBuilder builder(final BadInputData template) {
        return BadInputDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBadInputData(Function<BadInputData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BadInputData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BadInputData>() {
            @Override
            public String toString() {
                return "TypeReference<BadInputData>";
            }
        };
    }
}
