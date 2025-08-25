
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set Address Custom Field</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAddressCustomFieldChange setAddressCustomFieldChange = SetAddressCustomFieldChange.builder()
 *             .change("{change}")
 *             .address(addressBuilder -> addressBuilder)
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetAddressCustomFieldChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAddressCustomFieldChangeImpl.class)
public interface SetAddressCustomFieldChange extends Change {

    /**
     * discriminator value for SetAddressCustomFieldChange
     */
    String SET_ADDRESS_CUSTOM_FIELD_CHANGE = "SetAddressCustomFieldChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */
    @NotNull
    @JsonProperty("customTypeId")
    public String getCustomTypeId();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> which was extended.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Field</a>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     */

    public void setCustomTypeId(final String customTypeId);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * factory method
     * @return instance of SetAddressCustomFieldChange
     */
    public static SetAddressCustomFieldChange of() {
        return new SetAddressCustomFieldChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAddressCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAddressCustomFieldChange of(final SetAddressCustomFieldChange template) {
        SetAddressCustomFieldChangeImpl instance = new SetAddressCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddress(template.getAddress());
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetAddressCustomFieldChange copyDeep();

    /**
     * factory method to create a deep copy of SetAddressCustomFieldChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAddressCustomFieldChange deepCopy(@Nullable final SetAddressCustomFieldChange template) {
        if (template == null) {
            return null;
        }
        SetAddressCustomFieldChangeImpl instance = new SetAddressCustomFieldChangeImpl();
        instance.setChange(template.getChange());
        instance.setAddress(com.commercetools.history.models.common.Address.deepCopy(template.getAddress()));
        instance.setName(template.getName());
        instance.setCustomTypeId(template.getCustomTypeId());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetAddressCustomFieldChange
     * @return builder
     */
    public static SetAddressCustomFieldChangeBuilder builder() {
        return SetAddressCustomFieldChangeBuilder.of();
    }

    /**
     * create builder for SetAddressCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAddressCustomFieldChangeBuilder builder(final SetAddressCustomFieldChange template) {
        return SetAddressCustomFieldChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAddressCustomFieldChange(Function<SetAddressCustomFieldChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAddressCustomFieldChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAddressCustomFieldChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAddressCustomFieldChange>";
            }
        };
    }
}
