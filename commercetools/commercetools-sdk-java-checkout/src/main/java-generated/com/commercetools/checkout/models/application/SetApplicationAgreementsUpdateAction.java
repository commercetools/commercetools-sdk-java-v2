
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetApplicationAgreementsUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationAgreementsUpdateAction setApplicationAgreementsUpdateAction = SetApplicationAgreementsUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAgreements")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationAgreementsUpdateActionImpl.class)
public interface SetApplicationAgreementsUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationAgreementsUpdateAction
     */
    String SET_AGREEMENTS = "setAgreements";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return agreements
     */
    @Valid
    @JsonProperty("agreements")
    public List<ApplicationAgreementDraft> getAgreements();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param agreements values to be set
     */

    @JsonIgnore
    public void setAgreements(final ApplicationAgreementDraft... agreements);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param agreements values to be set
     */

    public void setAgreements(final List<ApplicationAgreementDraft> agreements);

    /**
     * factory method
     * @return instance of SetApplicationAgreementsUpdateAction
     */
    public static SetApplicationAgreementsUpdateAction of() {
        return new SetApplicationAgreementsUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationAgreementsUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationAgreementsUpdateAction of(final SetApplicationAgreementsUpdateAction template) {
        SetApplicationAgreementsUpdateActionImpl instance = new SetApplicationAgreementsUpdateActionImpl();
        instance.setAgreements(template.getAgreements());
        return instance;
    }

    public SetApplicationAgreementsUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationAgreementsUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationAgreementsUpdateAction deepCopy(
            @Nullable final SetApplicationAgreementsUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationAgreementsUpdateActionImpl instance = new SetApplicationAgreementsUpdateActionImpl();
        instance.setAgreements(Optional.ofNullable(template.getAgreements())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.application.ApplicationAgreementDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetApplicationAgreementsUpdateAction
     * @return builder
     */
    public static SetApplicationAgreementsUpdateActionBuilder builder() {
        return SetApplicationAgreementsUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationAgreementsUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationAgreementsUpdateActionBuilder builder(
            final SetApplicationAgreementsUpdateAction template) {
        return SetApplicationAgreementsUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationAgreementsUpdateAction(Function<SetApplicationAgreementsUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementsUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationAgreementsUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationAgreementsUpdateAction>";
            }
        };
    }
}
