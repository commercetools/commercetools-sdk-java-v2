package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ProjectChangeCountriesAction;
import com.commercetools.api.generated.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.api.generated.models.project.ProjectChangeLanguagesAction;
import com.commercetools.api.generated.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.api.generated.models.project.ProjectChangeMessagesEnabledAction;
import com.commercetools.api.generated.models.project.ProjectChangeNameAction;
import com.commercetools.api.generated.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.api.generated.models.project.ProjectSetShippingRateInputTypeAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectChangeCountriesActionImpl.class, name = "changeCountries"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectChangeCurrenciesActionImpl.class, name = "changeCurrencies"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectChangeLanguagesActionImpl.class, name = "changeLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectChangeMessagesConfigurationActionImpl.class, name = "changeMessagesConfiguration"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectChangeMessagesEnabledActionImpl.class, name = "changeMessagesEnabled"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectSetExternalOAuthActionImpl.class, name = "setExternalOAuth"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.project.ProjectSetShippingRateInputTypeActionImpl.class, name = "setShippingRateInputType")
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


   


}