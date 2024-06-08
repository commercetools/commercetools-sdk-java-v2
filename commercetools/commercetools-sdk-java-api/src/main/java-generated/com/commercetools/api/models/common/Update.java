
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Update
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Update update = Update.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UpdateImpl.class)
public interface Update extends com.commercetools.api.models.ResourceUpdate<Update, UpdateAction, UpdateBuilder> {

    /**
     *
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<UpdateAction> getActions();

    /**
     * set version
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * set actions
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final UpdateAction... actions);

    /**
     * set actions
     * @param actions values to be set
     */

    public void setActions(final List<UpdateAction> actions);

    /**
     * factory method
     * @return instance of Update
     */
    public static Update of() {
        return new UpdateImpl();
    }

    /**
     * factory method to create a shallow copy Update
     * @param template instance to be copied
     * @return copy instance
     */
    public static Update of(final Update template) {
        UpdateImpl instance = new UpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of Update
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Update deepCopy(@Nullable final Update template) {
        if (template == null) {
            return null;
        }
        UpdateImpl instance = new UpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.UpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for Update
     * @return builder
     */
    public static UpdateBuilder builder() {
        return UpdateBuilder.of();
    }

    /**
     * create builder for Update instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateBuilder builder(final Update template) {
        return UpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUpdate(Function<Update, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Update> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Update>() {
            @Override
            public String toString() {
                return "TypeReference<Update>";
            }
        };
    }
}
