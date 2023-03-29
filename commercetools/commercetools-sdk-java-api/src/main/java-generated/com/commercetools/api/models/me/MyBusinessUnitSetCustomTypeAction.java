
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetCustomTypeAction myBusinessUnitSetCustomTypeAction = MyBusinessUnitSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetCustomTypeActionImpl.class)
public interface MyBusinessUnitSetCustomTypeAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of MyBusinessUnitSetCustomTypeAction
     */
    public static MyBusinessUnitSetCustomTypeAction of() {
        return new MyBusinessUnitSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitSetCustomTypeAction of(final MyBusinessUnitSetCustomTypeAction template) {
        MyBusinessUnitSetCustomTypeActionImpl instance = new MyBusinessUnitSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitSetCustomTypeAction deepCopy(
            @Nullable final MyBusinessUnitSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitSetCustomTypeActionImpl instance = new MyBusinessUnitSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitSetCustomTypeAction
     * @return builder
     */
    public static MyBusinessUnitSetCustomTypeActionBuilder builder() {
        return MyBusinessUnitSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetCustomTypeActionBuilder builder(final MyBusinessUnitSetCustomTypeAction template) {
        return MyBusinessUnitSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitSetCustomTypeAction(Function<MyBusinessUnitSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetCustomTypeAction>";
            }
        };
    }
}
