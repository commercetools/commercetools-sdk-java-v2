package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.channel.ChannelSetCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ChannelSetCustomTypeActionImpl.class)
public interface ChannelSetCustomTypeAction extends ChannelUpdateAction {


   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();

   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);

   public void setFields(final FieldContainer fields);

   public static ChannelSetCustomTypeActionImpl of(){
      return new ChannelSetCustomTypeActionImpl();
   }


   public static ChannelSetCustomTypeActionImpl of(final ChannelSetCustomTypeAction template) {
      ChannelSetCustomTypeActionImpl instance = new ChannelSetCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}
