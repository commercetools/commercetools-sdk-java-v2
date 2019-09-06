package com.commercetools.models.Project;

import com.commercetools.models.Project.ProjectChangeCountriesAction;
import com.commercetools.models.Project.ProjectChangeCurrenciesAction;
import com.commercetools.models.Project.ProjectChangeLanguagesAction;
import com.commercetools.models.Project.ProjectChangeMessagesConfigurationAction;
import com.commercetools.models.Project.ProjectChangeMessagesEnabledAction;
import com.commercetools.models.Project.ProjectChangeNameAction;
import com.commercetools.models.Project.ProjectSetExternalOAuthAction;
import com.commercetools.models.Project.ProjectSetShippingRateInputTypeAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectChangeCountriesActionImpl.class, name = "changeCountries"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectChangeCurrenciesActionImpl.class, name = "changeCurrencies"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectChangeLanguagesActionImpl.class, name = "changeLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectChangeMessagesConfigurationActionImpl.class, name = "changeMessagesConfiguration"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectChangeMessagesEnabledActionImpl.class, name = "changeMessagesEnabled"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectSetExternalOAuthActionImpl.class, name = "setExternalOAuth"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.ProjectSetShippingRateInputTypeActionImpl.class, name = "setShippingRateInputType")
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