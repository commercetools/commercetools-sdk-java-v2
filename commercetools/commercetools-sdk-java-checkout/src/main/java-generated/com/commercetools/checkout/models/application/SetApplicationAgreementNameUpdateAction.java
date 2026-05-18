
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
 * SetApplicationAgreementNameUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementNameUpdateAction setApplicationAgreementNameUpdateAction = SetApplicationAgreementNameUpdateAction.builder()
 *             .agreementId("{agreementId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAgreementName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationAgreementNameUpdateActionImpl.class)
public interface SetApplicationAgreementNameUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationAgreementNameUpdateAction
     */
    String SET_AGREEMENT_NAME = "setAgreementName";

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
     *  <p>New name for the agreement.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>ID of the agreement to update.</p>
     * @param agreementId value to be set
     */

    public void setAgreementId(final String agreementId);

    /**
     *  <p>New name for the agreement.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of SetApplicationAgreementNameUpdateAction
     */
    public static SetApplicationAgreementNameUpdateAction of() {
        return new SetApplicationAgreementNameUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationAgreementNameUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationAgreementNameUpdateAction of(final SetApplicationAgreementNameUpdateAction template) {
        SetApplicationAgreementNameUpdateActionImpl instance = new SetApplicationAgreementNameUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setName(template.getName());
        return instance;
    }

    public SetApplicationAgreementNameUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationAgreementNameUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationAgreementNameUpdateAction deepCopy(
            @Nullable final SetApplicationAgreementNameUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationAgreementNameUpdateActionImpl instance = new SetApplicationAgreementNameUpdateActionImpl();
        instance.setAgreementId(template.getAgreementId());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for SetApplicationAgreementNameUpdateAction
     * @return builder
     */
    public static SetApplicationAgreementNameUpdateActionBuilder builder() {
        return SetApplicationAgreementNameUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationAgreementNameUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementNameUpdateActionBuilder builder(
            final SetApplicationAgreementNameUpdateAction template) {
        return SetApplicationAgreementNameUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationAgreementNameUpdateAction(
            Function<SetApplicationAgreementNameUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementNameUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementNameUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationAgreementNameUpdateAction>";
            }
        };
    }
}
