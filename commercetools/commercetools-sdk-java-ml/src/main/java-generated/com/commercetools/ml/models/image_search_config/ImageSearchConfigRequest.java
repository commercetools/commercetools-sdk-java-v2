
package com.commercetools.ml.models.image_search_config;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImageSearchConfigRequestImpl.class)
public interface ImageSearchConfigRequest {

    /**
    *  <p>The list of update actions to be performed on the project.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ImageSearchConfigUpdateAction> getActions();

    @JsonIgnore
    public void setActions(final ImageSearchConfigUpdateAction... actions);

    public void setActions(final List<ImageSearchConfigUpdateAction> actions);

    public static ImageSearchConfigRequest of() {
        return new ImageSearchConfigRequestImpl();
    }

    public static ImageSearchConfigRequest of(final ImageSearchConfigRequest template) {
        ImageSearchConfigRequestImpl instance = new ImageSearchConfigRequestImpl();
        instance.setActions(template.getActions());
        return instance;
    }

    public static ImageSearchConfigRequestBuilder builder() {
        return ImageSearchConfigRequestBuilder.of();
    }

    public static ImageSearchConfigRequestBuilder builder(final ImageSearchConfigRequest template) {
        return ImageSearchConfigRequestBuilder.of(template);
    }

    default <T> T withImageSearchConfigRequest(Function<ImageSearchConfigRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ImageSearchConfigRequest>";
            }
        };
    }
}
