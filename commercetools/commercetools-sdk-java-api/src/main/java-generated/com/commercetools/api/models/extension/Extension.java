
package com.commercetools.api.models.extension;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionImpl.class)
public interface Extension extends BaseResource, com.commercetools.api.models.DomainResource<Extension> {

    /**
    *  <p>Unique ID of the Extension.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the Extension.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Date and time (UTC) the Extension was initially created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>Date and time (UTC) the Extension was last updated.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-defined unique identifier for the Extension.
    *  Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Information necessary for the commercetools Platform to call the Extension.</p>
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
    */

    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setDestination(final ExtensionDestination destination);

    @JsonIgnore
    public void setTriggers(final ExtensionTrigger... triggers);

    public void setTriggers(final List<ExtensionTrigger> triggers);

    public void setTimeoutInMs(final Integer timeoutInMs);

    public static Extension of() {
        return new ExtensionImpl();
    }

    public static Extension of(final Extension template) {
        ExtensionImpl instance = new ExtensionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setDestination(template.getDestination());
        instance.setTriggers(template.getTriggers());
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    public static ExtensionBuilder builder() {
        return ExtensionBuilder.of();
    }

    public static ExtensionBuilder builder(final Extension template) {
        return ExtensionBuilder.of(template);
    }

    default <T> T withExtension(Function<Extension, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Extension> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Extension>() {
            @Override
            public String toString() {
                return "TypeReference<Extension>";
            }
        };
    }
}
