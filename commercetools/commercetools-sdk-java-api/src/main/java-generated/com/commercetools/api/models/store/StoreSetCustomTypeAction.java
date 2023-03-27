
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCustomTypeAction storeSetCustomTypeAction = StoreSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCustomTypeActionImpl.class)
public interface StoreSetCustomTypeAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the Store with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Store.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the Store with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Store.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StoreSetCustomTypeAction
     */
    public static StoreSetCustomTypeAction of() {
        return new StoreSetCustomTypeActionImpl();
    }

    /**
     * factory method to copy an instance of StoreSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetCustomTypeAction of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionImpl instance = new StoreSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * builder factory method for StoreSetCustomTypeAction
     * @return builder
     */
    public static StoreSetCustomTypeActionBuilder builder() {
        return StoreSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StoreSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCustomTypeActionBuilder builder(final StoreSetCustomTypeAction template) {
        return StoreSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetCustomTypeAction(Function<StoreSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCustomTypeAction>";
            }
        };
    }
}
