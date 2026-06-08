
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
 *  <p>Generated when the container element specified in the <code>expressId</code> option is not found in the DOM.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressContainerNotFound expressContainerNotFound = ExpressContainerNotFound.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("express_container_not_found")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpressContainerNotFoundImpl.class)
public interface ExpressContainerNotFound extends ResponseMessage {

    /**
     * discriminator value for ExpressContainerNotFound
     */
    String EXPRESS_CONTAINER_NOT_FOUND = "express_container_not_found";

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
     *  <p>Express container not found.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>id</code> of the container that was not found.</p>
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
     *  <p>Express container not found.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>id</code> of the container that was not found.</p>
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
     * @return instance of ExpressContainerNotFound
     */
    public static ExpressContainerNotFound of() {
        return new ExpressContainerNotFoundImpl();
    }

    /**
     * factory method to create a shallow copy ExpressContainerNotFound
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpressContainerNotFound of(final ExpressContainerNotFound template) {
        ExpressContainerNotFoundImpl instance = new ExpressContainerNotFoundImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ExpressContainerNotFound copyDeep();

    /**
     * factory method to create a deep copy of ExpressContainerNotFound
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpressContainerNotFound deepCopy(@Nullable final ExpressContainerNotFound template) {
        if (template == null) {
            return null;
        }
        ExpressContainerNotFoundImpl instance = new ExpressContainerNotFoundImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ExpressContainerNotFound
     * @return builder
     */
    public static ExpressContainerNotFoundBuilder builder() {
        return ExpressContainerNotFoundBuilder.of();
    }

    /**
     * create builder for ExpressContainerNotFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressContainerNotFoundBuilder builder(final ExpressContainerNotFound template) {
        return ExpressContainerNotFoundBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpressContainerNotFound(Function<ExpressContainerNotFound, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpressContainerNotFound> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpressContainerNotFound>() {
            @Override
            public String toString() {
                return "TypeReference<ExpressContainerNotFound>";
            }
        };
    }
}
