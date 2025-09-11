
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
 *  <p>Generated when the <span>Checkout Session</span> fails to refresh.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FailedToRefreshSession failedToRefreshSession = FailedToRefreshSession.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("failed_to_refresh_session")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FailedToRefreshSessionImpl.class)
public interface FailedToRefreshSession extends Message {

    /**
     * discriminator value for FailedToRefreshSession
     */
    String FAILED_TO_REFRESH_SESSION = "failed_to_refresh_session";

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
     *  <p>Failed to refresh session.</p>
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
     *  <p>Failed to refresh session.</p>
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
     * @return instance of FailedToRefreshSession
     */
    public static FailedToRefreshSession of() {
        return new FailedToRefreshSessionImpl();
    }

    /**
     * factory method to create a shallow copy FailedToRefreshSession
     * @param template instance to be copied
     * @return copy instance
     */
    public static FailedToRefreshSession of(final FailedToRefreshSession template) {
        FailedToRefreshSessionImpl instance = new FailedToRefreshSessionImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public FailedToRefreshSession copyDeep();

    /**
     * factory method to create a deep copy of FailedToRefreshSession
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FailedToRefreshSession deepCopy(@Nullable final FailedToRefreshSession template) {
        if (template == null) {
            return null;
        }
        FailedToRefreshSessionImpl instance = new FailedToRefreshSessionImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for FailedToRefreshSession
     * @return builder
     */
    public static FailedToRefreshSessionBuilder builder() {
        return FailedToRefreshSessionBuilder.of();
    }

    /**
     * create builder for FailedToRefreshSession instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FailedToRefreshSessionBuilder builder(final FailedToRefreshSession template) {
        return FailedToRefreshSessionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFailedToRefreshSession(Function<FailedToRefreshSession, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FailedToRefreshSession> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FailedToRefreshSession>() {
            @Override
            public String toString() {
                return "TypeReference<FailedToRefreshSession>";
            }
        };
    }
}
