
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
 *  <p>Generated when multiple elements with the <code>data-ctc-express</code> attribute are found without an <code>expressId</code> specified. Use the <code>expressId</code> option to specify which container to use.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressMultipleContainersFound expressMultipleContainersFound = ExpressMultipleContainersFound.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_multiple_containers_found")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressMultipleContainersFoundImpl.class)
public interface ExpressMultipleContainersFound extends ResponseMessage {

    /**
     * discriminator value for ExpressMultipleContainersFound
     */
    String EXPRESS_MULTIPLE_CONTAINERS_FOUND = "express_multiple_containers_found";

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
     *  <p>Multiple elements with data-ctc-express attribute found. Use expressId to specify which container to use.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>count</code> property indicating the number of containers found.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Multiple elements with data-ctc-express attribute found. Use expressId to specify which container to use.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>count</code> property indicating the number of containers found.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of ExpressMultipleContainersFound
     */
    public static ExpressMultipleContainersFound of() {
        return new ExpressMultipleContainersFoundImpl();
    }

    /**
     * factory method to create a shallow copy ExpressMultipleContainersFound
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressMultipleContainersFound of(final ExpressMultipleContainersFound template) {
        ExpressMultipleContainersFoundImpl instance = new ExpressMultipleContainersFoundImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressMultipleContainersFound copyDeep();

    /**
     * factory method to create a deep copy of ExpressMultipleContainersFound
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressMultipleContainersFound deepCopy(@Nullable final ExpressMultipleContainersFound template) {
        if (template == null) {
            return null;
        }
        ExpressMultipleContainersFoundImpl instance = new ExpressMultipleContainersFoundImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressMultipleContainersFound
     * @return builder
     */
    public static ExpressMultipleContainersFoundBuilder builder() {
        return ExpressMultipleContainersFoundBuilder.of();
    }

    /**
     * create builder for ExpressMultipleContainersFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressMultipleContainersFoundBuilder builder(final ExpressMultipleContainersFound template) {
        return ExpressMultipleContainersFoundBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressMultipleContainersFound(Function<ExpressMultipleContainersFound, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressMultipleContainersFound> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressMultipleContainersFound>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressMultipleContainersFound>";
            }
        };
    }
}
