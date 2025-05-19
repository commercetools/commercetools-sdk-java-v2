
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>This update action produces the StoreNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetNameAction storeSetNameAction = StoreSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetNameActionImpl.class)
public interface StoreSetNameAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of StoreSetNameAction
     */
    public static StoreSetNameAction of() {
        return new StoreSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetNameAction of(final StoreSetNameAction template) {
        StoreSetNameActionImpl instance = new StoreSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public StoreSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetNameAction deepCopy(@Nullable final StoreSetNameAction template) {
        if (template == null) {
            return null;
        }
        StoreSetNameActionImpl instance = new StoreSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for StoreSetNameAction
     * @return builder
     */
    public static StoreSetNameActionBuilder builder() {
        return StoreSetNameActionBuilder.of();
    }

    /**
     * create builder for StoreSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetNameActionBuilder builder(final StoreSetNameAction template) {
        return StoreSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetNameAction(Function<StoreSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetNameAction>";
            }
        };
    }
}
