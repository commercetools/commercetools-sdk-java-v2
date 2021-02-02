
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionImpl.class, name = ChangeStatusUpdateAction.CHANGE_STATUS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ImageSearchConfigUpdateActionImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ImageSearchConfigUpdateAction {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withImageSearchConfigUpdateAction(Function<ImageSearchConfigUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
