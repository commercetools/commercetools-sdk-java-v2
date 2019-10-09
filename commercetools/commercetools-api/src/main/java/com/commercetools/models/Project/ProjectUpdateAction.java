package com.commercetools.models.project;

import com.commercetools.models.project.ProjectChangeCountriesAction;
import com.commercetools.models.project.ProjectChangeCurrenciesAction;
import com.commercetools.models.project.ProjectChangeLanguagesAction;
import com.commercetools.models.project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.models.project.ProjectChangeMessagesEnabledAction;
import com.commercetools.models.project.ProjectChangeNameAction;
import com.commercetools.models.project.ProjectSetExternalOAuthAction;
import com.commercetools.models.project.ProjectSetShippingRateInputTypeAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectChangeCountriesActionImpl.class, name = "changeCountries"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectChangeCurrenciesActionImpl.class, name = "changeCurrencies"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectChangeLanguagesActionImpl.class, name = "changeLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectChangeMessagesConfigurationActionImpl.class, name = "changeMessagesConfiguration"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectChangeMessagesEnabledActionImpl.class, name = "changeMessagesEnabled"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectSetExternalOAuthActionImpl.class, name = "setExternalOAuth"),
   @JsonSubTypes.Type(value = com.commercetools.models.project.ProjectSetShippingRateInputTypeActionImpl.class, name = "setShippingRateInputType")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProjectUpdateAction  {


   


}