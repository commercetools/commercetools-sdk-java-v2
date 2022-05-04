
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ErrorByExtensionImpl.class)
public interface ErrorByExtension {

    /**
    *  <p>Platform-generated unique identifier of the Extension.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the Extension.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ErrorByExtension of() {
        return new ErrorByExtensionImpl();
    }

    public static ErrorByExtension of(final ErrorByExtension template) {
        ErrorByExtensionImpl instance = new ErrorByExtensionImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ErrorByExtensionBuilder builder() {
        return ErrorByExtensionBuilder.of();
    }

    public static ErrorByExtensionBuilder builder(final ErrorByExtension template) {
        return ErrorByExtensionBuilder.of(template);
    }

    default <T> T withErrorByExtension(Function<ErrorByExtension, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ErrorByExtension> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorByExtension>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorByExtension>";
            }
        };
    }
}
