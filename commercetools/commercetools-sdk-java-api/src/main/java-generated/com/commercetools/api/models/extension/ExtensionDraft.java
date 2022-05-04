
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
    *  <p>User-defined unique identifier for the Extension.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Defines where the Extension can be reached.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();

    /**
    *  <p>Describes what triggers the Extension.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    /**
    *  <p>Maximum time (in milliseconds) the commercetools Platform waits for a response from the Extension.
    *  If no timeout is provided, the default value is used for all types of Extensions.
    *  The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
    *  <p>This limit can be increased per Project after we review the performance impact.
    *  Please contact our support via the <a href="https://support.commercetools.com">support portal</a> and provide the Region, Project key, and use case.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionDraft>";
            }
        };
    }
}
