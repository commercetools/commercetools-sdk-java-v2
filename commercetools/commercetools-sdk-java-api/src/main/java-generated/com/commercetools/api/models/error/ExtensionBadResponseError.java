
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionBadResponseErrorImpl.class)
public interface ExtensionBadResponseError extends ErrorObject {

    String EXTENSION_BAD_RESPONSE = "ExtensionBadResponse";

    @Valid
    @JsonProperty("localizedMessage")
    public LocalizedString getLocalizedMessage();

    @Valid
    @JsonProperty("extensionExtraInfo")
    public Object getExtensionExtraInfo();

    @NotNull
    @Valid
    @JsonProperty("errorByExtension")
    public ErrorByExtension getErrorByExtension();

    public void setLocalizedMessage(final LocalizedString localizedMessage);

    public void setExtensionExtraInfo(final Object extensionExtraInfo);

    public void setErrorByExtension(final ErrorByExtension errorByExtension);

    public static ExtensionBadResponseError of() {
        return new ExtensionBadResponseErrorImpl();
    }

    public static ExtensionBadResponseError of(final ExtensionBadResponseError template) {
        ExtensionBadResponseErrorImpl instance = new ExtensionBadResponseErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setErrorByExtension(template.getErrorByExtension());
        return instance;
    }

    public static ExtensionBadResponseErrorBuilder builder() {
        return ExtensionBadResponseErrorBuilder.of();
    }

    public static ExtensionBadResponseErrorBuilder builder(final ExtensionBadResponseError template) {
        return ExtensionBadResponseErrorBuilder.of(template);
    }

    default <T> T withExtensionBadResponseError(Function<ExtensionBadResponseError, T> helper) {
        return helper.apply(this);
    }
}
