
package com.commercetools.api.models.extension;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Extension
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Extension extension = Extension.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .plusTriggers(triggersBuilder -> triggersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionImpl.class)
public interface Extension extends BaseResource, com.commercetools.api.models.DomainResource<Extension>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Extension.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Extension was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Extension was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Extension.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Extension.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The configuration for the Extension, including its type, location and authentication details.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @return triggers
     */
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();

    /**
     *  <p>Maximum time (in milliseconds) that the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     * @return timeoutInMs
     */

    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Extension.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Extension was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Extension was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Extension.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Extension.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The configuration for the Extension, including its type, location and authentication details.</p>
     * @param destination value to be set
     */

    public void setDestination(final ExtensionDestination destination);

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers values to be set
     */

    @JsonIgnore
    public void setTriggers(final ExtensionTrigger... triggers);

    /**
     *  <p>Describes what triggers the Extension.</p>
     * @param triggers values to be set
     */

    public void setTriggers(final List<ExtensionTrigger> triggers);

    /**
     *  <p>Maximum time (in milliseconds) that the Extension can respond within. If no timeout is provided, the default value is used for all types of Extensions. The maximum value is 10000 ms (10 seconds) for <code>payment</code> Extensions and 2000 ms (2 seconds) for all other Extensions.</p>
     * @param timeoutInMs value to be set
     */

    public void setTimeoutInMs(final Integer timeoutInMs);

    /**
     * factory method
     * @return instance of Extension
     */
    public static Extension of() {
        return new ExtensionImpl();
    }

    /**
     * factory method to create a shallow copy Extension
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of Extension
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Extension deepCopy(@Nullable final Extension template) {
        if (template == null) {
            return null;
        }
        ExtensionImpl instance = new ExtensionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setDestination(
            com.commercetools.api.models.extension.ExtensionDestination.deepCopy(template.getDestination()));
        instance.setTriggers(Optional.ofNullable(template.getTriggers())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.extension.ExtensionTrigger::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

    /**
     * builder factory method for Extension
     * @return builder
     */
    public static ExtensionBuilder builder() {
        return ExtensionBuilder.of();
    }

    /**
     * create builder for Extension instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionBuilder builder(final Extension template) {
        return ExtensionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtension(Function<Extension, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Extension> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Extension>() {
            @Override
            public String toString() {
                return "TypeReference<Extension>";
            }
        };
    }
}
