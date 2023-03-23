
package com.commercetools.api.models.me;

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

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyBusinessUnitSetCustomTypeAction of() {
        return new MyBusinessUnitSetCustomTypeActionImpl();
    }

    public static MyBusinessUnitSetCustomTypeAction of(final MyBusinessUnitSetCustomTypeAction template) {
        MyBusinessUnitSetCustomTypeActionImpl instance = new MyBusinessUnitSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyBusinessUnitSetCustomTypeActionBuilder builder() {
        return MyBusinessUnitSetCustomTypeActionBuilder.of();
    }

    public static MyBusinessUnitSetCustomTypeActionBuilder builder(final MyBusinessUnitSetCustomTypeAction template) {
        return MyBusinessUnitSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitSetCustomTypeAction(Function<MyBusinessUnitSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetCustomTypeAction>";
            }
        };
    }
}
