
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCustomFieldAction storeSetCustomFieldAction = StoreSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCustomFieldActionImpl.class)
public interface StoreSetCustomFieldAction extends StoreUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static StoreSetCustomFieldAction of() {
        return new StoreSetCustomFieldActionImpl();
    }

    public static StoreSetCustomFieldAction of(final StoreSetCustomFieldAction template) {
        StoreSetCustomFieldActionImpl instance = new StoreSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StoreSetCustomFieldActionBuilder builder() {
        return StoreSetCustomFieldActionBuilder.of();
    }

    public static StoreSetCustomFieldActionBuilder builder(final StoreSetCustomFieldAction template) {
        return StoreSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withStoreSetCustomFieldAction(Function<StoreSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StoreSetCustomFieldAction ofUnset(final String name) {
        return StoreSetCustomFieldActionBuilder.of().name(name).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCustomFieldAction>";
            }
        };
    }
}
