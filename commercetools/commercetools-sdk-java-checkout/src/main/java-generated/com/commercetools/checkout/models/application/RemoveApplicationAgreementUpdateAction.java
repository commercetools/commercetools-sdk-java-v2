
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
 * RemoveApplicationAgreementUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveApplicationAgreementUpdateAction removeApplicationAgreementUpdateAction = RemoveApplicationAgreementUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeAgreement")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveApplicationAgreementUpdateActionImpl.class)
public interface RemoveApplicationAgreementUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for RemoveApplicationAgreementUpdateAction
     */
    String REMOVE_AGREEMENT = "removeAgreement";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>ID of the agreement to remove from the Application.</p>
     * @return agreementId
     */
    @NotNull
    @JsonProperty("agreementId")
    public String getAgreementId();

    /**
     *  <p>ID of the agreement to remove from the Application.</p>
     * @param agreementId value to be set
     */

    public void setAgreementId(final String agreementId);

    /**
     * factory method
     * @return instance of RemoveApplicationAgreementUpdateAction
     */
    public static RemoveApplicationAgreementUpdateAction of() {
        return new RemoveApplicationAgreementUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy RemoveApplicationAgreementUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveApplicationAgreementUpdateAction of(final RemoveApplicationAgreementUpdateAction template) {
        RemoveApplicationAgreementUpdateActionImpl instance = new RemoveApplicationAgreementUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        return instance;
    }

    public RemoveApplicationAgreementUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of RemoveApplicationAgreementUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveApplicationAgreementUpdateAction deepCopy(
            @Nullable final RemoveApplicationAgreementUpdateAction template) {
        if (template == null) {
            return null;
        }
        RemoveApplicationAgreementUpdateActionImpl instance = new RemoveApplicationAgreementUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        return instance;
    }

    /**
     * builder factory method for RemoveApplicationAgreementUpdateAction
     * @return builder
     */
    public static RemoveApplicationAgreementUpdateActionBuilder builder() {
        return RemoveApplicationAgreementUpdateActionBuilder.of();
    }

    /**
     * create builder for RemoveApplicationAgreementUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveApplicationAgreementUpdateActionBuilder builder(
            final RemoveApplicationAgreementUpdateAction template) {
        return RemoveApplicationAgreementUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveApplicationAgreementUpdateAction(
            Function<RemoveApplicationAgreementUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveApplicationAgreementUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveApplicationAgreementUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveApplicationAgreementUpdateAction>";
            }
        };
    }
}
