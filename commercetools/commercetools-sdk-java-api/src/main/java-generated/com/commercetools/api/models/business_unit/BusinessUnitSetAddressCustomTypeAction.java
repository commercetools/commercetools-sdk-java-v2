
package com.commercetools.api.models.business_unit;

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
 * BusinessUnitSetAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAddressCustomTypeAction businessUnitSetAddressCustomTypeAction = BusinessUnitSetAddressCustomTypeAction.builder()
 *             .addressId("{addressId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetAddressCustomTypeActionImpl.class)
public interface BusinessUnitSetAddressCustomTypeAction extends BusinessUnitUpdateAction {

    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    /**
     *  <p>Defines the Type that extends the <code>address</code> with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields for the <code>address</code>.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>ID of the address to be extended.</p>
     * @return addressId
     */
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public void setAddressId(final String addressId);

    public static BusinessUnitSetAddressCustomTypeAction of() {
        return new BusinessUnitSetAddressCustomTypeActionImpl();
    }

    public static BusinessUnitSetAddressCustomTypeAction of(final BusinessUnitSetAddressCustomTypeAction template) {
        BusinessUnitSetAddressCustomTypeActionImpl instance = new BusinessUnitSetAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public static BusinessUnitSetAddressCustomTypeActionBuilder builder() {
        return BusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    public static BusinessUnitSetAddressCustomTypeActionBuilder builder(
            final BusinessUnitSetAddressCustomTypeAction template) {
        return BusinessUnitSetAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetAddressCustomTypeAction(
            Function<BusinessUnitSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetAddressCustomTypeAction>";
            }
        };
    }
}
