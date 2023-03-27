
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitUpdateAction businessUnitUpdateAction = BusinessUnitUpdateAction.addAddressBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionImpl.class, name = BusinessUnitAddAddressAction.ADD_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionImpl.class, name = BusinessUnitAddAssociateAction.ADD_ASSOCIATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionImpl.class, name = BusinessUnitAddBillingAddressIdAction.ADD_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionImpl.class, name = BusinessUnitAddShippingAddressIdAction.ADD_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionImpl.class, name = BusinessUnitAddStoreAction.ADD_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionImpl.class, name = BusinessUnitChangeAddressAction.CHANGE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionImpl.class, name = BusinessUnitChangeAssociateAction.CHANGE_ASSOCIATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionImpl.class, name = BusinessUnitChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionImpl.class, name = BusinessUnitChangeParentUnitAction.CHANGE_PARENT_UNIT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionImpl.class, name = BusinessUnitChangeStatusAction.CHANGE_STATUS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionImpl.class, name = BusinessUnitRemoveAddressAction.REMOVE_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionImpl.class, name = BusinessUnitRemoveAssociateAction.REMOVE_ASSOCIATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionImpl.class, name = BusinessUnitRemoveBillingAddressIdAction.REMOVE_BILLING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionImpl.class, name = BusinessUnitRemoveShippingAddressIdAction.REMOVE_SHIPPING_ADDRESS_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionImpl.class, name = BusinessUnitRemoveStoreAction.REMOVE_STORE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionImpl.class, name = BusinessUnitSetAddressCustomFieldAction.SET_ADDRESS_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionImpl.class, name = BusinessUnitSetAddressCustomTypeAction.SET_ADDRESS_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionImpl.class, name = BusinessUnitSetAssociatesAction.SET_ASSOCIATES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionImpl.class, name = BusinessUnitSetContactEmailAction.SET_CONTACT_EMAIL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionImpl.class, name = BusinessUnitSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionImpl.class, name = BusinessUnitSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionImpl.class, name = BusinessUnitSetDefaultBillingAddressAction.SET_DEFAULT_BILLING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionImpl.class, name = BusinessUnitSetDefaultShippingAddressAction.SET_DEFAULT_SHIPPING_ADDRESS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionImpl.class, name = BusinessUnitSetStoreModeAction.SET_STORE_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionImpl.class, name = BusinessUnitSetStoresAction.SET_STORES) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = BusinessUnitUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<BusinessUnitUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for addAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionBuilder addAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionBuilder.of();
    }

    /**
     * builder for addAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionBuilder addAssociateBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionBuilder.of();
    }

    /**
     * builder for addBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for addShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for addStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionBuilder addStoreBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionBuilder.of();
    }

    /**
     * builder for changeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionBuilder changeAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionBuilder.of();
    }

    /**
     * builder for changeAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionBuilder changeAssociateBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionBuilder.of();
    }

    /**
     * builder for changeParentUnit subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionBuilder changeParentUnitBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionBuilder.of();
    }

    /**
     * builder for changeStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionBuilder changeStatusBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionBuilder.of();
    }

    /**
     * builder for removeAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionBuilder removeAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionBuilder.of();
    }

    /**
     * builder for removeAssociate subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionBuilder removeAssociateBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionBuilder.of();
    }

    /**
     * builder for removeBillingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * builder for removeShippingAddressId subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * builder for removeStore subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionBuilder removeStoreBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionBuilder.of();
    }

    /**
     * builder for setAddressCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAddressCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionBuilder.of();
    }

    /**
     * builder for setAssociates subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionBuilder setAssociatesBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionBuilder.of();
    }

    /**
     * builder for setContactEmail subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionBuilder setContactEmailBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDefaultBillingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * builder for setDefaultShippingAddress subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * builder for setStoreMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionBuilder setStoreModeBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionBuilder.of();
    }

    /**
     * builder for setStores subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionBuilder setStoresBuilder() {
        return com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitUpdateAction(Function<BusinessUnitUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitUpdateAction>";
            }
        };
    }
}
