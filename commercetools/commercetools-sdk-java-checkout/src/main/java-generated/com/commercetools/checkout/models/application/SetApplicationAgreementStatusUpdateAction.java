
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
 * SetApplicationAgreementStatusUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementStatusUpdateAction setApplicationAgreementStatusUpdateAction = SetApplicationAgreementStatusUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .status(ApplicationAgreementStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAgreementStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationAgreementStatusUpdateActionImpl.class)
public interface SetApplicationAgreementStatusUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationAgreementStatusUpdateAction
     */
    String SET_AGREEMENT_STATUS = "setAgreementStatus";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>ID of the agreement to update.</p>
     * @return agreementId
     */
    @NotNull
    @JsonProperty("agreementId")
    public String getAgreementId();

    /**
     *  <p>New status for the agreement.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApplicationAgreementStatus getStatus();

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     */

    public void setAgreementId(final String agreementId);

    /**
     *  <p>New status for the agreement.</p>
     * @param status value to be set
     */

    public void setStatus(final ApplicationAgreementStatus status);

    /**
     * factory method
     * @return instance of SetApplicationAgreementStatusUpdateAction
     */
    public static SetApplicationAgreementStatusUpdateAction of() {
        return new SetApplicationAgreementStatusUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationAgreementStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationAgreementStatusUpdateAction of(
            final SetApplicationAgreementStatusUpdateAction template) {
        SetApplicationAgreementStatusUpdateActionImpl instance = new SetApplicationAgreementStatusUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setStatus(template.getStatus());
        return instance;
    }

    public SetApplicationAgreementStatusUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationAgreementStatusUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationAgreementStatusUpdateAction deepCopy(
            @Nullable final SetApplicationAgreementStatusUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationAgreementStatusUpdateActionImpl instance = new SetApplicationAgreementStatusUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for SetApplicationAgreementStatusUpdateAction
     * @return builder
     */
    public static SetApplicationAgreementStatusUpdateActionBuilder builder() {
        return SetApplicationAgreementStatusUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationAgreementStatusUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementStatusUpdateActionBuilder builder(
            final SetApplicationAgreementStatusUpdateAction template) {
        return SetApplicationAgreementStatusUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationAgreementStatusUpdateAction(
            Function<SetApplicationAgreementStatusUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementStatusUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementStatusUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationAgreementStatusUpdateAction>";
            }
        };
    }
}
