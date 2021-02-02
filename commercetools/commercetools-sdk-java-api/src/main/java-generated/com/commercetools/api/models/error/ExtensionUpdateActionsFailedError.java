
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
@JsonDeserialize(as = ExtensionUpdateActionsFailedErrorImpl.class)
public interface ExtensionUpdateActionsFailedError extends ErrorObject {

    String EXTENSION_UPDATE_ACTIONS_FAILED = "ExtensionUpdateActionsFailed";

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

    public static ExtensionUpdateActionsFailedError of() {
        return new ExtensionUpdateActionsFailedErrorImpl();
    }

    public static ExtensionUpdateActionsFailedError of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorImpl instance = new ExtensionUpdateActionsFailedErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setErrorByExtension(template.getErrorByExtension());
        return instance;
    }

    public static ExtensionUpdateActionsFailedErrorBuilder builder() {
        return ExtensionUpdateActionsFailedErrorBuilder.of();
    }

    public static ExtensionUpdateActionsFailedErrorBuilder builder(final ExtensionUpdateActionsFailedError template) {
        return ExtensionUpdateActionsFailedErrorBuilder.of(template);
    }

    default <T> T withExtensionUpdateActionsFailedError(Function<ExtensionUpdateActionsFailedError, T> helper) {
        return helper.apply(this);
    }
}
