
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SetApplicationStatusUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationStatusUpdateAction setApplicationStatusUpdateAction = SetApplicationStatusUpdateAction.builder()
 *             .status(ApplicationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationStatusUpdateActionImpl.class)
public interface SetApplicationStatusUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationStatusUpdateAction
     */
    String SET_STATUS = "setStatus";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>New status to assign to the Application.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApplicationStatus getStatus();

    /**
     *  <p>New status to assign to the Application.</p>
     * @param status value to be set
     */

    public void setStatus(final ApplicationStatus status);

    /**
     * factory method
     * @return instance of SetApplicationStatusUpdateAction
     */
    public static SetApplicationStatusUpdateAction of() {
        return new SetApplicationStatusUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationStatusUpdateAction of(final SetApplicationStatusUpdateAction template) {
        SetApplicationStatusUpdateActionImpl instance = new SetApplicationStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public SetApplicationStatusUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationStatusUpdateAction deepCopy(@Nullable final SetApplicationStatusUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationStatusUpdateActionImpl instance = new SetApplicationStatusUpdateActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for SetApplicationStatusUpdateAction
     * @return builder
     */
    public static SetApplicationStatusUpdateActionBuilder builder() {
        return SetApplicationStatusUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationStatusUpdateActionBuilder builder(final SetApplicationStatusUpdateAction template) {
        return SetApplicationStatusUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationStatusUpdateAction(Function<SetApplicationStatusUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationStatusUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationStatusUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationStatusUpdateAction>";
            }
        };
    }
}
