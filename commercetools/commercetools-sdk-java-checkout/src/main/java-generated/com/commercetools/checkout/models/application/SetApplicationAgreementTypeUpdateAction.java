
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
 * SetApplicationAgreementTypeUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementTypeUpdateAction setApplicationAgreementTypeUpdateAction = SetApplicationAgreementTypeUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .type(ApplicationAgreementType.TEXT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAgreementType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationAgreementTypeUpdateActionImpl.class)
public interface SetApplicationAgreementTypeUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationAgreementTypeUpdateAction
     */
    String SET_AGREEMENT_TYPE = "setAgreementType";

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
     *  <p>New type for the agreement.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ApplicationAgreementType getType();

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     */

    public void setAgreementId(final String agreementId);

    /**
     *  <p>New type for the agreement.</p>
     * @param type value to be set
     */

    public void setType(final ApplicationAgreementType type);

    /**
     * factory method
     * @return instance of SetApplicationAgreementTypeUpdateAction
     */
    public static SetApplicationAgreementTypeUpdateAction of() {
        return new SetApplicationAgreementTypeUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationAgreementTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationAgreementTypeUpdateAction of(final SetApplicationAgreementTypeUpdateAction template) {
        SetApplicationAgreementTypeUpdateActionImpl instance = new SetApplicationAgreementTypeUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setType(template.getType());
        return instance;
    }

    public SetApplicationAgreementTypeUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationAgreementTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationAgreementTypeUpdateAction deepCopy(
            @Nullable final SetApplicationAgreementTypeUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationAgreementTypeUpdateActionImpl instance = new SetApplicationAgreementTypeUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for SetApplicationAgreementTypeUpdateAction
     * @return builder
     */
    public static SetApplicationAgreementTypeUpdateActionBuilder builder() {
        return SetApplicationAgreementTypeUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationAgreementTypeUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementTypeUpdateActionBuilder builder(
            final SetApplicationAgreementTypeUpdateAction template) {
        return SetApplicationAgreementTypeUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationAgreementTypeUpdateAction(
            Function<SetApplicationAgreementTypeUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementTypeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementTypeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationAgreementTypeUpdateAction>";
            }
        };
    }
}
