
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetAddressCustomTypeAction myBusinessUnitSetAddressCustomTypeAction = MyBusinessUnitSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetAddressCustomTypeActionImpl.class)
public interface MyBusinessUnitSetAddressCustomTypeAction extends MyBusinessUnitUpdateAction {

    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>ID of the <code>address</code> to be extended.</p>
     * @return addressId
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public void setAddressId(final String addressId);

    public static MyBusinessUnitSetAddressCustomTypeAction of() {
        return new MyBusinessUnitSetAddressCustomTypeActionImpl();
    }

    public static MyBusinessUnitSetAddressCustomTypeAction of(final MyBusinessUnitSetAddressCustomTypeAction template) {
        MyBusinessUnitSetAddressCustomTypeActionImpl instance = new MyBusinessUnitSetAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public static MyBusinessUnitSetAddressCustomTypeActionBuilder builder() {
        return MyBusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    public static MyBusinessUnitSetAddressCustomTypeActionBuilder builder(
            final MyBusinessUnitSetAddressCustomTypeAction template) {
        return MyBusinessUnitSetAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitSetAddressCustomTypeAction(
            Function<MyBusinessUnitSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetAddressCustomTypeAction>";
            }
        };
    }
}
