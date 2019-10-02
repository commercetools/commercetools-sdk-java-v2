package com.commercetools.models.project;

import com.commercetools.models.message.MessageConfiguration;
import com.commercetools.models.project.ExternalOAuth;
import com.commercetools.models.project.ShippingRateInputType;
import java.time.ZonedDateTime;
import com.commercetools.models.project.ProjectImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectImpl.class)
public interface Project  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @JsonProperty("countries")
   public List<String> getCountries();
   
   @NotNull
   @JsonProperty("currencies")
   public List<String> getCurrencies();
   
   @NotNull
   @JsonProperty("languages")
   public List<String> getLanguages();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   
   @JsonProperty("trialUntil")
   public String getTrialUntil();
   
   @NotNull
   @Valid
   @JsonProperty("messages")
   public MessageConfiguration getMessages();
   
   @Valid
   @JsonProperty("shippingRateInputType")
   public ShippingRateInputType getShippingRateInputType();
   
   @Valid
   @JsonProperty("externalOAuth")
   public ExternalOAuth getExternalOAuth();

   public void setVersion(final Long version);
   
   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setCountries(final List<String> countries);
   
   public void setCurrencies(final List<String> currencies);
   
   public void setLanguages(final List<String> languages);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setTrialUntil(final String trialUntil);
   
   public void setMessages(final MessageConfiguration messages);
   
   public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);
   
   public void setExternalOAuth(final ExternalOAuth externalOAuth);
   
   public static ProjectImpl of(){
      return new ProjectImpl();
   }
   

   public static ProjectImpl of(final Project template) {
      ProjectImpl instance = new ProjectImpl();
      instance.setExternalOAuth(template.getExternalOAuth());
      instance.setShippingRateInputType(template.getShippingRateInputType());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLanguages(template.getLanguages());
      instance.setName(template.getName());
      instance.setMessages(template.getMessages());
      instance.setCountries(template.getCountries());
      instance.setTrialUntil(template.getTrialUntil());
      instance.setVersion(template.getVersion());
      instance.setKey(template.getKey());
      instance.setCurrencies(template.getCurrencies());
      return instance;
   }

}