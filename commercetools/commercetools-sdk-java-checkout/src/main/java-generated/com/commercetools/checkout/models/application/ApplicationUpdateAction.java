
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
 *  <p>Base type for all Application update actions.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationUpdateAction applicationUpdateAction = ApplicationUpdateAction.addAllowedOriginBuilder()
 *             origin("{origin}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ApplicationUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ApplicationUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApplicationUpdateAction {

    /**
     *  <p>Type of update action to be performed on the Application.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ApplicationUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ApplicationUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationUpdateAction deepCopy(@Nullable final ApplicationUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ApplicationUpdateActionImpl)) {
            return template.copyDeep();
        }
        ApplicationUpdateActionImpl instance = new ApplicationUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAllowedOrigin subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.AddAllowedOriginUpdateActionBuilder addAllowedOriginBuilder() {
        return com.commercetools.checkout.models.application.AddAllowedOriginUpdateActionBuilder.of();
    }

    /**
     * builder for addAgreement subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.AddApplicationAgreementUpdateActionBuilder addAgreementBuilder() {
        return com.commercetools.checkout.models.application.AddApplicationAgreementUpdateActionBuilder.of();
    }

    /**
     * builder for addCountry subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.AddCountryUpdateActionBuilder addCountryBuilder() {
        return com.commercetools.checkout.models.application.AddCountryUpdateActionBuilder.of();
    }

    /**
     * builder for removeAllowedOrigin subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.RemoveAllowedOriginUpdateActionBuilder removeAllowedOriginBuilder() {
        return com.commercetools.checkout.models.application.RemoveAllowedOriginUpdateActionBuilder.of();
    }

    /**
     * builder for removeAgreement subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.RemoveApplicationAgreementUpdateActionBuilder removeAgreementBuilder() {
        return com.commercetools.checkout.models.application.RemoveApplicationAgreementUpdateActionBuilder.of();
    }

    /**
     * builder for removeCountry subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.RemoveCountryUpdateActionBuilder removeCountryBuilder() {
        return com.commercetools.checkout.models.application.RemoveCountryUpdateActionBuilder.of();
    }

    /**
     * builder for reorderAgreement subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.ReorderApplicationAgreementUpdateActionBuilder reorderAgreementBuilder() {
        return com.commercetools.checkout.models.application.ReorderApplicationAgreementUpdateActionBuilder.of();
    }

    /**
     * builder for setActivePaymentComponentType subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetActivePaymentComponentTypeUpdateActionBuilder setActivePaymentComponentTypeBuilder() {
        return com.commercetools.checkout.models.application.SetActivePaymentComponentTypeUpdateActionBuilder.of();
    }

    /**
     * builder for setAllowAllOrigins subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetAllowAllOriginsUpdateActionBuilder setAllowAllOriginsBuilder() {
        return com.commercetools.checkout.models.application.SetAllowAllOriginsUpdateActionBuilder.of();
    }

    /**
     * builder for setAllowedOrigins subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetAllowedOriginsUpdateActionBuilder setAllowedOriginsBuilder() {
        return com.commercetools.checkout.models.application.SetAllowedOriginsUpdateActionBuilder.of();
    }

    /**
     * builder for setAgreementName subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationAgreementNameUpdateActionBuilder setAgreementNameBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationAgreementNameUpdateActionBuilder.of();
    }

    /**
     * builder for setAgreementStatus subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationAgreementStatusUpdateActionBuilder setAgreementStatusBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationAgreementStatusUpdateActionBuilder.of();
    }

    /**
     * builder for setAgreementText subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationAgreementTextUpdateActionBuilder setAgreementTextBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationAgreementTextUpdateActionBuilder.of();
    }

    /**
     * builder for setAgreementType subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationAgreementTypeUpdateActionBuilder setAgreementTypeBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationAgreementTypeUpdateActionBuilder.of();
    }

    /**
     * builder for setAgreements subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationAgreementsUpdateActionBuilder setAgreementsBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationAgreementsUpdateActionBuilder.of();
    }

    /**
     * builder for setApplicationLogo subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationLogoUpdateActionBuilder setApplicationLogoBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationLogoUpdateActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationNameUpdateActionBuilder setNameBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationNameUpdateActionBuilder.of();
    }

    /**
     * builder for setStatus subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetApplicationStatusUpdateActionBuilder setStatusBuilder() {
        return com.commercetools.checkout.models.application.SetApplicationStatusUpdateActionBuilder.of();
    }

    /**
     * builder for setCountries subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetCountriesUpdateActionBuilder setCountriesBuilder() {
        return com.commercetools.checkout.models.application.SetCountriesUpdateActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetDescriptionUpdateActionBuilder setDescriptionBuilder() {
        return com.commercetools.checkout.models.application.SetDescriptionUpdateActionBuilder.of();
    }

    /**
     * builder for setDiscountsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetDiscountsConfigurationUpdateActionBuilder setDiscountsConfigurationBuilder() {
        return com.commercetools.checkout.models.application.SetDiscountsConfigurationUpdateActionBuilder.of();
    }

    /**
     * builder for setPaymentReturnUrl subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetPaymentReturnUrlUpdateActionBuilder setPaymentReturnUrlBuilder() {
        return com.commercetools.checkout.models.application.SetPaymentReturnUrlUpdateActionBuilder.of();
    }

    /**
     * builder for setPaymentsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.checkout.models.application.SetPaymentsConfigurationUpdateActionBuilder setPaymentsConfigurationBuilder() {
        return com.commercetools.checkout.models.application.SetPaymentsConfigurationUpdateActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationUpdateAction(Function<ApplicationUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationUpdateAction>";
            }
        };
    }
}
