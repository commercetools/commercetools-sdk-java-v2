
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

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
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCustomTypeActionImpl.class)
public interface StoreSetCustomTypeAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Store with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Object containing the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the Store.</p>
     *  <p>Required if at least one Custom Field is defined as required in the <code>fieldDefinitions</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Store with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Object containing the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a> fields for the Store.</p>
     *  <p>Required if at least one Custom Field is defined as required in the <code>fieldDefinitions</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
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
     * factory method to create a shallow copy StoreSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetCustomTypeAction of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionImpl instance = new StoreSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public StoreSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetCustomTypeAction deepCopy(@Nullable final StoreSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StoreSetCustomTypeActionImpl instance = new StoreSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
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
    public static tools.jackson.core.type.TypeReference<StoreSetCustomTypeAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCustomTypeAction>";
            }
        };
    }
}
