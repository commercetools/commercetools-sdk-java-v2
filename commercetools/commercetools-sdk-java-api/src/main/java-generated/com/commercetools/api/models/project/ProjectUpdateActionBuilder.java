package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationAction;
import com.commercetools.api.models.project.ProjectChangeCartsConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeNameAction;
import com.commercetools.api.models.project.ProjectChangeOrderSearchStatusAction;
import com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledAction;
import com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationAction;
import com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationAction;
import com.commercetools.api.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction;
import com.commercetools.api.models.project.ProjectUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectUpdateActionBuilder {

    public com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionBuilder changeMyBusinessUnitStatusOnCreationBuilder() {
       return com.commercetools.api.models.project.ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionBuilder changeCartsConfigurationBuilder() {
       return com.commercetools.api.models.project.ProjectChangeCartsConfigurationActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder changeCountriesBuilder() {
       return com.commercetools.api.models.project.ProjectChangeCountriesActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionBuilder changeCountryTaxRateFallbackEnabledBuilder() {
       return com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeCurrenciesActionBuilder changeCurrenciesBuilder() {
       return com.commercetools.api.models.project.ProjectChangeCurrenciesActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeLanguagesActionBuilder changeLanguagesBuilder() {
       return com.commercetools.api.models.project.ProjectChangeLanguagesActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionBuilder changeMessagesConfigurationBuilder() {
       return com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.project.ProjectChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionBuilder changeOrderSearchStatusBuilder() {
       return com.commercetools.api.models.project.ProjectChangeOrderSearchStatusActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionBuilder changeProductSearchIndexingEnabledBuilder() {
       return com.commercetools.api.models.project.ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionBuilder changeShoppingListsConfigurationBuilder() {
       return com.commercetools.api.models.project.ProjectChangeShoppingListsConfigurationActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder setMyBusinessUnitAssociateRoleOnCreationBuilder() {
       return com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectSetExternalOAuthActionBuilder setExternalOAuthBuilder() {
       return com.commercetools.api.models.project.ProjectSetExternalOAuthActionBuilder.of();
    }
    public com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionBuilder setShippingRateInputTypeBuilder() {
       return com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionBuilder.of();
    }

    /**
     * factory method for an instance of ProjectUpdateActionBuilder
     * @return builder 
     */
    public static ProjectUpdateActionBuilder of() {
        return new ProjectUpdateActionBuilder();
    }

}
