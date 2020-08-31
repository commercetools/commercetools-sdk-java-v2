package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ChangeStatusUpdateAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionImpl.class, name = "changeStatus")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = ImageSearchConfigUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ImageSearchConfigUpdateAction  {





}
