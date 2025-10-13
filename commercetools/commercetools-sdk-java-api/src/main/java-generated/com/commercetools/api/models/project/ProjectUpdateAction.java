
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProjectUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectUpdateAction projectUpdateAction = ProjectUpdateAction.changeBusinessUnitSearchStatusBuilder()
 *             status(BusinessUnitSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProjectUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProjectUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProjectUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProjectUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ProjectUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectUpdateAction deepCopy(@Nullable final ProjectUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ProjectUpdateActionImpl)) {
            return template.copyDeep();
        }
        ProjectUpdateActionImpl instance = new ProjectUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeBusinessUnitSearchStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeBusinessUnitSearchStatusActionBuilder changeBusinessUnitSearchStatusBuilder() {
        return com.commercetools.api.models.project.ProjectChangeBusinessUnitSearchStatusActionBuilder.of();
    }

    /**
     * builder for changeMyBusinessUnitStatusOnCreation subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionBuilder changeMyBusinessUnitStatusOnCreationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of();
    }

    /**
     * builder for changeCartsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionBuilder changeCartsConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionBuilder.of();
    }

    /**
     * builder for changeCountries subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder changeCountriesBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder.of();
    }

    /**
     * builder for changeCountryTaxRateFallbackEnabled subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionBuilder changeCountryTaxRateFallbackEnabledBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of();
    }

    /**
     * builder for changeCurrencies subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCurrenciesActionBuilder changeCurrenciesBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCurrenciesActionBuilder.of();
    }

    /**
     * builder for changeCustomerSearchStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeCustomerSearchStatusActionBuilder changeCustomerSearchStatusBuilder() {
        return com.commercetools.api.models.project.ProjectChangeCustomerSearchStatusActionBuilder.of();
    }

    /**
     * builder for changeLanguages subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeLanguagesActionBuilder changeLanguagesBuilder() {
        return com.commercetools.api.models.project.ProjectChangeLanguagesActionBuilder.of();
    }

    /**
     * builder for changeMessagesConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionBuilder changeMessagesConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.project.ProjectChangeNameActionBuilder.of();
    }

    /**
     * builder for changeOrderSearchStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionBuilder changeOrderSearchStatusBuilder() {
        return com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionBuilder.of();
    }

    /**
     * builder for changePriceRoundingMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangePriceRoundingModeActionBuilder changePriceRoundingModeBuilder() {
        return com.commercetools.api.models.project.ProjectChangePriceRoundingModeActionBuilder.of();
    }

    /**
     * builder for changeProductSearchIndexingEnabled subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionBuilder changeProductSearchIndexingEnabledBuilder() {
        return com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }

    /**
     * builder for changeShoppingListsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionBuilder changeShoppingListsConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionBuilder.of();
    }

    /**
     * builder for changeTaxRoundingMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectChangeTaxRoundingModeActionBuilder changeTaxRoundingModeBuilder() {
        return com.commercetools.api.models.project.ProjectChangeTaxRoundingModeActionBuilder.of();
    }

    /**
     * builder for setMyBusinessUnitAssociateRoleOnCreation subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder setMyBusinessUnitAssociateRoleOnCreationBuilder() {
        return com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder.of();
    }

    /**
     * builder for setDiscountsConfiguration subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectSetDiscountsConfigurationActionBuilder setDiscountsConfigurationBuilder() {
        return com.commercetools.api.models.project.ProjectSetDiscountsConfigurationActionBuilder.of();
    }

    /**
     * builder for setExternalOAuth subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectSetExternalOAuthActionBuilder setExternalOAuthBuilder() {
        return com.commercetools.api.models.project.ProjectSetExternalOAuthActionBuilder.of();
    }

    /**
     * builder for setShippingRateInputType subtype
     * @return builder
     */
    public static com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionBuilder setShippingRateInputTypeBuilder() {
        return com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectUpdateAction(Function<ProjectUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectUpdateAction>";
            }
        };
    }
}
