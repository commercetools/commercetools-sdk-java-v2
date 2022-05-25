
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreUpdate storeUpdate = StoreUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreUpdateImpl.class)
public interface StoreUpdate
        extends com.commercetools.api.models.ResourceUpdate<StoreUpdate, StoreUpdateAction, StoreUpdateBuilder> {

    /**
     *
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StoreUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final StoreUpdateAction... actions);

    public void setActions(final List<StoreUpdateAction> actions);

    public static StoreUpdate of() {
        return new StoreUpdateImpl();
    }

    public static StoreUpdate of(final StoreUpdate template) {
        StoreUpdateImpl instance = new StoreUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static StoreUpdateBuilder builder() {
        return StoreUpdateBuilder.of();
    }

    public static StoreUpdateBuilder builder(final StoreUpdate template) {
        return StoreUpdateBuilder.of(template);
    }

    default <T> T withStoreUpdate(Function<StoreUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<StoreUpdate>";
            }
        };
    }
}
