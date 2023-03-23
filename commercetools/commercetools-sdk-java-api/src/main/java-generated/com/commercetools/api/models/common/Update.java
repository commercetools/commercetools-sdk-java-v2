
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final UpdateAction... actions);

    public void setActions(final List<UpdateAction> actions);

    public static Update of() {
        return new UpdateImpl();
    }

    public static Update of(final Update template) {
        UpdateImpl instance = new UpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static UpdateBuilder builder() {
        return UpdateBuilder.of();
    }

    public static UpdateBuilder builder(final Update template) {
        return UpdateBuilder.of(template);
    }

    default <T> T withUpdate(Function<Update, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Update> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Update>() {
            @Override
            public String toString() {
                return "TypeReference<Update>";
            }
        };
    }
}
