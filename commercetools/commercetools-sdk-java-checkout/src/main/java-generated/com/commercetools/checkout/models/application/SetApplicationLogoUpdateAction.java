
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
 * SetApplicationLogoUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationLogoUpdateAction setApplicationLogoUpdateAction = SetApplicationLogoUpdateAction.builder()
 *             .logo(logoBuilder -> logoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setApplicationLogo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetApplicationLogoUpdateActionImpl.class)
public interface SetApplicationLogoUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetApplicationLogoUpdateAction
     */
    String SET_APPLICATION_LOGO = "setApplicationLogo";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     * @return logo
     */
    @NotNull
    @Valid
    @JsonProperty("logo")
    public ApplicationLogo getLogo();

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     * @param logo value to be set
     */

    public void setLogo(final ApplicationLogo logo);

    /**
     * factory method
     * @return instance of SetApplicationLogoUpdateAction
     */
    public static SetApplicationLogoUpdateAction of() {
        return new SetApplicationLogoUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetApplicationLogoUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetApplicationLogoUpdateAction of(final SetApplicationLogoUpdateAction template) {
        SetApplicationLogoUpdateActionImpl instance = new SetApplicationLogoUpdateActionImpl();
        instance.setLogo(template.getLogo());
        return instance;
    }

    public SetApplicationLogoUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetApplicationLogoUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetApplicationLogoUpdateAction deepCopy(@Nullable final SetApplicationLogoUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetApplicationLogoUpdateActionImpl instance = new SetApplicationLogoUpdateActionImpl();
        instance.setLogo(com.commercetools.checkout.models.application.ApplicationLogo.deepCopy(template.getLogo()));
        return instance;
    }

    /**
     * builder factory method for SetApplicationLogoUpdateAction
     * @return builder
     */
    public static SetApplicationLogoUpdateActionBuilder builder() {
        return SetApplicationLogoUpdateActionBuilder.of();
    }

    /**
     * create builder for SetApplicationLogoUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationLogoUpdateActionBuilder builder(final SetApplicationLogoUpdateAction template) {
        return SetApplicationLogoUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetApplicationLogoUpdateAction(Function<SetApplicationLogoUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetApplicationLogoUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetApplicationLogoUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetApplicationLogoUpdateAction>";
            }
        };
    }
}
