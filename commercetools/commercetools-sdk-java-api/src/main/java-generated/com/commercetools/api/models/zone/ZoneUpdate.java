
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneUpdate zoneUpdate = ZoneUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneUpdateImpl.class)
public interface ZoneUpdate
        extends com.commercetools.api.models.ResourceUpdate<ZoneUpdate, ZoneUpdateAction, ZoneUpdateBuilder> {

    /**
     *  <p>Expected version of the Zone on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ZoneUpdateAction> getActions();

    /**
     *  <p>Expected version of the Zone on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ZoneUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Zone.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ZoneUpdateAction> actions);

    /**
     * factory method
     * @return instance of ZoneUpdate
     */
    public static ZoneUpdate of() {
        return new ZoneUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ZoneUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneUpdate of(final ZoneUpdate template) {
        ZoneUpdateImpl instance = new ZoneUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ZoneUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneUpdate deepCopy(@Nullable final ZoneUpdate template) {
        if (template == null) {
            return null;
        }
        ZoneUpdateImpl instance = new ZoneUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.zone.ZoneUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ZoneUpdate
     * @return builder
     */
    public static ZoneUpdateBuilder builder() {
        return ZoneUpdateBuilder.of();
    }

    /**
     * create builder for ZoneUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneUpdateBuilder builder(final ZoneUpdate template) {
        return ZoneUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneUpdate(Function<ZoneUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneUpdate>";
            }
        };
    }
}
