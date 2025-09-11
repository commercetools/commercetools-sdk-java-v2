
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the <span>Checkout Session</span> is expired.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpiredSession expiredSession = ExpiredSession.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("expired_session")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpiredSessionImpl.class)
public interface ExpiredSession extends Message {

    /**
     * discriminator value for ExpiredSession
     */
    String EXPIRED_SESSION = "expired_session";

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
     *  <p>Session is expired.</p>
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
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Session is expired.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of ExpiredSession
     */
    public static ExpiredSession of() {
        return new ExpiredSessionImpl();
    }

    /**
     * factory method to create a shallow copy ExpiredSession
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpiredSession of(final ExpiredSession template) {
        ExpiredSessionImpl instance = new ExpiredSessionImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public ExpiredSession copyDeep();

    /**
     * factory method to create a deep copy of ExpiredSession
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpiredSession deepCopy(@Nullable final ExpiredSession template) {
        if (template == null) {
            return null;
        }
        ExpiredSessionImpl instance = new ExpiredSessionImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for ExpiredSession
     * @return builder
     */
    public static ExpiredSessionBuilder builder() {
        return ExpiredSessionBuilder.of();
    }

    /**
     * create builder for ExpiredSession instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpiredSessionBuilder builder(final ExpiredSession template) {
        return ExpiredSessionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpiredSession(Function<ExpiredSession, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpiredSession> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpiredSession>() {
            @Override
            public String toString() {
                return "TypeReference<ExpiredSession>";
            }
        };
    }
}
