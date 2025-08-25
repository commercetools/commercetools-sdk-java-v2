
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adding or updating a Custom Type on an Address of a Business Unit generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddressCustomTypeSetMessage" rel="nofollow">BusinessUnitAddressCustomTypeSet</a> Message, and removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddressCustomTypeRemovedMessage" rel="nofollow">BusinessUnitAddressCustomTypeRemoved</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setAddressCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetAddressCustomTypeActionImpl.class)
public interface BusinessUnitSetAddressCustomTypeAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetAddressCustomTypeAction
     */
    String SET_ADDRESS_CUSTOM_TYPE = "setAddressCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>address</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> for the <code>address</code>.</p>
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

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the <code>address</code> with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the <code>address</code>.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> for the <code>address</code>.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     *  <p>ID of the address to be extended.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of BusinessUnitSetAddressCustomTypeAction
     */
    public static BusinessUnitSetAddressCustomTypeAction of() {
        return new BusinessUnitSetAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetAddressCustomTypeAction of(final BusinessUnitSetAddressCustomTypeAction template) {
        BusinessUnitSetAddressCustomTypeActionImpl instance = new BusinessUnitSetAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public BusinessUnitSetAddressCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetAddressCustomTypeAction deepCopy(
            @Nullable final BusinessUnitSetAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetAddressCustomTypeActionImpl instance = new BusinessUnitSetAddressCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetAddressCustomTypeAction
     * @return builder
     */
    public static BusinessUnitSetAddressCustomTypeActionBuilder builder() {
        return BusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetAddressCustomTypeActionBuilder builder(
            final BusinessUnitSetAddressCustomTypeAction template) {
        return BusinessUnitSetAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetAddressCustomTypeAction(
            Function<BusinessUnitSetAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetAddressCustomTypeAction>";
            }
        };
    }
}
