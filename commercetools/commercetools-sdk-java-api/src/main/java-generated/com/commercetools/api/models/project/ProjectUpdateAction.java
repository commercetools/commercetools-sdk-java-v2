package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledAction;
import com.commercetools.api.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.models.project.ProjectChangeMessagesEnabledAction;
import com.commercetools.api.models.project.ProjectChangeNameAction;
import com.commercetools.api.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.models.project.ProjectSetShippingRateInputTypeAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCountriesActionImpl.class, name = "changeCountries"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCountryTaxRateFallbackEnabledActionImpl.class, name = "changeCountryTaxRateFallbackEnabled"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeCurrenciesActionImpl.class, name = "changeCurrencies"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeLanguagesActionImpl.class, name = "changeLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionImpl.class, name = "changeMessagesConfiguration"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeMessagesEnabledActionImpl.class, name = "changeMessagesEnabled"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectSetExternalOAuthActionImpl.class, name = "setExternalOAuth"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionImpl.class, name = "setShippingRateInputType")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = ProjectUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProjectUpdateAction  {





    default <T> T withProjectUpdateAction(Function<ProjectUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
