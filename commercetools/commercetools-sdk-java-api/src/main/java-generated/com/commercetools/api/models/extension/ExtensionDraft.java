
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionDraftImpl.class)
public interface ExtensionDraft {

    /**
    *  <p>User-specific unique identifier for the extension</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Details where the extension can be reached</p>
    */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();

    /**
    *  <p>Describes what triggers the extension</p>
    */
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    /**
    *  <p>The maximum time the commercetools platform waits for a response from the extension.
    *  The maximum value is 2000 ms (2 seconds).
    *  This limit can be increased per project after we review the performance impact.
    *  Please contact Support via the <a href="https://support.commercetools.com">Support Portal</a> and provide the region, project key and use case.</p>
    */

    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    public void setKey(final String key);

    public void setDestination(final ExtensionDestination destination);

    @JsonIgnore
    public void setTriggers(final ExtensionTrigger... triggers);

    public void setTriggers(final List<ExtensionTrigger> triggers);

    public void setTimeoutInMs(final Integer timeoutInMs);

    public static ExtensionDraft of() {
        return new ExtensionDraftImpl();
    }

    public static ExtensionDraft of(final ExtensionDraft template) {
        ExtensionDraftImpl instance = new ExtensionDraftImpl();
        instance.setKey(template.getKey());
        instance.setDestination(template.getDestination());
        instance.setTriggers(template.getTriggers());
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    public static ExtensionDraftBuilder builder() {
        return ExtensionDraftBuilder.of();
    }

    public static ExtensionDraftBuilder builder(final ExtensionDraft template) {
        return ExtensionDraftBuilder.of(template);
    }

    default <T> T withExtensionDraft(Function<ExtensionDraft, T> helper) {
        return helper.apply(this);
    }
}
