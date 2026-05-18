
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetApplicationAgreementTextUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementTextUpdateAction setApplicationAgreementTextUpdateAction = SetApplicationAgreementTextUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .text(textBuilder -> textBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAgreementText")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationAgreementTextUpdateActionImpl.class)
public interface SetApplicationAgreementTextUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationAgreementTextUpdateAction
     */
    String SET_AGREEMENT_TEXT = "setAgreementText";

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
     *  <p>New text for the agreement.</p>
     * @return text
     */
    @NotNull
    @Valid
    @JsonProperty("text")
    public LocalizedString getText();

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     */

    public void setAgreementId(final String agreementId);

    /**
     *  <p>New text for the agreement.</p>
     * @param text value to be set
     */

    public void setText(final LocalizedString text);

    /**
     * factory method
     * @return instance of SetApplicationAgreementTextUpdateAction
     */
    public static SetApplicationAgreementTextUpdateAction of() {
        return new SetApplicationAgreementTextUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationAgreementTextUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationAgreementTextUpdateAction of(final SetApplicationAgreementTextUpdateAction template) {
        SetApplicationAgreementTextUpdateActionImpl instance = new SetApplicationAgreementTextUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setText(template.getText());
        return instance;
    }

    public SetApplicationAgreementTextUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationAgreementTextUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationAgreementTextUpdateAction deepCopy(
            @Nullable final SetApplicationAgreementTextUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationAgreementTextUpdateActionImpl instance = new SetApplicationAgreementTextUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setText(com.commercetools.checkout.models.common.LocalizedString.deepCopy(template.getText()));
        return instance;
    }

    /**
     * builder factory method for SetApplicationAgreementTextUpdateAction
     * @return builder
     */
    public static SetApplicationAgreementTextUpdateActionBuilder builder() {
        return SetApplicationAgreementTextUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationAgreementTextUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementTextUpdateActionBuilder builder(
            final SetApplicationAgreementTextUpdateAction template) {
        return SetApplicationAgreementTextUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationAgreementTextUpdateAction(
            Function<SetApplicationAgreementTextUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementTextUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementTextUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationAgreementTextUpdateAction>";
            }
        };
    }
}
