
package com.commercetools.checkout.models.application;

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
 * AddApplicationAgreementUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddApplicationAgreementUpdateAction addApplicationAgreementUpdateAction = AddApplicationAgreementUpdateAction.builder()
 *             .agreement(agreementBuilder -> agreementBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addAgreement")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddApplicationAgreementUpdateActionImpl.class)
public interface AddApplicationAgreementUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for AddApplicationAgreementUpdateAction
     */
    String ADD_AGREEMENT = "addAgreement";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Agreement to add to the Application.</p>
     * @return agreement
     */
    @NotNull
    @Valid
    @JsonProperty("agreement")
    public ApplicationAgreementDraft getAgreement();

    /**
     *  <p>Agreement to add to the Application.</p>
     * @param agreement value to be set
     */

    public void setAgreement(final ApplicationAgreementDraft agreement);

    /**
     * factory method
     * @return instance of AddApplicationAgreementUpdateAction
     */
    public static AddApplicationAgreementUpdateAction of() {
        return new AddApplicationAgreementUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy AddApplicationAgreementUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddApplicationAgreementUpdateAction of(final AddApplicationAgreementUpdateAction template) {
        AddApplicationAgreementUpdateActionImpl instance = new AddApplicationAgreementUpdateActionImpl();
        instance.setAgreement(template.getAgreement());
        return instance;
    }

    public AddApplicationAgreementUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of AddApplicationAgreementUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddApplicationAgreementUpdateAction deepCopy(
            @Nullable final AddApplicationAgreementUpdateAction template) {
        if (template == null) {
            return null;
        }
        AddApplicationAgreementUpdateActionImpl instance = new AddApplicationAgreementUpdateActionImpl();
        instance.setAgreement(
            com.commercetools.checkout.models.application.ApplicationAgreementDraft.deepCopy(template.getAgreement()));
        return instance;
    }

    /**
     * builder factory method for AddApplicationAgreementUpdateAction
     * @return builder
     */
    public static AddApplicationAgreementUpdateActionBuilder builder() {
        return AddApplicationAgreementUpdateActionBuilder.of();
    }

    /**
     * create builder for AddApplicationAgreementUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddApplicationAgreementUpdateActionBuilder builder(
            final AddApplicationAgreementUpdateAction template) {
        return AddApplicationAgreementUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddApplicationAgreementUpdateAction(Function<AddApplicationAgreementUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddApplicationAgreementUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddApplicationAgreementUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<AddApplicationAgreementUpdateAction>";
            }
        };
    }
}
